/**
 * Created by Andrew on 12-May-18.
 */
public class Main {

    public static void main(String[] args){

/*        NodeList nodeList = new NodeList();


        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");
        for (String s : data) {
            nodeList.addItem(new Node(s));
        }

        nodeList.printNodeList();

        nodeList.removeFromList("Brisbane");

        nodeList.printNodeList();*/

BinarySearchTree binary = new BinarySearchTree();

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");
        for (String s : data) {
            binary.addItem(new Node(s));
        }

        binary.searchList("Brisbane");


    }
}
