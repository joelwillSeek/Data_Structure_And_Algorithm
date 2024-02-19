package Datastructure;

import Common_class.Convenience;

public class Heaps {
    //tree based
    //min heap is the root is the smallest and every level get larger
    //max heap is the root is the largest and every level get smaller
    //all level must be complete except for the last row
    //use array for left to right each level.
    //removal: pop of the root node and move up the last item in the heap then bubble down.
    //with array:-
    //arra[(i-1)/2]:parent node
    //arra[(i*2)+1]:left child node
    //arra[(i*2)+2]
    //use to sort, priority Queue
    
    int[] heap=new int[10];
    int actualheapsize=0;

    Convenience con=new Convenience();

    public void insert(int data){
       heap[actualheapsize++]=data;
        int pos=actualheapsize-1;
       while(pos>0&&data<heap[parent(pos)]){
        heap[pos]=heap[parent(pos)];
        pos=parent(pos);
       }
       heap[pos]=data;
    }

    private int parent(int i){
        return (i-1)/2;
    }


    public void display(){
        for(int i=0;i<heap.length;i++){
            con.printlnInt(heap[i]);
        }
    }

    private boolean isEmpty(){
        if(heap.length==0){
            return true;
        }
        return false;
    }

}
