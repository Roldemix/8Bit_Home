package com.example._Bit_Home.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

import com.example._Bit_Home.Model.Producto;
import com.example._Bit_Home.Repository.ProductoRepository;

@Service
@Transactional
public class ProductoService {

    @AutoWired
    private ProductoRepository productoRepository;

    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    public Producto findById(Integer id) {
        Producto producto = productoRepository.findById(id).orElse(null);
        return producto;
    }

    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto partialUpdate(Producto producto){
        Producto existingProducto = productoRepository.findById(producto.getId()).orElse(null);
        if (existingProducto != null) {
            if (producto.getNombre() != null) {
                existingProducto.setNombre(producto.getNombre());
            }

            if(producto.getDescripcion() != null) {
                existingProducto.setDescripcion(producto.getDescripcion());
            }

            if(producto.getLogo() != null) {
                existingProducto.setLogo(producto.getLogo());
            }

            return productoRepository.save(existingProducto);
        }
        return null;
    }

    public void deleteById(Integer id) {
        naveService.deleteByProductoId(id);
        productoRepository.deleteById(id);
    }
}