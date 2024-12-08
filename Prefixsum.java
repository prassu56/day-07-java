import java.util.*;
public class Prefixsum{
    public static void main(String[]args){
        int a[]={11,2,3,4,3,};
        int pre[]=new int[a.length];
        pre[0]=a[0];
        for(int i=1;i<a.length;i++)
        pre[i]=pre[i-1]+a[i];
        System.out.println(Arrays.toString(pre));
    }
}