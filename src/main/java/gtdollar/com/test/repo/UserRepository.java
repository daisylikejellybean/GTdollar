package gtdollar.com.test.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import gtdollar.com.test.User;

public interface UserRepository extends CrudRepository<User, Long> {

	@Query("from User u where u.userEmail=:userEmail")
	User findUserByEmail(@Param("userEmail") String userEmail);

}
