package com.entrevoverse.eventmanagement.repository;

import com.entrevoverse.eventmanagement.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {
}