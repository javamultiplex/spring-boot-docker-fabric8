package com.javamultiplex.repository;

import com.javamultiplex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Rohit Agarwal on 30/01/22 11:11 PM
 * @copyright www.javamultiplex.com
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
