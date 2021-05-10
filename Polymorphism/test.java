package Polymorphism;

public class test {
    void show(int a, String b)
    {
        System.out.println("1");
    }
    void show(int a)
    {
        System.out.println("2");
    }

    public static void main(String[] args) {
        test t =new test();
    //    t.show(1);
        t.show(1,"anuj");
    }
}

