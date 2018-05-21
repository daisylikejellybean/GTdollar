package gtdollar.com.test.repo;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import gtdollar.com.test.Transaction;


public interface TransactionRepository extends CrudRepository<Transaction, Long> {

	@Query("from Transaction t where t.sender=:email or t.receiver=:email")
	ArrayList<Transaction> getTransactionsByEmail(@Param("email") String email);
}