/**
 * Segunda Entrega - Escribir las clases e interfaces, además de las relaciones de herencias necesarias para poder resolverlo.
 * 
 * Clase Generica para Voladores (Flying)
 *
 * @author  Angel Antognoli
 * @date: 11-OCT-2022
 */
package com.educacionit.bootcamp.entidades;

public abstract class Flying {

    private String name;

    public Flying(String name) {
        this.name = name;
    }

    public Flying(){
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
