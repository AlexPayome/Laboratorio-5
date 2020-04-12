package laboratorio5;
//@autor Alex Payome
public class Nodo {
    private int dato;
    //auto referencia
    private Nodo enlace;
    /**
     * constructor nodo
     * Se inicializan los atributos de la case
     * por defecto
     */
    public Nodo(){
        this.dato = 0;
        this.enlace = null;
    }
    /**
     * constructor Nodo
     * inicializa el atributo dato de la clase.
     * @param dato 
     */
    public Nodo(int dato) {
        this.dato = dato;
        this.enlace = null;
    }
    /**
     * Se obtiene el dato del Nodo
     * @return valor entero correspondielete al dato
     */
    public int getDato() {
        return dato;
    }
    /**
     * Se actualiza el dato del nodo
     * @param dato 
     */
    public void setDato(int dato) {
        this.dato = dato;
    }
    /**
     * obtiene el valor de la referencia
     * @return referencia del siguiente nodo
     */
    public Nodo getEnlace() {
        return enlace;
    }
    /**
     * Se actualiza la referencia del nodo
     * @param enlace 
     */
    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }    
}
