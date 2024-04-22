package stepdefinition;

import com.app.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass{
	
	
	@Before
	public void before() {
		System.out.println("before");
		// preconditions -> borwser launch -> 
		
	}
	
	@After
	public void teardown() {
		System.out.println("after");
		// screenshot,reports code
	}
}
