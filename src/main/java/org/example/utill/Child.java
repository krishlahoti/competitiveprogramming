package org.example.utill;

class Parent {

    Parent() {
        print();
    }

    void print() {
        System.out.println("Parent");
    }

}

class Child extends Parent {

    int i = 5;

    public static void main(String[] args) {
        Parent obj = new Child();
        obj.print();

    }

    void print() {
        System.out.println(i);
    }
}
