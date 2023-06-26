package com.cg;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class StudentController {

		@Autowired
		StudentServiceImpl studentServiceImpl;
			

		@GetMapping("/student/{rollNo}")
		public Student findByrollNo(int rollNo) {
			return StudentServiceImpl.getByrollNo();
			
		}
		@GetMapping("/student/{name}")
		public Student getByStudentName(@PathVariable("name") String name) {
			return StudentServiceImpl.getByName(name);
		}
	}
}
