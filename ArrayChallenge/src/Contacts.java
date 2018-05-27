import java.util.ArrayList;

/**
 * Created by Andrew on 08-May-18.
 */
public class Contacts {
    private ArrayList<String> contactNames = new ArrayList<>();
    private ArrayList<String> contactNumbers = new ArrayList<>();

    public void addContact(String contactName, String contactNumber){
        if(findContactIndexByName(contactName)<0||findContactIndexByNumber(contactNumber)<0) {
            contactNames.add(contactName);
            contactNumbers.add(contactNumber);
        }
        else System.out.println("Contact Name or Number Already in Use");
    }

    public void updateContactName(String oldContactName, String newContactName){
        if(findContactIndexByName(newContactName)<0) {
            if (findContactIndexByName(oldContactName) >= 0) {
                modifyContactName(findContactIndexByName(oldContactName), newContactName);
            }
            else System.out.println("Old name not found");
        }
        else System.out.println("New Name is Already in Use");
    }

    public void updateContactNumber(String oldContactName, String newContactNumber){
        if(findContactIndexByNumber(newContactNumber)<0) {
            if (findContactIndexByName(oldContactName) > 0) {
                modifyContactNumber(findContactIndexByName(oldContactName), newContactNumber);
            }
            else System.out.println("Old name not found");
        }
        else System.out.println("New Number is Already in Use");
    }

    public String getContactName(int listIndex){
        return contactNames.get(listIndex);
    }

    public String getContactNumber(int listIndex){
        return contactNumbers.get(listIndex);
    }



    private void modifyContactName(int index, String contactName){
        contactNames.set(index,contactName);
        System.out.println("Contact has been updated to " + contactNames.get(index) + ". phone number remains " + contactNumbers.get(index));
    }

    private void modifyContactNumber(int index, String newNumber){
        contactNumbers.set(index,newNumber);
        System.out.println("Contact number has been updated to " + contactNumbers.get(index) + ". name remains " + contactNames.get(index));
    }

    public int findContactIndexByName(String contactName){
        return contactNames.indexOf(contactName);
    }

    public int findContactIndexByNumber(String contactNumber){
        return contactNumbers.indexOf(contactNumber);
    }

    public void printContacts(){
        System.out.println("You have " + contactNames.size() + " contacts.");
        for(int i=0;i < contactNames.size();i++){
            System.out.println("Contact " + (i+1) + "- " + getContactName(i) + ", " + getContactNumber(i));
        }

    }

    public void removeContact(String contactName){
        int index = findContactIndexByName(contactName);
        removeContact(index);
    }

    private void removeContact(int index){
        contactNames.remove(index);
        contactNumbers.remove(index);
    }

}
