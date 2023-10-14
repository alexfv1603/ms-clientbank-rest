package client.bank.service;

import java.util.List;
import com.example.demo.model.Client;

public interface ClientService {

	boolean insertClient(Client client);
	List<Client> clients();
	
}
