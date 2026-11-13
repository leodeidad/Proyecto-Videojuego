/**
 *
 * @author Usuario
 */
public class DanioAtaqueNormal implements Danio {
    @Override
    public int aplicarDanio(Personaje p1, Personaje p2){
        int vidaRestante = 0;
        vidaRestante = p2.getVida() - p1.getFuerza();
        return vidaRestante;
    }
}
