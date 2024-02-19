package Algorithms;



public class InsertionSort{

    public void sort(int[] v){
        for(int i=1;i<v.length;i++){
            int temp=v[i],j=i-1;
            
            while(j>=0&&v[j]>temp){
                v[j+1]=v[j];

                --j;
            }
            v[j+1]=temp;
            
        }
    }

}