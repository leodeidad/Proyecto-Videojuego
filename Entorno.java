/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel Herrera
 */
public abstract class Entorno {
    protected String nombre;
    protected String descripcion; //(Solo que describa elementos especiales)
    protected int id; //identificador para los tipos de luchadores (Fuego: 1, Hielo : 2, naturaleza; 3, electricidad: 4)
    protected boolean armas;

    public Entorno(String nombre, String descripcion, int id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
        this.armas = false;
    }

    public void setArmas(boolean armas) {
        this.armas = armas;
    }
    
    public boolean getArmas() {
        return armas;
    } //Para obtener y verificar si tiene armas el entorno

    public String getNombre() {
        return nombre;
    } //Obtener el nombre del entorno

    public int getId() {
        return id;
    } //Obtener el identificador del entorno
    
    public abstract void Descripcion(); // Aplicar polimorfismo para mostrar la descripcion del escenario
    
}
