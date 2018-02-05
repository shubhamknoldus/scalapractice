package edu.practice;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("hi just running java");
        A x = new B();
        B y = new B();
        x.print();
        y.printB();
        y.print();
    }
}
class A{
    public void print(){
        System.out.println("print from A");
    }
}
class B extends A{
    public void print(){
        System.out.println("printing print() from A via B's object overridden definition");
    }
    public void printB(){
        System.out.println("print from B");
    }
}