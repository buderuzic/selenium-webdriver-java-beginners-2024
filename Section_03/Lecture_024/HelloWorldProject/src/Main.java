public class Main {
    static String classLevelVariable = "This is a class level variable";

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int sum = calculator.add(10, 5);
        System.out.println(sum);
        int difference = calculator.subtract(10, 5);
        System.out.println(difference);
    }

    public static void printName(String name) {
        System.out.println("Hello, " + name);
    }

    public static void printAge(int age) {
        System.out.println("You are " + age + " years old");
    }

    public static String getGreeting() {
        return "Hello, welcome to Java";
    }

    public static int addNumbers(int number1, int number2) {
        return number1 + number2;
    }
}
