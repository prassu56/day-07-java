/* sum of array elements
11/1=11
11+2=13/2=6
11+2+3=16/3=5
11+2+3+4=20/4=5
11+2+3+4+3=23/5=4
*/
import java.util.*;
public class Sumofgivenementsdividedbythenoofsumelements{
    public static void main(String[]args){
        int a[]={11,2,3,4,3};
        int s=0;
        for(int i=0;i<a.length;i++)
        {
            s+=a[i];
            int res=s/(i+1);
            a[i]=res;
        }
        System.out.println(Arrays.toString(a));
    }
}