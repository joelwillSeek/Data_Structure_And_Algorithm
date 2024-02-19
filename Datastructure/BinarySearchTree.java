package Datastructure;

import Common_class.Convenience;

public class BinarySearchTree {
    Convenience con;
    Node root;

    /*Binary search tree = A tree data structure, where each node is greater than it' left child,
                          but less than it's right.
                          Easy to locate a node when they are in this order
                          time complexity: best case O(log n)
                                            worst case O(n)
                          Space complexity:O(n)
     * 
     */

    private static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){ 
            this.data=data;
        }
    }

    public BinarySearchTree(){
        con=new Convenience();
    }
    
    public void insert(int data){
        Node newnode=new Node(data);

        root = insertHelper(root,newnode);
    }

    private Node insertHelper(Node root,Node newNode){
        
        if(root==null){
            root=newNode;
            return root;
        }
        if(newNode.data<=root.data){
            root.left=insertHelper(root.left,newNode);
        }else{
            root.right=insertHelper(root.right,newNode);
        }
        return root;
    }

    public boolean search(int data){
        if(!IsEmpty()){
            return searchHelper(root,data);
        }else{
            con.print("\nNo Tree.\n");
            return false;
        }
    }

    private boolean searchHelper(Node root,int data){

        if(root==null){
            return false;
        }else if(data<root.data){
            return searchHelper(root.left, data);
        }else if(data>root.data){
            return searchHelper(root.right, data);
        }else{//node found
            return true;
        }
    }

    public void display(){
        if(IsEmpty()){
            con.print("\nNo Tree\n");
        }else{
            displayHelper(root);
        }
    }

    private void displayHelper(Node root){
        if(root==null){
            return;
        }else{
            //left->root->right
            displayHelper(root.left);
            con.printlnInt(root.data);
            displayHelper(root.right);
            //left->right->root
            displayHelper(root.left);
            displayHelper(root.right);
            con.printInt(root.data);
            //root->left->right
            con.printInt(root.data);
            displayHelper(root.left);
            displayHelper(root.right);
        }
    }

    public void remove(int data){
        if(search(data)){
            removeHelper(root,data);
        }else{
            con.print("\nNo Such Value.\n");
        }
    }

    private Node removeHelper(Node root,int data){
        if(root==null){
            return root;
        } else if(root.data==data){
            //leaf node
            if(root.left==null&&root.right==null){
                root=null;
            }else if(root.right!=null){
                root.data=successor(root.right);
                root.right=removeHelper(root.right, root.data);
            }else if(root.left!=null){
                root.data=predccsor(root.left);
                root.left=removeHelper(root.left, root.data);
            }
        } else if(data<root.data){
            root.left=removeHelper(root.left, data);
        }else if(data>root.data){
            root.right=removeHelper(root.right, data);
        }
        return root;
    }

    private int successor(Node root){
        if(root.left==null){
            return root.data;
        }else{
            successor(root.left);
        }

        return -1;
    }

    private int predccsor(Node root){
        if(root.right==null){
            return root.data;
        }else{
            predccsor(root.right);
        }

        return -1;
    }

    public boolean IsEmpty(){
        if(root==null){
            return true;
        }
        return false;
    }

}
