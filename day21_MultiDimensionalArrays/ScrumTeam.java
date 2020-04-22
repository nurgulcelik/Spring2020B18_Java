package day21_MultiDimensionalArrays;

public class ScrumTeam {
    public static void main(String[] args) {


        String[] DevTeam = {"Zeynep", "Haider", "Jpovid", "Muhtar"};
        String[] Testers = {"Rahman", "Aishan", "Osman", "Ali"};
        String[] PO= {"Barzy","Donald"};
        String[] Testers2={"Ilham","Zarina","Aizhan","Asiman"};
        String[][] ScrumTeam = {DevTeam, Testers,PO};
        //                      0       1
        ScrumTeam[0][3]="Jean";
        ScrumTeam[1]= Testers2;
        String info= ScrumTeam[1][2];
        System.out.println(info);

        for (String eachEmployee : ScrumTeam[2]) {
            System.out.println(eachEmployee);
        }
    }
}