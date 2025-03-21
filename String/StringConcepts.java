package String;

public class StringConcepts {

    public static void main(String[] args) {
        String a = "Akash";
        String b = "Akash";

        String c = new String("Akash");
        String d = new String("Akash");
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(c.equals(d));
        System.out.println(a==c);

        System.out.println("------------");

        int x=5;
        int y=5;

        Integer z= new Integer(5);
        Integer w= new Integer(5);
        System.out.println(x==y);
        System.out.println(z==w);
        System.out.println(z.equals(w));
        System.out.println(x==w);



    }
}
