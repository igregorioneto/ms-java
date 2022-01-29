package com.greg.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greg.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
