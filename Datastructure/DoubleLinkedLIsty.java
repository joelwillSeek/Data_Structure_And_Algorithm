package Datastructure;
import Common_class.Convenience;

public class DoubleLinkedLIsty {

    //TODO:write a  methods for getindex

    Convenience con=new Convenience();

    private class Node{
        int data;
        Node prev,next;
        Node(int data){
            this.data=data;
            prev=null;
            next=null;
        }
    }

    Node head=null;

    Node tail=null;

    int size=0;

    public void insertFront(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            tail=newNode;
            ++size;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        ++size;
    }

    public void insertLast(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            tail=newNode;
            ++size;
            return;
        }

        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        ++size;
    }

    public void insertAtIndex(int index,int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            tail=newNode;
            ++size;
            return;
        }else if(index==0){
            insertFront(data);
            return;
        }else if(index==size-1){
            insertLast(data);
            return;
        }else if(index>size-1){
            con.print("\nIndex out of bounds.\n");
            return;
        }else if(index<0){
            con.print("\nIndex cant be negative.\n");
            return;
        }
        int i=0;
        Node temp=head;
        while(i<size){
            if(index==i){
                newNode.prev=temp.prev;
                newNode.next=temp;
                temp.prev.next=newNode;
                temp.prev=newNode;
                ++size;
                return;
            }
            ++i;
            temp=temp.next;
        }
        
    }

    public void removeFront(){
        if(isEmpty()){
            con.print("\n No Linked List.\n");
            return;
        }
        head=head.next;
        head.prev.next=null;
        head.prev=null;
        --size;
    }

    public int getSize(){
        return size;
    }

    public  void removeLast(){
        if(isEmpty()){
            con.print("\n No Linked List.\n");
            return;
        }
        tail=tail.prev;
        tail.next.prev=null;
        tail.next=null;
        --size;
    }

    public void removeAtIndex(int index){
        if(isEmpty()){
            con.print("\n No Linked List.\n");
            return;
        }else if(index==0){
            removeFront();
            return;
        }else if(index==size-1){
            removeLast();
            return;
        }else if(index>size-1){
            con.print("\nIndex out of bounds.\n");
            return;
        }else if(index<0){
            con.print("\nIndex cant be negative.\n");
            return;
        }

        Node temp=head;
        int i=0;

        while(i<size){
            if(i==index){
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;
                temp.next=null;
                temp.prev=null;
                temp=null;
                --size;
                return;
            }
            ++i;
            temp=temp.next;
        }
    }

    public int getIndex(int index){
        if(isEmpty()){
            con.print("\n No Linked List.\n");
            return Integer.parseInt(null);
        }else if(index==0){
            return getFront();
        }else if(index==size-1){
            return getLast();
        }else if(index>size-1){
            con.print("\nIndex out of bounds.\n");
            return Integer.parseInt(null);
        }else if(index<0){
            con.print("\nIndex cant be negative.\n");
            return Integer.parseInt(null);
        }
        Node temp=head;
        int i=0;
        while(i<size){
            if(i==index){
                return temp.data;
            }
            ++i;
            temp=temp.next;
        }
        return Integer.parseInt(null);
    }

    public int getFront(){
        if(isEmpty()){
            con.print("\nNo Linked List.\n");
            return Integer.parseInt(null);
        }
        return head.data;
    }

    public int getLast(){
        if(isEmpty()){
            con.print("\nNo Linked List.\n");
            return Integer.parseInt(null);
        }
        return tail.data;
    }

    public void display(){
        Node temp=head;
        con.print("Head->");
        while(temp!=null){
            con.print(temp.data+"->");
            temp=temp.next;
        }
        con.print("Tail\n");
    }

    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }

}
