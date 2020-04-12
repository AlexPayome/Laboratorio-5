package laboratorio5;
//@autor Alex Payome
public class Lista {
    private Nodo primero;
    private Nodo ultimo;
    
    //Constructor de la clase
    public Lista(){
        this.primero = null;
        this.ultimo = null;
    }
    /**
     * se anexa un nodo al inicio de la lita
     * @param dato
     */
    public void anexarInicioLista (int dato){
        Nodo nuevo = new Nodo(dato);
        if (primero==null){
            primero=nuevo;
            ultimo=nuevo;
        } else{
            nuevo.setEnlace(primero);
            primero=nuevo;
        }
    }
    /**
     * se anexa un nodo al final de la lista
     *@param dato
     */
    public void anexarFinalLista(int dato){
        Nodo nuevo = new Nodo(dato);
        if (primero==null) {
            primero=nuevo;
            ultimo=nuevo;
        } else {
            ultimo.setEnlace(nuevo);
            ultimo=nuevo;
            ultimo.setEnlace(null);
        }
    }
    /**
     * Se evalua si lista es vacia
     * @return true si es vacia o false
     */
    public boolean esVacia(){
        return(primero==null);
    }
    /**
     * busca un valor en los nodos de la lista
     * @param dato
     * @return verdadero o falso
     */
    public boolean buscarNodo(int dato){
        boolean encontro=false;
        Nodo p=primero;
        while (p.getEnlace()!=null && encontro==false) {            
            if (p.getDato()==dato) encontro=true;
            p=p.getEnlace();
        }
        return encontro;
    }
    public boolean borrarNodoInicio(){
        if (esVacia()) return false;
        if (primero.getEnlace()==null) {
            primero=null;
            ultimo=null;
            return true;
        } else {
            Nodo temp=primero;
            primero=primero.getEnlace();
            temp.setEnlace(null);
            return true;
        }
    }
    /**
     * metodo que borra un nodo final de la lista
     * @return false o true dependiendo si el borro nodo
     */
    public boolean borrarNodoFinal(){
        if (esVacia()) return false;
        if (primero.getEnlace()==null) {
            primero=null;
            ultimo=null;
            return false;
        } else {
            Nodo temp=primero;
            Nodo aux=primero;
            while (temp.getEnlace()!=null) {                
                aux=temp;
                temp=temp.getEnlace();
            }
            ultimo=aux;
            ultimo.setEnlace(null);
            return true;
        }
    }
    /**
     * Metodo que almacena en un string los nodos de la lista
     * a imprimir o el mensaje de la lista vacia, si no hay nodo
     * @return string
     */
    public String imprimirLista(){
        String str="";
        boolean condicion=esVacia();
        if (condicion==false) {
            //creamos una copia de la lista que apunte al primer nodo
            Nodo aux = primero;
            int i=1; //para mostrar en qué posición está cada nodo,se quita si no es necesario saber la posición
            while(aux!=null){
                str=str+i+"->"+aux.getDato()+"\n";
                aux=aux.getEnlace();//El nodo pasa a ser el siguiente
                i++;
            }
        } else {
            str = "lista vacia";
        }
        return str;
    }
}
