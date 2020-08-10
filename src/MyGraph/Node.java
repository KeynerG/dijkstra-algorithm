package MyGraph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/***
 * Node class for the graph, made mainly for setters and getters.
 */

public class Node {
    private HashMap<Node, Integer>refs;
    private String name = "";

    public HashMap<Node, Integer> getRefs() {
        return refs;
    }

    public void setRefs(HashMap<Node, Integer> refs) {
        this.refs = refs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addRef(Node node, int weight){
        refs.put(node, weight);
        System.out.println("Done");
    }
    public void delRef(Node node){
        for (Node aux : refs.keySet()){
            if (aux.equals(node)) {
                refs.remove(node);
            }
        }
        System.out.println("Done");
    }
    public void cleanRefs(){
        refs.clear();
        System.out.println("Done");
    }
}
