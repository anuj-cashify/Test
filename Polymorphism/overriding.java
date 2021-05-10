package Polymorphism;

class overriding {
    void show(){
        System.out.println("1");
    }

}

class overriding2 extends overriding {
    void show() {
        System.out.println("2");
    }


    public static void main(String[] args) {
        overriding t = new overriding();
       // t.show();

        overriding2 q = new overriding2();
        q.show();

    }
}

