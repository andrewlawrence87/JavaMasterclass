import java.util.Scanner;

/**
 * Created by Andrew on 08-May-18.
 */
public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contacts = new Contacts();

    public static void main(String[] args){
        boolean quit = false;
        int choice;
        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    contacts.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContactName();
                    break;
                case 4:
                    updateContactNumber();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    deleteContact();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print your contacts.");
        System.out.println("\t 2 - To add a new contact.");
        System.out.println("\t 3 - To update a contact name.");
        System.out.println("\t 4 - To update a contact nunmber.");
        System.out.println("\t 5 - To search for a contact");
        System.out.println("\t 6 - To delete a contact");
        System.out.println("\t 7 - To quit the application");
    }




private static void addContact(){
    System.out.println("Enter contact name");
    String name = scanner.nextLine();
    System.out.println("Enter contact number");
    String number = scanner.nextLine();
    contacts.addContact(name,number);
}

private static void updateContactName(){
    System.out.println("Enter old contact name");
    String oldName = scanner.nextLine();
    System.out.println("Enter new contact name");
    String newName = scanner.nextLine();
    contacts.updateContactName(oldName,newName);
}

private static void updateContactNumber(){
    System.out.println("Enter contact name");
    String oldName = scanner.nextLine();
    System.out.println("Enter new contact number");
    String newNumber = scanner.nextLine();
    contacts.updateContactNumber(oldName,newNumber);
}

private static void searchForContact(){
    System.out.println("Enter name or number to search");
    String search = scanner.nextLine();
    if (contacts.findContactIndexByName(search) >= 0){
        System.out.println("Contact " + ((contacts.findContactIndexByName(search))+1) + "- " + contacts.getContactName(contacts.findContactIndexByName(search)) + ", " + contacts.getContactNumber(contacts.findContactIndexByName(search)));
    }
    else if (contacts.findContactIndexByNumber(search) >=0){
        System.out.println("Contact " + (contacts.findContactIndexByNumber(search)+1) + "- " + contacts.getContactName(contacts.findContactIndexByNumber(search)) + ", " + contacts.getContactNumber(contacts.findContactIndexByNumber(search)));
    }
    else System.out.println("Contact not found");
}

private static void deleteContact(){
    System.out.println("Enter contact name to delete");
    String contactName = scanner.nextLine();
    contacts.removeContact(contactName);
    }
}
