
// Ways to initiate Object

// 2 . Through ThroughMethod

class ThroughMethod {
    public static void main(String args[]) {
      Student s1 = new Student();
      s1.insertRecord(100, "Ravi");
      System.out.println(s1.id + " : " +s1.name);
    }
  }
  
class Student {
    int id ;
    String name;
    
    void insertRecord(int id_ip, String name_ip){
      id = id_ip;
      name = name_ip;
    }
}