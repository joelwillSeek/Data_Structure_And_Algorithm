package Algorithms;

import Common_class.Convenience;;

public class BubbleSort {
    static Convenience con=new Convenience();
// n^2
//okay for small data set
//Bad for large data set
    public void sortThis(int[] v){
        for(int i=0;i<v.length-1;i++){
            for(int j=0;j<v.length-i-1;j++){
                
                if(v[j]>v[j+1]){
                    con.SwapIndex(v, j, j+1);
                }
            
            }
        }
    }
}