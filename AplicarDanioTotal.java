
/**
 *
 * @author Usuario
 */
import java.util.Random;

public class AplicarDanioTotal {

    public int aplicarDanioTotal(Personaje p1, Personaje p2, Danio danio) {
        Random random = new Random();
        boolean defensa = random.nextBoolean();
        if (!defensa) {
            return danio.aplicarDanio(p1, p2);
        } else {
            
            p2.textoDefensa();
            return danio.aplicarDanio(p1, p2) + p2.defensa;
        }

    }
}
