package Algorithms;

import java.util.LinkedList;

import Common_class.Convenience;
import Datastructure.Graphs;
import Datastructure.LinkedLIsttest;
import Datastructure.Queue;

public class BFS {
    Graphs.adjecymetrix.AdjecenyMetrix nodesList;
    Convenience con;

    /*
     * Breadth FS = Traverse agraph level by level
     *              Utilizes a Queue
     *              Better if destination is on average close to start
     *              Siblings are visited before chilren
     */

    public BFS(){
        nodesList= new Graphs.adjecymetrix.AdjecenyMetrix(4);
        con=new Convenience();
        nodesList.addNode('A');
        nodesList.addNode('B');
        nodesList.addNode('C');
        nodesList.addNode('D');
        nodesList.createEdge(0, 1);
        nodesList.createEdge(1, 0);
        nodesList.createEdge(1, 2);
        nodesList.createEdge(2, 0);
        nodesList.createEdge(2, 1);
        nodesList.createEdge(3, 0);
        nodesList.createEdge(0, 3);
    }

    public void breathFirstSearch(int src){
        LinkedLIsttest queuLinkedLIsttest=new LinkedLIsttest();
        boolean[] visted=new boolean[nodesList.getMetrixSize()];

        visted[src]=true;
        queuLinkedLIsttest.insertLast(src);

        while(!queuLinkedLIsttest.isEmpty()){
            src=queuLinkedLIsttest.getFront();
            queuLinkedLIsttest.removeFirst();

            con.print( nodesList.getRowChar(src)+" ");

            for(int i=0;i<nodesList.getRowSize(src);i++){
                if(visted[i]==false&&nodesList.checkEdge(src, i)){
                    visted[i]=true;
                    queuLinkedLIsttest.insertLast(i);
                }
            }
        }
    }
}
