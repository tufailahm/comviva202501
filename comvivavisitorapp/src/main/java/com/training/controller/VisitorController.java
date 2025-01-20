package com.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Visitor;

@RestController		// JSON
@RequestMapping("visitors")
public class VisitorController {
	@GetMapping //localhost:9090/visitors
	public List<Visitor> getAllVisitors(){
		List<Visitor> visitors = new ArrayList<Visitor>();
		visitors.add(new Visitor(111, "Neha", "Meeting", "Purshottam"));
		visitors.add(new Visitor(112, "Neha", "Meeting", "Purshottam"));
		visitors.add(new Visitor(113, "Neha", "Meeting", "Purshottam"));
		return visitors;
	}
	
	
	@GetMapping("{vId}")		//localhost:9090/visitor/1612317
	public Visitor getVisitor(@PathVariable("vId")int visitorId)
	{
		//code here to search for visitorId;
		return new Visitor(visitorId, "NA", "NA", "NA");
	}
	
	@PostMapping	//localhost:9090/visitors - POST
	public String saveVisitor() {
		return "Visitor Saved";
	}
}
