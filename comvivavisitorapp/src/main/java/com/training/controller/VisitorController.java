package com.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Visitor;

@RestController		// JSON
@RequestMapping("visitors")
public class VisitorController {

	public VisitorController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping //localhost:9090/visitors
	public List<Visitor> getAllVisitors(){
		
		List<Visitor> visitors = new ArrayList<Visitor>();
		visitors.add(new Visitor(111, "Neha", "Meeting", "Purshottam"));
		visitors.add(new Visitor(111, "Neha", "Meeting", "Purshottam"));
		visitors.add(new Visitor(111, "Neha", "Meeting", "Purshottam"));
		return visitors;
		
	}
	
	@PostMapping	//localhost:9090/visitors - POST
	public String saveVisitor() {
		return "Visitor Saved";
	}
}
