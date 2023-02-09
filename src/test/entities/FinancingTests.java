package test.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing.Financing;

public class FinancingTests {

	// CONSTRUCTORS
	@Test
	public void constructorShouldBuildCorrectlyWhenValidated() {
		// ARRANGE
		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;

		// ACT
		Financing fin = new Financing(totalAmount, income, months);

		// ASSERT
		Assertions.assertEquals(totalAmount, fin.getTotalAmount());
		Assertions.assertEquals(income, fin.getIncome());
		Assertions.assertEquals(months, fin.getMonths());
	}

	@Test
	public void constructorShouldThrowExceptionWhenNotValid() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = new Financing(100000.0, 2000.0, 20);
		});
	}

	// SET TOTAL AMOUNT
	@Test
	public void setTotalAmountShouldSetDataWhenValidated() {

		Financing fin = new Financing(100000.0, 2000.0, 80);

		fin.setTotalAmount(90000.0);

		Assertions.assertEquals(90000.0, fin.getTotalAmount());
	}

	@Test
	public void setTotalAmountShouldThrowExceptionWhenNotValid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = new Financing(100000.0, 2000.0, 80);

			fin.setTotalAmount(110000.0);
		});
	}

	// SET INCOME
	@Test
	public void setIncomeShouldSetDataWhenValidated() {

		Financing fin = new Financing(100000.0, 2000.0, 80);

		fin.setIncome(4000.0);

		Assertions.assertEquals(4000.0, fin.getIncome());
	}

	@Test
	public void setIncomeShouldThrowExceptionWhenNotValid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = new Financing(100000.0, 2000.0, 80);

			fin.setIncome(1000.0);
		});
	}

	// SET MONTHS
	@Test
	public void setMonthsShouldSetDataWhenValidated() {

		Financing fin = new Financing(100000.0, 2000.0, 80);

		fin.setMonths(90);

		Assertions.assertEquals(90, fin.getMonths());
	}

	@Test
	public void setMonthsShouldThrowExceptionWhenNotValid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = new Financing(100000.0, 2000.0, 80);

			fin.setMonths(40);
		});
	}
	
	// ENTRY
	@Test
	public void entryShouldCalculateEntryCorrectly() { 
		Financing fin = new Financing(100000.0, 2000.0, 80);
		Assertions.assertEquals(20000.0, fin.entry());
	}
	
	// QUOTA
	@Test
	public void quotaShouldCalculateQuotaCorrectly() { 
		Financing fin = new Financing(100000.0, 2000.0, 80);
		Assertions.assertEquals(1000.0, fin.quota());
	}

}
