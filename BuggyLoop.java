public class MyClass {
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {
            System.out.println(x++);
            if (x == 5) {
                break; // Exits the loop prematurely 
            }
        }
    }
}