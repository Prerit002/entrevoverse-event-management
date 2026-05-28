package com.entrevoverse.eventmanagement.controller;

import com.entrevoverse.eventmanagement.model.Event;
import com.entrevoverse.eventmanagement.model.Registration;
import com.entrevoverse.eventmanagement.repository.EventRepository;
import com.entrevoverse.eventmanagement.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private RegistrationRepository registrationRepository;

    // Sabhi events fetch karo
    @GetMapping("/events")
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    // Naya event add karo (admin)
    @PostMapping("/events")
    public Event addEvent(@RequestBody Event event) {
        return eventRepository.save(event);
    }

    // Event delete karo (admin)
    @DeleteMapping("/events/{id}")
    public void deleteEvent(@PathVariable int id) {
        eventRepository.deleteById(id);
    }

    // Registration karo
    @PostMapping("/register")
    public Registration register(@RequestBody Registration registration) {
        registration.setRegisteredAt(LocalDateTime.now());
        return registrationRepository.save(registration);
    }

    // Sabhi registrations dekho (admin)
    @GetMapping("/registrations")
    public List<Registration> getAllRegistrations() {
        return registrationRepository.findAll();
    }
}