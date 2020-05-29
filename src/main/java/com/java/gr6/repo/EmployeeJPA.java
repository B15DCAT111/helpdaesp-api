package com.java.gr6.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.java.gr6.helpdeskBO.EmployeeBO;

public interface EmployeeJPA extends JpaRepository<EmployeeBO, Long> {
	@Query(value = "SELECT count(*) FROM helpdesk.employee", nativeQuery = true)
	Long getMaxEmpId();

}
