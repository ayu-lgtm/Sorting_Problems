import java.util.Arrays;

public class Meeting_Maximum_Guest {
    public static void maxguest(int arr[],int dep[],int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1,j=0,curr=1,res=1;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                curr++;
                i++;
            }
            else if(arr[i]>dep[j]){
                j++;curr--;
            }
            res=Math.max(res,curr);
        }

        System.out.print(res);
        
    }
    public static void main(String args[]){
        int arr[]={800,700,600,500};
        int dep[]={840,820,830,530};
        maxguest(arr,dep,arr.length);
    }
}
