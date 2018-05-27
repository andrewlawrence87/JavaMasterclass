import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrew on 12-May-18.
 */
public class NodeList {

    ListItem head = null;

    public void addItem(ListItem newItem) {
        if (head == null) {
            initialHead(newItem);
            return;
        }
        System.out.println("Compare to Value: " + newItem.compareTo(head));

        ListItem currentNode = head;
        boolean sort = false;

        while (!sort) {
            int comparison = newItem.compareTo(currentNode);
            System.out.println("running while loop");

            if(comparison == 0){
                System.out.println("Item already in list");
                break;
            }

            if (comparison<0){
                addBefore(currentNode, newItem);
                sort = true;
                break;
            }

            if (currentNode.nextItem == null){
                if (comparison > 0){
                    addInFront(currentNode, newItem);
                }
                else {
                    System.out.println("running add before");
                    addBefore(currentNode, newItem);
                }
                sort=true;
                break;
            }
            currentNode = currentNode.nextItem;
        }
    }

    private void initialHead(ListItem newItem){
        head = newItem;
    }

    private void addBefore(ListItem currentNode, ListItem newItem) {
        System.out.println("Runing the add before loop, with values " + currentNode.getValue() + " and " + newItem.getValue() );

        if (currentNode.prevItem == null) {
            currentNode.setPrev(newItem);
            System.out.println("running set prev");
            newItem.setNext(currentNode);
            head = newItem;
        } else {
            newItem.setPrev(currentNode.prevItem);
            newItem.setNext(currentNode);
            currentNode.prevItem.setNext(newItem);
            currentNode.setPrev(newItem);
        }
    }

    private void addInFront(ListItem currentNode, ListItem newItem) {
        System.out.println("Runing the add after loop, with values " + currentNode.getValue() + " and " + newItem.getValue() );
        if (currentNode.nextItem == null) {
            currentNode.setNext(newItem);
            newItem.setPrev(currentNode);
        }
        else {
            currentNode.nextItem.setPrev(newItem);
            newItem.setPrev(currentNode);
            newItem.setNext(currentNode.nextItem);
            currentNode.setNext(currentNode);
        }
    }

    public void printNodeList(){
        ListItem currentNode = head;
        System.out.println("Starting to print \n" + currentNode.getValue());
        while ((currentNode.nextItem != null)){
            currentNode = currentNode.nextItem;
            System.out.println(currentNode.getValue());
        }

    }

    public void removeFromList(String itemName){
        ListItem currentNode = head;
        if (currentNode.getValue().toString().equals(itemName)){
            removeFromList(currentNode);
            return;
        }
        while (currentNode.nextItem != null){
            currentNode = currentNode.nextItem;
            if (currentNode.getValue().toString().equals(itemName)){
                removeFromList(currentNode);
                return;
            }
        }
        System.out.println("Item is not in list");

    }

    private void removeFromList(ListItem item){
        if (item.prevItem != null && item.nextItem != null){
            item.prevItem.setNext(item.nextItem);
            item.nextItem.setPrev(item.prevItem);
        }
        if (item.prevItem != null && item.nextItem == null){
            item.prevItem.setNext(null);
        }
        if (item.prevItem == null && item.nextItem != null){
            item.nextItem.setPrev(null);
            head = item.nextItem;
        }
        item.setNext(null);
        item.setPrev(null);
    }

}
