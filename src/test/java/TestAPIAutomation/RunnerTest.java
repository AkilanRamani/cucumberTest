package TestAPIAutomation;

import com.intuit.karate.Runner;
import com.intuit.karate.junit5.Karate;
import com.intuit.karate.junit5.Karate.Test;

public class RunnerTest {
 
	 @Test
	 
	    Karate testUsers() {
	       // return Karate.run("POSTandGETCall").relativeTo(getClass());
	       Karate k =  Karate.run("AA"); // which will accept the feature file as an argument in the Run method and will Return the Karate class Type. 
	    Class<RunnerTest> c = RunnerTest.class;
	       
	       //Karate k1 = k.relativeTo(c);
	       Karate k5 = Karate.run("aa");
	      return k5;
	}
}


