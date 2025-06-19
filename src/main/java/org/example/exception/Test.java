package org.example.exception;

class Parent {
    private void display() {
        System.out.println("Parent method");
    }
}
class Child extends Parent {
    private void display() {
        System.out.println("Child method");
    }
}
public class Test {
    public static void main(String[] args) {
        Parent obj = new Child();
        // obj.display(); // Compilation error
    }
}