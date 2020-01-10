public class accessmodifier extends Area{
    private static void show(int x){
        System.out.println("side length :" +x);
    }
    public static void main(String args[]){
        accessmodifier obj1 =new accessmodifier();
        obj1.setside(6);
        obj1.getdetails();
        show(obj1.getside());
        accessmodifier obj2 =new accessmodifier();
        obj2.setside(8);
        obj2.getdetails();
        show(obj2.getside());
    }
}


class Area{
    private int side;
    //square area
    private int area(){
        return side*side;
    }
    private int perimeter(){
        return 4*side;
    }
   void getdetails(){
        System.out.println("Area of square is : "+ area());
       System.out.println("perimeter of square is : "+ perimeter());
    }
    void setside(int s){
        side=s;
    }
    int getside(){
        return side;
    }
}

