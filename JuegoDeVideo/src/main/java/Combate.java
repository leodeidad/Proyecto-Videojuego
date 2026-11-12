
/**
 *
 * @author P5E003-O
 */
import java.util.Random;
public class Combate {
    Random random = new Random();
    int rand;
    int turn;
    Personaje personaje1;
    Personaje personaje2;
    Entorno escenario;
    AplicarDanioTotal vidaRestante = new AplicarDanioTotal();
    
    
    public Combate(Personaje personaje1, Personaje personaje2, Entorno escenario){
        this.personaje1=personaje1;
        this.personaje2=personaje2;
        this.escenario=escenario;
    }
    
          
    public void turno(Personaje p1, Personaje p2){
        Personaje a,b;
        //Selecciona de forma aleatoria el turno de los personajes
        do{
            if(random.nextInt(2) == 0){
                  a = p1;
                  b = p2;
               }else{
                  a = p2;
                  b = p1;
               }
              rand = random.nextInt(4);
                   switch (rand){
               case 0: 
                   int v1 = vidaRestante.aplicarDanioTotal(a, b, new DanioAtaqueNormal());
                   b.setVida(v1);
                   break;
               case 1: 
                   int v2 = vidaRestante.aplicarDanioTotal(a, b, new DanioAtaqueEspecial());
                   b.setVida(v2);
                   break;
               case 2: 
                   int v3 = vidaRestante.aplicarDanioTotal(a, b, new DanioAtaqueEspecial());
                   b.setVida(v3);
                   break;
               case 3: 
                   personaje2.vida-=personaje1.especial;
                   break;
                   } 
        }while(p1.getVida() >= 0 && p2.getVida()>=0);           
        System.out.println(this.personaje1.nombre+" - Vida: "+this.personaje1.vida);
        System.out.println(this.personaje2.nombre+" - Vida: "+this.personaje2.vida);
    }  
}
