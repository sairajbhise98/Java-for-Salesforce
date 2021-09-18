// Inheritance in Java 

// 1. Single (Classic)
/*
          Parent Class
            |
          Child Class
*/



class Child extends Parent {
    String name;
    String lastname ;
    public static void main(String args[]) {
      Child c = new Child();
      c.name = "Tony";
      c.lastname = "Stark";
      System.out.println(c.name + " " + c.pname + " " + c.lastname);
    }
  }
  
class Parent {
    String pname = "Howard" ;
}