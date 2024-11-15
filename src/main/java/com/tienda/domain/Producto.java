/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import jakarta.persistence.*;

import java.io.Serializable; //permite almacenar y transmitir objetos de la clase donde se implemente 

import lombok.Data;

@Data

@Entity

@Table(name = "producto")

public class Producto implements Serializable {

    private static final long serialVersionUID = 1L; //asegura que todo lo que esta en esta clase se pueda serializar 

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY) //identifica el valor del id o llave primaria y que sea el mismo en el codigo

    @Column(name = "id_producto") //hace referencia al primary key 

    private Long idProducto;//en la tabla tenemos un primary key que es igual a idProducto

    private String descripcion;

    private String rutaImagen;

    private boolean activo;

    private String detalle;

    private double precio;

    private int existencias;

    //private Long idCategoria; reemplazar  @ManyToOne
    
    @ManyToOne
    @JoinColumn(name="id_categoria")
    Categoria categoria;

    public Producto() {

    }

    public Producto(String producto, boolean activo) {

        this.descripcion = producto;

        this.activo = activo;

    }

}
