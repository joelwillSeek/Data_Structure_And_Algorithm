package Algorithms;

import Common_class.Convenience;
public class SelectionSort {
    Convenience con =new Convenience();
    int temp;
    //n^2
    //okay for small set of data
    //bad for large set of data
    public void sortThis(int[] v){
        for(int i=0;i<v.length;i++){
            int min=i;
            for(int j=i+1;j<v.length;j++){
                if(v[j]<v[min]){
                    min=j;
                }
            }
           con.SwapIndex(v, i, min);
        }   
    }
}
