class RunTimePolymorphism {
    public static void main(String args[]) {
      Bank b ;
      // SBI 
      b = new RBI(); // Upcasting
      System.out.println(b.display());
      
      // Kotak
      b = new Kotak();
      System.out.print(b.display());
    }
  }
  
  class Bank {
    String display() {
      return "The Name of the Bank is : None.";
    }
  }
  
  class RBI extends Bank {
    String display() {
      return "The Name of the Bank is : RBI.";
    }
  }
  
  class Kotak extends Bank{
    String display() {
      return "The Name of the Bank is : Kotak Finance.";
    }
  }