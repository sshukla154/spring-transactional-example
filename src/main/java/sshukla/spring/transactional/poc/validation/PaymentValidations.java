package sshukla.spring.transactional.poc.validation;

import sshukla.spring.transactional.poc.exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 'Seemant Shukla' on '18/09/2022'
 */
public class PaymentValidations {

    private static Map<String, Double> accountAmountMap = new HashMap<>();

    static {
        accountAmountMap.put("account-1", 15000.00);
        accountAmountMap.put("account-2", 1000.00);
        accountAmountMap.put("account-3", 923.12);
        accountAmountMap.put("account-4", 8000.17);
        accountAmountMap.put("account-5", 10123.54);
    }

    /**
     * Failed Payment:
     * 1. When actual amount in back account is less than fare
     */

    public static boolean validateCreditLimit(String accountNumber, Double fareAmount) {
        if (fareAmount > Double.valueOf(accountAmountMap.get(accountNumber))) {
            throw new InsufficientAmountException("Insufficient amount in account!!!");
        }
        return true;
    }

}
