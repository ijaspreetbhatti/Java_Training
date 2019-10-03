class ConstructorDemo {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A {
    A() {
        System.out.println("Inside A...");
    }
}
