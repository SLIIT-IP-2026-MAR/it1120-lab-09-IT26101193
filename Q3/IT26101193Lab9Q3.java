public class IT26101193Lab9Q3 {
    public static void main(String[] args) {
        int term1 = multiply(3, 4);
        int term2 = multiply(5, 7);
        int expression1 = square(add(term1, term2));

        int term3 = square(add(4, 7));
        int term4 = square(add(8, 3));
        int expression2 = add(term3, term4);

        System.out.println("Result of (3 * 4 + 5 * 7)²   : " + expression1);
        System.out.println("Result of (4 + 7)² + (8 + 3)² : " + expression2);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int square(int n) {
        return n * n;
    }
}