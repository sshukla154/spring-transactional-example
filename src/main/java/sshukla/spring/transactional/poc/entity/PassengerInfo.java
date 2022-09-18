package sshukla.spring.transactional.poc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.util.Date;

/**
 * @author 'Seemant Shukla' on '18/09/2022'
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "passenger_info")
public class PassengerInfo {

    @Id
    @GeneratedValue
    private Long pId;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy")
    private Date travelDate;

    private String name;
    private String email;
    private String source;
    private String destination;
    private String pickupTime;
    private String arrivalTime;
    private Double fare;

}
