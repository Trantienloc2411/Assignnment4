
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lmnhn
 */
 class AVLTree implements I_List{
    Node root;

    public AVLTree(){}
    public AVLTree(Node root) {
        root =null;
    }


    @Override
    public void insert(Phone x) {

    }

    @Override
    public void visit(Node p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int height(Node p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int balanceFactor(Node p) {
        if (p == null) {
            return 0;
        }
        return height(p.left) - height(p.right);
    }

    @Override
    public void breadth() {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.info + " ");

            /*add left child to the queue */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /*add right right child to the queue */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    @Override
    public void preOrder(Node p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inOrder(Node p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postOrder(Node p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Node search(Phone x) {
        return search(root, x);
    }
    
    Node search(Node p, Phone x) {
        if (p == null) {
            return null;
        } else if (x.getId() == p.getId()) {
            return p;
        } else if (x.getId() < p.getId()) {
            return search(p.left, x);
        } else {
            return search(p.right, x);
        }
    }
    

    @Override
    public void deletebyMerging(int x) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value to find: ");
        x = Integer.parseInt(sc.nextLine());
        
        //using search to find node x
        //if
    }

    @Override
    public void deletebyCopying(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteNode(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void findMinPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void findNewestPhone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void findMaxValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
