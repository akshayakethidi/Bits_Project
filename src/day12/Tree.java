package day12;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
}
}

public class Tree {
    int idx=-1;
    public Node buildTree(int arr[])
    {
        idx++;
        if(arr[idx]==-1)
        {
            return null;
        }
        Node newNode=new Node(arr[idx]);
        newNode.left=buildTree(arr);
        newNode.right=buildTree(arr);
        return newNode;
    }
    public void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public void postOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public int countNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int count=1;
        count += countNodes(root.left);
        count += countNodes(root.right);
        return count;
    }
    public int sumNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int sum=root.data;
        sum += sumNodes(root.left);
        sum += sumNodes(root.right);
        return sum;
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Tree ob = new Tree();
        Node root = ob.buildTree(nodes);
        System.out.println(root.data);
        System.out.print("Pre-order traversal: ");
        ob.preOrder(root);
        System.out.println();
        System.out.print("In-order traversal: ");
        ob.inOrder(root);
        System.out.println();
        System.out.print("Post-order traversal: ");
        ob.postOrder(root);
        System.out.println();
        System.out.print("Number of nodes: ");
        System.out.println(ob.countNodes(root));
        System.out.print("Sum of nodes: ");
        System.out.println(ob.sumNodes(root));
    }
}

    