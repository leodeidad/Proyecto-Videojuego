

/**
 *
 * @author P5E003-O
 */
public abstract class Personaje implements Ataque{
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
        this.id = id;
    }
    
    @Override
    public void ataque(){
        System.out.println(getNombre()+" ataca");
    }
    
    public abstract boolean isVivo();
    public abstract void datos();
    
    

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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setEspecial(int especial) {
        this.especial = especial;
    }

    public void setId(int id) {
        this.id = id;
    }
}
