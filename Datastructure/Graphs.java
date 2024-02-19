package Datastructure;
import java.util.ArrayList;
import java.util.LinkedList;
import Common_class.Convenience;

public class Graphs {
    static Convenience con=new Convenience();

    public static class adjecymetrix{
         /*
     * Adjaceny Matrix = An array to store 1's/-'s' to represent edhaes
     *                 runtime complexity to check an edge: o(1)
     *                 Space complexity: o(v^2)
     */
    
    private static class Node{
        char data;

        Node(char data){
            this.data=data;
        }
    }

    public static class AdjecenyMetrix{

        ArrayList<Node> nodes;
        int[][] metrix;
        public AdjecenyMetrix(int size){
            metrix=new int[size][size];
            nodes=new ArrayList<>();
        }

        public int getMetrixSize(){
            return metrix.length;
        }

        public int getRowSize(int src){
            return metrix[src].length;
        }

        public char getRowChar(int src){
            return  (char)nodes.get(src).data;
        }

        public void addNode(char v){
            Node newNode=new Node(v);
            nodes.add(newNode);
        }

        public void createEdge(int src,int dist){
            metrix[src][dist]=1;
        }

        public boolean checkEdge(int src,int dist){
            if(metrix[src][dist]==1){
                return true;
            }else{
                return false;
            }
        }

        public void print(){
            con.print("  ");
            for(int i=0;i<nodes.size();i++){
                con.print(String.valueOf(nodes.get(i).data )+" ");
            }
            con.nextLine();
            for(int i=0;i<metrix.length;i++){
                con.print(String.valueOf(nodes.get(i).data)+" ");
                for(int j=0;j<metrix[i].length;j++){
                    
                    con.print(metrix[i][j]+" ");
                }
                con.nextLine();
            }
        }
    }

    }

   public static class ajecylist{
        static private class Node{
            char data;
            Node(char data){
                this.data=data;
            }
        }

        public static class adjcentList{
            
            ArrayList<LinkedList> nodeList=new ArrayList<>();

            public void addNode(char v){
                Node newNode=new Node(v);
                LinkedList<Node> b=new LinkedList<>();
                b.add(newNode);
                nodeList.add(b);
            }

            public void createEdge(int src,int dist){
                LinkedList<Node> currLinkedList=nodeList.get(src);

                Node distNode=(Graphs.ajecylist.Node) nodeList.get(dist).get(0);

                currLinkedList.add(distNode);
            }

            public boolean checkEdge(int src,int dist){
                LinkedList<Node> curLinkedList=nodeList.get(src);
                Node distNode= (Graphs.ajecylist.Node) nodeList.get(dist).get(0);
                for(Node p : curLinkedList){
                    if(p==distNode){
                        return true;
                    }
                }
                return false;
            }

            public void print(){
                for(LinkedList<Node> p: nodeList){
                    for(Node f : p){
                        con.print(f.data+"->");
                    }
                    con.print("\n");
                }
            }
        }
    }
   
}
