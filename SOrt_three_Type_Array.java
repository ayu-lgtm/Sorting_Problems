import java.util.Arrays;

public class SOrt_three_Type_Array {
    public static void function(int arr[],int n){
        int mid=0,low=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr, mid, low);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr, mid, high);
                high--;
            }
        }
    }
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String args[]){
        int arr[]={0,1,2,0,1,0,2,1,0,2};
        function(arr,arr.length);
        System.out.print(Arrays.toString(arr));
    }
}
