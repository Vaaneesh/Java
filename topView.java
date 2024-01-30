// import java.util.LinkedList;
// import java.util.*;
// import java.util.TreeMap;

// class Node {
//     int data;
//     int depth;
//     Node left, right;

//     Node(int value, int d) {
//         data = value;
//         depth = d;
//         left = right = null;
//     }
// }

// class Main {
//     Node root;

//     Main() {
//         root = null;
//     }

//     void insert(int value, int depth) {
//         root = insertRec(root, value, depth);
//     }

//     Node insertRec(Node root, int value, int depth) {
//         if (root == null)
//             return new Node(value, depth);
//         if (value < root.data)
//             root.left = insertRec(root.left, value, depth + 1);
//         else if (value > root.data)
//             root.right = insertRec(root.right, value, depth + 1);
//         return root;
//     }

//     void topView() {
//         // Using TreeMap to automatically sort by horizontal distance
//        TreeMap<Integer,Integer>topViewMap=new TreeMap<>();
//        Queue<Node>queue=new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty()){
//         Node current=queue.poll();
//         int hd=current.depth;
//         if(!topViewMap.containsKey(hd)){
//             topViewMap.put(hd,current.data);
//         }
//         if(current.left!=null){
//             queue.offer(current.left);
//             current.left.depth=hd-1;
//         }
//         if(current.right!=null){
//             queue.offer(current.right);
//             current.right.depth=hd+1;
//         }
//        }
//        for(int val:topViewMap.values()){
//         System.out.print(val+" ");
//        }
//     }

//     public static void main(String args[]) {
//         Scanner scanner = new Scanner(System.in);

//         int n = scanner.nextInt();
//         Main tree = new Main();
//         for (int i = 0; i < n; i++) {
//             int value = scanner.nextInt();
//             int depth = scanner.nextInt();
//             tree.insert(value, depth);
//         }

//         System.out.println("Top view of the BST:");
//         tree.topView();
//         scanner.close();
//     }
// }
