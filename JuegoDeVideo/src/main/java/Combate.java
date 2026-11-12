import java.util.Random;
/**
 *
 * @author P5E003-O
 */

public class Combate {
    Random random = new Random();
    int rand;
    int turn;
    Personaje personaje1;
    Personaje personaje2;
    Entorno escenario;
    
    public Combate(Personaje personaje1, Personaje personaje2, Entorno escenario){
        this.personaje1=personaje1;
        this.personaje2=personaje2;
        this.escenario=escenario;
    }
    
    public void turno(){
        switch(turn = random.nextInt(2)){
            case 0:
                    switch (rand = random.nextInt(4)){
                case 0: 
                    personaje1.setVida(personaje1.getVida()-personaje2.getFuerza());
                    personaje2.ataque();
                    break;
                case 1: 
                    personaje1.setVida(personaje1.getVida() - personaje2.getEspecial()) ;
                    personaje2.ataque();
                    break;
                case 2: 
                    personaje1.vida -= (personaje2.fuerza - personaje1.defensa);
                    personaje2.ataque();
                    break;
                case 3: 
                    personaje1.vida-=(personaje2.especial - personaje1.defensa);
                    personaje2.ataque();
                    break;
                 }
                break;
            case 1:
                    switch (rand = random.nextInt(4)){
                case 0: 
                    personaje2.vida-=personaje1.fuerza;
                    personaje1.ataque();
                    break;
                case 1: 
                    personaje2.vida-=personaje1.especial;
                    personaje1.ataque();
                    break;

                  }    
                break;         
            
     }
            
        
        System.out.println(this.personaje1.nombre+" - Vida: "+this.personaje1.vida);
        System.out.println(this.personaje2.nombre+" - Vida: "+this.personaje2.vida);
    }
}
