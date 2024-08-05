package Arrays;
//Find triplet whose sum will be zero in an array
public class FindZeroTriplets {
    public static void main(String[] args) {

        // For failure ---> int arr[] = {1,2,3,4,5,6};
        int arr[] = {0, -1, 2, -3, 1};
        int flag=0;
        for (int i = 0; i <arr.length-2 ; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        flag=1;
                    }
                }

            }

        }
        if(flag==0)
            System.out.println("Zero Triplet not present");
    }
}
