public class TextEditor {
    static class Node {
        String data;
        Node prev;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private Node cursor;

    public TextEditor() {
        head = null;
        tail = null;
        cursor = null;
    }

    public void insert(String text) {
        Node newNode = new Node(text);
        if (cursor == null) {
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        } else {
            newNode.next = cursor.next;
            newNode.prev = cursor;
            if (cursor.next != null) {
                cursor.next.prev = newNode;
            } else {
                tail = newNode;
            }
            cursor.next = newNode;
        }
        cursor = newNode;
    }

    public void delete() {
        if (cursor == null) {
            System.out.println("Nothing to delete.");
            return;
        }

        if (cursor == head && cursor == tail) {
            head = tail = cursor = null;
        } else if (cursor == head) {
            head = head.next;
            head.prev = null;
            cursor = head;
        } else if (cursor == tail) {
            tail = tail.prev;
            tail.next = null;
            cursor = tail;
        } else {
            cursor.prev.next = cursor.next;
            cursor.next.prev = cursor.prev;
            cursor = cursor.prev;
        }
    }

    public void moveCursorLeft() {
        if (cursor != null && cursor.prev != null) {
            cursor = cursor.prev;
        } else {
            System.out.println("Cursor is at the beginning.");
        }
    }

    public void moveCursorRight() {
        if (cursor != null && cursor.next != null) {
            cursor = cursor.next;
        } else {
            System.out.println("Cursor is at the end.");
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            if (current == cursor) {
                System.out.print("|" + current.data + "| ");
            } else {
                System.out.print(current.data + " ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("\nText Editor Operations:");
            System.out.println("1. Insert text");
            System.out.println("2. Delete text");
            System.out.println("3. Move cursor left");
            System.out.println("4. Move cursor right");
            System.out.println("5. Display text");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter text to insert: ");
                    String text = scanner.nextLine();
                    editor.insert(text);
                    break;
                case 2:
                    editor.delete();
                    break;
                case 3:
                    editor.moveCursorLeft();
                    break;
                case 4:
                    editor.moveCursorRight();
                    break;
                case 5:
                    editor.display();
                    break;
                case 6:
                    System.out.println("Exiting editor.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
