public class Problem1 {
    public static void main(String[] args) {
        String name = "Zhambik";   // change to your name
        int len = name.length();

        // top border
        System.out.print("+");
        for (int i = 0; i < len + 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        // middle
        System.out.println("| " + name + " |");

        // bottom border
        System.out.print("+");
        for (int i = 0; i < len + 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
