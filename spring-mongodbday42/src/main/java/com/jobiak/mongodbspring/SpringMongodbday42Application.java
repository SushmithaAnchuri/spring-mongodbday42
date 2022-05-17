package com.jobiak.mongodbspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.jobiak.mongodbspring.model.Customer;
import com.jobiak.mongodbspring.repository.CustomerRepository;
import com.jobiak.mongodbspring.repository.IssueRepository;

/*@EnableMongoRepositories(basePackageClasses = IssueRepository.class)*/
@SpringBootApplication
public class SpringMongodbday42Application implements CommandLineRunner {

	@Autowired
	CustomerRepository cust;
	public static void main(String[] args) {
		SpringApplication.run(SpringMongodbday42Application.class, args);
	}
	/*
	 * @Override public void run(String... args) throws Exception { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */
	
	  @Override public void run(String... args) throws Exception { Customer c1=new
	  Customer("1","Sushmitha","Anchuri"); Customer c2=new
	  Customer("2","Akhila","pamu"); Customer c3=new
	  Customer("3","Bindhupriya","Thipireddy"); Customer c4=new
	  Customer("4","Preethi","Reddy");
	  
	  cust.save(c1); cust.save(c2); cust.save(c3); cust.save(c4);
	  
	  System.out.println("*********************************");
	  
	  List<Customer> customer=cust.findAll();
	  
	  for(Customer c:customer) { System.out.println(c.toString()); } }
	 

}
