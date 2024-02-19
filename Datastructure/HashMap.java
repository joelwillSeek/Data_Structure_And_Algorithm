package Datastructure;
import java.util.Hashtable;
import Common_class.Convenience;

public class HashMap {
    Convenience con=new Convenience();
    Hashtable<Integer,String> table=new Hashtable<>(10);
    public void add(int key,String v){
        table.put(key,v);
    }

    public void get(int key){
        con.print(table.get(key));
    }

    public void getAll(){
        for(int key : table.keySet()){
            con.print(key+"\t"+table.get(key));
        }
    }

    public void remove(int key){
        table.remove(key);
    }

    public void hashcode(){
        for(Integer key : table.keySet()){
            con.print(key.hashCode()%10+"\t"+key+"\t"+table.get(key));
            con.nextLine();
        }
    }
}
