package com.example._Bit_Home.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example._Bit_Home.Model.Categoria;
import com.example._Bit_Home.Repository.CategoriaRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
@SuppressWarnings("null")
public class CategoriasService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProductoRepository naveService;

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Categoria findById(Integer id) {
        Categoria categoria = categoriaRepository.findById(id).orElse(null);
        return categoria;
    }

    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Categoria partialUpdate(Categoria categoria){
        Categoria existingCategoria = categoriaRepository.findById(categoria.getId()).orElse(null);
        if (existingCategoria != null) {
            if (categoria.getNombre() != null) {
                existingCategoria.setNombre(categoria.getNombre());
            }

            if(categoria.getDescripcion() != null) {
                existingCategoria.setDescripcion(categoria.getDescripcion());
            }

            if(categoria.getLogo() != null) {
                existingCategoria.setLogo(categoria.getLogo());
            }

            return categoriaRepository.save(existingCategoria);
        }
        return null;
    }

    public void deleteById(Integer id) {
        naveService.deleteByCategoriaId(id);
        categoriaRepository.deleteById(id);
    }
}
