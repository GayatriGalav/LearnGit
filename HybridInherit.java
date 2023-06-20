//Using Hierarchical and Multilevel Inheritance
class A {
    void displayA() {
        System.out.println("This is class A");
    }
}

class B extends A {
    void displayB() {
        System.out.println("This is class B");
    }
}

class C extends A {
    void displayC() {
        System.out.println("This is class C");
    }
}

class D extends B {
    void displayD() {
        System.out.println("This is class D");
    }
}

public class HybridInherit {
    public static void main(String args[]) {
        D d = new D();
        d.displayD();
        d.displayB();
        d.displayA();
    }
}
