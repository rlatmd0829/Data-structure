import java.util.NoSuchElementException;

public class NodeQueue<T> {
    class Node <T>{
         private T data;
         private Node<T> next;

         public Node(T data){
             this.data = data;
         }
    }
    private Node<T> front; // front에서 삭제가 일어남 front랑 rear랑 같은곳에 있다가 들어올수록 rear는 뒤로 밀림
    private Node<T> rear;  // rear에서 삽입이 일어남

    public void add(T item){
        Node<T> t = new Node<T>(item);

        if(rear != null){
            rear.next = t;
        }
        rear = t;
        if(front == null){
            front = rear;
        }
    }
    public T remove(){
        if(front == null){
            throw new NoSuchElementException();
        }
        T data = front.data;
        front = front.next;

        if(front == null){
            rear = null;
        }
        return data;
    }
    public T peek(){
        if(front == null){
            throw new NoSuchElementException();
        }
        return front.data;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public static void main(String[] args){
        NodeQueue<Integer> q = new NodeQueue<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
    }
}
