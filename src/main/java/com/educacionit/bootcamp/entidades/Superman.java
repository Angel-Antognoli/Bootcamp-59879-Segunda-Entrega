/**
 * Segunda Entrega - Escribir las clases e interfaces, además de las relaciones de herencias necesarias para poder resolverlo.
 *
 * Clase Superman que hereda de Voladores (Flying)
 *
 * @author  Angel Antognoli
 * @date: 11-OCT-2022
 */
package com.educacionit.bootcamp.entidades;

//Clase Helicoptero hereda de Flying.
public class Superman extends Flying {

    private String idNumber;
    private String phoneNumber;

    public Superman(String name, String idNumber, String phoneNumber) {
        super(name);
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
    }

    public Superman(){
        super();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

