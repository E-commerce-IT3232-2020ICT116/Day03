package lk.ac.vau.fas.ict.controller;

import java.util.ArrayList;
import java.util.List;
import lk.ac.vau.fas.ict.model.Student;
import jakarta.annotation.PostConstruct;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")

public class AppController {
		Student st1 = new Student("Bob",23, "IT",3.2,"2020ICT01");
		Student st2 = new Student("Mark",24, "IT",3.6,"2020ICT02");
		Student st3 = new Student("Chirst",25, "IT", 3.7,"2020ICT03");
		List <Student> students= new ArrayList<Student>();
		
		@GetMapping("/student")
		public Student getStudent() {
			return st1;
		}
		
		@PostConstruct
	    public void init() {
	        students.add(st1);
	        students.add(st2);
	        students.add(st3);
	    }
		
		@GetMapping("/students")
		 public List<Student> getStudents() {
	        return students;
	    }
		
		@GetMapping("/student/{id}")
		public Student getStudent(@PathVariable("id") String regNo) {
	        for (Student student : students) {
	            if (student.getRegNo().equals(regNo)) {
	                return student;
	            }
	        }
	        return null;  
	    }
	    
		@GetMapping("/students/age-between")
		 public List<Student> getStudentsByAgeRange() {
	        List<Student> result = new ArrayList<>();

          for (Student student : students) {
                if (student.getAge() >= 20 && student.getAge() <= 24) {
	                result.add(student); 
	            }
	        }
	        return result;
	    }
		
		@GetMapping("/students/sorted-by-gpa")
		 public List<Student> getStudentsSortedByGPA() {


	        int n = students.size();
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (students.get(j).getGpa() > students.get(j + 1).getGpa()) {
                        Student temp = students.get(j);
	                    students.set(j, students.get(j + 1));
	                    students.set(j + 1, temp);
	                }
	            }
	        }
	        return students;
	    }
		
		@PostMapping("/student")
	    public Student createStudent(@RequestBody Student student) {
	        students.add(student); 
            return student; 

	    }

}
