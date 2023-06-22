interface Bank {
    float printROI();
}

class SBI implements Bank {
    public float printROI() {
        System.out.println("SBI Bank ");
        return 9.7f;
    }
}

class HDFC implements Bank {
    public float printROI() {
        System.out.println("HDFC Bank ");
        return 8.7f;
    }
}

public class Interface {
    public static void main(String args[]) {
        // Bank ex=new HDFC();
        HDFC ex = new HDFC();
        System.out.println("The rate of interest is " + ex.printROI());
    }
}
