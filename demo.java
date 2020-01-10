interface A{
    default void display(){
        System.out.println("default of interface A");
    }
    static void show(){
        System.out.println("Show method of interface A");
    }
}
interface B{
    default void display(){
        System.out.println("default of interface B");
    }
    static void show(){
        System.out.println("Show method of interface B");
    }
}

public class demo implements A, B{
    public void display(){
        B.super.display();
        A.super.display();
    }
    public static void main(String args[]){
        A.show();
        B.show();
        demo obj = new demo();
        obj.display();
    }
}
