import java.util.Scanner;

public class PoojaCode {
//    Programming Challenge: Word Counter
//    For this programming challenge, write a function in a .py file which takes 1 string as an argument, finds out the number of words in that string, then returns that number.
//    For example, if the program was used on the string "This is a string.", then the function would return 4.
//    Assumptions:
//    Assume that the string will be assigned to a variable and that it will contain at least 1 word.
//    Assume that there will never be 2 or more consecutive spaces in a row within the string.
//    Contractions and possessive words with an apostrophe like "it's" or "Brian's" count as 1 word.
//    Hyphenated words like "ice-cream" count as 1 word.
//    Numbers in the string such as the "007" in "James Bond is 007." count as words
//    There will be no double quotes "" within in the string.
//    Hints for this problem:
//    Use string methods to filter out characters besides numbers, letters, spaces, apostrophes, and hyphens.
//    Count the number of spaces in the filtered string and add 1 to that since the string will always contain at least 1 word.  This will give you the number of words it contains.
//    You should test your program with many different strings.
//            However, the strings that the solution code is being used on are the 3 strings below.
//    str_1 = "James Bond is 007."
//    str_2 = "When the moon hits your eye like a big pizza pie, that's amore!"
//    str_3 = "Anyway, like I was sayin', shrimp is the fruit of the sea. You can barbecue it, boil it, broil it, bake it, \
//saute it. Dey's uh, shrimp-kabobs, shrimp creole, shrimp gumbo. Pan fried, deep fried, stir-fried. There's pineapple \
//shrimp, lemon shrimp, coconut shrimp, pepper shrimp, shrimp soup, shrimp stew, shrimp salad, shrimp and potatoes, \
//shrimp burger, shrimp sandwich. That- that's about it."
//    So, for your final solution, copy the above into your .py file and print() 3 calls of your function, once for each of the 3 variables above.
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter sentence");
            String word= sc.nextLine();

            int result = WordCounter(word);
            System.out.println("Result : "+result);

        }

        public static int WordCounter(String word){
            String arr[]=word.split(" ");
            return arr.length;
        }

}
