package es;

import java.util.Scanner;

public class EntréeStandardJava implements EntréeStandard {
    @Override
    public String lis() {
        return new Scanner(System.in, "UTF-8").nextLine();
    }
}
