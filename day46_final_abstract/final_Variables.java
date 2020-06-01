package day46_final_abstract;

public class final_Variables {
    final int instanceVariable=300;
     //final int instanceVariable2;
   final static int staticVariable=130;
   final static int getStaticVariables= 20;
    public static void main(String[] args) {
        final double pi= 3.14;
        final_Variables obj = new final_Variables();
       // obj.instanceVariable=400;
        final String gender="Male";
       // gender="female"; compile error, because it is constant.
        final int score;// you can initiliaze before you use it
        score=100;
        System.out.println(score);
       // obj.instanceVariable2;

    }
}
