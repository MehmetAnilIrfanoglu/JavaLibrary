import java.util.ArrayList;
import java.util.List;

public class Graph {
    

List<List<Node>> adjacentList;

    
    public Graph(List<Edge> edge)
    {
    	adjacentList = new ArrayList<>();
    	
        for (int i = 0; i < edge.size(); i++) {
            adjacentList.add(i, new ArrayList<>());
        }
       
        for (int i=0;i<edge.size();i++)
        {
        	Edge e = edge.get(i);
        	Node temp = new Node(e.pair2, e.weight);
            adjacentList.get(e.pair1).add(temp);
        }
    }

    public static ArrayList<Integer> finditem(Graph graph,int find,boolean forFirst)  {
        int item = find;     
        ArrayList<Integer> elements = new ArrayList<Integer>();
       
        	if (forFirst) {
        		for (int i=0;i<graph.adjacentList.get(item).size();i++) {
        			Node edge = graph.adjacentList.get(item).get(i);
                    System.out.print("("+item+","+edge.item +") "+edge.cost +"\n");                 
                    elements.add(edge.item);
                }
                return elements;
        	}
        	else {
        		for (int i=0;i<graph.adjacentList.get(item).size();i++) {
        			Node edge = graph.adjacentList.get(item).get(i);
                    elements.add(edge.item);
                }
                return elements;
        		
        	}
       
    }
    
}