
/**
 *
 * @author Joaquin Molina y Dylan Loyo
 */
public class JuegoDeVideo {

    public static void main(String[] args) {
        Fuego fuego= new Fuego("Pedro");
        Hielo hielo = new Hielo("Juan");
        LagoCongelado e1=new LagoCongelado();
        Combate c1 = new Combate(fuego, hielo, e1);
        c1.turno();
        
    }
}
