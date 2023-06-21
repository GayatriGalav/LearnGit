class base {
    int area;

    base() {
        area = 0;
    }

    base(int a) {
        area = a * a;
    }

    base(int a, int b) {
        area = a * b;
    }

    void display() {
        System.out.println("The value of area is " + area);
    }
}

public class ConstructorOverloading {
    public static void main(String args[]) {
        base eg1 = new base(3, 8);
        eg1.display();
        base eg2 = new base(4);
        eg2.display();

    }
}