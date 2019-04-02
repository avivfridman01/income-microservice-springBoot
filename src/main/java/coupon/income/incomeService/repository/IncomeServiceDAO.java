package coupon.income.incomeService.repository;

import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import coupon.income.incomeService.entities.Income;

@Repository
public interface IncomeServiceDAO extends JpaRepository<Income, Integer> {
	
	@Query("select I from Income I")
	public Collection<Income> viewAllIncome();

	@Query("select I from Income I where I.name=:name and I.description LIKE 'CUSTOMER%'")
	public Collection<Income> viewIncomeByCustomer(@Param("name") long name);

	@Query("select I from Income I where I.name=:name and I.description LIKE 'COMPANY%'")
	public Collection<Income> viewIncomeByCompany(@Param("name") long name);
}
