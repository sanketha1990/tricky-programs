package com.cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		Session session = cluster.connect("killrvideo");
		ResultSet result = session.execute("select * from videos_by_tag");
		System.out.println("Result = " + result);
	}

}
