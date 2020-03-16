package com.dev.pd.creational.factoymethod;

public class ConnectionDBFactory {
	
	public ConnectionDB selectionConnectionDB(int option) {
		switch (option) {
		case 1: 
			return new SQLConnectionDB();
		case 2: 
			return new OracleConnectionDB();
		case 3:
			return new MongoConnectionDB();
		case 4:
			return new CasandraConnectionDB();
		case 5:
			return new DB2ConnectionDB();
		case 6:
			return new MySQLConnectionDB();
		default:
			throw new IllegalArgumentException();
		}
	}
	
}
