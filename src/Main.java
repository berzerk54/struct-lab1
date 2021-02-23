import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    public int size;

    public void menu() {

    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(3, "John");
        tree.insert(8, "T1000");
        tree.insert(1, "Sara");
        tree.insert(2, "T800");

        Node findJohn = tree.find(3);
        findJohn.printNode();

        tree.print(findJohn);

    }


    public class KeyBoard extends KeyAdapter {
        public void keyPressed(KeyEvent event) {
            int key = event.getKeyCode();
            switch (key) {

                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:

                    break;
                case 5:

                    break;
            }
        }
    }
}