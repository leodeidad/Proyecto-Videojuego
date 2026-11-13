/**
 *
 * @author Usuario
 */
public class AplicarDanioEntorno implements DanioEntorno{
    @Override
    public void danioEntorno(Personaje p1, Personaje p2, Entorno entorno){
        Personaje a;
        for(int i = 0; i <= 1 ; i++ ){
            if(i == 0){
                a = p1;
            }else{
                a = p2;
            }
            if(a.getId() != entorno.getId()){
                a.setVida(a.getVida() - entorno.getdanioEntorno());
                System.out.println(a.getNombre() + " recibio danio del entorno.");
            }
        }
    }
}
