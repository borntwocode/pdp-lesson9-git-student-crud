package uz.pdp.db;

import uz.pdp.entity.Student;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepo implements Repository<Student> {
    private List<Student> students;
    private static StudentRepo singleton;
    private static String PATH = "src/uz/pdp/db/student_db.txt";

    private StudentRepo(List<Student> students) {
        this.students = students;
    }
    public static StudentRepo getInstance(){
        if(singleton == null){
            singleton = new StudentRepo(loadData());
        }
        return singleton;
    }

    private static ArrayList<Student> loadData(){
        try (
                InputStream inputStream = new FileInputStream(PATH);
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        ) {
            return (ArrayList<Student>) objectInputStream.readObject();
        } catch (Throwable e) {
            return new ArrayList<>();
        }
    }
    @Override
    public void add(Student student) {
        students.add(student);
    }
    private void upload(){
        try (
                OutputStream outputStream = new FileOutputStream(PATH);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)
        ){
            objectOutputStream.writeObject(students);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(Student student) {

    }
}
