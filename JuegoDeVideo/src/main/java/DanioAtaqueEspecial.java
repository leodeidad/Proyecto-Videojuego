/**
 *
 * @author Usuario
 */
public class DanioAtaqueEspecial implements Danio{
    @Override
    public int aplicarDanio(Personaje p1, Personaje p2){
        int vidaRestante=p2.getVida();
        //Añadimos directamente en este metodo la validacion de que solo se puede
        //usar si tiene suficiente energia
        if(p1.getEnergia()>10){
            vidaRestante = p2.getVida() - p1.getEspecial();
            p1.energia-=5;
        }else{
            p1.textoCansancio();
        }
        return vidaRestante;
    }
}
