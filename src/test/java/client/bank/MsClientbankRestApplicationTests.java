package client.bank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Client;

import client.bank.repository.ClientRepository;

@SpringBootTest
class MsClientbankRestApplicationTests {
	
	@Autowired
	ClientRepository clientRepository;

	@Test
	void saveClient() {
		try {
			Client client = new Client();
			client.setTypeClient("Personal");
			client.setTypeDocument("DNI");
			client.setNumberDocument("71628372");
			clientRepository.save(client);
			System.out.println("registró");
		} catch (Exception e) {
			System.out.println("error: " + e.getMessage());
		}
	}

}
