package springmvc2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import springmvc2.dao.StudentDao;
import springmvc2.model.Student;

@Component
@Service
public class StudentService {

	@Autowired
	StudentDao dao;
	
	
	public void addStudent(Student s) {
		dao.addStudent(s);
	}
	
	public List<Student> getStudents() {
		return dao.getStudents();
	}
	
	public Student getStudentById(int id) {
		return dao.getStudentById(id);
	}
	
	public void  updateStudent(Student s) {
		dao.updateStudent(s);
	}
	
	public void deleteStudent(int id) {
		dao.deleteStudent(id);
	}
}
