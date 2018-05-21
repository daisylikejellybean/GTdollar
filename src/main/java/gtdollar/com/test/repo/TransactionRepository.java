package gtdollar.com.test.repo;
import org.springframework.data.repository.CrudRepository;
import gtdollar.com.test.Transaction;


public interface TransactionRepository extends CrudRepository<Transaction, Long> {

}