package bhargavi;

public interface B {
    default void display(){
        System.out.println("default of interface B");
    }
    static void show(){
        System.out.println("Show method of interface B");
    }
}
