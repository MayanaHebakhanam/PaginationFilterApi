package com.example.api2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pagination")
public class PaginationController {

	@Autowired
	PaginationService service;

	@PostMapping("/create")
	EmployeeTab create(@RequestBody EmployeeTab emp) {
		return service.save(emp);
	}
	
	@PutMapping("/update")
	EmployeeTab update(@RequestBody EmployeeTab e) {
		return service.save(e);
	}

	@GetMapping()
	public ResponseEntity<Iterable<EmployeeTab>> getAllEmployees(@RequestParam(defaultValue = "10") Integer records) {
		Iterable<EmployeeTab> list = service.getAllEmployees(records);

		return new ResponseEntity<Iterable<EmployeeTab>>(list, new HttpHeaders(), HttpStatus.OK);
	}
}
