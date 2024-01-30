import java.util.*;

class Main {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    Main() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);
        return root;
    }

    void leftView(Node root) {
        ArrayList<Node> list=new ArrayList<>();
        leftViewUtil(root,list, 0);
        for(Node cur:list){
            System.out.print(cur.data+" ");
        }
    }

    void leftViewUtil(Node root, ArrayList<Node> list,int level) {
        if(root==null)
        return;
        while(list.size()<=level){
            list.add(null);
        }
        if(list.get(level)==null){
            list.set(level,root);
        }
        // if(list.get(level)==null){
        //     list.set(level,root);
        // }

        // Recur for the left and right subtrees
        leftViewUtil(root.left,list, level + 1);
        leftViewUtil(root.right,list, level + 1);
    }

    public static void main(String args[]) {
        Main tree = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input");
        int numNodes = scanner.nextInt();
        for (int i = 0; i < numNodes; i++) {
            int value = scanner.nextInt();
            tree.insert(value);
        }
        tree.leftView(tree.root);
        scanner.close();
    }
}
