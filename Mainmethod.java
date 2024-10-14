class A {

    public static void main(String[] args) {
        System.out.println("hello .a");
    }
}

class B {

    public static void main(String[] args) {
        System.out.println("hello .b");
    }
}

public class Mainmethod {
    public static void main(String[] args) {
        A.main(null);
        System.out.println("hello.Main");

    }
}
