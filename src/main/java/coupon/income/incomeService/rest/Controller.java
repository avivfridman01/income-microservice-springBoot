package coupon.income.incomeService.rest;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import coupon.income.incomeService.entities.Income;
import coupon.income.incomeService.repository.IncomeServiceTemplate;

@RestController
@RequestMapping("Controller")
public class Controller {

	@Autowired
	private IncomeServiceTemplate incomeServiceTemplate;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void storeIncome(@RequestBody Income income) {
		incomeServiceTemplate.storeIncome(income);
	}

	@RequestMapping(value = "/viewAll", method = RequestMethod.GET)
	public Collection<Income> viewAllIncome() {
		Collection<Income> collection = incomeServiceTemplate.viewAllIncome();
		return collection;
	}

	@RequestMapping(value = "/viewByCustomer/{customerID}", method = RequestMethod.GET)
	public Collection<Income> viewIncomeByCustomer(@PathVariable()long customerID) {
		Collection<Income> collection = incomeServiceTemplate.viewIncomeByCustomer(customerID);
		return collection;
	}

	@RequestMapping(value = "/viewByCompany/{companyID}", method = RequestMethod.GET)
	public Collection<Income> viewIncomeByCompany(@PathVariable()long companyID) {
		Collection<Income> collection = incomeServiceTemplate.viewIncomeByCompany(companyID);
		return collection;
	}
}
