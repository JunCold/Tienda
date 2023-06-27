
package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    public List<Categoria> getCategorias(boolean activos);
    //Se obtiene una categoria por su ID
    
    public Categoria getCategoria(Categoria categoria);
        
    //Insertar: se inserta cuando el idCategoria está vacío (valor 0 o null)
    //Modificar: se modifica cuando el idCategoria no está vacío
    public void save(Categoria categoria);
    
    //Se elimina un registro por su ID
    public void delete(Categoria categoria);
}
