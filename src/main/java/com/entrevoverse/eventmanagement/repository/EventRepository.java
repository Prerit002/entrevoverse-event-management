package com.entrevoverse.eventmanagement.repository;

import com.entrevoverse.eventmanagement.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
    
}