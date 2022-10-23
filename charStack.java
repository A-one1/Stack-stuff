public class charStack {

    int top;
    char stack[] = new char[20];

    void init() {
        top = -1;
    }

    void push(char c) {
        top++;
        stack[top] = c;

    }

    public char pop() {
        char c;
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

    public char getTop() {
        return stack[top];
    }

}
