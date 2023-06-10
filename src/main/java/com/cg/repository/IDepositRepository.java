package com.cg.repository;


import com.cg.model.Deposit;
import com.cg.model.dto.customer.CustomerDTO;
import com.cg.model.dto.deposit.DepositDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDepositRepository extends JpaRepository<Deposit, Long> {
}