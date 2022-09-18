package sshukla.spring.transactional.poc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author 'Seemant Shukla' on '18/09/2022'
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payment_info")
public class PaymentInfo {
    @Id
    @GeneratedValue(generator = "UUID2")
    @GenericGenerator(name = "UUID2", strategy = "org.hibernate.id.UUIDGenerator")
    private String paymentId;

    private String accountNumber;
    private Double amount;
    private String cardType;
    private Long passengerId;
}
