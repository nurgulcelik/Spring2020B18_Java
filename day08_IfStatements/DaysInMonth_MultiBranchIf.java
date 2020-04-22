package day08_IfStatements;

public class DaysInMonth_MultiBranchIf {
    public static void main(String[] args) {
     byte months = 3;
     String result = " ";
        if (months == 1) {
            result ="January has 31 days";
        }else if ( months==2){
            result = " February has 28 days";
        } else if ( months==3){
            result =" March has 31 days";
        } else if ( months==4){
            result = " April has 30 days";
        } else if ( months ==5){
            result = " May has 31 days";
        } else if ( months==6){
            result = " June has 30 days";
        } else if ( months==7){
            result = " July has 31 days";
        } else if ( months==8){
            result = " August has 31 days ";
        } else if ( months ==9){
            result = " September has 30 days";
        } else if ( months ==10){
            result= " October has 31 days";
        } else if ( months ==11){
            result= " November has 30 days";

        } else if( months==12){
            result= " December has 31 days";
        } else {
            result = " Invalid entry";
        }
            System.out.println( result);
        String result2= (months==1)?"January has 31 days":(months==2)?"February has 28 days"
        :(months==3)?"March has 31 days":(months==5)?"April has 30 days"
        :(months==6)?" June has 30 days":(months==7)?" July has 31 days"
        :(months==8)?" September has 30 days":(months==9)?" October has 31 days"
        :(months==10)?" November has 30 days":(months==12)?"December has 31 days":"Invalid entry";
        System.out.println(result2);
    }
}
