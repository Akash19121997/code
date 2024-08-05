package Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int arr[] = {5, 20, 35, 40 ,50};
        int value =35;
        int newArr[] = new int[arr.length-1];

        for (int i = 0, j=0; i < arr.length; i++) {
            if(arr[i] != value)
                newArr[j++] = arr[i];
        }
        for (int a : newArr) {
            System.out.println(a);
        }
    }
}
