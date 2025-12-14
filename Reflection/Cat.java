package Reflection;

public class Cat {
    private static String name;
    private int age;
    public Cat(String name, int age) {
        Cat.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Cat.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private static void printNameInCaps(){
        System.out.println("Name: " + name.toUpperCase());
    }
}
