
/**
 *
 * @author Joaquin Molina y Dylan Loyo
 */
public class JuegoDeVideo {

    public static void main(String[] args) {
        Peruano fuego= new Peruano("Pedro");
        Mexicano hielo = new Mexicano("Juan");
        Mexico e1=new Mexico();
        Combate c1 = new Combate(fuego, hielo, e1);
        c1.newCombate();
        
    }
}
