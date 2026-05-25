package introduction.generics;

import java.util.List;

public class StudentRepository implements CrudRepository<Student, Integer>{
    @Override
    public boolean add(Student add) {
        String query = String.format("INSERT INTO students (id, name, birthdate) VALUES (%d, '%s', '%s')",
                add.getId(), add.getName(), add.getBirthdate());

        //execute sql query
        return false;
    }

    @Override
    public boolean delete(Integer key) {
        String query = String.format("DELETE FROM students WHERE id = %d", key);
        //execute sql query
        return false;
    }

    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public Student findOne(Integer integer) {
        return null;
    }

    @Override
    public boolean update(Integer integer, Student data) {
        return false;
    }
}
