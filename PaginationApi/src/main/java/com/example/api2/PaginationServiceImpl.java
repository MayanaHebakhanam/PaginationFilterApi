package com.example.api2;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PaginationServiceImpl implements PaginationService {

	@Autowired
	PaginationRepository repository;

	public Iterable<EmployeeTab> getAllEmployees(Integer pageSize) {

		Pageable paging = PageRequest.ofSize(pageSize);

		Page<EmployeeTab> pagedResult = repository.findAll(paging);

		if (pagedResult.hasContent()) {
			return pagedResult.getContent();
		} else {
			return new ArrayList<EmployeeTab>();
		}

	}

	public EmployeeTab save(EmployeeTab emp) {

		return repository.save(emp);
	}
}
