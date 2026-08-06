public class MyClass {
    String hello = "Hello World";
    public static void main(String[] args) {
        new MyClass().doSomething();
    }
    void doSomething() {
        System.out.println(hello);
    }
}

