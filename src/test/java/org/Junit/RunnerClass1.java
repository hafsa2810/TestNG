package org.Junit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClass1 {

	
	@Test
	public void tc50() {
		Result rs = JUnitCore.runClasses(Employee.class, Client.class);
		System.out.println("Run count is :"+rs.getRunCount());
		System.out.println("Failure count is :"+rs.getFailureCount());
		System.out.println("Ignore count is :"+rs.getIgnoreCount());
		List<Failure> li = rs.getFailures();
		
		for(Failure x : li) {
			System.out.println(x);

	}
}
}