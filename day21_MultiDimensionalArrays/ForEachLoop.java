package day21_MultiDimensionalArrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};//number of execution of the loop the size of the array,
        //for(DataType variableName=:ArrayName){
        for (int each : nums) {
            System.out.println(each);//whenever we don't need index num we can use for each
        }
        String[] students = {"Muhtar", "Asiya", "Murodil"};
        for (String each : students) {
            System.out.println(each);
        }
    int[] arr1={10,2,3,6,5,4,7,8,9,1};
        //Arrays.sort(arr1);
        for(int each:arr1){
            if(each < 5){
                continue;
            }
            System.out.println(each);
        }
        String sentence="I like Java";
        String[] words= sentence.split(" ");//[I,like,Java]

        for(String each:words){//0~2
            System.out.println(each);
        }
        for(int i=words.length-1; i>=0; i--){
            System.out.println(words[i]);
        }
        String sentence3="I am going to cinema";
        String[] words3=sentence3.split(" ");
        for(String each:words3 ) {
            System.out.println(each);
        }


            }


        }


