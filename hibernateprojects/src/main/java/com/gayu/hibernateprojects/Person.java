package com.gayu.hibernateprojects;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
//@Table(name="Person_Table")  ---> get different table name for already created table
public class Person {
	@Id
	private int pid;
	//@Transient -- pname will not bget stored
	
	
	
	private PersonName personName;
	//@Column(name="Person_color")  -- we can change the column name of table
	private String pcolor;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}

	/*
	 * public String getPname() { return pname; } public void setPname(String pname)
	 * { this.pname = pname; }
	 */
	
	
	
	
	public String getPcolor() {
		return pcolor;
	}
	public PersonName getPersonName() {
		return personName;
	}
	public void setPersonName(PersonName personName) {
		this.personName = personName;
	}
	public void setPcolor(String pcolor) {
		this.pcolor = pcolor;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", personName=" + personName + ", pcolor=" + pcolor + "]";
	}
	
	

}
