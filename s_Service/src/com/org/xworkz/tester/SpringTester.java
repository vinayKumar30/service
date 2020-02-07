package com.org.xworkz.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.xworkz.dao.DAOImpl;
import com.org.xworkz.dao.ValentineDAO;
import com.org.xworkz.entity.ValentineEntity;
import com.org.xworkz.service.ValentineService;
import com.org.xworkz.service.ValentineServiceImpl;

public class SpringTester {

	public static void main(String args[]) {
		try {
			ApplicationContext container = new ClassPathXmlApplicationContext("resources/context.xml");

			ValentineServiceImpl ref = container.getBean(ValentineServiceImpl.class);

			ValentineEntity entity = new ValentineEntity();
			entity.setId(1);
			entity.setName("Eshwar");
			entity.setStatus(true);
			entity.setAmount(400);
			entity.setGift("Flowers");

			System.out.println(entity);

		    //ValentineDAO dao = new DAOImpl();
			//dao.save(entity);
			
			ref.ValidateandSave(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
