/*@lineinfo:filename=HelloWorldDAO*//*@lineinfo:user-code*//*@lineinfo:1^1*/package gagan.sqlj.practice.helloworld;


import java.sql.*;
import sqlj.runtime.*;
import sqlj.runtime.ref.*;

import java.util.List;

public class HelloWorldDAO extends SQLJTemplate {

	public void insert(String emplyeeName, double salary) throws SQLException {
		/*@lineinfo:generated-code*//*@lineinfo:13^3*/

//  ************************************************************
//  #sql { INSERT INTO TEST (ENAME, SAL) VALUES (:emplyeeName, :salary)  };
//  ************************************************************

{
  sqlj.runtime.ConnectionContext __sJT_connCtx = sqlj.runtime.ref.DefaultContext.getDefaultContext();
  if (__sJT_connCtx == null) sqlj.runtime.error.RuntimeRefErrors.raise_NULL_CONN_CTX();
  sqlj.runtime.ExecutionContext __sJT_execCtx = __sJT_connCtx.getExecutionContext();
  if (__sJT_execCtx == null) sqlj.runtime.error.RuntimeRefErrors.raise_NULL_EXEC_CTX();
  String __sJT_1 = emplyeeName;
  double __sJT_2 = salary;
  synchronized (__sJT_execCtx) {
    sqlj.runtime.profile.RTStatement __sJT_stmt = __sJT_execCtx.registerStatement(__sJT_connCtx, HelloWorldDAO_SJProfileKeys.getKey(0), 0);
    try 
    {
      __sJT_stmt.setString(1, __sJT_1);
      __sJT_stmt.setDouble(2, __sJT_2);
      __sJT_execCtx.executeUpdate();
    }
    finally 
    {
      __sJT_execCtx.releaseStatement();
    }
  }
}


//  ************************************************************

/*@lineinfo:user-code*//*@lineinfo:13^71*/
	}
	
	public void update(String emplyeeName, double salary) throws SQLException {
		/*@lineinfo:generated-code*//*@lineinfo:17^3*/

//  ************************************************************
//  #sql { UPDATE TEST SET SAL = :salary WHERE ENAME = :emplyeeName  };
//  ************************************************************

{
  sqlj.runtime.ConnectionContext __sJT_connCtx = sqlj.runtime.ref.DefaultContext.getDefaultContext();
  if (__sJT_connCtx == null) sqlj.runtime.error.RuntimeRefErrors.raise_NULL_CONN_CTX();
  sqlj.runtime.ExecutionContext __sJT_execCtx = __sJT_connCtx.getExecutionContext();
  if (__sJT_execCtx == null) sqlj.runtime.error.RuntimeRefErrors.raise_NULL_EXEC_CTX();
  double __sJT_1 = salary;
  String __sJT_2 = emplyeeName;
  synchronized (__sJT_execCtx) {
    sqlj.runtime.profile.RTStatement __sJT_stmt = __sJT_execCtx.registerStatement(__sJT_connCtx, HelloWorldDAO_SJProfileKeys.getKey(0), 1);
    try 
    {
      __sJT_stmt.setDouble(1, __sJT_1);
      __sJT_stmt.setString(2, __sJT_2);
      __sJT_execCtx.executeUpdate();
    }
    finally 
    {
      __sJT_execCtx.releaseStatement();
    }
  }
}


//  ************************************************************

/*@lineinfo:user-code*//*@lineinfo:17^67*/
	} 
	
	public void delete() throws SQLException {
		/*@lineinfo:generated-code*//*@lineinfo:21^3*/

//  ************************************************************
//  #sql { DELETE FROM TEST  };
//  ************************************************************

{
  sqlj.runtime.ConnectionContext __sJT_connCtx = sqlj.runtime.ref.DefaultContext.getDefaultContext();
  if (__sJT_connCtx == null) sqlj.runtime.error.RuntimeRefErrors.raise_NULL_CONN_CTX();
  sqlj.runtime.ExecutionContext __sJT_execCtx = __sJT_connCtx.getExecutionContext();
  if (__sJT_execCtx == null) sqlj.runtime.error.RuntimeRefErrors.raise_NULL_EXEC_CTX();
  synchronized (__sJT_execCtx) {
    sqlj.runtime.profile.RTStatement __sJT_stmt = __sJT_execCtx.registerStatement(__sJT_connCtx, HelloWorldDAO_SJProfileKeys.getKey(0), 2);
    try 
    {
      __sJT_execCtx.executeUpdate();
    }
    finally 
    {
      __sJT_execCtx.releaseStatement();
    }
  }
}


//  ************************************************************

/*@lineinfo:user-code*//*@lineinfo:21^27*/
	}  
	
	/*@lineinfo:generated-code*//*@lineinfo:24^2*/

//  ************************************************************
//  SQLJ iterator declaration:
//  ************************************************************

public static class EmployeeIteratorClass 
extends sqlj.runtime.ref.ResultSetIterImpl
implements sqlj.runtime.PositionedIterator
{
  public EmployeeIteratorClass(sqlj.runtime.profile.RTResultSet resultSet) 
    throws java.sql.SQLException 
  {
    super(resultSet, 3);
  }
  public long getCol1() 
    throws java.sql.SQLException 
  {
    return resultSet.getLongNoNull(1);
  }
  public String getCol2() 
    throws java.sql.SQLException 
  {
    return resultSet.getString(2);
  }
  public double getCol3() 
    throws java.sql.SQLException 
  {
    return resultSet.getDoubleNoNull(3);
  }
}


//  ************************************************************

/*@lineinfo:user-code*//*@lineinfo:26^2*/

	public void fetch() throws SQLException {
	
		EmployeeIteratorClass employeeIterator;
	
		/*@lineinfo:generated-code*//*@lineinfo:32^3*/

//  ************************************************************
//  #sql employeeIterator = { SELECT * FROM TEST  };
//  ************************************************************

{
  sqlj.runtime.ConnectionContext __sJT_connCtx = sqlj.runtime.ref.DefaultContext.getDefaultContext();
  if (__sJT_connCtx == null) sqlj.runtime.error.RuntimeRefErrors.raise_NULL_CONN_CTX();
  sqlj.runtime.ExecutionContext __sJT_execCtx = __sJT_connCtx.getExecutionContext();
  if (__sJT_execCtx == null) sqlj.runtime.error.RuntimeRefErrors.raise_NULL_EXEC_CTX();
  synchronized (__sJT_execCtx) {
    sqlj.runtime.profile.RTStatement __sJT_stmt = __sJT_execCtx.registerStatement(__sJT_connCtx, HelloWorldDAO_SJProfileKeys.getKey(0), 3);
    try 
    {
      sqlj.runtime.profile.RTResultSet __sJT_result = __sJT_execCtx.executeQuery();
      employeeIterator = new EmployeeIteratorClass(__sJT_result);
    }
    finally 
    {
      __sJT_execCtx.releaseStatement();
    }
  }
}


//  ************************************************************

/*@lineinfo:user-code*//*@lineinfo:32^48*/
		
		ResultSet resultSet = employeeIterator.getResultSet();
		
		while (resultSet.next()) {

  			System.out.print("id = " + resultSet.getLong(1));
 		 	System.out.print("\t emplyeeName = " + resultSet.getString(2));
 		 	System.out.println("\t salary = " + resultSet.getDouble(3));

		}
		resultSet.close();
	}
	/*	
	public void updateWithIN(List<String> employeeNameList) throws SQLException {
	
	  	int listSize = employeeNameList.size();		
        final int subSetSize = 5;//Determine the number of IDs we want to send to Database at a time		
        int numberOfSubSets = (listSize%subSetSize)==0 ? (listSize/subSetSize) : (listSize/subSetSize)+1;
        
        for(int index = 0; index < numberOfSubSets; index++){
        		
        	Object [] subSetOfNames = getSubSet(index,subSetSize,employeeNameList);
        	updateWithINClause(subSetOfNames);
        }
	}
	*/
	public void updateWithINClause(Object [] employeeNameSubSet) throws SQLException {
		
		String ename1 = (String) employeeNameSubSet[0];	String ename2 = (String) employeeNameSubSet[1];	String ename3 = (String) employeeNameSubSet[2];
		String ename4 = (String) employeeNameSubSet[3];	String ename5 = (String) employeeNameSubSet[4];
		
        /*@lineinfo:generated-code*//*@lineinfo:64^9*/

//  ************************************************************
//  #sql { UPDATE TEST SET SAL = SAL+100 WHERE ENAME IN (:ename1, :ename2, :ename3, :ename4, :ename5)  };
//  ************************************************************

{
  sqlj.runtime.ConnectionContext __sJT_connCtx = sqlj.runtime.ref.DefaultContext.getDefaultContext();
  if (__sJT_connCtx == null) sqlj.runtime.error.RuntimeRefErrors.raise_NULL_CONN_CTX();
  sqlj.runtime.ExecutionContext __sJT_execCtx = __sJT_connCtx.getExecutionContext();
  if (__sJT_execCtx == null) sqlj.runtime.error.RuntimeRefErrors.raise_NULL_EXEC_CTX();
  String __sJT_1 = ename1;
  String __sJT_2 = ename2;
  String __sJT_3 = ename3;
  String __sJT_4 = ename4;
  String __sJT_5 = ename5;
  synchronized (__sJT_execCtx) {
    sqlj.runtime.profile.RTStatement __sJT_stmt = __sJT_execCtx.registerStatement(__sJT_connCtx, HelloWorldDAO_SJProfileKeys.getKey(0), 4);
    try 
    {
      __sJT_stmt.setString(1, __sJT_1);
      __sJT_stmt.setString(2, __sJT_2);
      __sJT_stmt.setString(3, __sJT_3);
      __sJT_stmt.setString(4, __sJT_4);
      __sJT_stmt.setString(5, __sJT_5);
      __sJT_execCtx.executeUpdate();
    }
    finally 
    {
      __sJT_execCtx.releaseStatement();
    }
  }
}


//  ************************************************************

/*@lineinfo:user-code*//*@lineinfo:64^107*/
	}
	
}/*@lineinfo:generated-code*/class HelloWorldDAO_SJProfileKeys 
{
  private static HelloWorldDAO_SJProfileKeys inst = null;
  public static java.lang.Object getKey(int keyNum) 
    throws java.sql.SQLException 
  {
    if (inst == null)
    {
      inst = new HelloWorldDAO_SJProfileKeys();
    }
    return inst.keys[keyNum];
  }
  private final sqlj.runtime.profile.Loader loader = sqlj.runtime.RuntimeContext.getRuntime().getLoaderForClass(getClass());
  private java.lang.Object[] keys;
  private HelloWorldDAO_SJProfileKeys() 
    throws java.sql.SQLException 
  {
    keys = new java.lang.Object[1];
    keys[0] = sqlj.runtime.ref.DefaultContext.getProfileKey(loader, "gagan.sqlj.practice.helloworld.HelloWorldDAO_SJProfile0");
  }
}
