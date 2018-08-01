
import java.awt.print.Book;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fundsindia
 */
public class DFSgraph {

        private int Vertex;
        private LinkedList<Integer> adj[];

        DFSgraph(int v) {
            Vertex = v; 
            adj = new LinkedList[Vertex];
            for (int i = 0; i < Vertex; i++) {
                adj[i] = new LinkedList();
            }
        }

        void addEdge(int v, int w) {
           adj[v].add(w);
        }
        void DFSUtil(int v, boolean[] visited) {
            visited[v] = true;
            System.out.println(v);
            Iterator<Integer> it = adj[v].listIterator();
            while (it.hasNext()) {
                int n = it.next();
                if (!visited[n]) {
                    DFSUtil(n, visited);
                }
            }
        }
        void DFS(int v){
         boolean[] visited = new boolean[Vertex];
            DFSUtil(v, visited);
        }
    
    
    public static void main(String[] args){
        DFSgraph g = new DFSgraph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal "
                + "(starting from vertex 2)");

        g.DFS(2);
    
 }
}