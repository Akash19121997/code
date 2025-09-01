package ComparatorComparableDemo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Song s1 = new Song("Saiyaara", "Farhan", 2025);
        Song s2 = new Song("Thodi Si Daru", "AP Dhillon", 2024);
        //Song s3 = s2;
        //Song s4 = s2.clone();
        //s2.setName("Akash");

        //System.out.println(s3);
        //System.out.println(s4);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(s1);
        songs.add(s2);
        songs.sort(new ComparatorImpl());
        //songs.forEach(System.out::println);

    }
}
