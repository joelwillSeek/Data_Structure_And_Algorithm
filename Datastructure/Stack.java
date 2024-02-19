package Datastructure;
public class Stack {
    private LinkedLIsttest list=new LinkedLIsttest();


    public void Push(int val){
        list.insertFront(val);
    }

    public void read(){
        print(String.valueOf(list.getFront()));
    }

    public void POP(){
        if(list.isEmpty()){
            print("No Stack");
        }else{
            print("Poped!");
            list.removeFirst();
        }
    }

    private void print(String v) {
        System.out.println(v);
    }
}
