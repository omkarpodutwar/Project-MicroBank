package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository <Accounts, Long>{

    Optional<Accounts> findByCustomerId(Long customerId);

    @Transactional //
    @Modifying //tells the framework that this data is going to modify the data, so run this query in transactional
    //transactional bcoz if error occurs at runtime then the entire transaction will be rolled back
    //therf we are at a safer side, deleteById is a method of framework therf no need to mention transactional
    //framework will take care of it
    void deleteByCustomerId(Long customerId);
}
