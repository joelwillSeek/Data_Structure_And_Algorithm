package Common_class;
public  class Convenience{
    public Convenience(){
    }

    public void clearScreen(){
        for(int i=0;i<5;i++){
            print("\n");
        }
    }

    public  void println(String v){
        	System.out.println(v);
    }

    public void printlnbool(boolean v){
        System.out.println(String.valueOf(v));
    }

    public  void print(String v){
        System.out.print(v);
    }
    public  void printlnInt(int v){
        System.out.println(String.valueOf(v));
    }
    public  void printlnFloot(Float v){
        System.out.println(String.valueOf(v));
    }

    public  void printInt(int v){
        System.out.print(String.valueOf(v));
    }
    public  void printFloot(Float v){
        System.out.print(String.valueOf(v));
    }

    public void SwapIndex(int[] v,int a,int b){
       int temp=v[a];
        v[a]=v[b];
        v[b]=temp;
    }

    public void printArrayInt(int[] list){
        for(int e : list){
            printInt(e);
        }
    }

    public void nextLine(){
        print("\n");
    }

    public void exit(){
        System.exit(0);
    }

    public int[] Slice(int[] list,int begin,int end){
        int[] newList=new int[50];
        for(int i=begin;i<end;i++){
            newList[i]=list[i];
        }
        return newList;
    }


    public void printlnLong(long v){
        System.out.println(v);
    }
}