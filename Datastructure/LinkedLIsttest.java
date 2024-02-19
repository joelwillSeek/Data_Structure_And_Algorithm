package Datastructure;

import Common_class.Convenience;

public class LinkedLIsttest {
    Convenience con = new Convenience();

    private class Node {
        int data;
        Node next = null;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;
    int size = 0;

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = tail.next;
        }
        
        ++size;
        
    }

    public void insertFront(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        ++size;
    }

    public void insertInIndex(int index, int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            ++size;
            return;
        } else if (index > size - 1) {
            con.print("\nIndex out of bounds"+size);
            con.nextLine();
            return;
        }else if(index<0){
            con.print("Negative numbers not allowed.");
            con.nextLine();
            return;
        }else if(index==0){
            insertFront(data);
            return;
        }else if(index==size-1){
            insertLast(data);
            return;
        }

        if (insertInIndexHelper(index, data, 0, head)) {
            con.print("\n Inserted\n");
            ++size;
        } else {
            con.print("\nError can't insert\n");
        }
    }

    public int getSize(){
        return size;
    }

    public void display() {
        if (isEmpty()) {
            con.print("\nNo Linked List.\n");
            return;
        }
        Node temp = head;

        while (temp != null) {
            con.print(temp.data + "->");
            temp = temp.next;
        }
        con.print("Null");
        con.print("->Size: "+getSize());
        con.nextLine();
    }

    public void removeFirst(){
        if(isEmpty()){
            con.print("No linked list.");
            con.nextLine();
            return;
        }else{
            Node a=head;
            head=head.next;
            a.next=null;
            a=null;
            --size;
        }
    }

    public void removeLast(){
        if(isEmpty()){
            con.print("No linked list\n");
            return;
        }else{
            Node temp=head;
            Node prev=null;

            while(temp.next!=null){
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            tail=prev;
            temp=null;
            --size;
        }
    }

    public void removeOnIndex(int index){
        if(isEmpty()){
            con.print("No linked list.\n");
            return;
        }else if(index>size-1){
            con.print("Index out of bounds.\n");
            return;
        }else if(index<0){
            con.print("Index cant be negative\n");
            return;
        }else if(index==0){
            removeFirst();
            return;
        }else if(index==size-1){
            removeLast();
            return;
        }else{
            Node temp=head;
            Node prev=null;
            int i=0;
            while(i!=index){
                prev=temp;
                temp=temp.next;
                ++i;
            }
            prev.next=temp.next;
            temp.next=null;
            temp=null;
            --size;
        }
    }

    public int getFront(){
        if(isEmpty()){
            return head.data;
        }
        con.print("\nNo linked list.\n");
        return -1;
    }

    public int getLast(){
        if(isEmpty()){
            return tail.data;
        }
        con.print("\nNo linked list.\n");
        return -1;
    }

    public int getIndex(int index){
        if(isEmpty()){
            con.print("\nNo linked list\n");
            return -1;
        }else if(index<0){
            con.print("\nNo linked list\n");
            return -1;
        }else if(index>size-1){
            con.print("\nIndex out of bounds.\n");
            return -1;
        }else{
            Node temNode=head;

            int i=0;

            while(i!=index){
                temNode=temNode.next;
                ++i;
            }
            return temNode.data;
        }
    }

    private boolean insertInIndexHelper(int index, int data, int currentIndex, Node node) {
        con.print("+"+currentIndex);
        if (currentIndex > size) {
            return false;
        } else if (index == currentIndex+1) {
            con.print("index"+currentIndex+" "+node.data);
            Node newNode = new Node(data);
            newNode.next = node.next;
            node.next = newNode;
            return true;
        } else {
            return insertInIndexHelper(index, data, ++currentIndex, node.next);
        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

}
