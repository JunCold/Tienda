
package com.Tienda.service;

import com.Tienda.domain.Producto;
import java.util.List;


public interface ProductoService {
    public List<Producto> getProductos(boolean activos);
    //Se obtiene un productoC por su ID
    
    public Producto getProducto(Producto producto);
        
    //Insertar: se inserta cuando el idProducto está vacío (valor 0 o null)
    //Modificar: se modifica cuando el idProducto no está vacío
    public void save(Producto producto);
    
    //Se elimina un registro por su ID
    public void delete(Producto producto);
}
