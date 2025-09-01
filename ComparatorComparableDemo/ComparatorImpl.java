package ComparatorComparableDemo;

import java.util.Comparator;

public class ComparatorImpl implements Comparator<Song> {

    public int compare(Song o1, Song o2) {
        if(o1.getYear() > o2.getYear()){
            return 1;
        }
        else if(o1.getYear() < o2.getYear()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
