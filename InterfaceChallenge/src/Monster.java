import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Andrew on 10-May-18.
 */
public class Monster implements ISaveable {


    private ArrayList<String> inventory = new ArrayList<>();

    @Override
    public void writeValues() {
        for(String output : inventory){
            System.out.println(output);
        }

    }

    public void fillInventory(){
        inventory = readValues();
    }

    @Override
    public ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter an item for the monster inventory\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public String toString(int index){
        return inventory.get(index);
    }
}
