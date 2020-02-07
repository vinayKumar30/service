package com.org.xworkz.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
@Table(name = "valentine_details")
public class ValentineEntity implements Serializable {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "vId")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "gift")
	private String gift;
	@Column(name = "amount")
	private int amount;
	@Column(name = "status")
	private boolean status;

	public ValentineEntity() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

}
