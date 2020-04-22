package day22_Arrays_Loops;
/*
 write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop
 */
public class Java_Python {
    public static void main(String[] args) {
        String sentence="I like java and javascript python, python";
        int countJava=0;//2
         int countPython=0;
      String[] words  =sentence.split(" ");//[ i,like,java,and,javascript]
        for(String each:words){
            if(each.contains("java")){
                countJava++;
            }
            if(each.contains("python")){
                countPython++;
            }
        }
        System.out.println(countJava);
        System.out.println(countPython);
        System.out.println(countJava == countPython);
        String sentence2="I have 2 dog and 1 cat.one of the dog is big,other dog is small";
        String[] words2= sentence2.split(" ");
        int countOfDog=0;
        int countOfCat=0;
        for(String each:words2){
        if(each.contains("dog")){
            countOfDog++;

        }else if(each.contains("cat")){
            countOfCat++;
        }
        }
        System.out.println(countOfDog);
        System.out.println(countOfCat==countOfDog);
    }
}
