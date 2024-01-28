import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest1{



	@Test
	public void testForTheSumOfTwoInteger(){

	Calculator myCalculator = new Calculator();

	int answer = myCalculator.add(4,5);

	assertEquals(9,answer);


	}

	@Test
	public void testForTheSumOfOneIntegerAndOneDouble(){

	Calculator myCalculator = new Calculator();

	double answer = myCalculator.add(4,5.2);

	assertEquals(9.2,answer);


	}

	@Test
	public void testForTheSumOfTwoDouble(){

	Calculator myCalculator = new Calculator();

	double answer = myCalculator.add(4.3,5.2);

	assertEquals(9.5,answer);

	}

	@Test
	public void testForOneNegativeIntegerAndOneInteger(){

	Calculator myCalculator = new Calculator();

	int answer = myCalculator.add(4,-6);

	assertEquals(-2,answer);
	}

	@Test
	public void testForSubtrationOfTwoNumber(){
	
	Calculator myCalculator = new Calculator();

	int answer = myCalculator.minus(9,4);

	assertEquals(5,answer);
	
	}

	@Test
	public void testForDividingOfTwoNumber(){

	Calculator myCalculator = new Calculator();

	int answer = myCalculator.division(20,2);

	assertEquals(10,answer);

	}



}