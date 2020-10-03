import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void deposit() {
		
		//create an instance of a class
		BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00);
		double balance = account.deposit(200.00, true);
		//can use assertEquals method that the actual method should be 200
		assertEquals(1200.00, balance, 0);
		//the third parameter is the delta parameter it allows leeway, as long as the expected and actual are within
		//the range of delta it is ok and still passes
		
		//deposit test is now succesful
		//not best pracrtice to have multiple assertions or use another method
		//assertEquals(1200.00, account.getBalance(), 0);
	}
	
	@Test
	public void withdraw() {
		fail("This test has yet to be implemented");
	}
	
	@Test
	public void getBalance_deposit() {
		BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00);
		account.deposit(200.0, true);
		assertEquals(1200.00, account.getBalance(), 0);
		
	}
	
	@Test
	public void getBalance_withdrawt() {
		BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00);
		account.withdraw(200.0, true);
		assertEquals(800.00, account.getBalance(), 0);
		
	}
	
	/*
	@Test
	public void dummyTest() {
		//need to make an assertion to catch a bug
		//an empty test method will allow the code to pass
		//the first parameter is the value we expect
		//the second parameter is the value we want to test
		assertEquals(20,21); 
	}
*/
	
	
}
