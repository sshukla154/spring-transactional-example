package sshukla.spring.transactional.poc.service;

import sshukla.spring.transactional.poc.dto.FlightBookingRequest;
import sshukla.spring.transactional.poc.dto.FlightBookingResponse;

/**
 * @author 'Seemant Shukla' on '18/09/2022'
 */
public interface FlightBookingService {
    FlightBookingResponse bookFlight(FlightBookingRequest flightBookingRequest);
}
