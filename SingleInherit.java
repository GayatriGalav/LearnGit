class Animal{
    void eat(){
        System.out.println("EATING....");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("BARKING....");
    }
}
public class SingleInherit {
    public static void main(String args[]){
        dog d=new dog();
        d.bark();
        d.eat();
    }
}
