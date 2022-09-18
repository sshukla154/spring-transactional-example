package sshukla.spring.transactional.poc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sshukla.spring.transactional.poc.entity.PassengerInfo;
import sshukla.spring.transactional.poc.entity.PaymentInfo;

/**
 * @author 'Seemant Shukla' on '18/09/2022'
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingRequest {

    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;

}
