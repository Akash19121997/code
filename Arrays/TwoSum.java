package Arrays;
// Takes two parameters and returns an array containing the indices of two numbers int the array ttat sum to the target integer
public class TwoSum {

    public static void main(String[] args) {
        int arr[] = {1, 9, 5, 3, 5};
        int sum = 10;
        for(int i=0; i<arr.length-1; i++ ){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum)
                    System.out.println(i+"  "+j);
            }
        }
    }
}
