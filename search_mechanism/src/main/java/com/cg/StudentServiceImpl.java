package com.cg;

import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentServiceImpl {

	@Autowired
	private StudentRepository studentRepository;

	public Student getByName(String name)
	{
			studentRepository.findByName(name).get();
		
	}

	public Student getByrollNo(int rollNo)
	{
		return studentRepository.findbyRollNo(rollNo).get();
	}

}