package FunctionalProgramming;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class CustomClass {

    static class Course{
        private String name;
        private String Category;
        private int reviewScore;
        private int noOfStudents;

        public Course(String name, String category, int reviewScore, int noOfStudents) {
            this.name = name;
            Category = category;
            this.reviewScore = reviewScore;
            this.noOfStudents = noOfStudents;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCategory() {
            return Category;
        }

        public void setCategory(String category) {
            Category = category;
        }

        public int getReviewScore() {
            return reviewScore;
        }

        public void setReviewScore(int reviewScore) {
            this.reviewScore = reviewScore;
        }

        public int getNoOfStudents() {
            return noOfStudents;
        }

        public void setNoOfStudents(int noOfStudents) {
            this.noOfStudents = noOfStudents;
        }

        @Override
        public String toString() {
            return "Course{" +
                    "name='" + name + '\'' +
                    ", Category='" + Category + '\'' +
                    ", reviewScore=" + reviewScore +
                    ", noOfStudents=" + noOfStudents +
                    '}';
        }
    }

    public static void main(String[] args) {



        List<Course> courses = List.of(
                new Course("Spring", "Framework",90, 50),
                new Course("Java", "Programming",70, 98),
                new Course("Collection", "Framework",94, 49)
        );
        // allMatch, noneMatch, anyMatch -> these will return boolean values
        Boolean result=courses.stream().noneMatch(course -> course.getReviewScore()>90);
        //System.out.println(result);

        //sorted

        Comparator<Course> comparatorStudents = Comparator.comparing(Course::getNoOfStudents);
        Comparator<Course> comparatorStudentsScore = Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore);

        //courses.stream().sorted(comparatorStudents).forEach(System.out::println); // ascending order
        //courses.stream().sorted(comparatorStudents.reversed()).forEach(System.out::println); // descending order

        //courses.stream().sorted(comparatorStudentsScore).forEach(System.out::println);
        //courses.stream().sorted(comparatorStudentsScore.reversed()).forEach(System.out::println);

        // limit
        //courses.stream().sorted(comparatorStudentsScore).limit(2).forEach(System.out::println); // will pick 1st 2
        // skip
        //courses.stream().sorted(comparatorStudentsScore).skip(2).forEach(System.out::println); // will skip 1st 2
        //courses.stream().sorted(comparatorStudentsScore).skip(1).limit(2).forEach(System.out::println); // will skip 1st and get next 2

        courses.forEach(System.out::println);

        //take while -> take all courses until noOfStudents is less than equal to 98; it's like take all until condition matches. when it matches break
        System.out.println();
        //courses.stream().takeWhile(e -> e.getNoOfStudents()<=98).forEach(System.out::println);

        //dropWhile -> opposite of takeWhile
        //courses.stream().max(comparatorStudentsScore).ifPresent(System.out::println);

        long count=courses.stream().filter(course -> course.getNoOfStudents()>=90).count();
        System.out.println(count);

        OptionalDouble average=courses.stream().filter(course -> course.getReviewScore()>70).mapToInt(Course::getNoOfStudents).average();
    }
}
