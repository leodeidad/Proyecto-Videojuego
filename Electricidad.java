/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author P5E003-O
 */
public class Electricidad extends Entorno{

    public Electricidad() {
        super("Campo Electrico", "Cuidado con los rayos", 4, 5);
    }
    
    @Override
    public void Descripcion() {
        System.out.print(this.descripcion + ", te pueden caer encima");
    }
}
