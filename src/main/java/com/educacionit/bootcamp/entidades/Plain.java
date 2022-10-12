/**
 * Segunda Entrega - Escribir las clases e interfaces, además de las relaciones de herencias necesarias para poder resolverlo.
 *
 * Clase Plain que hereda de Voladores (Flying)
 *
 * @author  Angel Antognoli
 * @date: 11-OCT-2022
 */
package com.educacionit.bootcamp.entidades;

//Clase Helicoptero hereda de Flying e implementa la interface Landable.
import com.educacionit.bootcamp.interfaces.Landable;

public class Plain extends Flying implements Landable {

    private Integer passengersQuantity;
    private Integer engineQuantity;

    private String model;

    public Plain(String name, Integer passengersQuantity, Integer engineQuantity, String model) {
        super(name);
        this.passengersQuantity = passengersQuantity;
        this.engineQuantity = engineQuantity;
        this.model = model;
    }

    public Plain(){
        super();
    }

    public Integer getPassengersQuantity() {
        return passengersQuantity;
    }

    public void setPassengersQuantity(Integer passengersQuantity) {
        this.passengersQuantity = passengersQuantity;
    }

    public Integer getEngineQuantity() {
        return engineQuantity;
    }

    public void setEngineQuantity(Integer engineQuantity) {
        this.engineQuantity = engineQuantity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

