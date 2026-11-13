
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
            if (!p2.isVivo()) {
                p2.setVida(0);
            }
            return danio.aplicarDanio(p1, p2);
        } else {
            if (!p2.isVivo()) {
                p2.setVida(0);
                }
            p2.textoDefensa();
            return danio.aplicarDanio(p1, p2) + p2.defensa;
        }

    }
}
