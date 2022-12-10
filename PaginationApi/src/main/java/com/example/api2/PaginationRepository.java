package com.example.api2;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaginationRepository extends PagingAndSortingRepository<EmployeeTab, Long> {

}
