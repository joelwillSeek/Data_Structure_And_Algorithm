package Algorithms;

import Common_class.Convenience;

public class TertairySearch {
    Convenience con=new Convenience();
    int[] a;
    public TertairySearch(){
        a=new int[]{1,2,3,4,5,6,7,8,9,10};
    }

    public boolean search(int value){
        return searchHelper(0,a.length-1,value,a);
    }

    private boolean searchHelper(int start,int end,int value,int[] array){
        if(end>=start){
            int mid1=start+(end-start)/3;
            int mid2=end-(end-start)/3;

            if(array[mid1]==value){
                return true;
            }else if(array[mid2]==value){
                return true;
            }else if(value<array[mid1]){
                return searchHelper(start, mid1-1, value, array);
            }else if(value>array[mid2]){
                return searchHelper(mid2+1, end, value, array);
            }else if(array[mid1]<value&&array[mid2]>value){
                return searchHelper(mid1+1, mid2-1, value, array);
            }
        }

        return false;
    }
}
