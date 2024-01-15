package uz.pdp.service;

import uz.pdp.db.StudentRepo;
import uz.pdp.entity.Student;
import uz.pdp.util.Input;
import java.util.List;
import java.util.Optional;

public class StudentService {
    private static StudentRepo studentRepo = StudentRepo.getInstance();
    public static Optional<Student> findUserById(Integer id){
        List<Student> students = studentRepo.findAll();
        for (Student student : students) {
            if(student.getId().equals(id)){
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }
    public static void add(){
        Student student = new Student(
                Input.INPUT_STR("Enter Student First Name"),
                Input.INPUT_STR("Enter Student Last Name"),
                Input.INPUT_STR("Enter Student Phone Number")
        );
        studentRepo.add(student);
    }
    public static void print(){
        List<Student> all = studentRepo.findAll();
        for (Student student : all) {
            System.out.println();
        }
    }
    public static void edit(){
        Student chosenUser = chooseUser();
        Student student = new Student(
                Input.INPUT_STR("Enter New First Name"),
                Input.INPUT_STR("Enter New Last Name"),
                Input.INPUT_STR("Enter New Phone Number")
        );
        student.setId(chosenUser.getId());
        studentRepo.update(student);
    }
    private static Student chooseUser(){
        print();
        Optional<Student> chosenUserOpt = findUserById(Input.INPUT_INT("Choose User"));
        return chosenUserOpt.orElse(null);
    }
    public static void remove(){
        Student student = chooseUser();
        studentRepo.delete(student);
    }

}
