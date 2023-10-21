import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int moves = 0;
        Support support = new Support();
        Hunter hunter = new Hunter();

        int startofhunterposition = (int) (Math.random() * 5);
        int[] hunterfields = {startofhunterposition, startofhunterposition + 1, startofhunterposition + 2};
        hunter.sethunterfields(hunterfields);

        boolean stillon = true;
        System.out.println("In the forest there is a big, creepy mustached and blood-thirsty Hunter hiding in the bushes.\n" +
                "Fortunately you got riffle and can save all the animals. Shot the Hunter using as few bullets as possible.\n"
                +"Use bullets numbered 1-9.\n"+ "Good luck!");
        while (stillon = true) {
            String field = support.getinputdata("Aim and shoot!");
            String result = hunter.check(field);
            moves++;

            if (result.equals("Congrats! You killed the Hunter!")) {
                stillon = false;
                System.out.println("you used " + moves + " bullets to shot the Hunter");
            }
        }
    }
}