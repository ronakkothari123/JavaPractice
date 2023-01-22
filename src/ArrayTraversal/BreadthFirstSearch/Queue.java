package ArrayTraversal.BreadthFirstSearch;

import java.util.ArrayList;

public class Queue {
    public ArrayList<Character> nodes = new ArrayList<>();

    public Queue(char startingNode){
        nodes.add(startingNode);
    }

    public void push(char node){
        nodes.add(node);
    }

    public char pop(){
        char element = nodes.get(0);
        nodes.remove(0);
        return element;
    }

    public int length(){
        return nodes.size();
    }
}
