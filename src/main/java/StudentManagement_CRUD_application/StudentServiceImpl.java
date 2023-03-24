package StudentManagement_CRUD_application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllsStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student createStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Long id) {
	
		studentRepository.deleteById(id);
	}

	@Override
	public Student findById(Long id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public Student save(Student student) {
		
		return studentRepository.save(student);
	}

}
