# spring-transactional-example

### Used annotations:
`@SpringBootApplication`
`@EnableTransactionManagement`
`@RestController`
`@RequestMapping`
`@Autowired`
`@PostMapping`
`@RequestBody`
`@Service`
`@Override`
`@Transactional`
`@Data`
`@NoArgsConstructor`
`@AllArgsConstructor`
`@Entity`
`@Table`
`@Id`
`@GeneratedValue`
`@GenericGenerator`
`@JsonFormat`
`@Repository`

## API
- _POST_ : `http://localhost:8081/flight-booking`

## JSON Body
- Valid: Verifying `@Transactional` annotation i.e. failed while performing payment so won't make entry in `passenger_info` table as well. Another use-case is, commenting the `@Transactional` annotation in service layer and verifying with the same request (this will make entry in `passenger_info` table but will fail while performing payment so won't make any entry in `payment_info` table)  
```
{
    "passengerInfo": {
        "travelDate": "13/12/2022",
        "name": "S Shukla",
        "email": "sshukla@sshukla.com",
        "source": "Netherlands",
        "destination": "India",
        "pickupTime": "15:00",
        "arrivalTime": "12:00",
        "fare": 800000.00
    },
    "paymentInfo": {
        "accountNumber": "account-1",
        "cardType": "Credit Card"
    }
}
```
- Invalid: Successful insert in both the tables
```
{
    "passengerInfo": {
        "travelDate": "13/12/2022",
        "name": "S Shukla",
        "email": "sshukla@sshukla.com",
        "source": "Netherlands",
        "destination": "India",
        "pickupTime": "15:00",
        "arrivalTime": "12:00",
        "fare": 5000.00
    },
    "paymentInfo": {
        "accountNumber": "account-1",
        "cardType": "Credit Card"
    }
}
```