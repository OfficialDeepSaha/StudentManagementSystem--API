package StudentManagement_CRUD_application;

import java.util.List;

public interface StudentService {
	
	public List<Student> getAllsStudents();
	
	Student createStudent(Student student);
	
	Student findById(Long id);
	
	void deleteStudent(Long id);

	public Student save(Student student);
	
	

}
