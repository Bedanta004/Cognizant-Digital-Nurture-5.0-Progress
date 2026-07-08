package com.BedantaM.SpringJDBC1Demo;

import com.BedantaM.SpringJDBC1Demo.model.Alien;
import com.BedantaM.SpringJDBC1Demo.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbc1DemoApplication {

	public static void main(String[] args)
	{

	ApplicationContext context = SpringApplication.run(SpringJdbc1DemoApplication.class, args);

		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(111);
		alien1.setName("Navin");
		alien1.setTech("Java FSE");

		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(alien1);

		System.out.println(repo.findAll());
	}

}
