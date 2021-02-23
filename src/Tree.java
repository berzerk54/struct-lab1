public class Tree {

    Node root;


    public Node find(int key){
        Node current = root;
        while(current.key!=key){
            if(current.key<key){
                current = current.right;
            }else{
                current = current.left;
            }
            if(current==null){
                return null;
            }
        }
        return current;
    }


    public void insert(int key, String data){
        Node node = new Node();
        node.key = key;
        node.data = data;
        if(root==null){
            root = node;
        }else{
            Node current = root;
            Node prev = null;
            while (true){
                prev = current;
                if(key<prev.key){
                    current = current.left;
                    if(current==null){
                        prev.left = node;
                        return;
                    }
                }else{
                    current = current.right;
                    if(current==null){
                        prev.right = node;
                        return;
                    }
                }
            }
        }
    }


    public void print(Node startNode){
        if(startNode != null){
            print(startNode.left);
            startNode.printNode();
            print(startNode.right);
        }
    }
}