package Algorithms;

import Common_class.Convenience;
public class QuickSort {
    Convenience c=new Convenience();

    //O(nlogn)
    
    public void quickSort(int[] list ,int left,int right){
        if(left>=right) return;
        


        int pivot=parition(list ,left,right);
       
        quickSort(list, left, pivot-1);
        quickSort(list, pivot+1, right);

    }

    private int parition(int[] list,int left,int right) {
        int j=(left-1);
        int pivot=right;

        for(int i=left;i<right;i++){
            if(list[i]<=list[pivot]){
                ++j;
                c.SwapIndex(list, j, i);
            }
        }
        ++j;
        c.SwapIndex(list, j, pivot);
       
        return j;
    }
}
