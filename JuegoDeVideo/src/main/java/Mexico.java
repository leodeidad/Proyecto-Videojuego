/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author P5E003-O
 */
public class Mexico extends Entorno {

    public Mexico() {
        super("Lago Congelado", "El piso es fragil" , 2);
    }

    @Override
    public void Descripcion() {
          System.out.print(this.descripcion + ", mira por donde pisas");
    }
    
}
