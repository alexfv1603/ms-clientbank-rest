package client.bank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Client;

import client.bank.repository.ClientRepository;
import client.bank.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	ClientRepository clientRepository;

	@Override
	public boolean insertClient(Client client) {
		try {
			clientRepository.save(client);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Client> clients() {
		return clientRepository.findAll();
	}

}
