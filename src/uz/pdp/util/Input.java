package uz.pdp.util;

import java.util.Scanner;

public interface Input {
    static int INPUT_INT(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        if(!scanner.hasNextInt()){
            return INPUT_INT("Enter Number");
        }
        return scanner.nextInt();
    }
    static String INPUT_STR(String msg){
        System.out.println(msg);
        return new Scanner(System.in).nextLine();
    }
}
