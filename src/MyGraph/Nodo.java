package MyGraph;

/***
 * Node class for the linked list.
 * @author Oscar Méndez
 * @author Keyner Gómez
 * @author Hansel Hampton
 * @version 1.1
 * @since 2020
 */
public class Nodo <Node> {
    private Node data;
    private Nodo next;

    /***
     * First constructor method of the Nodo class.
     * @param data Node
     */
    public Nodo(Node data){
        this.data = data;
        this.next = null;
    }

    /***
     * Second constructor method of the Nodo class.
     */
    public Nodo() {
        this.data = data;
        this.next = null;
    }

    /***
     * This method returns the 'data' variable.
     * @return Node
     */
    public Node getData(){
        return this.data;

    }

    /***
     * This method changes the value of the 'data' variable.
     * @param data Node
     */
    public void setData(Node data){
        this.data = data;

    }

    /***
     * This method returns the 'next' variable.
     * @return Nodo
     */
    public Nodo getNext(){

        return this.next;
    }
    /***
     * This method changes the value of the 'next' variable.
     * @param nodo Nodo
     */
    public void setNext(Nodo nodo){
        this.next = nodo;

    }
}
