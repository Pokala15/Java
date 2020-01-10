import bhargavi.*;

public class demo implements A,B {
    public void display(){
        B.super.display();
        A.super.display();
    }
    public static void main(String args[]){
        A.show();
        B.show();
        demo obj = new demo();
        obj.display();
        hello objnew = new hello();
        objnew.Wish();
        objnew.farwell();
    }
}

