package Algorithms;
public class InterpolationSearch {
    //an improvment from binary search
    //average case:o(log(log n))
    //worst case:O(n)
    public int interpolit(int[] list,int high,int low,int val){
        int pos;
        if(low<=high&&val>=list[low]&&val<=list[high]){
            
            pos=low+((val-list[low])*(high-low)/(list[high]-list[low]));
            System.out.println(pos);
            if(list[pos]==val) return list[pos];

            if(list[pos]<val) return interpolit(list, high, pos+1, val);

            if(list[pos]>val) return interpolit(list, pos-1, low, val);
        }
        
        
        return -1;
        
    }
}
