package com.core3;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;



import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class MyRejectedExecutionHandler implements RejectedExecutionHandler {

	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		// TODO Auto-generated method stub
		System.out.println(r.toString() + " is Rejected");

		System.out.println("Retrying to Execute");
		try {
			// Re-executing with alternateExecutor
			executor.execute(r);
			System.out.println("executed thread are"+executor.getCompletedTaskCount());
			System.out.println(r.toString() + " Execution Started");
		} catch (Exception e) {
			System.out.println("Failure to Re-exicute " + e.getMessage());
		}
	}

}




