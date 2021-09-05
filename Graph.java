/*
How to implement a graph from scratch:  View code below



When is the best time to implement a graph?



Look up time and insertion time:


*/

public class Graph{
  private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();
  
  public static class Node {
    private int id;
    LinkedList<Node> adjacent = new LinkedList<>();   //this will allow you to iterate through all of the nodes that one node is connected too.
    private Node(int id){
      this.id = new Id
    }
  }
  
  private Node getNode(int id){...}
  
  
  public void addEdge(int source, int destination){
     Node s = getNode(source);
     Node d = getNode(destination);
     s.adjacent.add(d);
  }
  
  public boolean hasPathDFS(int source, int destination){. //out facing method
    Node s = getNode(source); 
    Node d = getNode(destination);
    HashSet<Integer> visited. = new HashSet<>();  //this will stop you from going into an infinite loop, by checking if you've visited the node before
    return hasPathDFS(s, d, visited);     
  }
  
  private boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited){  //behind the scene method
    if(visited.contains(source.id)){
      return false;  //if the hashset already contains the source id, then we have already checked to see if it was our destination and determined that it wasn't
    }
    
    visited.add(source.id); //adding the node that we are checking into the hashset
    if(source == destination) return true;   //we have found the node that we were looking for
    
    for(Node child: source.adjacent){   //we have not found the node, we are going to check all of the current nodes adjacent nodes
      if(hasPathDFS(child, destination, visited)) return true;
    }
    
    //if we have checked every node in the graph and haven't found the destination node, return false
    return false;
  }
  
  public boolean hasPathBFS(int source, int destination){
    LinkedList<Node> nextToVisit = new LinkedList<>();
    HashSet<Integer> visited = new HashSet<>();
    nextToVisit.add(source);
    while(!nextToVisit.isEmpty()){
      Node node = nextToVisit.remove();
      
      if(node == destination) return true; found the node that you are looking for
      
      if(visited.contains(source.id)) continue; 
      
      visited.add(node.id);
      
      for(Node child: node.adjacent){
        nextToVisit.add(child);
      }
      
      return false;  //if you get to the end and still haven't found your source, return false
    }
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
