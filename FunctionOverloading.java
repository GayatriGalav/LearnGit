class calculate {
    int area(int side) {
        System.out.println("SQUARE");
        return side * side;
    }

    int area(int a, int b) {
        System.out.println("RECTANGLE");
        return a * b;
    }
}

public class FunctionOverloading {
    public static void main(String args[]) {
        calculate c = new calculate();
        System.out.println(c.area(5));
        System.out.println(c.area(5, 4));
    }
}
