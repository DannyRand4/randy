class CustomStack {
    int[] stack;
    int size;
    int maxSize;

    public CustomStack(int maxSize) {
        this.stack = new int[maxSize];
        this.size = 0;
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if (size < maxSize) stack[size++] = x;
    }

    public int pop() {
        if (size == 0) return -1;
        return stack[--size];
    }

    public void increment(int k, int val) {
        int limit = Math.min(k, size);
        for (int i = 0; i < limit; i++) stack[i] += val;
    }

    public static void main(String[] args) {
        CustomStack cs = new CustomStack(5);
        cs.push(1);
        cs.push(2);
        cs.push(3);
        System.out.println(cs.pop());
        cs.push(4);
        cs.increment(2, 10);
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
    }
}
