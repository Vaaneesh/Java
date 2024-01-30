// import java.util.Scanner;

// class Main {
//     static class node {
//         int key;
//         node left, right;
//     }

//     static node newNode(int item) {
//         node temp = new node();
//         temp.key = item;
//         temp.left = temp.right = null;
//         return temp;
//     }

//     static node insert(node node, int key) {
//         if (node == null)
//             return newNode(key);
//         if (key < node.key) {
//             node.left = insert(node.left, key);
//         } else if (key > node.key) {
//             node.right = insert(node.right, key);
//         }
//         return node;
//     }

//     static boolean hasPathSum(node root, int targetSum) {
//         // If the tree is empty, there is no path, return false
//         if(root==null){
//             return false;
//         }
//         if(root.left==null && root.right==null && targetSum-root.key==0)
//         return true;
//         return hasPathSum(root.left, targetSum-root.key)||hasPathSum(root.right,targetSum-root.key);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         node root = null;

//         while (N != 0) {
//             root = insert(root, sc.nextInt());
//             N--;
//         }

//         int targetSum = sc.nextInt();
//         System.out.println(hasPathSum(root, targetSum));
//         sc.close();
//     }
// }
