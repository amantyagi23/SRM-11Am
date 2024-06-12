public class ImplementationOfStack {

    int stack[];
    int size;
    int top;

    ImplementationOfStack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    void push(int item) {
        top++;
        stack[top] = item;
    }

    int pop() {
        return stack[top--];
    }

    void show() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + "--->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ImplementationOfStack obj = new ImplementationOfStack(10);

        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        obj.push(6);
        obj.push(6);
        obj.push(6);
        obj.push(6);
        obj.push(6);
        obj.push(6);

        obj.show();

        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());

        obj.show();
    }
}
