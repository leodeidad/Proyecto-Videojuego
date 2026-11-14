
/**
 *
 * @author Joaquín Molina, Dylan Loyo, Andres Jimenez, Leonel Herrera 
 * Profesor: Ingeniero Pablo Saa
 * Materia: Programacion II
 * Plantel: Escuela Politecnica Nacional
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
