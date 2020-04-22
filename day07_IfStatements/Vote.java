package day07_IfStatements;

public class Vote {
    public static void main(String[] args) {
    int age= 18;
    boolean UScitizen= true;
    boolean likeDonald = true;
    boolean eligible = age>=18 &&  UScitizen==true;
      if ( eligible==true){
          System.out.println(" You are eligible to vote");
      }
      if (eligible != true) {
          System.out.println(" You are not eligible to vote");
      }
          int age2=12;
       String eligibleToVote= (age2>=18 && UScitizen==true)?"You are eligible to vote"
        :"You are not eligible to vote";
          System.out.println(eligibleToVote);
      }
    }

