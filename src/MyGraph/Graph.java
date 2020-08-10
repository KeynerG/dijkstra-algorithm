package MyGraph;

import java.util.HashMap;

public class Graph {
    ListaEnlazada graph;

    public Graph(){
        graph = new ListaEnlazada();
    }

    public void createNode(String name){
        Node node = new Node();
        node.setName(name);
        graph.add(node);
        System.out.println("Done");
    }
    public void createNode(String name, HashMap<Node, Integer>refs){
        Node node = new Node();
        node.setName(name);
        node.setRefs(refs);
        graph.add(node);
        System.out.println("Done");
    }

    public Node getNode(Node node){
        return (Node) graph.find(node).getData();
    }

    public void deleteNode(Node node){
        Nodo del = graph.find(node);
        graph.removeByValue(del);
        System.out.println("Done");
    }

    public void addRef(Node host, Node ref, int weight){
        host.addRef(ref, weight);
    }

    public static void main(String args[]){
        Graph graph1 = new Graph();

        for(int i=0;i<graph1.graph.getSize();i++){
            graph1.createNode("San Jose");
            graph1.createNode("Alajuela");
            graph1.createNode("Heredia");
            graph1.createNode("Cartago");
            graph1.createNode("Liberia");
        }
        System.out.println(graph1);
    }
}
