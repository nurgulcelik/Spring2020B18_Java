package day09_NestedIf_Ternary;

public class Ternary2 {
    public static void main(String[] args) {
       //ternary;? if,:else keyword
   String result="";
   if(9>10){
       result="9 is greater";
   }else{
       result="10 is greater";
   }
        System.out.println(result);
   String result2= (9>10)?"9 is greater":"10 is greater";
        System.out.println(result2);


        System.out.println("=======================");
        int age= 21;
        boolean eligibility=(age>=21)? true:false;
        System.out.println(eligibility);
        System.out.println("==============================");
        int ageOfPerson = 20;
        String eligibleToVote= "";
        if(ageOfPerson >=18){
            eligibleToVote="Yes";
        }else{
            eligibleToVote="No";
        }
        String eligibleToVote2= (ageOfPerson>=18)?"Yes":"False";
        System.out.println(eligibleToVote2);





    }

}
