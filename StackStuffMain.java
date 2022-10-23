import java.io.*;
class StackStuffMain {
    public static void main(String[] args) throws IOException {
        String file = "D:\\SELU\\390\\program 2\\data.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String curLine;
        while ((curLine = bufferedReader.readLine()) != null) {
            // process the line as required
            System.out.println(curLine);
            System.out.println(evaluate(curLine ) + "\n");
        }
        bufferedReader.close();

    }

    static public int evaluate(String equation) {
        ParenTest pTest = new ParenTest();
        InfixToPostFix iTF = new InfixToPostFix();
        String postFix ;
        PostFixEval pFix = new PostFixEval();
        int eval = 0;

        if (pTest.checkParen(equation)) {
           postFix= iTF.iTF(equation);
           System.out.print("Value: ");
           eval = pFix.postFixEval(postFix);

        } else {
        }
        return eval;


    }

}