public class Node {

    public int key;
    public String data;
    public Node left;
    public Node right;

    public void printNode(){
        System.out.println("KEY " + key + " DATA: " + data);
    }
    public int getHeight() {

        return 1+ Math.max(left.getHeight(), right.getHeight());

    }



}