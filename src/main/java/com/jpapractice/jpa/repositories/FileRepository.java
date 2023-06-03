package com.jpapractice.jpa.repositories;

import com.jpapractice.jpa.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Integer> {
}
