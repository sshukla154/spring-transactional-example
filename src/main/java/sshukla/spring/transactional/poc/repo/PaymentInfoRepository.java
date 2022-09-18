package sshukla.spring.transactional.poc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sshukla.spring.transactional.poc.entity.PaymentInfo;

/**
 * @author 'Seemant Shukla' on '18/09/2022'
 */

@Repository
public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {
}
