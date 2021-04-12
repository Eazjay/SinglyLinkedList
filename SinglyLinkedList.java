
public class SinglyLinkedList {
    public Node head;

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
            System.out.println(runner.value);
        }
    }

    public void printValues() {
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        System.out.println(node.value);
    }

    public int find(int value) {
        int index = 0;
        Node runner = head;
        while (runner != null) {
            if (runner.value == value) {
                return index;
            }
            System.out.println(runner);
            runner = runner.next;
            index++;
        }
        return -1;
    }
    public void remove(){
        Node runner = this.head;
        while(runner.next != null){
            if(runner.next == null){
                runner = null;
            }
            System.out.println(runner.value);
            runner = runner.next;
        }
    }
}