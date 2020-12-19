public class LinkedListEx {
    private Node head;
    private Node tail;
    private int size = 0;
    private class Node{
        private Object data;
        private Node next;
        public Node(Object input){
            this.data = input;
            this.next = null;
        }
//        public String toString(){
//            return String.valueOf(this.data);
//        }
    }
    public void addFirst(Object input){
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        size++;
        if(head.next == null){
            tail = head;
        }
    }
    public void addLast(Object input){
        Node newNode = new Node(input);
        if(size == 0){
            addFirst(input);
        }else{
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }
    Node node(int index){ // 위치찾기
        Node x = head;
        for(int i=0; i<index; i++){
            x = x.next;
        }
        return x;
    }
    public void add(int k, Object input){
        if(k == 0){
            addFirst(input);
        }else{
            Node temp1 = node(k-1); // 추가할 노드에 앞노드
            Node temp2 = temp1.next;  // 추가할 노드에 뒷노드
            Node newNode = new Node(input);
            temp1.next = newNode;
            newNode.next = temp2;
            size++;
            if(newNode.next == null){
                tail = newNode;
            }
        }
    }
    public String toString(){
        if(head == null){
            return "[]";
        }
        Node temp = head;
        String str = "[";
        while (temp.next != null){
            str += temp.data + ", ";
            temp = temp.next;
        }
        str += temp.data;
        return str+"]";
    }
    public Object removeFirst(){
        Node temp = head;
        head = head.next;
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    }
    public Object remove(int k){
        if(k == 0){
            return removeFirst();
        }
        Node temp = node(k-1);
        Node todoDeleted = temp.next;
        temp.next = temp.next.next;
        Object returnData = todoDeleted.data;
        if(todoDeleted == tail){
            tail = temp;
        }
        todoDeleted = null;
        size--;
        return  returnData;
    }
    public Object removeLast(){
        return remove(size-1);
    }

    public static void main(String[] args){
        LinkedListEx numbers = new LinkedListEx();
        numbers.addFirst(10);
        numbers.addLast(20);
        numbers.add(1,15);
        numbers.remove(1);
        System.out.println(numbers); // toString 메소드 안불러줘도 객체를
                                    // print찍으면 자바에서는 알아서 toString메소를 찾아서 출력해준다.

    }


}
