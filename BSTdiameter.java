// import java.util.*;

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
//         if (root == null)
//             return new Node(value);
//         if (value < root.data)
//             root.left = insertRec(root.left, value);
//         else if (value > root.data)
//             root.right = insertRec(root.right, value);
//         return root;
//     }

//     int height(Node node) {
//         if(node==null){
//             return 0;
//         }
//         return 1+Math.max(height(node.left),height(node.right));
//     }

//     int diameter(Node root) {
//         if(root==null)
//         return 0;
//         int leftHeight=height(root.left);
//         int rightHeight=height(root.right);

//         int diameterWithRoots=leftHeight+rightHeight+1;

//         int leftDiameter=diameter(root.left);
//         int rightDiameter=diameter(root.right);

//         return Math.max(diameterWithRoots,Math.max(leftDiameter, rightDiameter));
//     }

//     public static void main(String args[]) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter size");
//         int n = scanner.nextInt();
//         Main tree = new Main();

//         for (int i = 0; i < n; i++) {
//             int value = scanner.nextInt();
//             tree.insert(value);
//         }

//         System.out.println(tree.diameter(tree.root));
//         scanner.close();
//     }
// }
