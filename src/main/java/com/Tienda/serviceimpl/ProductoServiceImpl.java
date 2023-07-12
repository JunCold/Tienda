package com.Tienda.serviceimpl;


import com.Tienda.domain.Producto;
import com.Tienda.service.ProductoService;
import com.Tienda.dao.ProductoDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> getProductos(boolean activos) {
        List<Producto> Productos = productoDao.findAll();
        if (activos) {
            Productos.removeIf(x -> !x.isActivo());
        }
        return Productos;
    }

    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Producto Producto) {
        return productoDao.findById(Producto.getIdProducto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto Producto) {
        productoDao.save(Producto);
    }

    @Override
    @Transactional
    public void delete(Producto Producto) {
        productoDao.delete(Producto);
    }
    
    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada

    @Override
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup) {
         return productoDao.findByPrecioBetweenOrderByDescripcion(precioInf, precioSup);
    }
    
     @Override
    @Transactional(readOnly=true)    
    public List<Producto> metodoJPQL(double precioInf, double precioSup) {
        return productoDao.metodoJPQL(precioInf, precioSup);
    }
@Override
    @Transactional(readOnly=true)    
    public List<Producto> metodoNativo(double precioInf, double precioSup) {
        return productoDao.metodoNativo(precioInf, precioSup);
    }

}
