
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
        //Inicio del combate, datos generales
        escenario.Descripcion();
        System.out.println("\n");
        personaje1.datos();
        personaje2.datos();
        System.out.println("\nEmpieza el combate...");
        System.out.println("\n");
        e.danioEntorno(personaje1, personaje2, escenario);
        //Selecciona de forma aleatoria el turno de los personajes
        do{
            if(random.nextInt(2) == 0){
                //cada nuevo turno se selecciona quien sera el que haga el ataque
                  a = this.personaje1;
                  b = this.personaje2;
               }else{
                  a = this.personaje2;
                  b = this.personaje1;
               }
              rand = random.nextInt(4);
                   switch (rand){
                //Solo hay dos casos de ataque, normal o especial
               case 0:
                   a.textoAtaque();
                   int v1 = vidaRestante.aplicarDanioTotal(a, b, new DanioAtaqueNormal());
                   b.setVida(v1);   
                   
                   System.out.println("Vida de "+a.getNombre()+": "+a.getVida());
                   System.out.println("Vida de "+b.getNombre()+": "+b.getVida());
                   System.out.println("\n");
                   break;
               case 1:
                   a.textoAtaqueEspecial();
                   int v2 = vidaRestante.aplicarDanioTotal(a, b, new DanioAtaqueEspecial());
                   b.setVida(v2);
                   
                   System.out.println("Vida de "+a.getNombre()+": "+a.getVida());
                   System.out.println("Vida de "+b.getNombre()+": "+b.getVida());
                   System.out.println("\n");
                   break;
                   }
        //El combate se mantiene hasta que haya un ganador
        }while(a.isVivo() && b.isVivo());
        //Anuncio del ganador
        if(personaje1.isVivo()){
            System.out.println(personaje1.getNombre()+" es el ganador, poniendo en alto a "+personaje1.getNacion());
        }else{
            System.out.println(personaje2.getNombre()+" es el ganador, poniendo en alto a "+personaje2.getNacion());
        }
    }
}
