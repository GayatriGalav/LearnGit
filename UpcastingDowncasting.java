class Parent {
    String name;

    void display1() {
        System.out.println("Method of Parent Class");
    }
}

class Child extends Parent {
    int id;

    void display2() {
        System.out.println("Method of Child class");
    }
}

public class UpcastingDowncasting {
    public static void main(String args[]) {
        // Parent c = new Parent();
        // c.display();

        // Upcasting
        Parent p = new Child();
        p.display1();
        p.name = "John";
        System.out.println(p.name);

        // Downcasting (Explicit)
        // Implicit Downcasting not allowed
        Child c = (Child) p;
        c.display2();
        c.display1();

        c.id = 1;
        System.out.println(c.name);
        System.out.println(c.id);
    }
}
