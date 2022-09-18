package sshukla.spring.transactional.poc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sshukla.spring.transactional.poc.entity.PassengerInfo;

/**
 * @author 'Seemant Shukla' on '18/09/2022'
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingResponse {

    private String status;
    private Double fare;
    private String pnrNumber;
    private PassengerInfo passengerInfo;

}
