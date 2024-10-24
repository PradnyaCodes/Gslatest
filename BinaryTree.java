import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static  class BinaryT{
        static int idx =-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preorder(Node root){
        //root
        //left subtree
        //right subtree

        if(root==null){
            return;
        }
        System.out.print(root.data+"");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        //left subtree
        //root
        //right subtree

        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+"");
        inorder(root.right);
    }

    public static void postorder(Node root){
        //left subtree
        //right subtree
        //root
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+"");
    }

    public static void levelorder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            if(root==null){
                return;
            }
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else {
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }

            }
        }
    }


    public static int countOfNodes(Node root){

        if(root==null){
            return 0;
        }

        int leftcount = countOfNodes(root.left);
        int rightcount = countOfNodes(root.right);

        return leftcount+rightcount+1;
    }

    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right);

        return leftsum + rightsum + root.data;
    }

    public static int heightofTree(Node root){
        if(root==null){
            return 0;
        }
        int leftheight = heightofTree(root.left);
        int rightheight = heightofTree(root.right);

        int maxheight = Math.max(leftheight,rightheight) +1;

        return maxheight;
    }

    public static boolean isBalanced(Node root){
        return dfsHeight(root)!=-1;
    }

    private static int dfsHeight(Node root) {
        if(root==null)
            return 0;
        int leftHeight = dfsHeight(root.left);
        if(leftHeight==-1) return -1;
        int rightHeight = dfsHeight(root.right);
        if(rightHeight==-1) return -1;

        if(Math.abs(leftHeight-rightHeight)>1) return -1;
        return Math.max(leftHeight,rightHeight)+1;
    }

    public static int diameterOfBinaryTree(Node root){
        int dia[] = new int[1];
        height(root,dia);
        return dia[0];

    }

    public static int height(Node node, int []dia){
        if(node==null)
            return 0;
        int lh = height(node.left, dia);
        int rh = height(node.right,dia);
        dia[0] = Math.max(dia[0],lh+rh);
        return 1+Math.max(lh,rh);
    }

    public static int maxPathSum(Node root){
        int maxValue[] = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        maxPathDown(root,maxValue);
        return maxValue[0];
    }

    private static int maxPathDown(Node node, int[] maxValue) {
        if(node==null) return 0;
        int left =Math.max(0,maxPathDown(node.left,maxValue));
        int right = Math.max(0,maxPathDown(node.right,maxValue));
        maxValue[0] = Math.max(maxValue[0],left+right+node.data);
        return Math.max(left,right)+node.data;
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryT tree = new BinaryT();
        Node root = tree.buildTree(nodes);
        System.out.println(root);
        System.out.println("preorder");
        preorder(root);
        System.out.println();
        System.out.println("inorder");
        inorder(root);
        System.out.println();
        System.out.println("postorder");
        postorder(root);
        System.out.println();
        System.out.println("levelorder");
        levelorder(root);
        System.out.println("total count of nodes:");
        System.out.println(countOfNodes(root));
        System.out.println("sum of nodes:");
        System.out.println(sumOfNodes(root));
        System.out.println("height of a tree");
        System.out.println(heightofTree(root));
        System.out.println("is it a balanced tree?");

        System.out.println("diamter of a tree");
        System.out.println(diameterOfBinaryTree(root));
        System.out.println("max path sum");
        System.out.println(maxPathSum(root));


    }
}
