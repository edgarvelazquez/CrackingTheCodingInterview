//Chapter 4
//4.1 problem
/**
 * Definition for Directed graph.
 * class DirectedGraphNode {
 *     int label;
 *     ArrayList<DirectedGraphNode> neighbors;
 *     DirectedGraphNode(int x) {
 *         label = x;
 *         neighbors = new ArrayList<DirectedGraphNode>();
 *     }
 * };
 */


public class Solution {
    /*
     * @param graph: A list of Directed graph node
     * @param s: the starting Directed graph node
     * @param t: the terminal Directed graph node
     * @return: a boolean value
     */
    public boolean hasRoute(ArrayList<DirectedGraphNode> graph, DirectedGraphNode s, DirectedGraphNode t) {
        // write your code here
        if(s == null || t == null)return false; // if they are empty
        if(s.label== t.label) return true; // if we get the same node for both
        
        ArrayList<DirectedGraphNode> visited = new ArrayList<DirectedGraphNode>();
        Queue<DirectedGraphNode> q = new LinkedList<DirectedGraphNode>();
        q.add(s);
        while(q.size() != 0) {
            DirectedGraphNode temp = q.remove();
            if(!visited.contains(temp)){
                visited.add(temp);
                for(DirectedGraphNode i: temp.neighbors){
                    if(i.label==t.label) {
                        return true;
                    } else {
                        if(!q.contains(i)) {
                          q.add(i);  
                        }
                    }
                }
            }
        }
        return false;
        
    }
    
}