
public class Main {
    public static void main(String[] args) {
//        Напишите метод, который возводит число в квадрат.
        System.out.println("5 в квадрате: " + pow(5, 2));

    }

    public static double pow(int value, int powValue) {
        return Math.pow(value, powValue);
    }

}