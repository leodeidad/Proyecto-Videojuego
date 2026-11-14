
/**
 *
 * @author Joaquin Molina
 */
public class Ecuatoriano extends Personaje{

    public Ecuatoriano(String nombre){
        super("Ecuador", 150, 40, 20, 15, 65, 2);
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
        System.out.println(getNombre() + " lanza una baraja de cuarenta");
    }

    @Override
    public void textoAtaqueEspecial() {
        System.out.println(getNombre() + " invoca al taita Imbabura y a la mama Cotacachi");
    }
    
    public void textoCansancio(){
        System.out.println(getNombre()+" ya no jala, cachos");
    }

    @Override
    public void textoDefensa() {
        System.out.println(getNombre() + " se cubre con jorgito el guayaco");
    }
}
