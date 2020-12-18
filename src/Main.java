import decorators.Caramel;
import decorators.Citron;
import elements.Cafe;
import elements.The;

import java.util.Scanner;

public class Main {
    private static  Scanner saisir_value = new Scanner(System.in);

    public static void getPrice(int value){
        switch(value){
            case 1:
                System.out.println("PRIX THE : "+new The().getCost()+" FCFA");
                break;
            case 2 :
                System.out.println("PRIX THE CARAMEL : "+new Caramel(new The()).getCost() +" FCFA");
                break;
            case 3:
                System.out.println("PRIX THE CITRON : "+new Citron(new The()).getCost()+" FCFA");
                break;
            case 4 :
                System.out.println("PRIX CAFE SIMPLE : "+new Cafe().getCost()+" FCFA");
                break;
            case 5:
                System.out.println("PRIX CAFE CITRON : "+new Citron(new Cafe()).getCost()+" FCFA");
                break;
            case 6:
                System.out.println("PRIX CAFE CARAMEL : "+new Caramel(new Cafe()).getCost()+" FCFA");
                break;
        }
    }

    public static int menu(){
        System.out.println("----------- ** MENU ** ------------");
        System.out.println("1 ---------- THE ---------- ");
        System.out.println("2 ---------- THE CARAMEL ---------- ");
        System.out.println("3 ---------- THE CITRON ---------- ");
        System.out.println("4 ---------- CAFE ---------- ");
        System.out.println("5 ---------- CAFE CITRON ---------- ");
        System.out.println("6 ---------- CAFE CARAMEL ---------- ");
        System.out.println("---------------------------------------");
        try {
            System.out.println("Faites Votre choix : ");
            return Integer.parseInt(saisir_value.nextLine());
        }catch(Exception ex){
            return 0;
        }
    }

    public static void main(String[] args){
        int value = menu();

        //we check if the value is correct
        while (value!=1 && value!=2 && value!=3 && value!=4 && value!=5 && value!=6){
            System.out.println("Veuillez saisir un chiffre entre 1 et 6 : ");
            value = menu();
        }

        //get the price of the command of the client
        getPrice(value);
    }

}
