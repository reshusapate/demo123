package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CollegeServiceImpl implements CollegeService {

	 List<College> list;
	 
	 public CollegeServiceImpl(){
	 list =new ArrayList<>();
	 list.add(new College(true, 01,"abc@gmail.com",101, null, null));
	 }
	@Override
	public List<College> getColleges() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public College addCollege(College college) {
		// TODO Auto-generated method stub
		 list.add(college);
		 return college;
	}

}
