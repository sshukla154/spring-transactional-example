package sshukla.spring.transactional.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sshukla.spring.transactional.poc.dto.FlightBookingRequest;
import sshukla.spring.transactional.poc.dto.FlightBookingResponse;
import sshukla.spring.transactional.poc.service.FlightBookingService;

/**
 * @author 'Seemant Shukla' on '18/09/2022'
 */

@RestController
@RequestMapping("/flight-booking")
public class FlightBookingController {

    @Autowired
    private FlightBookingService flightBookingService;

    @PostMapping
    public FlightBookingResponse bookFlight(@RequestBody FlightBookingRequest flightBookingRequest) {
        return flightBookingService.bookFlight(flightBookingRequest);
    }

}
