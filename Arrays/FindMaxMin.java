package Arrays;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.sql.SQLOutput;
import java.util.*;

public class FindMaxMin {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,1,20,35,12};
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("Max : "+max+" , Min :"+min);

        //Using stream
        System.out.println(Arrays.stream(arr).min().getAsInt());
        System.out.println(Arrays.stream(arr).max().getAsInt());
        System.out.println(Arrays.stream(arr).reduce(0,(a,b)-> a>b ? a:b));
    }
}
