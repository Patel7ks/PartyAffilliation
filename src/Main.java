import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Party Affiliation");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.println("Enter your Choice:");

        String party = input.nextLine();

        if(party.equalsIgnoreCase("D")){
            System.out.println("You get a Democratic Donkey.");
        }
        else if (party.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        }
        else if (party.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        }
        else {
            System.out.println("You get other");
        }
    }
}