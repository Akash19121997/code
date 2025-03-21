package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomClassPractice {

    static class Course{

        String name;
        int numberOfStudents;
        int score;

        public Course(String name, int numberOfStudents, int score) {
            this.name = name;
            this.numberOfStudents = numberOfStudents;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumberOfStudents() {
            return numberOfStudents;
        }

        public void setNumberOfStudents(int numberOfStudents) {
            this.numberOfStudents = numberOfStudents;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Course{" +
                    "name='" + name + '\'' +
                    ", numberOfStudents=" + numberOfStudents +
                    ", score=" + score +
                    '}';
        }
    }

    public static void main(String[] args) {


        List<Course> courses = List.of(
                new Course("AWS",50,90),
                new Course("Google",40,65),
                new Course("Spring",80,95)
        );

        Comparator<Course> comparatorScore = Comparator.comparing(Course::getScore);
        Comparator<Course> comparatorScoreStudent = Comparator.comparing(Course::getScore).thenComparing(Course::getNumberOfStudents);

        Boolean results=courses.stream().anyMatch(course -> course.getScore()>695);
        System.out.println(results);

        courses.stream().sorted(comparatorScore).forEach(System.out::println);
    }
}
