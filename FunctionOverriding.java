class vehicle {
    void engine() {
        System.out.println("Vehicle engine");
    }
}

class Bike extends vehicle {
    void engine() {
        System.out.println("Bike engine");
    }
}

class car extends vehicle {
    void engine() {
        System.out.println("Car engine");
    }
}

public class FunctionOverriding {
    public static void main(String args[]) {
        car benz = new car();
        benz.engine();
    }
}
