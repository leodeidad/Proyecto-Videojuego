
/**
 *
 * @author P5E003-O
 */
public class Peruano extends Personaje{

    public Peruano(String nombre) {
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
    
    //Implementación Interfaces de texto heredadas del abstract Personajes
    @Override
    public void textoAtaque(){
        System.out.println(getNombre()+" lanza palomas");
    }
    
    @Override
    public void textoAtaqueEspecial(){
        System.out.println(getNombre()+" invoca a Atahualpa");
    }
    
    @Override
    public void textoDefensa(){
        System.out.println(getNombre()+" usa un escudo Inca");
    }
}
