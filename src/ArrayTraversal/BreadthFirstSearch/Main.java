package ArrayTraversal.BreadthFirstSearch;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<Character, Character[]> graph = new HashMap<>();

    public static void main(String[] args){
        initializeGraph();

        Queue nodes = new Queue('a');

        while(nodes.length() > 0){
            char current = nodes.pop();

            System.out.print(current);

            for(char node : graph.get(current)) nodes.push(node);
        }
    }

    public static void initializeGraph(){
        graph.put('a', new Character[]{'b', 'c'});
        graph.put('b', new Character[]{'d'});
        graph.put('c', new Character[]{'e'});
        graph.put('d', new Character[]{'f'});
        graph.put('e', new Character[]{});
        graph.put('f', new Character[]{});
    }
}
