package br.com.conexa.calendar;

import br.com.conexa.calendar.service.CalendarPocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.GeneralSecurityException;

@RestController
public class CalendarPocController {

    private final CalendarPocService calendarPocService;

    @Autowired
    public CalendarPocController(CalendarPocService calendarPocService) {
        this.calendarPocService = calendarPocService;
    }

    @GetMapping("/calendar")
    public ResponseEntity<Void> getEvents() throws GeneralSecurityException, IOException {
        calendarPocService.getEvents();
        return ResponseEntity.ok().build();
    }

    @PostMapping("/calendar")
    public ResponseEntity<Void> createEventOnCalendar() throws GeneralSecurityException, IOException {
        calendarPocService.createEventOnCalendar();
        return ResponseEntity.ok().build();
    }
}
