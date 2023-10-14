package client.bank.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.model.Client;

public interface ClientRepository extends MongoRepository<Client, String>{

}
