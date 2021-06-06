import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("How may people?");
        Scanner UserInput = new Scanner(System.in);
        double NoOfPeople = UserInput.nextDouble();
        System.out.println("How many slices for each person?");
        double NoOfSlices = UserInput.nextDouble();
        double TotalNoOfSlices = NoOfPeople * NoOfSlices;
        System.out.println("You will need "+ TotalNoOfSlices+" slices for everyone to get "+NoOfSlices+" slices");
        System.out.println("How many slices per pizza?");
        double NoPerPizza = UserInput.nextDouble();
        double NoOfPizza = TotalNoOfSlices/NoPerPizza;
        System.out.println("You will need "+NoOfPizza+" Pizzas for everyone.");
    }
}
