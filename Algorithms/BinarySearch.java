package Algorithms;

public class BinarySearch {

    public String search(int[] theList,int val){
        
        return recursiveFind(theList,val,theList.length,0);
    }

    private String recursiveFind(int[] list,int val,int high,int low){

        int mid= Math.round((high+low)/2);
        String returenter=null;
        System.out.println(low+" and "+high+"mid"+mid);
        

        
        if(val==mid){
            return "Found";
        }if(low>high){
            return "Not Found";
        }else if(mid<val){
            returenter= recursiveFind(list, val, high, mid+1);
        }else if(mid>val){
            returenter= recursiveFind(list, val, mid-1, low);
        }
        return returenter;
    }
}
