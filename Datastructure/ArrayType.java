package Datastructure;


    public class ArrayType {
        int[] list;
        int count=-1;
        public ArrayType(int size){
           list=new int[size];
        }
        
    
        public void add(int v){
            if(list.length==count){
                int[] newlist=new int[count*2];
                for(int i=0;i<count;i++){
                    newlist[i]=list[i];
                }
                list=newlist;
            }
    
            list[++count]=v;
        }
    
       public  void remove(int v){
            if(v<0||v>=count){
                throw new IllegalArgumentException();
            }
    
            for(int i=v;i<count;i++){
                list[i]=list[i+1];
               // pintme(count);
            }
            count--;
        }
    
       public  void print(){
            for(int i=0;i<count;i++){
                pintme(list[i]);
    
            }
        }
    
    
        public Boolean searchNum(int v,int index){
            pintme(index);
            if(list[index]==v) return true;
            else if(index>=count)return false;
                
            return searchNum(v, ++index);
        }
    
       public void pintme(int v){
            System.out.println(v);
        }
    }
