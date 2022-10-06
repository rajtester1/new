package Test.test;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class Mother {

@BeforeClass	
public void keyy() {

	RestAssured.authentication=RestAssured.preemptive().
			basic("admin", "admin");
	
}
	
}
