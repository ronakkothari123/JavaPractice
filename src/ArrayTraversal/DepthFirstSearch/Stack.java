package ArrayTraversal.DepthFirstSearch;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Character> nodes = new ArrayList<>();

    public Stack(char startingNode){
        nodes.add(startingNode);
    }

    public void push(char node){
        nodes.add(node);
    }

    public char pop(){
        char element = nodes.get(nodes.size() - 1);
        nodes.remove(nodes.size() - 1);
        return element;
    }

    public int length(){
        return nodes.size();
    }
}
