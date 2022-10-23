import java.io.*;

public class PostFixEval {
    public static void main(String[] args) throws IOException {
        String file = "D:\\SELU\\390\\program 2\\data.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String curLine;
        while ((curLine = bufferedReader.readLine()) != null) {
            // process the line as required
            System.out.println(curLine);
            System.out.println(postFixEval(curLine) + "\n");
        }
        bufferedReader.close();

    }

    static int postFixEval(String equation) {
        intStack solve = new intStack();
        char ch;
        int i, x, y, z, num;
        solve.init();
        for (i = 0; i < equation.length(); i++) {
            ch = equation.charAt(i);
            if ((ch >= '0') && (ch <= '9')) {
                num = Character.getNumericValue(ch);
                solve.push(num);
            } else if (ch == '+') {
                y = solve.pop();
                x = solve.pop();
                z = x + y;
                solve.push(z);
            } else if (ch == '-') {
                y = solve.pop();
                x = solve.pop();
                z = x - y;
                solve.push(z);
            } else if (ch == '*') {
                y = solve.pop();
                x = solve.pop();
                z = x * y;
                solve.push(z);
            } else if (ch == '/') {
                y = solve.pop();
                x = solve.pop();
                z = x / y;
                solve.push(z);
            }

        }

        return solve.pop();

    }

}
