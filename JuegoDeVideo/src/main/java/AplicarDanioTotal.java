/**
 *
 * @author Usuario
 */
import java.util.Random;
public class AplicarDanioTotal {
    
    public int aplicarDanioTotal(Personaje p1, Personaje p2, Danio danio){
        Random random = new Random();
        boolean valor = random.nextBoolean(); 
        if(!valor){
        return danio.aplicarDanio(p1, p2);
        }else{
            System.out.println(p2.getNombre() + " Se defendio.");
            return danio.aplicarDanio(p1, p2) + p2.defensa;
        }
        
    }
}
