package pgm1;

public class Student 
{
	private String usn;
	private String name;
	private String branch;
	private String phonenumber;
	public Student(String usn, String name, String branch, String phonenumber) 
	{
		this.usn = usn;
		this.name = name;
		this.branch = branch;
		this.phonenumber = phonenumber;
	}
	public String getUsn() 
	{
		return usn;
	}
	public void setUsn(String usn) 
	{
		this.usn = usn;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getBranch()
	{
		return branch;
	}
	public void setBranch(String branch) 
	{
		this.branch = branch;
	}
	public String getPhonenumber()
	{
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}
	
}

