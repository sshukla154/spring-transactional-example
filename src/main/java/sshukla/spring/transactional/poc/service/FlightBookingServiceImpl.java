package sshukla.spring.transactional.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sshukla.spring.transactional.poc.dto.FlightBookingRequest;
import sshukla.spring.transactional.poc.dto.FlightBookingResponse;
import sshukla.spring.transactional.poc.entity.PassengerInfo;
import sshukla.spring.transactional.poc.entity.PaymentInfo;
import sshukla.spring.transactional.poc.repo.PassengerInfoRepository;
import sshukla.spring.transactional.poc.repo.PaymentInfoRepository;
import sshukla.spring.transactional.poc.validation.PaymentValidations;

import java.util.UUID;

/**
 * @author 'Seemant Shukla' on '18/09/2022'
 */

@Service
public class FlightBookingServiceImpl implements FlightBookingService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;

    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Override
    @Transactional
    public FlightBookingResponse bookFlight(FlightBookingRequest flightBookingRequest) {

        passengerInfoRepository.save(flightBookingRequest.getPassengerInfo());

        PaymentValidations.validateCreditLimit(flightBookingRequest.getPaymentInfo().getAccountNumber(), flightBookingRequest.getPassengerInfo().getFare());

        flightBookingRequest.getPaymentInfo().setAmount(flightBookingRequest.getPassengerInfo().getFare());
        flightBookingRequest.getPaymentInfo().setPassengerId(flightBookingRequest.getPassengerInfo().getPId());

        paymentInfoRepository.save(flightBookingRequest.getPaymentInfo());

        return new FlightBookingResponse("SUCCESS", flightBookingRequest.getPassengerInfo().getFare(), UUID.randomUUID().toString().split("-")[0], flightBookingRequest.getPassengerInfo());
    }
}
