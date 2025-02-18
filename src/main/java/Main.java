import domain.Operand;
import exception.IllegalUserInputException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        try {
            System.out.print("enter formula\n>> ");
            String input = br.readLine();

            String[] split = input.split(" ");

            if (split.length != 3) {
                throw new IllegalUserInputException("formula format is wrong.");
            }
            long operand1 = Long.parseLong(split[0]);
            long operand2 = Long.parseLong(split[2]);
            Operand operand = new Operand(split[1]);

            System.out.println("result : " + operand.calculate(operand1, operand2));

        } catch (NumberFormatException e) {
            throw new IllegalUserInputException("formula format is wrong.");
        }
    }
}
