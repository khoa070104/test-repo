class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    // Hàm thêm node vào cuối danh sách
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) { // nếu danh sách rỗng
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) { // duyệt đến node cuối
            temp = temp.next;
        }
        temp.next = newNode; // gắn node mới vào cuối
    }

    // Hàm in danh sách
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Thêm các phần tử vào cuối danh sách
        int[] arr = {5, 7, 9, 1, 2, 0, 8};
        for (int num : arr) {
            list.addLast(num);
        }

        // In danh sách
        System.out.print("Linked List: ");
        list.printList();
    }
}
