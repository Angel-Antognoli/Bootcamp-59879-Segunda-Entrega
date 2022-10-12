/**
 * Segunda Entrega - Escribir las clases e interfaces, además de las relaciones de herencias necesarias para poder resolverlo.
 *
 * Clase Helicoptero que hereda de Voladores (Flying)
 *
 * @author  Angel Antognoli
 * @date: 11-OCT-2022
 */
package com.educacionit.bootcamp.entidades;

import com.educacionit.bootcamp.interfaces.Landable;
import com.educacionit.bootcamp.enums.FlyType;

// Clase Helicoptero hereda de Flying e implementa la interface Landable.
public class Helicopter extends Flying implements Landable {

    private Integer passengersQuantity;
    private FlyType flyType;

    public Helicopter(String name, Integer passengersQuantity, FlyType flyType) {
        super(name);
        this.passengersQuantity = passengersQuantity;
        this.flyType = flyType;
    }

    public Helicopter(){
        super();
    }

    public Integer getPassengersQuantity() {
        return passengersQuantity;
    }

    public void setPassengersQuantity(Integer passengersQuantity) {
        this.passengersQuantity = passengersQuantity;
    }

    public FlyType getFlyType() {
        return flyType;
    }

    public void setFlyType(FlyType flyType) {
        this.flyType = flyType;
    }
}
