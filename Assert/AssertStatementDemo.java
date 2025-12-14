package Assert;

import java.util.Arrays;

public class AssertStatementDemo {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        //AssertionExceptiion will come. Used for debugging purpose
        assert arr.length>10 : "Length must be greater that 10";
        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum of array : "+sum);
    }
}
