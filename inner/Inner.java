package inner;

class Outer{
    static class Innerclass{
        void f1(){
            System.out.println("inner class");
        }
    }
}

public class Inner {
    public static void main(String[] args) {
        Outer.Innerclass o1 =new Outer.Innerclass();
        o1.f1();
    }
}

