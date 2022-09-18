package sshukla.spring.transactional.poc.exception;

/**
 * @author 'Seemant Shukla' on '18/09/2022'
 */
public class InsufficientAmountException extends RuntimeException {
    public InsufficientAmountException(String message) {
        super(message);
    }
}
