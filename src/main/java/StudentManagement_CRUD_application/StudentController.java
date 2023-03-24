package StudentManagement_CRUD_application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	
	//List student
	@GetMapping("/students")
	public List<Student> getStudents() {
		
		return studentService.getAllsStudents();
		
		
	}
	
	//Create student
	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student) {
		
		return studentService.createStudent(student);
	}
	
	
	//Update student
	@PostMapping("/students/update/{id}")
	public Student updateStudent(@RequestBody Student student , @PathVariable Long id) {
		
		Student update = studentService.findById(id);
		update.setId(student.getId());
		update.setEmail(student.getEmail());
		update.setFirstName(student.getFirstName());
		update.setLastName(student.getLastName());
		
		return studentService.save(update);
	}
	
	
	
	
	//Delete student
	@GetMapping("/students/{id}")
	public void deleteStudent(@PathVariable Long id) {
		
		studentService.deleteStudent(id);
	}
	
	
	
	
	
	
	

}
