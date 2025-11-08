package com.example._Bit_Home.Repository;   

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example._Bit_Home.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}