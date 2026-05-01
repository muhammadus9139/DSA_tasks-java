public class BinaryTree {
    Node root;

    Node addroot(int data){
        if(root!=null){
            return root;
        }
        root=new Node(data);
        return root;
    }

    Node addleft(Node parent,int data){
        parent.left=new Node(data);
        return parent.left;
    }

    Node addright(Node parent,int data){
        parent.right=new Node(data);
        return parent.right;
    }

    // Total nodes
    int size(Node node){
        if(node==null){
            return 0;
        }
        return 1+size(node.left)+size(node.right);
    }

    // DFS Recursive Traversals
    void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }

    void Inorder(Node node){
        if(node==null){
            return;
        }
        Inorder(node.left);
        System.out.println(node.data+" ");
        Inorder(node.right);
    }

    void postorder(Node node){
        if(node==null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data+" ");
    }

    // DFS iterative preorder
    // Custom stack based
    void preorderiterative(Node root){
        if(root==null){
            return;
        }

        java.util.Stack<Node>stack=new java.util.Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            Node current=stack.pop();
            System.out.println(current.data+" ");

            if(current.right!=null){
                stack.push(current.right);
            }

            if(current.left!=null){
                stack.push(current.left);
            }
        }
    }

    // BFS Iterative
    // Custom Queued based

    void bfs(Node root){
        if(root==null){
            return;
        }
        java.util.Queue<Node> queue=new java.util.LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node current=queue.poll();
            System.out.println(current.data+" ");

            if(current.left!=null){
                queue.add(current.right);
            }

            if(current.left!=null){
                queue.add(current.left);
            }
        }
    }

    int totalleafnodes(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        return totalleafnodes(root.left)+totalleafnodes(root.right);
    }

    int height(Node root){
        if(root==null){
            return -1;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
}
