package Algorithms;

import Datastructure.Graphs;
import Common_class.Convenience;

public class DFS{

    /*
     * Depth FIrst Search = Pick a route, keep going.
     *                      If you reach a dead end, or an already visited node,
     *                      backtrack to a previous node with unvisited adjacent neighbors.
     */
    Convenience con=new Convenience();
    Graphs.adjecymetrix.AdjecenyMetrix adjMetrics=new Graphs.adjecymetrix.AdjecenyMetrix(4);
    public DFS(){
        adjMetrics.addNode('A');
        adjMetrics.addNode('B');
        adjMetrics.addNode('C');
        adjMetrics.addNode('D');
        adjMetrics.createEdge(0, 1);
        adjMetrics.createEdge(1, 2);
        adjMetrics.createEdge(1, 0);
        adjMetrics.createEdge(2, 0);
        adjMetrics.createEdge(2, 1);
        adjMetrics.createEdge(2, 3);
    }

    public void search(int src){
        boolean[] visted=new boolean[adjMetrics.getMetrixSize()];
        searchHelper(visted,src);
        con.nextLine();
    }

    private void searchHelper(boolean[] visted,int src){
        if(visted[src]){
            return;
        }else{
            con.print(String.valueOf(adjMetrics.getRowChar(src))+"->");
            visted[src]=true;
        }

        for(int i=0;i<adjMetrics.getRowSize(src);i++){
            if(adjMetrics.checkEdge(src, i)){
                searchHelper(visted, i);
            }
        }
    }
}