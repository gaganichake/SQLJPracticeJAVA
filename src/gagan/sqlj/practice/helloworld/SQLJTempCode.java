package gagan.sqlj.practice.helloworld;

import java.sql.SQLException;
import java.util.List;

/*
 * This is a temporary java file used before writing original sqlj file for the purpose of detecting Compilation error.
 */
public class SQLJTempCode extends SQLJTemplate {
	
	public void insert(String emplyeeName, double salary) throws SQLException {
		//#sql { INSERT INTO TEST (ENAME, SAL) VALUES (:emplyeeName, :salary) };
	}
	
	public void update(String emplyeeName, double salary) throws SQLException {
		//#sql { UPDATE TEST SET SAL = :salary WHERE ENAME = :emplyeeName };
	} 
	
	public void delete() throws SQLException {
		//#sql { DELETE FROM TEST };
	}  
	
/*	#sql public static iterator EmployeeIteratorClass (
 	 	long, String, double
	);

	public void fetch() throws SQLException {
	
		EmployeeIteratorClass employeeIterator;
	
		//#sql employeeIterator = { SELECT * FROM TEST };
		
		ResultSet resultSet = employeeIterator.getResultSet();
		
		while (resultSet.next()) {

  			System.out.print("id = " + resultSet.getLong(1));
 		 	System.out.print("\t emplyeeName = " + resultSet.getString(2));
 		 	System.out.println("\t salary = " + resultSet.getDouble(3));

		}
		resultSet.close();
	}*/
		
	public void updateWithIN(List<String> employeeNameList) throws SQLException {
	
	  	int listSize = employeeNameList.size();		
        final int subSetSize = 5;//Determine the number of IDs we want to send to Database at a time		
        int numberOfSubSets = (listSize%subSetSize)==0 ? (listSize/subSetSize) : (listSize/subSetSize)+1;
        
        for(int index = 0; index < numberOfSubSets; index++){
        		
        	Object [] subSetOfNames = getSubSet(index,subSetSize,employeeNameList);
        	updateWithINClause(subSetOfNames);
        }
	}
	
	public void updateWithINClause(Object [] employeeNameSubSet) throws SQLException {
		
		String ename1 = (String) employeeNameSubSet[0];	String ename2 = (String) employeeNameSubSet[1];	String ename3 = (String) employeeNameSubSet[2];
		String ename4 = (String) employeeNameSubSet[3];	String ename5 = (String) employeeNameSubSet[4];
		
        //#sql [] { UPDATE TEST SET SAL = SAL+100 WHERE ENAME IN (:ename1, :ename2, :ename3, :ename4, :ename5) };
	} 
	
}
