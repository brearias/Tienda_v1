/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import jakarta.persistence.*;

import java.io.Serializable; //permite almacenar y transmitir objetos de la clase donde se implemente 
import java.util.List;

import lombok.Data;

@Data

@Entity

@Table(name = "categoria")

public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L; //asegura que todo lo que esta en esta clase se pueda serializar 

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY) //identifica el valor del id o llave primaria y que sea el mismo en el codigo

    @Column(name = "id_categoria") //hace referencia al primary key 

    private Long idCategoria;//en la tabla tenemos un primary key que es igual a idCategoria

    private String descripcion;

    private String rutaImagen;

    private boolean activo;
    
    @OneToMany
    @JoinColumn (name="id_categoria", updatable = false)
    List<Producto> productos;

    public Categoria() {

    }

    public Categoria(String categoria, boolean activo) {

        this.descripcion = categoria;

        this.activo = activo;

    }

}
