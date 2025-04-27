// import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int target=7;
        System.out.println(bsearch(arr, target));
    }
    static int bsearch(int arr[], int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
           int mid=start+(end-start)/2;

           if(target<mid){
            return end=mid-1;
           }
           else if(target>mid){
            return start=mid+1;
           }
           else{
            return mid;
           }
        }
        return -1;
    }
}
