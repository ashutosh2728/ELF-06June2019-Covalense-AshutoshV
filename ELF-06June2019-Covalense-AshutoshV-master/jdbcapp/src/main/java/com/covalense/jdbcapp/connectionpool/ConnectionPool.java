package com.covalense.jdbcapp.connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

public class ConnectionPool {
	private Vector<Connection> pool;
	private String driverClassNM = null;
	private String dbUrl = null;
	private String userM = null;
	private String password = null;
	int poolSize;
	private static ConnectionPool poolRef = null;

	public static ConnectionPool getConnectionPool() throws Exception {
		if (poolRef == null) {
			poolRef = new ConnectionPool();
		}
		return poolRef;
	}

	private void loadProperties() throws Exception {
		dbUrl = PropertiesUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.DB_URL);
		driverClassNM = PropertiesUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.DRIVER_CLASS_NAME);
		userM = PropertiesUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.USER_M);
		password = PropertiesUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.PASSWORD);
		poolSize = Integer.parseInt(PropertiesUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.POOL_SIZE));
	}

	private void initializePool() throws Exception {
		pool = new Vector<Connection>();
		Connection con = null;
		Class.forName(driverClassNM);

		for (int i = 0; i < poolSize; i++) {
			con = DriverManager.getConnection(dbUrl, userM, password);
			pool.add(con);
		}

	}

	private ConnectionPool() throws Exception {

		loadProperties();
		initializePool();
	}

	public Connection getConnectionFromPool() {

		return pool.remove(0);
	}

	public void returnConnectionToPool(Connection con) {
		pool.add(con);
	}

}
