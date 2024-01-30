// import java.util.Scanner;

// class Node {
//     int data;
//     Node left, right;

//     Node(int value) {
//         data = value;
//         left = right = null;
//     }
// }

// class Main {
//     Node root;

//     Main() {
//         root = null;
//     }

//     void insert(int value) {
//         root = insertRec(root, value);
//     }

//     Node insertRec(Node root, int value) {
//         if (root == null) {
//             return new Node(value);
//         }
//         if (value < root.data) {
//             root.left = insertRec(root.left, value);
//         } else if (value > root.data) {
//             root.right = insertRec(root.right, value);
//         }
//         return root;
//     }

//     void postorderTraversal(Node node) {
//         if(node!=null){
//             postorderTraversal(node.left);
//             postorderTraversal(node.right);
//             System.out.print(node.data+" ");
//         }
//     }

//     public static void main(String args[]) {
//         Scanner scanner = new Scanner(System.in);
//         Main tree = new Main();

//         int n = scanner.nextInt();
//         for (int i = 0; i < n; i++) {
//             int value = scanner.nextInt();
//             tree.insert(value);
//         }

//         tree.postorderTraversal(tree.root);

//         scanner.close();
//     }
// }
