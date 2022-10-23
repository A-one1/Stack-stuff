import java.io.*;

public class ParenTest {
    public static void main(String[] args) throws IOException {
        String file = "D:\\SELU\\390\\program 2\\data.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String curLine;
        while ((curLine = bufferedReader.readLine()) != null) {
            // process the line as required
            System.out.println(curLine);
            checkParen(curLine);
            System.out.println("\n");
        }
        bufferedReader.close();

    }

     static boolean checkParen(String equation) {
        charStack parenStack = new charStack();
        boolean valid = false;
        char c;
        parenStack.init();
        int i;

        for (i = 0; i < equation.length(); i++) {
            c = equation.charAt(i);

            if (c == '[' || c == '{' || c == '(') {
                parenStack.push(c);
            } else if (c == ']') {
                if (parenStack.isItEmpty()) {
                    System.out.println("INVALID EQUATION !! MISSING '[' ");
                    parenStack.push(c);
                } else if (parenStack.getTop() == '[') {
                    parenStack.pop();
                }
            } else if (c == '}') {
                if (parenStack.isItEmpty()) {
                    System.out.println("INVALID EQUATION !! MISSING '{' ");
                    parenStack.push(c);
                } else if (parenStack.getTop() == '{') {
                    parenStack.pop();
                }
            } else if (c == ')') {
                if (parenStack.isItEmpty()) {
                    System.out.println("INVALID EQUATION !! MISSING '(' ");
                    parenStack.push(c);
                } else if (parenStack.getTop() == '(') {
                    parenStack.pop();
                }
            }

        }
        if(parenStack.isItEmpty()){
            valid = true;
            System.out.println("VALID EQUATION");

        }
        else{
        }

        return valid;

    }

}
