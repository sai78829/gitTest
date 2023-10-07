package com.Example.TestNG;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.Test;

public class AppTest 
{
 
    @Test
    public void shouldAnswerWithTrue()
    {
    	System.out.println("Addition perform");
    	App a1=new App();
    	int result=a1.add(10, 10);
        assertEquals(20, result );
        
    }

	
}
