/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author P5E003-O
 */
public class Peru extends Entorno {
    //HogarDeLava  Esta orientada a Personajes de Tipo fuego
    public Peru() {
        super("Hogar de Lava", "Un lugar muy caliente lleno de magma.", 1);
    }
    
    @Override
    public void Descripcion() {
        System.out.print(this.descripcion + ", espero que te guste el calor");
    }
}
