
/**
 *
 * @author P5E003-O
 */
public class Fuego extends Personaje {

    public Fuego(String nombre) {
        super(150, 30, 15, 5, 60, 1);
        this.nombre=nombre;
       
    }

 
    
    @Override
    public boolean isVivo() {
        return vida > 0;
    }
    
    @Override
    public void datos(){
        System.out.println("El personaje " + nombre + " tiene " + vida + " puntos de vida.");
    }
}
