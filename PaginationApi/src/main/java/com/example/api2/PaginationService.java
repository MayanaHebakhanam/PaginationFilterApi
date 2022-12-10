package com.example.api2;

import org.springframework.stereotype.Component;


@Component
public interface PaginationService {

	Iterable<EmployeeTab> getAllEmployees(Integer pageSize);

	EmployeeTab save(EmployeeTab emp);

}
