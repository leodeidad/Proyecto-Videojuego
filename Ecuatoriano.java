/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Paula
 */
public class Ecuatoriano extends Personaje{

    public Ecuatoriano(String nombre){
        super(130, 40, 20, 4, 65, 2);
        this.nombre = nombre;
    }

    @Override
    public void datos() {
        System.out.println("Desde la tierra de los ajolotes y las catrinas llega el luchador "
                + nombre + " tomando tequila. \nLlega con:\nVida: "
                + vida + "\nFuerza: " + fuerza + "\nDefensa: " + defensa + "\nEspecial: " + especial
                + "\nEnergia: " + energia + "\n");
    }

    //Implementación Interfaces de texto heredadas del abstract Personajes
    @Override
    public void textoAtaque() {
        System.out.println(getNombre() + " lanza tacos picantes");
    }

    @Override
    public void textoAtaqueEspecial() {
        System.out.println(getNombre() + " invoca a chespirito y cantinflas para un "
                + "golpe de compañerismo");
    }

    @Override
    public void textoDefensa() {
        System.out.println(getNombre() + " se esconde en su embajada");
    }
}
