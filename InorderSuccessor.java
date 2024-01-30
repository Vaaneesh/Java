// import java.util.*;

// class Main {
//     class Node {
//         int data;
//         Node left, right;

//         Node(int item) {
//             data = item;
//             left = right = null;
//         }
//     }

//     Node root;

//     Main() {
//         root = null;
//     }

//     void insert(int key) {
//         root = insertRec(root, key);
//     }

//     Node insertRec(Node root, int key) {
//         if (root == null) {
//             root = new Node(key);
//             return root;
//         }
//         if (key < root.data)
//             root.left = insertRec(root.left, key);
//         else if (key > root.data)
//             root.right = insertRec(root.right, key);
//         return root;
//     }

//     Node inorderSuccessor(Node root, Node x) {
//         if(x.right!=null){
//             return findMin(x.right);
//         }
//         Node ans=null;
//         while(root!=null){
//             if(x.data<root.data){
//                 ans=root;
//                 root=root.left;
//             }
//             else if(x.data>root.data){
//                 root=root.right;
//             }
//             else{
//                 break;
//             }
//         }
//         return ans;
        
//     }

//     Node findMin(Node node){
//         while(node.left!=null){
//             node=node.left;
//         }
//         return node;
//     }

//     public static void main(String args[]) {
//         Main tree = new Main();
//         Scanner scanner = new Scanner(System.in);
//         int numNodes = scanner.nextInt();

//         for (int i = 0; i < numNodes; i++) {
//             int value = scanner.nextInt();
//             tree.insert(value);
//         }

//         int referenceValue = scanner.nextInt();
//         Node x = tree.findNode(tree.root, referenceValue);
//         Node result = tree.inorderSuccessor(tree.root, x);

//         if (result != null)
//             System.out.println(result.data);
//         else
//             System.out.println("No inorder successor found");

//         scanner.close();
//     }

//     Node findNode(Node root, int value) {
//         if (root == null || root.data == value)
//             return root;
//         if (value < root.data)
//             return findNode(root.left, value);
//         else
//             return findNode(root.right, value);
//     }
// }
