package bhargavi;
public interface A {
    default void display(){
        System.out.println("default of interface A");
    }
    static void show(){
        System.out.println("Show method of interface A");
    }
}
