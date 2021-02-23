public class EmptyNode extends Node {

    public static Node INSTANCE = new EmptyNode();


    public int getHeight() {
        return 0;
    }
    private EmptyNode() {
        super();
    }

}