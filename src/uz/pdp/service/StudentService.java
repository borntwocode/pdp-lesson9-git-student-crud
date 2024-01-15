package uz.pdp.service;

import uz.pdp.db.StudentRepo;
import uz.pdp.entity.Student;

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
}
