package returnexample.server;

import returnexample.shared.UpperCaseServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImpl implements UpperCaseServer {

    public ServerImpl() throws RemoteException {
        UnicastRemoteObject.exportObject(this, 0);
    }

    @Override
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public String checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        String result = "";
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
            result = "not prime";
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    result = "is not prime";
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
                result = "is a prime";
            }
        }
        return result;

    }
}