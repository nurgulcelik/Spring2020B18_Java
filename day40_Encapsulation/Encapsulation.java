package day40_Encapsulation;

public class Encapsulation {
     private long SSN;
     public long getSSN(){//getter read only
          return SSN;
     }
     public void setSSN(long SSN){//setter write only
          this.SSN=SSN;
     }
}
