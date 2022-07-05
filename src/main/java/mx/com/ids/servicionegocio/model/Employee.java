package mx.com.ids.servicionegocio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "firstname")
	private String firstname;

	@Column(name = "idCountry")
	private long country;
	
	@Column(name = "idLanguage")
	private long language;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public long getCountry() {
		return country;
	}

	public void setCountry(long country) {
		this.country = country;
	}

	public long getLanguage() {
		return language;
	}

	public void setLanguage(long language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Employee [Id = " + getId() + ", Surname = " + getSurname() + ", Firstname = " + getFirstname() + ", Country = " + getCountry()
				+ ", Language = " + getLanguage() + "]"; 
	}

	

	

	

}
