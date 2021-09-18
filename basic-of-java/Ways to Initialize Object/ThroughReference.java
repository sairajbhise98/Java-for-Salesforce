
// Ways to initiate Object

// 1 . Through ThroughReference

class ThroughReference {
    public static void main(String args[]) {
      Student s1 = new Student();
      s1.id = 101;
      s1.name = "Sairaj";
      System.out.println(s1.id + " : " +s1.name);
    }
  }
  
class Student {
    int id ;
    String name;
}