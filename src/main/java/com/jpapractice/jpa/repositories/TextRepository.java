package com.jpapractice.jpa.repositories;

import com.jpapractice.jpa.models.Text;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextRepository extends JpaRepository<Text, Integer> {
}
