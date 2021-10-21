package returnexample.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class RunClient {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        RMIClient client = new RMIClient();
        client.startClient();

        Scanner in = new Scanner(System.in);
        // while (true) {
        // System.out.println("Input >");
        // String line = in.nextLine();

        // if (line.equalsIgnoreCase("exit"))
        // break;

        // String result = null;
        // try {
        // result = client.toUpperCase(line);
        // System.out.println("Result > " + result);
        // } catch (Exception e) {
        // System.out.println("Error: " + e.getMessage());
        // }
        // }
        while (true) {
            System.out.println("Input >");
            int line = in.nextInt();

            if (line == 0) {
                in.close();
                break;
            }

            String result = null;
            try {
                result = client.checkPrime(line);
                System.out.println("Result > " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
