/**
 * Created by Andrew on 12-May-18.
 */
public class Node extends ListItem {

    public Node(String value) {
        this.value = value;
    }

    @Override
    public void setNext(ListItem item) {
        this.nextItem = item;
    }

    @Override
    public void setPrev(ListItem item) {
        this.prevItem = item;
    }

    public String toString(){
        if (super.getValue() != null) {
            return ((String) super.getValue());
        }
        else return "No Value";
    }

    public void printOutStatus(){
        System.out.println("Name is " + getValue());
        if (prevItem != null){
            System.out.println("Previous is " + prevItem.getValue());
        }
        if (nextItem != null){
            System.out.println("Next is " + nextItem.getValue());
        }
    }

}
