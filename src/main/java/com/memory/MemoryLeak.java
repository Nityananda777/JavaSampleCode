package com.memory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class MemoryLeak {
	// OutOfMemoryError
	// A memory leak is where an object that will never be used again still
	// hangs around in memory and doesn't get garbage collection, because some
	// reference to that object exists though no one is going to use it anytime.

	// 1. Long-living (static) objects. Static field holding object reference -
	// remains always in memory
	// very bad especially if "final" - once memory allocated cannot be even
	// changed or nullified in the code or finalize() method.
	// Usage of static classes should be minimized as they stay in memory for
	// the lifetime of the application.
	static final ArrayList<Object> list = new ArrayList<Object>(100);

	public static void main(String[] args) {

		// 2. (Unclosed) open streams ( file , network etc... )
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("xyz")));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 3. Unclosed connections
		try {
			// Connection conn = MyConnectionFactory.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 4. Also, while using single JDBC connection,calling close() on the
		// connection object, the db connection closes along with associated
		// Statement and ResultSet objects and all are garbage collected.
		// If a connection pool is used, a request to the database is made using
		// one of the existing connections in the pool. In this case, on calling
		// close() on the connection object, the database connection just
		// returns back to the pool, it is not actually closed. So merely
		// closing the connection does not automatically close the ResultSet and
		// Statement objects. As a result, ResultSet and Statement will not
		// become eligible for garbage collection.
		// Whatever be the connection usage - JDBC Statement and ResultSet
		// objects must be explicitly closed in a finally block

		// 4. web applications objects stored in application scope till
		// application is restarted
		// getServletContext().setAttribute("SOME_MAP", map);

		// 5. HTTP is a request-response-based stateless protocol. If a client
		// wants to send information to the server, it can be stored in an
		// HttpRequest object.
		// The data stored in HttpSession stays in memory as long as the user is
		// logged in. Putting too much data (e.g. shopping cart) into
		// HttpSession leads to the Overstuffed Session
		// Use of HttpSessions should be minimized and used only for state that
		// cannot realistically be kept on the request object
		// Remove objects from HttpSession if they are no longer used
		// Long-living data should be migrated to the business tier

		// Memory Overheads
		Boolean b = new Boolean(true);
		String s = new String("why new?");

		// Detection of memory leaks
		// 1. jConsole, jProbe Memory Analyzer, IBM's MAT eclipse plugin for
		// memory analyze
		// 2. Runtime.getRuntime().freeMemory

	}

}
