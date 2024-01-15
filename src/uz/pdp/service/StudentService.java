package uz.pdp.service;

import uz.pdp.db.StudentRepo;
import uz.pdp.entity.Student;
import uz.pdp.util.Input;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class StudentService {
    private static StudentRepo studentRepo = StudentRepo.getInstance();
    public static Optional<Student> findUserById(UUID uuid){
        List<Student> students = studentRepo.findAll();
        for (Student student : students) {
            if(student.getId().equals(uuid)){
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

}
