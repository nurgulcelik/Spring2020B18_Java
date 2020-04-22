package day21_MultiDimensionalArrays;

public class Zoo {
    public static void main(String[] args) {
     String[] wildAnimals={"Tiger","Lion","Monkey","Turtle"};
      String[] birds= {"Eagles","Ducks","Peacock","Chicken"} ;
        String[][] zoo= {wildAnimals,birds};
        //                  0          1
        String kfc= zoo[1][3];//chicken

        System.out.println(kfc);
        for(String eachBirds:zoo[1]){
            if(eachBirds.equals("Chicken")){
                continue;

        }
        System.out.println(eachBirds);// 4 times
            System.out.println("=============================");
for(String eachWildAnimals:zoo[0]) {//5 times
    if(eachWildAnimals.equals("Turtle")){
        continue;
    }
    System.out.println(eachWildAnimals);

}
            String[] color ={"blue","white","black","green","orange"};
            String[] clothes={"skirt","socks","pants","jacket","shoes"};
            String[][] partyDress={color,clothes};
            for(String each:partyDress[0]) {
                if (each.equals("white")) {
                    continue;
                }
                System.out.print(each + " ");
            }
        }
    }
}
