package dayInterview.Array;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr={2,7,9,0,3,34,67,98,31,97,1};
        int min= Integer.MAX_VALUE;
        for(int each:arr){
            if(each<min)
                min=each;
        }
        System.out.println(min);
    }
}
