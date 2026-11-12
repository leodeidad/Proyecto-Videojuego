
/**
 *
 * @author P5E003-O
 */
public class Hielo extends Personaje implements Ataque, AtaqueEspecial, Defensa{

    public Hielo(String nombre) {
        super(130, 40, 20, 4, 65, 2);
        this.nombre=nombre;
    }
    
    
    
    @Override
    public void ataqueEspecial(){
        
    }
    
    @Override
    public void defensa(){
        
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

