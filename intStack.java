
public class intStack {
    int top;
    int stack[] = new int[20];

    void init() {
        top = -1;
    }

    void push(int c) {
        top++;
        stack[top] = c;

    }

    int pop() {
        int c;
        c = stack[top];
        top--;
        return c;
    }

    boolean isItEmpty() {
        boolean answer = false;
        if (top == -1) {
            answer = true;
        }
        return answer;
    }

    void showstack() {
        int i;
        for (i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
    }

    public int getTop() {
        return stack[top];
    }

}
