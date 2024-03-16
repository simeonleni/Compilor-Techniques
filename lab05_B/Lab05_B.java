import java.util.*;

public class Lab05_B {

    public static void main(String[] args) {

        String data = "E-D+I*H/B";
        List<String> tokens = lexicalAnalysis(data);

        ArrayList<String> syntaxErrors = syntaxAnalysis(tokens);
        System.out.println("\nSyntax Errors: " + syntaxErrors);

        ArrayList<String> semanticErrors = semanticAnalysis(tokens);
        System.out.println("\nSemantic Errors: " + semanticErrors);
    }

    private static List<String> lexicalAnalysis(String data) {
        List<String> tokensList = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(data, "+-*/", true);

        while (tokenizer.hasMoreTokens()) {
            String token[] = tokenizer.nextToken().split("");
            for (String string : token) {
                tokensList.add(string);
                System.out.println(string);
            }
        }

        return tokensList;
    }

    private static ArrayList<String> syntaxAnalysis(List<String> values) {
        ArrayList<String> errorCodes = new ArrayList<>();

        for (String token : values) {
            if (token.matches(".*\\d+.*")) {
                System.out.println(
                        "SYNTAX ERROR: Numbers 0 to 9 are not allowed in any part of the token. Token: " + token);
                errorCodes.add("S001");
                // Don't print the token after error message
                continue;
            }

            if (!token.matches("[A-Za-z+\\-*/]+")) {
                System.out.println("SYNTAX ERROR: Only letters, '+', '-', '*', and '/' are allowed. Token: " + token);
                errorCodes.add("S002");
                // Don't print the token after error message
                continue;
            }

            // Only print the token if no errors were found
            System.out.println(token);
        }

        return errorCodes;
    }

    private static ArrayList<String> semanticAnalysis(List<String> tokens) {
        ArrayList<String> errorCodes = new ArrayList<>();

        for (int i = 0; i < tokens.size() - 1; i++) {
            String currentToken = tokens.get(i);
            String nextToken = tokens.get(i + 1);

            if (isIdentifier(currentToken) && isIdentifier(nextToken)) {
                System.out.println(
                        "\nSEMANTIC ERROR- two operators (*,-,+,/) or Identifier (A to Z and a to z) cannot be written together! :::: "
                                + currentToken + ", " + nextToken);
                errorCodes.add("S100");
            }

            if (isOperator(currentToken) && isOperator(nextToken)) {
                System.out.println(
                        "\nSEMANTIC ERROR- two operators (*,-,+,/) or Identifier (A to Z and a to z) cannot be written together! :::: "
                                + currentToken + ", " + nextToken);
                errorCodes.add("S101");
            }

            if (isIdentifier(currentToken) && isIdentifier(nextToken)) {
                System.out.println(
                        "\nSEMANTIC ERROR-Invalid String! There is no operator in the String (+, /, -, *,) :::: "
                                + currentToken + ", " + nextToken);
                errorCodes.add("S102");
            }
        }

        return errorCodes;
    }

    private static boolean isOperator(String token) {
        return token.matches("[+\\-*/]");
    }

    private static boolean isIdentifier(String token) {
        return token.matches("[A-Za-z]+");
    }

}
