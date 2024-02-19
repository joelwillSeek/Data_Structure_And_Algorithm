package Datastructure;
public class Queue {
    private LinkedLIsttest list =new LinkedLIsttest();

    public void Push(int val){
        list.insertFront(val);
    }

    public int Pop(){
        int a = list.getFront();
        list.removeFirst();
        return a;
    }

}
