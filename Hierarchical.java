class A {
    void printA() {
        System.out.println("This is class A");
    }
}

class B extends A {
    void printB() {
        System.out.println("This is class B");
    }
}

class C extends A {
    void printC() {
        System.out.println("This is class C");
    }
}

class D extends B {
    void printD() {
        System.out.println("This is class D");
    }
}

class E extends B {
    void printE() {
        System.out.println("This is class E");
    }
}

class F extends C {
    void printF() {
        System.out.println("This is class F");
    }
}

public class Hierarchical {
    public static void main(String args[]) {
        D example = new D();
        example.printA();
    }
}
