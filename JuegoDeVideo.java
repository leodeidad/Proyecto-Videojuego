
/**
 *
 * @author Joaquin Molina y Dylan Loyo
 */
public class JuegoDeVideo {

    public static void main(String[] args) {
        Peruano fuego= new Peruano("Advincula");
        Mexicano hielo = new Mexicano("Rey Misterio");
        Mexico e1=new Mexico();
        Combate c1 = new Combate(fuego, hielo, e1);
        c1.newCombate();
        
    }
}
