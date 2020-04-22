package day09_NestedIf_Ternary;
/*
Nested If: if the condition can be evaluate to multiple scenario

            if we have precondition
            if(pre-condition){
                    statementA
                if(Condition1){
                    statementB
                }
            }
        statementA: only if precondition is true
        only statementA: if precondition is true, condition1 is false
        statementB: if precondition is tre, and condition1 is true
        only statementB: impossible

 */
public class NestedIf {
    public static void main(String[] args) {
        int age = 17;
        boolean USCitizen = false;
        if (USCitizen) {
            if (age > 17) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You must be 18 year old or older to be able to vote");
            }
        } else {
            System.out.println(" Only the US citizens are eligible to vote for Donald Trump");
        }
        System.out.println("===============================");
        int score = 98;
        String grade = "";
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else  {
                grade = "F";
            }
        } else {
            grade = "Invalid";
        }
        System.out.println(grade);

        int score2 = 75;
        String grade2 = "";
        if (score2 >= 0 && score2 <= 100) {
            grade2 = (score2 >= 90) ? "A" : (score2 >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";

        } else {
            grade2 = "Invalid";
        }

        System.out.println(grade2);

    }

    }


