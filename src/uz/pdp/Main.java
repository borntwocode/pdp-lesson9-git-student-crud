package uz.pdp;

import uz.pdp.service.StudentService;
import uz.pdp.util.Input;

public class Main {
    public static void main(String[] args) {

        while (true){
            displayMenu();
            switch (Input.INPUT_INT("Choose")){
                case 1 -> StudentService.add();
                case 2 -> StudentService.print();
                case 3 -> StudentService.edit();
                case 4 -> StudentService.remove();
            }
        }

    }
    private static void displayMenu(){
        System.out.println("""
                
                1 - Add Student
                2 - Show Student
                3 - Edit Student
                4 - Remove Student
                """);
    }
}
