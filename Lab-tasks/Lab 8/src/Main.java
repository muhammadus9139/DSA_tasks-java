import org.w3c.dom.ls.LSOutput;

public class Main{
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();

        Node root = tree.addroot(10);
        Node n2 = tree.addright(root, 4);
        Node n1 = tree.addleft(root, 2);
        Node n3 = tree.addleft(n1, 2);
        Node n4 = tree.addright(n1, 4);
        Node n5 = tree.addleft(n2, 2);
        Node n6 = tree.addright(n2, 4);


        // Recursive traversals calls
        System.out.println("Preorder Recursive");
        tree.preorder(tree.root);
        System.out.println();

        System.out.println("Inorder Recursive");
        tree.Inorder(tree.root);
        System.out.println();

        System.out.println("Postorder Recursive");
        tree.postorder(tree.root);
        System.out.println();

        // Preordr iterativee
        System.out.println("Preorder iterative");
        tree.preorderiterative(tree.root);
        System.out.println();

        // BFS Iterative
        System.out.println("BFS level Order ");
        tree.bfs(tree.root);
        System.out.println();


        int size=tree.size(tree.root);
        System.out.println("Total nodes: "+size);



        int count=tree.totalleafnodes(tree.root);
        System.out.println("Total leaf nodes: "+count);


        int height=tree.height(tree.root);
        System.out.println("Height of tree: "+height);
    }
}