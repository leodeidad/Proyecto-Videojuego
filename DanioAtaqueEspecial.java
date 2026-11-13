/**
 *
 * @author Usuario
 */
public class DanioAtaqueEspecial implements Danio{
    @Override
    public int aplicarDanio(Personaje p1, Personaje p2){
        int vidaRestante = 0;
        vidaRestante = p2.getVida() - p1.getEspecial();
        
        return vidaRestante;
    }
}
