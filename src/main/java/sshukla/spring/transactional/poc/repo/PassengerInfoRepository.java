package sshukla.spring.transactional.poc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sshukla.spring.transactional.poc.entity.PassengerInfo;

/**
 * @author 'Seemant Shukla' on '18/09/2022'
 */

@Repository
public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long> {
}
