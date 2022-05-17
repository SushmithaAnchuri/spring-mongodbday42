package com.jobiak.mongodbspring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jobiak.mongodbspring.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>{

}
