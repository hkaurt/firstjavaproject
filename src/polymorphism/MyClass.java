package polymorphism;

/*
 * public class MyClass { private int value;
 * 
 * public MyClass(int value) { this.value = value; }
 * 
 * // Method using 'this' to refer to the current instance public MyClass
 * modifyValue(int newValue) { this.value = newValue; // 'this' is used to refer
 * to the current object's field return this; // returning the current instance
 * }
 * 
 * public string getValue() { return this.s; }
 * 
 * public static void main(String[] args) { MyClass obj = new MyClass(10);
 * obj.modifyValue(20); System.out.println(obj.getValue()); // Output: 20 } }
 */

class Parent {
    public static void display() {
        System.out.println("Parent's static method");
    }
}

class Child extends Parent {
    // Same method signature, but it's a hidden method, not inherited
  /*  public static void display() {
        System.out.println("Child's static method");*/
    }

