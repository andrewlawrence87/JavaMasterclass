/**
 * Created by Andrew on 12-May-18.
 */
public class BinarySearchTree {


        ListItem head = null;

        public void addItem(ListItem newItem) {

            if (head == null) {
                initialHead(newItem);
                System.out.println("Creating head");
                return;
            }

            if (searchList(newItem.getValue().toString())) {
                System.out.println("item already in list");
                return;
            }

            ListItem currentNode = head;
            boolean sort = false;

            while (!sort) {
                int comparison = newItem.compareTo(currentNode);
                if (comparison<0) {
                    if (currentNode.prevItem == null) {
                        addBefore(currentNode, newItem);
                        sort = true;
                        break;
                    }
                    else currentNode = currentNode.prevItem;
                }

                else if (comparison>0){
                    if (currentNode.nextItem == null) {
                        addInFront(currentNode, newItem);
                        sort = true;
                        break;
                    }
                    else currentNode = currentNode.nextItem;
                }
                else {System.out.println("something went wrong in the add function");
                sort=true;}
            }
        }

        private void initialHead(ListItem newItem){
            head = newItem;
        }

        private void addBefore(ListItem currentNode, ListItem newItem) {
            currentNode.prevItem = newItem;
            }

        private void addInFront(ListItem currentNode, ListItem newItem) {
            currentNode.nextItem = newItem;
            }


        public boolean searchList(String item) {
            ListItem currentList = head;
            boolean doneSearching = false;
            int comparison = currentList.getValue().toString().compareTo(item);
            System.out.println("search list");
            while (!doneSearching){
                comparison = currentList.getValue().toString().compareTo(item);
                System.out.println(comparison);
                if (currentList.getValue().toString().equals(item)){
                    System.out.println("Item Found");
                    return true;
                }
                if (comparison<0){
                    if(currentList.nextItem == null){
                        return false;
                    }
                    currentList = currentList.nextItem;
                }
                if (comparison>0){
                    if(currentList.prevItem == null){
                        return false;
                    }
                    currentList = currentList.prevItem;
                }
                if (comparison==0){
                    System.out.println("Something went wrong");
                    return false;
                }
            }
            return false;
        }


}
