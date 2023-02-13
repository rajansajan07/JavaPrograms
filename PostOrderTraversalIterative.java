class Node {
    int value;
    Node left;
    Node right;
    Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

class Pair {
    Node node;
    boolean visited;
    Pair(Node node, boolean visited) {
        this.node = node;
        this.visited = visited;
    }
}
public class PostOrderTraversalIterative {
  
  public List<Integer> postorderTraversal(Node root) {
      List<Integer> result = new ArrayList<>();
      if (root == null) {
          return result;
      }
      Stack<Pair> stack = new Stack<>();
      stack.push(new Pair(root, false));
      while (!stack.isEmpty()) {
          Pair pair = stack.pop();
          Node node = pair.node;
          boolean visited = pair.visited;
          if (visited) {
              result.add(node.value);
          } else {
              stack.push(new Pair(node, true));
              if (node.right != null) {
                  stack.push(new Pair(node.right, false));
              }
              if (node.left != null) {
                  stack.push(new Pair(node.left, false));
              }
          }
      }
      return result;
  }
  public static void main(String[] args) {
    
}
