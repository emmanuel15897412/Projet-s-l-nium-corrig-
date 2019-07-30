package fr.eql.autom.Outils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import org.dbunit.Assertion;
import org.dbunit.IDatabaseTester;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;

public class OutilBDD {

	private static String DRIVER;
	private static String JDBC_URL;
	private static String USER;
	private static String PASSWORD;

	public static void setUp() throws IOException {

		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("src/main/java/ressources/bdd/bdd.properties");
		prop.load(file);
		System.out.println(file.toString());
		file.close();

		DRIVER = prop.getProperty("driver");
		JDBC_URL = prop.getProperty("jdbc");
		USER = prop.getProperty("user");
		PASSWORD = prop.getProperty("password");

		System.out.println(file.toString());

	}

	// public static IDataSet readDataSet(String path_to_file) throws
	// DataSetException, IOException {
	// setUp();
	// return new FlatXmlDataSetBuilder().build(new File(path_to_file));
	// }
	//
	// public static void insertData(String path_to_file) throws Exception {
	// IDataSet dataset = readDataSet(path_to_file);
	// System.out.println(DRIVER + " " + JDBC_URL + " " + USER + " " + PASSWORD);
	// IDatabaseTester databaseTester = new JdbcDatabaseTester(DRIVER, JDBC_URL,
	// USER, PASSWORD);
	// databaseTester.setSetUpOperation(DatabaseOperation.CLEAN_INSERT);
	// databaseTester.setDataSet(dataset);
	// databaseTester.onSetup();
	// }
	//
	// public static void deleteData(String path_to_file) throws Exception {
	// IDataSet dataset = readDataSet(path_to_file);
	// IDatabaseTester databaseTester = new JdbcDatabaseTester(DRIVER, JDBC_URL,
	// USER, PASSWORD);
	// databaseTester.setSetUpOperation(DatabaseOperation.DELETE_ALL);
	// databaseTester.setDataSet(dataset);
	// databaseTester.onSetup();
	// }
	//
	// public static void deleteDataOne(String path_to_file) throws Exception {
	// IDataSet dataset = readDataSet(path_to_file);
	// IDatabaseTester databaseTester = new JdbcDatabaseTester(DRIVER, JDBC_URL,
	// USER, PASSWORD);
	// databaseTester.setSetUpOperation(DatabaseOperation.DELETE);
	// databaseTester.setDataSet(dataset);
	// databaseTester.onSetup();
	// }
	//
	// public static void insertDataOne(String path_to_file) throws Exception {
	// IDataSet dataset = readDataSet(path_to_file);
	// IDatabaseTester databaseTester = new JdbcDatabaseTester(DRIVER, JDBC_URL,
	// USER, PASSWORD);
	// databaseTester.setSetUpOperation(DatabaseOperation.INSERT);
	// databaseTester.setDataSet(dataset);
	// databaseTester.onSetup();
	// }
	//
	// public static void compareData(String table, String path_to_file, String...
	// col) throws SQLException, Exception {
	// IDatabaseTester databaseTester = new JdbcDatabaseTester(DRIVER, JDBC_URL,
	// USER, PASSWORD);
	// IDataSet databaseDataSet = databaseTester.getConnection().createDataSet();
	// ITable actualTable = databaseDataSet.getTable(table);
	// IDataSet expectedDataSet = readDataSet(path_to_file);
	// ITable expectedTable = expectedDataSet.getTable(table);
	// String tab[] = col;
	// Assertion.assertEqualsIgnoreCols(expectedTable, actualTable, tab);
	// }

	// public String testEric(String test) {
	// int foovalue = 500;
	// PreparedStatement st = db.prepareStatement("SELECT * FROM matable WHERE ma
	// colonne = ?");
	// st.setInt(1, valeur);
	// ResultSet rs = st.executeQuery();
	// while (rs.next()) {
	// System.out.print("Colonne 1 renvoyée ");
	// System.out.println(rs.getString(1));
	// }
	// rs.close();
	// st.close();
	// }

	// select * from profile_table
	public static List<String> getAllProfilTable() throws SQLException {
		try {
			setUp();
		} catch (IOException e1) {
			System.out.println("pb setUp() BDD");
			e1.printStackTrace();
		}
		ResultSet rs = null;
		;
		PreparedStatement st = null;
		List<String> resulat = new LinkedList<String>();
		try {
			Connection con = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

			st = con.prepareStatement("select * from profile_table");
			rs = st.executeQuery();
			while (rs.next()) {
				System.out.print("Colonne 1 renvoyée ");
				System.out.println(rs.getString(3));
				resulat.add(rs.getString(3));
			}

		} catch (SQLException e) {
			System.out.println("pb bdd");
			e.printStackTrace();
		} finally {
			rs.close();
			st.close();

		}
		return resulat;
	}

	public static boolean getProfilTableByProfileName(String name) throws SQLException {
		// 'Role_test'
		try {
			setUp();
		} catch (IOException e1) {
			System.out.println("pb setUp() BDD");
			e1.printStackTrace();
		}
		boolean bool = true;
		PreparedStatement st = null;
		List<String> resulat = new LinkedList<String>();
		try {
			Connection con = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

			st = con.prepareStatement("delete from profile_table where profile_name = ?");
			st.setString(1, name);
			st.executeUpdate();

		} catch (org.postgresql.util.PSQLException e) {
			System.out.println("profil non trouvé");
			bool = false;

		} catch (SQLException e) {
			System.out.println("pb bdd");
			bool = false;
			e.printStackTrace();
		} finally {
			if (!st.isClosed()) {
				st.close();
			}
		}
		return bool;
	}
}
