/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.dao;

import com.tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository; //se importa la interfaz del JPA, se importan metodos para crear los CRUD

//esto hace que se convierta en un repositorio para la categoria. Permite extraer toda la info y guardarla aca 
public interface CategoriaDao extends JpaRepository<Categoria, Long> {

}
