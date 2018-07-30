package com.eventaddaserver.dao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.eventaddaserver.pojos.*;

@Repository
public interface CustomerDao extends MongoRepository<Customer, String>{

}
