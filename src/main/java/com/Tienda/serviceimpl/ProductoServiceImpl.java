package com.Tienda.serviceimpl;

import com.Tienda.dao.ProductoDao;
import com.Tienda.domain.Producto;
import com.Tienda.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoDao ProductoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> getProductos(boolean activos) {
        List<Producto> Productos = ProductoDao.findAll();
        if (activos) {
            Productos.removeIf(x -> !x.isActivo());
        }
        return Productos;
    }

    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Producto Producto) {
        return ProductoDao.findById(Producto.getIdProducto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto Producto) {
        ProductoDao.save(Producto);
    }

    @Override
    @Transactional
    public void delete(Producto Producto) {
        ProductoDao.delete(Producto);
    }

}
