/*
How to implement a graph from scratch:  View code below

When is the best time to implement a graph?



Look up time and insertion time:


*/

public class Graph{
  private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();  //would be used for getNode and addEdge to get access to a particular node
  
  public static class Node {
    private int id;
    LinkedList<Node> adjacent = new LinkedList<>();   //this will allow you to iterate through all of the nodes that one node is connected too.
    private Node(int id){
      this.id = new Id
    }
  }
  
  private Node getNode(int id){...}.  //using the HashMap nodeLookup to get node using O(1) lookup time then returns Node
  
  
//   public void addEdge(int source, int destination){
//      Node s = getNode(source);
//      Node d = getNode(destination);
//      s.adjacent.add(d);
//   }
    
    
    
    
    
  
  public boolean hasPathDFS(int source, int destination){. //out facing method
    Node s = getNode(source); 
    Node d = getNode(destination);
    HashSet<Integer> visited = new HashSet<>();  //replacement for flags, so you don't have to add a flag to a node, and still track what you have visited
    return hasPathDFS(s, d, visited);     
  }
  
  
  
    private boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited){  //behind the scene method
      if(visited.contains(source.id)){
        return false;  //if the hashset already contains the source id, then we have already checked to see if it was our destination and determined that it wasn't
    }
    
    visited.add(source.id); //adding the node that we are checking into the hashset
    if(source == destination) return true;   //we have found the node that we were looking for
    
    for(Node child: source.adjacent){   //we have not found the node, we are going to check all of the current nodes adjacent nodes (LinkedList in Graph class)
      if(hasPathDFS(child, destination, visited)) return true;
    }
    //if we have checked every node in the graph and haven't found the destination node, return false
    return false;
  }
  
  
  
  
  
  
  
  Public boolean hasPathBFS(int source, int destination){ //method that the user would access
    return hasPathBFS(getNode(source), getNode(destination));
  }
  
  
  private boolean hasPathBFS(Node source, Node destination){   //behind the scenes method
    LinkedList<Node> nextToVisit = new LinkedList<>();
    HashSet<Integer> visited = new HashSet<>();
    nextToVisit.add(source);
    while(!nextToVisit.isEmpty()){
      Node node = nextToVisit.remove();
      
      if(node == destination) return true; //found the node that you are looking for
      
      if(visited.contains(source.id)) continue; 
      
      visited.add(node.id);
      
      for(Node child: node.adjacent){
        nextToVisit.add(child);
      }
      
      return false;  //if you get to the end and still haven't found your source, return false
    }
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
