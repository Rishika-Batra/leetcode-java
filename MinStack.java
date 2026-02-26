class MinStack {
    private int[] data;
    private int[] minData;
    private int top;
    private int capacity;

    private static final int INITIAL_CAPACITY = 1000;

    public MinStack() {
        data = new int[INITIAL_CAPACITY];
        minData = new int[INITIAL_CAPACITY];
        top = -1;
        capacity = INITIAL_CAPACITY;
    }

    public void push(int val) {
        if (top + 1 >= capacity) {
            capacity *= 2;

            int[] newData = new int[capacity];
            int[] newMinData = new int[capacity];

            System.arraycopy(data, 0, newData, 0, data.length);
            System.arraycopy(minData, 0, newMinData, 0, minData.length);

            data = newData;
            minData = newMinData;
        }

        top++;
        data[top] = val;

        if (top == 0) {
            minData[top] = val;
        } else {
            minData[top] = Math.min(val, minData[top - 1]);
        }
    }

    public void pop() {
        if (top >= 0) {
            top--;
        }
    }

    public int top() {
        if (top >= 0) {
            return data[top];
        }
        return Integer.MIN_VALUE; // handle error if needed
    }

    public int getMin() {
        if (top >= 0) {
            return minData[top];
        }
        return Integer.MIN_VALUE; // handle error if needed
    }
}// update 181316731
