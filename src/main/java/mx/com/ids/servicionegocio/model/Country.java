package mx.com.ids.servicionegocio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Country")
public class Country implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "idAirport")
	private Long airport;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Long getAirport() {
		return airport;
	}

	public void setAirport(Long airport) {
		this.airport = airport;
	}

	@Override
	public String toString() {
		return "Country [Id = " + getId() + ", Code = " + getCode() + ", Name = " + getName() + ", Airport = " + getAirport() + "]";
	}

	
	
	

}
