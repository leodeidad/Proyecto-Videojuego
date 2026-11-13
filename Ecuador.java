/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author P5E003-O
 */
public class Ecuador extends Entorno {

    public Ecuador() {
        super("Bosque Salvaje", "Solo los animales sobreviven" , 3);
    }

    @Override
    public void Descripcion() {
       System.out.print(this.descripcion + ", debes ser una bestia");
    }
    
}
