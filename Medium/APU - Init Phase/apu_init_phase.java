import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Don't let the machines win. You are humanity's last hope...
 **/
class Player {
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(); // the number of cells on the X axis
        in.nextLine();
        int height = in.nextInt(); // the number of cells on the Y axis
        in.nextLine();
        
        List<Node> nodes = new ArrayList<Node>();
        
        for (int i = 0; i < height; i++) {
            String line = in.nextLine(); // width characters, each either 0 or .
            
            for(int j = 0; j < width; j++) {
                if(line.charAt(j) == '0') {
                    nodes.add(new Node(j, i));
                }
            }
        }
        
        System.err.println(nodes.toString());
        
        
        for(Node node : nodes) {
            
            Answer answer = new Answer(node);
            
            boolean hasRightNeighbor = false;
            boolean hasBottomNeighbor = false;
            
            for(Node otherNode : nodes) {
                if(!hasRightNeighbor && otherNode.isRightNeighborOf(node)) {
                    hasRightNeighbor = true;
                    answer.setRightNode(otherNode);
                }
                
                if(!hasBottomNeighbor && otherNode.isBottomNeighborOf(node)) {
                    hasBottomNeighbor = true;
                    
                    answer.setBottomNode(otherNode);
                }
            }
            
            
            System.out.println(answer);
        }
    }
}

class Node {
    int x;
    int y;
    
    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public boolean isRightNeighborOf(Node node) {
        int x1 = node.getX();
        int y1 = node.getY();
        
        return ((this.x > x1) && (this.y == y1));
    }
    
    public boolean isBottomNeighborOf(Node node) {
        int x1 = node.getX();
        int y1 = node.getY();
        
        return ((this.x == x1) && (this.y > y1));
    }
    
    @Override
    public String toString() {
        return String.format("%d %d", this.x, this.y);
    }
}

class Answer {
    private Node mainNode;
    private Node rightNode;
    private Node bottomNode;
    
    public Answer(Node mainNode) {
        this.mainNode = mainNode;
        this.rightNode = new Node(-1, -1);
        this.bottomNode = new Node(-1, -1);
    }
    
    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
    
    public void setBottomNode(Node bottomNode) {
        this.bottomNode = bottomNode;
    }
    
    @Override
    public String toString() {
        int x1 = this.mainNode.getX();
        int y1 = this.mainNode.getY();
        
        int x2 = this.rightNode.getX();
        int y2 = this.rightNode.getY();
        
        int x3 = this.bottomNode.getX();
        int y3 = this.bottomNode.getY();
        
        return String.format("%d %d %d %d %d %d", x1, y1, x2, y2, x3, y3);
    }
}