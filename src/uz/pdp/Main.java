package uz.pdp;

import uz.pdp.db.StudentRepo;
import uz.pdp.entity.Student;
import uz.pdp.service.StudentService;
import uz.pdp.util.Input;

public class Main {
    public static void main(String[] args) {

//        db();
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
    private static void db(){
        Student student1 = new Student("Asadbek", "Tog'ayev", "+998930649246");
        Student student2 = new Student("Zokirjon", "Fazliddinov", "+99893065746");
        Student student3 = new Student("Jack", "Anderson", "+9981283487");
        StudentRepo.getInstance().add(student1);
        StudentRepo.getInstance().add(student2);
        StudentRepo.getInstance().add(student3);
    }
}
