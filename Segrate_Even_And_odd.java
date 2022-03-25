
import java.util.Arrays;

public class Segrate_Even_And_odd  {
    public static void sort(int arr[]){
        int i=-1,j=arr.length;
        while(true){
            do{
                i++;
            }while(arr[i]%2==0);
            do{
                j--;
            }while(arr[j]%2!=0);
            if(i>=j){
                return ;
            }
            swap(arr,i,j);
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String args[]){
        int arr[]={15,-3,-2,18,7};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
