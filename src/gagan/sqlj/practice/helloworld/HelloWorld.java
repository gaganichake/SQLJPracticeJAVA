package gagan.sqlj.practice.helloworld;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HelloWorldDAO helloWorldDAO = new HelloWorldDAO();
		try {
			System.out.println("Insert...");
			helloWorldDAO.insert("Gagan", 1000);
			helloWorldDAO.insert("Rarang", 7000);
			helloWorldDAO.insert("Galande", 9000);
			helloWorldDAO.insert("Gourav", 9000);
			helloWorldDAO.insert("Praveen", 34000);
			helloWorldDAO.insert("Kunal", 6000);
			helloWorldDAO.insert("Narayan", 8000);
			helloWorldDAO.fetch();
			
			/*System.out.println("Update...");
			helloWorldDAO.update("Gagan", 2000);
			helloWorldDAO.fetch();*/
			
			/*System.out.println("Update with IN Clause...");
			List<String> employeeNameList = new ArrayList<String>();
			employeeNameList.add("Gagan");employeeNameList.add("Rarang");employeeNameList.add("Galande");employeeNameList.add("Gourav");
			employeeNameList.add("Praveen");employeeNameList.add("Kunal");employeeNameList.add("Narayan");
			helloWorldDAO.updateWithIN(employeeNameList);
			helloWorldDAO.fetch();*/
			
			/*System.out.println("Delete...");
			helloWorldDAO.delete();
			helloWorldDAO.fetch();*/
			
		} catch (SQLException e) {
			System.out.println("Exception...");
			e.printStackTrace();
		}
	}

}
