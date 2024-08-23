public class Main {
    static String classLevelVariable = "This is a class level variable";

    public static void main(String[] args){
        String name = "Dmitry";
        int age = 36;

        printName(name);
        printAge(age);
    }

    public static void printName(String name) {
        System.out.println("Hello, " + name);
    }

    public static void printAge(int age) {
        System.out.println("You are " + age + " years old");
    }
}
