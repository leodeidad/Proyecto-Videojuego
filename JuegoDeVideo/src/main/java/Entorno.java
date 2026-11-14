
/**
 *
 * @author Leonel Herrera
 */
public abstract class Entorno {
    protected String nombre;
    protected String descripcion; //(Solo que describa elementos especiales)
    protected String textoDanioEntorno;
    protected int id; //identificador para los tipos de luchadores (Fuego: 1, Hielo : 2, naturaleza; 3, electricidad: 4)
    protected int danioEntorno;
    
    //Para el atributo textoDanioEntorno se debe usar una oracion que complete la frase: "nombre" recibio danio por...
    public Entorno(String nombre, String descripcion, int id, int danioEntorno, String textoDanioEntorno) {
        this.textoDanioEntorno = textoDanioEntorno;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.danioEntorno = danioEntorno;
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    } //Obtener el nombre del entorno

    public int getId() {
        return id;
    } //Obtener el identificador del entorno
    
    //La descripcion es un atributo que se inicializa en el constructor, y el formato es global para todos los entornos
    public void Descripcion() {
          System.out.print("Bienvenidos a "+getNombre()+": "+this.descripcion);
    }
    
    public int getDanioEntorno() {
        return danioEntorno;
    }
 
}
