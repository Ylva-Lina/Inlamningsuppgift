import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Logic logic = new Logic();

        System.out.println("Please write some text. Start a new row by pressing enter ↵. To end, start a new row and type 'stop' followed by enter ↵.");

        boolean isStop = false;

        while (!isStop){
            String row = scan.nextLine();
            isStop = logic.findStop(row);
            logic.inputCount(row);
        }

        System.out.println("Row count: " + logic.getRows());
        System.out.println("Word count: " + logic.getWords());
        System.out.println("Character count: " + logic.getChars());
        System.out.println("Longest word: " + logic.getLongestWord());
    }
}