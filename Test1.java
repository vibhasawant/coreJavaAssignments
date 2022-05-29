public class Test1 {
    /*int x = 10; //instance varibale
    public static void main(String[] args)
    {
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
        t1.x = 20;
        System.out.print(t1.x + " ");  //20
        System.out.println(t2.x);       //10
    }*/

    /* static int i = 1;           //static variable
    public static void main(String[] args)
    {
       for (int i = 1; i < 10; i++) {
            i = i + 2;                  //3 6 9
            System.out.print(i + " ");
       }
    }*/
    /*static int i = 1;   //static variable
    public static void main(String[] args)
    {
        int i = 1;          //local variable
        for (Test1.i = 1; Test1.i < 10; Test1.i++) {
            i = i + 2;                      //3 5 7 9 11 13 15 17 19
            System.out.print(i + " ");
        }
    }*/
    /*static int i = 1;
    public static void main(String[] args)
    {
        static int i = 1;   //error
        for (Test1.i = 1; Test1.i < 10; Test1.i++) {
            i = i + 2;
            System.out.print(i + " ");
        }
    }*/
}
