import java.util.LinkedList;
import java.util.Queue;

public class BinrayTree {
    public static void main(String[] args){
        BinrayTree binrayTree;
        Node node1 = new Node(4,null,null);
        Node node2 = new Node(5, null, null);
        Node node3 = new Node(2, node1, node2);
        Node node5 = new Node(6, null,null);
        Node root = new Node(1,node3,node5);
        binrayTree = new BinrayTree(root);

        binrayTree.dfs(binrayTree.rootNode);
        binrayTree.bfs(binrayTree.rootNode);
    }
    Node rootNode;
    Queue<Node> Q = new LinkedList();

    public BinrayTree(Node rootNode){ // root 노드가 있어야 시작을 한다
        this.rootNode = rootNode;
    }

    public void dfs(Node root){ // 깊이 우선 탐색 inorder방식으로 구현
        if(root.left != null){
            dfs(root.left); // 왼쪽에 값이 있으면 들어간다
            root.left=null; // 나왔으면 연을 끊는다.
        }

        // 왼쪽이 null 일때가 root를 찍어야 할때 이므로 값을 출력
        // postorder는 출력문이 맨뒤에 preorder는 출력문이 맨앞에 있어야한다. inorder이라 중간에 위치
        System.out.println(root.value);

        // 출력하고나서 오른쪽 본다.
        if(root.right != null){
            dfs(root.right); // 오른쪽에 값이 있으면 들어가 오른쪽 자식의 왼쪽을 봐야한다.
            root.right=null; // 나왔으면 연을 끊는다.
        }
    }

    public void bfs(Node root){ // 넓이 우선 함색
        if(root == null){ // 맨 마지막에 재귀호출할때는 null을 주는데 그때 종료하기 위해
            return;
        }
        if(Q.isEmpty()){ // 처음 호출할떄만 동작
            Q.add(root);
        }
        Node poll = Q.poll(); // 맨 앞의 큐에서 값을 꺼낸다.
        System.out.println(poll.value); // 출력하고
        if(poll.left != null){ // 좌우가 있는지 확인하고 있으면 큐에 넣는다.
            Q.add(poll.left);
        }
        if(poll.right != null){
            Q.add(poll.right);
        }
        bfs(Q.peek()); // 큐의 맨 앞 값을 넣는다.
    }
    public static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value, Node left, Node right){
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

}
