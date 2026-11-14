/**
 *
 * @author Usuario
 */
public class AplicarDanioEntorno implements DanioEntorno{
    @Override
    public void danioEntorno(Personaje p1, Personaje p2, Entorno entorno){
        Personaje a;
        //Usamos un caso para que la validacion se aplice tanto al personaje 1 como al 2, asi
        //unificamos el danioEntorno en un solo metodo que afecta a ambos si no son locales, o
        //solo a los extranjeros si existe un local.
        for(int i = 0; i <= 1 ; i++ ){
            if(i == 0){
                a = p1;
            }else{
                a = p2;
            }
            if(a.getId() != entorno.getId()){
                a.setVida(a.getVida() - entorno.getDanioEntorno());
                System.out.println(a.getNombre() + " recibio danio por"+entorno.textoDanioEntorno);
            }
        }
    }
}
