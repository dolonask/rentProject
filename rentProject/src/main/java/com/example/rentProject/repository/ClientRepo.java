package com.example.rentProject.repository;

import com.example.rentProject.model.Client;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepo extends JpaRepository<Client, Long> {

    List<Client> findAllOrderByLastName(Pageable pageable);
}
