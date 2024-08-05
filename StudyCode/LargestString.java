package StudyCode;

public class LargestString {
    public static void main(String[] args){
        String arr[] = {"Akash", "Rajesh", "Priyanka Das"};
        String largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest.length()<arr[i].length())
                largest = arr[i];
        }
        System.out.println(largest);
    }
}
