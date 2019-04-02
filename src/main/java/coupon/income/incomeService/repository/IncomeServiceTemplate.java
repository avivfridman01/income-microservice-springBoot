package coupon.income.incomeService.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import coupon.income.incomeService.entities.Income;

@Controller
public class IncomeServiceTemplate {

	@Autowired
	public IncomeServiceDAO incomeService;

	public void storeIncome(Income income) {
		incomeService.save(income);
	}

	public Collection<Income> viewAllIncome() {
		Collection<Income> collection = incomeService.viewAllIncome();
		return collection;
	}

	public Collection<Income> viewIncomeByCustomer(long name) {
		Collection<Income> collection = incomeService.viewIncomeByCustomer(name);
		return collection;
	}

	public Collection<Income> viewIncomeByCompany(long name) {
		Collection<Income> collection = incomeService.viewIncomeByCompany(name);
		return collection;
	}

}
