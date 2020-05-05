package day34_CustomClass;
import java.util.*;
public class CarpetObjects {
    public static void main(String[] args) {
        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};
        carpets[0].customOrder(7, 8.5, 30, true);
        System.out.println(carpets[0]);//hash code
        carpets[1].customOrder(10, 15, 20, false);
        carpets[2].customOrder(3, 4, 30, true);
        carpets[3].customOrder(5, 9, 30, true);
        carpets[4].customOrder(10, 10, 20, false);
        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        for (Carpet eachCarpet : carpets) {
            if (eachCarpet.isPersian) {
                persianCarpets.add(eachCarpet);
            }
        }
        System.out.println("There are " + persianCarpets.size() + " persian carpets");
        System.out.println(persianCarpets.get(0).calcCost());
        System.out.println(persianCarpets.get(1).calcCost());
        System.out.println(persianCarpets.get(2).calcCost());
        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets));
        regularCarpets.removeAll(persianCarpets);
        System.out.println("There are " + regularCarpets.size() + " regular carpets");
        for (int i = 0; i < regularCarpets.size(); i++) {
            System.out.println(regularCarpets.get(i).calcCost());

        }
    }
}