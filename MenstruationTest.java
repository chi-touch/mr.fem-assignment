public class MenstruationTest{


	@Test
	public void testForFirstPeriodDate(){
	
	Menstruation myMenstruation = new MenstruationTest();

	int date =myMenstruation.period(9/01/2024);


	assertEquals(9/01/2024,date);


	}


}