package gagan.sqlj.practice.helloworld;

import java.sql.SQLException;
import java.util.List;

import sqlj.runtime.ref.DefaultContext;

public class SQLJTemplate extends JDBCTemplate {

	public SQLJTemplate() {

		DefaultContext context = null;
		try {
			context = new DefaultContext(getConnection());
		} catch (SQLException e) {
			System.out
					.println("Error while getting connection from JDBCTemplate");
			e.printStackTrace();
		}
		DefaultContext.setDefaultContext(context);
	}
	
	public Object [] getSubSet(int index, int subSetSize, List list){
		
		Object [] subSet = new Object [subSetSize];
		
		for(int i = index; i <= index+subSetSize; i++){
			
			subSet[i] = list.get(i);
		}
		
		return subSet;
	}

}
