public class Sum {
    Node head;

    // Function to get the length of the linked list
    private int getLength() {
        int length = 0;
        Node current = head;
        while (current != null) {
            length ++;
            current = current.next;
        }
        return length;
    }

    // Function to find and print the pair with the given sum
    public void findPairWithSum(int k) {
        Node prev = head;
        Node cur = prev.next;
        while (prev != null){
            cur = prev.next;
            while (cur != null){
                if (prev.data + cur.data == k){
                    System.out.println(prev.data + "," + cur.data);
                }
                cur = cur.next;
            }
            prev = prev.next;
        }
    }

    // Function to add a new node at the end of the list
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}
