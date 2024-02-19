package Algorithms;
public class MergeSort {
    public void sort(int[] list){
        if(list.length<2){
            return;
        }

        int mid=list.length/2;
        int[] left=new int[mid];
        int[] right=new int[list.length-mid];

        for(int i=0;i<mid;i++){
            left[i]=list[i];
        }

        for(int i=mid;i<list.length;i++){
            right[i-mid]=list[i];
        }

        sort(left);
        sort(right);

        merge(list,left,right);
    }

    private void merge(int[] lsit,int[] left,int[] right){
        int indexLeft=0;
        int indexRight=0;
        int indexCurrent=0;

        while(indexLeft<left.length&&indexRight<right.length){
            if(left[indexLeft]<=right[indexRight]){
                lsit[indexCurrent++]=left[indexLeft++];
            }else{
                lsit[indexCurrent++]=right[indexRight++];
            }
        }

        while(indexLeft<left.length){
            lsit[indexCurrent++]=left[indexLeft++];
        }

        while(indexRight<right.length){
            lsit[indexCurrent++]=right[indexRight++];
        }

    }
}
