// Inheritance in Java 

// 2. MultiLevel 
// A->B->C


class MultiLevel {
    public static void main(String args[]) {
      Morgan m = new Morgan();
      System.out.println("Hii " + m.morgan + " and " + m.tony + " and " + m.howard);
    }
  }
  
  class Morgan extends Tony {
    String morgan = "I am IronGirl..!";
  }
  
  class Tony extends Howard {
    String tony = "Tony Stark is my Papa";
  }
  
  class Howard {
    String howard = "Howard Stark is my Grandpa";
  }