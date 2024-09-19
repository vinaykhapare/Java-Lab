import java.util.Scanner;

interface Stack {
    void push(int element);
    void pop();
    void displayStack();
}

interface Queue {
    void enqueue(int element);
    void dequeue();
    void displayQueue();
}

class Operations implements Stack, Queue {
    int arr[];
    int top;
    int front;
    int rear;
    int size = 5;

    public Operations() {
        arr = new int[size];
        top = -1;
        front = 0;
        rear = -1;
    }

    // Stack operations
    public void push(int element) {
        if (top >= size - 1) {
            System.out.println("Stack overflow");
        } else {
            arr[++top] = element;
            System.out.println(element + " pushed to stack");
        }
    }

    public void pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
        } else {
            System.out.println(arr[top--] + " popped from stack");
        }
    }

    public void displayStack() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i] + " ");
            }
        }
    }

    // Queue operations
    public void enqueue(int element) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else {
            arr[++rear] = element;
            System.out.println(element + " added to queue");
        }
    }

    public void dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(arr[front++] + " removed from queue");
        }
    }

    public void displayQueue() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements:");
            for (int i = front; i <= rear; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}

public class QueueAndStackOperations {
    public static void main(String[] args) {
        int choice, operation;
        Scanner sc = new Scanner(System.in);
        Operations obj = new Operations();

        do {
            System.out.println("Enter your choice:");
            System.out.println("1. Stack");
            System.out.println("2. Queue");
            System.out.println("3. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Stack Operations");
                    System.out.println("Enter your operation:");
                    System.out.println("1. Push");
                    System.out.println("2. Pop");
                    System.out.println("3. Display Stack");
                    operation = sc.nextInt();
                    switch (operation) {
                        case 1:
                            System.out.println("Enter element to push to stack:");
                            int stackElement = sc.nextInt();
                            obj.push(stackElement);
                            break;
                        case 2:
                            obj.pop();
                            break;
                        case 3:
                            obj.displayStack();
                            break;
                        default:
                            System.out.println("Invalid operation");
                    }
                    break;

                case 2:
                    System.out.println("Queue Operations");
                    System.out.println("Enter your operation:");
                    System.out.println("1. Enqueue");
                    System.out.println("2. Dequeue");
                    System.out.println("3. Display Queue");
                    operation = sc.nextInt();
                    switch (operation) {
                        case 1:
                            System.out.println("Enter element to enqueue:");
                            int queueElement = sc.nextInt();
                            obj.enqueue(queueElement);
                            break;
                        case 2:
                            obj.dequeue();
                            break;
                        case 3:
                            obj.displayQueue();
                            break;
                        default:
                            System.out.println("Invalid operation");
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);

        sc.close();
    }
}
