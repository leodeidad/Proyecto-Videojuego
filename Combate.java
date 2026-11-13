
import java.util.Random;

/**
 *
 * @author P5E003-O
 */

public class Combate {

    Random random = new Random();
    int rand;
    Personaje personaje1;
    Personaje personaje2;
    Entorno escenario;
    AplicarDanioTotal vidaRestante = new AplicarDanioTotal();
    DanioEntorno e = new AplicarDanioEntorno();
            

    public Combate(Personaje personaje1, Personaje personaje2, Entorno escenario) {
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;
        this.escenario = escenario;
    }

    public void newCombate(){
        Personaje a,b;
        personaje1.datos();
        personaje2.datos();
        System.out.println("\nEmpieza el combate...");
        //Selecciona de forma aleatoria el turno de los personajes
        do{
            if(random.nextInt(2) == 0){
                  a = this.personaje1;
                  b = this.personaje2;
               }else{
                  a = this.personaje2;
                  b = this.personaje1;
               }
              rand = random.nextInt(4);
                   switch (rand){
               case 0:
                   a.textoAtaque();
                   int v1 = vidaRestante.aplicarDanioTotal(a, b, new DanioAtaqueNormal());
                   b.setVida(v1);   
                   e.danioEntorno(a, b, escenario);
                   System.out.println("Vida de "+a.getNombre()+": "+a.getVida());
                   System.out.println("Vida de "+b.getNombre()+": "+b.getVida());
                   break;
               case 1:
                   a.textoAtaqueEspecial();
                   int v2 = vidaRestante.aplicarDanioTotal(a, b, new DanioAtaqueEspecial());
                   b.setVida(v2);
                   e.danioEntorno(a, b, escenario);
                   System.out.println("Vida de "+a.getNombre()+": "+a.getVida());
                   System.out.println("Vida de "+b.getNombre()+": "+b.getVida());         
                   break;
                   }
        }while(a.isVivo() && b.isVivo());           
        
    }
}
