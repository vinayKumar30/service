package com.org.xworkz.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.xworkz.dao.ValentineDAO;
import com.org.xworkz.entity.ValentineEntity;

@Component
public class ValentineServiceImpl implements ValentineService {
	
	@Autowired
	private ValentineDAO dao;

	public ValentineServiceImpl() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public boolean ValidateandSave(ValentineEntity entity) {
		System.out.println("Invoked ValidateAndSave" + entity);
		Integer id = dao.save(entity);
		if (Objects.nonNull(id)) {
			System.out.println("Entity saved");
			return true;
		} 
			System.out.println("Entity not saved");
			return false;
		}

	}


