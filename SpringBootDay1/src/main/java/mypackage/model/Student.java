package mypackage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblstudent")

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rno ;
	private String name;
	private String qualification;
	private float percentage;
	public Student() {
		super();
		
	}
	public Student(int rno, String name, String qualification, float percentage) {
		super();
		this.rno = rno;
		this.name = name;
		this.qualification = qualification;
		this.percentage = percentage;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	
}
