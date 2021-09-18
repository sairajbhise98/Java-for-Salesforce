
// Ways to initiate Object

// 3 . Through ThroughConsructor

class ThroughConsructor {
    public static void main(String args[]) {
      Student s1 = new Student(103, "Pruthvi");
      System.out.println(s1.id + " : " +s1.name);
    }
  }
  
class Student {
    int id ;
    String name;
    
    public Student(int i, String n){
      id = i;
      name = n;
    }
}