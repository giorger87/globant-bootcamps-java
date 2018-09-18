package mainPackage;

import java.util.Scanner;

import connection.Connection;
import connection.ConnectionFactory;
import connection.FactoryProducer;

public class ConnectionDemo {
	static Scanner scanner = new Scanner(System.in);

	public static void run() {
		FactoryProducer Producer = new FactoryProducer();
		ConnectionFactory ConnFactory = null;

		// swiching different connection types (comment previous code to test)
		System.out.println("write your connection type (SQL/ NOSQL)");
		String ConType = scanner.nextLine();
		ConnFactory = Producer.getFactory("Connection");
		Connection newCon = ConnFactory.getConnType(ConType);
		newCon.connect();
	}
}
