public class TypeCastingExample {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d; // double to int
        int j = 50;
        double d2 = j; // int to double

        System.out.println("Double to int: " + i);
        System.out.println("Int to double: " + d2);
    }
}