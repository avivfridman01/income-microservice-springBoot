package coupon.income.incomeService.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Income {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long id;
	public long name;
	@Temporal(TemporalType.DATE)
	public Date date;
	@Enumerated(EnumType.STRING)
	public Description description;
	public double amount;

	public Income() {
		super();
	}

	public Income(long id, long name, Date date, Description description, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.description = description;
		this.amount = amount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getName() {
		return name;
	}

	public void setName(long name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Description getDescription() {
		return description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Income [id=" + id + ", name=" + name + ", date=" + date + ", description=" + description + ", amount="
				+ amount + "]";
	}

}
