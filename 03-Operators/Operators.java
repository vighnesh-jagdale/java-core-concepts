public class Operators {

    public static void main(String[] args) {

        // Arithmetic Operators


        System.out.println("===== ARITHMETIC OPERATORS =====");
        int a = 10, b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b)); // integer division
        System.out.println("a % b = " + (a % b));


        // Assignment Operators

        System.out.println("\n===== ASSIGNMENT OPERATORS =====");
        int x = 5;

        x += 2;  // x = x + 2
        System.out.println("x += 2 → " + x);

        x -= 1;
        System.out.println("x -= 1 → " + x);

        x *= 3;
        System.out.println("x *= 3 → " + x);

        x /= 2;
        System.out.println("x /= 2 → " + x);

        x %= 4;
        System.out.println("x %= 4 → " + x);


        // Relational Operators

        System.out.println("\n===== RELATIONAL (COMPARISON) OPERATORS =====");

        int m = 10, n = 20;

        System.out.println("m == n → " + (m == n));
        System.out.println("m != n → " + (m != n));
        System.out.println("m > n  → " + (m > n));
        System.out.println("m < n  → " + (m < n));
        System.out.println("m >= n → " + (m >= n));
        System.out.println("m <= n → " + (m <= n));


        // Logical Operators

        System.out.println("\n===== LOGICAL OPERATORS =====");

        boolean p = true, q = false;

        System.out.println("p && q → " + (p && q)); // AND
        System.out.println("p || q → " + (p || q)); // OR
        System.out.println("!p → " + (!p));         // NOT


        // Unary Operators

        System.out.println("\n===== UNARY OPERATORS =====");

        int u = 5;

        System.out.println("u = " + u);
        System.out.println("u++ → " + (u++)); // post
        System.out.println("After u++ → " + u);

        System.out.println("++u → " + (++u)); // pre
        System.out.println("--u → " + (--u));


        // Bitwise Operators

        System.out.println("\n===== BITWISE OPERATORS =====");

        int bitA = 5;  // 0101
        int bitB = 3;  // 0011

        System.out.println("bitA & bitB → " + (bitA & bitB)); // AND
        System.out.println("bitA | bitB → " + (bitA | bitB)); // OR
        System.out.println("bitA ^ bitB → " + (bitA ^ bitB)); // XOR
        System.out.println("~bitA → " + (~bitA));             // NOT
        System.out.println("bitA << 1 → " + (bitA << 1));     // left shift
        System.out.println("bitA >> 1 → " + (bitA >> 1));     // right shift


        // Ternary Operator : Works like if-else in one line or we can call it short hand notation for if-else

        System.out.println("\n===== TERNARY OPERATOR =====");

        int age = 18;

        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age check → " + result);


        // Instance Operator

        System.out.println("\n===== INSTANCEOF OPERATOR =====");

        String name = "Java";
        System.out.println("name instanceof String → " + (name instanceof String));
    }
}