/**
 * Segunda Entrega - Escribir las clases e interfaces, además de las relaciones de herencias necesarias para poder resolverlo.
 * ENUNCIADO
 * Existe una torre de control donde operadores pueden determinar ciertos voladores que pueden aterrizar en la pista de aterrizaje.
 *
 * Los voladores son: avion, helicoptero, superman, ovni.
 *
 * Los atributos que comparten son: nombre, (agregar otros de ser necesario).
 * Cada volador debe contar con atributos particulares(decidir los que crean convenientes).
 * Ej: avión puede tener cantidad de asientos, el helicóptero puede tener color, marca, modelo etc.
 *
 * CRITERIOS DE ACEPTACION:
 * ● En la pista solo podrán aterrizar aquellos voladores que cumplan con la interfaz Aterrizable.
 *
 * @author  Angel Antognoli
 * @date: 11-OCT-2022
 */

package com.educacionit.bootcamp.entregasegunda;

import com.educacionit.bootcamp.entidades.*;
import com.educacionit.bootcamp.interfaces.*;
import com.educacionit.bootcamp.enums.FlyType;
import com.educacionit.bootcamp.enums.VisitReason;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Superman s = new Superman("Clark Kent","123456","0800superman");
        Ovni o= new Ovni("Ovni","Melmak", VisitReason.PEACE);
        Plain p= new Plain("Plain",72,2,"Boeing 737-400");
        Helicopter h =new Helicopter("Helicopter",4, FlyType.PARTICULAR);
        List<Flying> FlyingList = Arrays.asList(s,o,p,h);

        for(Flying f :FlyingList){
            if ( f instanceof Landable) {
                System.out.println(f.getName() + " can land");
            }else {
                System.out.println(f.getName() + " can´t land");
            }
        }

    }
}
