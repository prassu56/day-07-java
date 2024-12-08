import java.util.*;
public class Movingzerostotheend{
    public static void main(String[]args){
        int arr[]={1,0,0,12,0,22,11};
        int n=arr.length;
        int temp[]=new int[n];
        int p=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                temp[p]=arr[i];
                p++;
            }
        }
        System.arraycopy(temp,0,arr,0,n);
        System.out.println(Arrays.toString(arr));
    }
}