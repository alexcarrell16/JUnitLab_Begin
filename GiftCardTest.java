package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GiftCardTest 
{

	@Test
	public void testGetIssuingStore() 
	{
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore());
		
		assertEquals("getBalance()", balance, card.getBalance(), .001);
	}
	
	@Test
	public void deduct_RemainingBalance()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100;
		card = new GiftCard(issuingStore, balance);
		
		double amountDeducted = 40;
		String expected = "Remaining Balance: 60.00";
		
		assertEquals("deduct()", expected, card.deduct(amountDeducted));
	}

}
