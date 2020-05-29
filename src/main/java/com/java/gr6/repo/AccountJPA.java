package com.java.gr6.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.gr6.helpdeskBO.AccountBO;

public interface AccountJPA extends JpaRepository<AccountBO, Long> {

}
