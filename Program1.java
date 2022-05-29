public class Program1 {
    int a = 10;
    int b;
    public static void main(String[] args) {
       // static int b = 10;        //error local var will not have any access modifier
        Program1 p1 = new Program1();
        System.out.println(p1.a);
        System.out.println(p1.b); //while calling non static variable from static method we have to use object/reference
        Program1 p2 = new Program1();
        p1.newMethod();
        //System.out.println(b); //Error while calling non static variable from static method
    }

    public void newMethod() {
        //static int b = 10;
        System.out.println("Value of b: " + b);  //calling non static varible from non static method
    }
}
