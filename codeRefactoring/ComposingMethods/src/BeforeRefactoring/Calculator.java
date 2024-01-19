package BeforeRefactoring;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int calculate(int a, int b, String operation) {
        if (operation.equals("add")) {
            return add(a, b);
        } else if (operation.equals("subtract")) {
            return subtract(a, b);
        } else if (operation.equals("multiply")) {
            return multiply(a, b);
        }
        return 0;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.calculate(5, 3, "add");
        System.out.println("Result: " + result);
    }
}
