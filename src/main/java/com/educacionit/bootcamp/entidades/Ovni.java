/**
 * Segunda Entrega - Escribir las clases e interfaces, además de las relaciones de herencias necesarias para poder resolverlo.
 *
 * Clase Ovni que hereda de Voladores (Flying)
 *
 * @author  Angel Antognoli
 * @date: 11-OCT-2022
 */
package com.educacionit.bootcamp.entidades;

//Clase Helicoptero hereda de Flying.
import com.educacionit.bootcamp.enums.VisitReason;

public class Ovni extends Flying {

    private String planet;
    private VisitReason visitReason;

    public Ovni(String name, String planet, VisitReason visitReason) {
        super(name);
        this.planet = planet;
        this.visitReason = visitReason;
    }

    public Ovni(){
        super();
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public VisitReason getVisitReason() {
        return visitReason;
    }

    public void setVisitReason(VisitReason visitReason) {
        this.visitReason = visitReason;
    }
}
