package com.cs.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "code_dev")
public class Developer01 {

	@Id
	private int id;

	@Column(name="name_surname",length = 30,nullable = false)
    private String nameSurname;

    @Column(length = 30,nullable = false)
    private String job;

    @Column(nullable = true)
    private String company;

    @Column(nullable = true)
    private int experience;

    @Column(nullable = true)
    private int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Developer01 [id=" + id + ", nameSurname=" + nameSurname + ", job=" + job + ", company=" + company
				+ ", experience=" + experience + ", salary=" + salary + "]";
	}
    
    
	
	
	
}
