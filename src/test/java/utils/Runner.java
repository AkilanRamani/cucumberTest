package utils;

import com.intuit.karate.junit5.Karate;
import com.intuit.karate.junit5.Karate.Test;

import TestAPIAutomation.RunnerTest;

public class Runner {
	@Test
    public Karate testOne() {
        
           return Karate.run("classpath:utils"); 
	 
   
}
}



