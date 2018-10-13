package student.service;

import student.dao.StudentDao;
import student.dto.Student;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2018. 10. 11..
 */
public class InsertService {

    private StudentDao studentDao;

    public InsertService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void insert(Student student) {
        studentDao.insert(student);
    }
}
