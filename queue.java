class MyCircularQueue {
    int[] queue;
    int front, rear, count, capacity;

    public MyCircularQueue(int k) {
        queue = new int[k];
        capacity = k;
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        count++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;
        front = (front + 1) % capacity;
        count--;
        return true;
    }

    public int Front() {
        return isEmpty() ? -1 : queue[front];
    }

    public int Rear() {
        return isEmpty() ? -1 : queue[rear];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }

    public static void main(String[] args) {
        MyCircularQueue cq = new MyCircularQueue(3);
        System.out.println(cq.enQueue(10));
        System.out.println(cq.enQueue(20));
        System.out.println(cq.enQueue(30));
        System.out.println(cq.enQueue(40));
        System.out.println(cq.Rear());
        System.out.println(cq.isFull());
        System.out.println(cq.deQueue());
        System.out.println(cq.enQueue(40));
        System.out.println(cq.Rear());
    }
}
