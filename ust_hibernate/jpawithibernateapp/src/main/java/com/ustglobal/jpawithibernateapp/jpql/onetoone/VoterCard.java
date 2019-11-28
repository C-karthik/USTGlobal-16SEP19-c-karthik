package com.ustglobal.jpawithibernateapp.jpql.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "votercard")
public class VoterCard {
	
	@Id
	@Column
	private int vid;
	
	@Column
	private String vname;
	

}
