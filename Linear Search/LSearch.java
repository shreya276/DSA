// search from 1st index to last index one by one
class LSearch{
    static int linearSearch(int arr[], int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){   
            if(arr[i]==target){
                return i;
            }
        };
        return -1;
        
    }
    public static void main(String[] args){
        int [] arr={1,2,3,54,6,7,89};
        int target=89;
        System.out.println(linearSearch(arr, target));
    }
}