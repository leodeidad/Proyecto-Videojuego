

/**
 *
 * @author P5E003-O
 */
public abstract class Personaje implements Ataque, AtaqueEspecial, Defensa{
    //Atributos de todos los personajes
    protected String nombre;
    protected int vida;
    protected int fuerza;
    protected int defensa;
    protected int energia;
    protected int especial;
    protected int id;
    
    //Constructor para todos los personajes (El nombre se define después)
    public Personaje(int vida, int fuerza, int defensa, int energia, 
                int especial, int id) {
        this.vida = vida;
        this.fuerza = fuerza;
        this.defensa = defensa;
        this.energia = energia;
        this.especial = especial;
        //Representa cada clase de luchador
        this.id = id;
    }
    
    public abstract void datos();
    
    public boolean isVivo() {
        return vida > 0;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }
    
    public int getFuerza(){
        return fuerza;
    }
    
    public int getDefensa() {
        return defensa;
    }

    public int getEnergia() {
        return energia;
    }

    public int getEspecial() {
        return especial;
    }

    public int getId() {
        return id;
    }

    public void setVida(int vida) {
        if(vida<0){
            this.vida=0;
        }else{
            this.vida = vida;
        }
    }
    
    //Implementación abstracta de interfaces para que las clases hijas estén 
    //forzadas a usarlas. En la documentación lo llaman "clase esqueletica"
    @Override 
    public abstract void textoAtaque();
    
    @Override
    public abstract void textoAtaqueEspecial();
    
    @Override
    public abstract void textoDefensa();
    
}
