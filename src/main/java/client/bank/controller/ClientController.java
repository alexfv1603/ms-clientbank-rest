package client.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Client;

import client.bank.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@PostMapping
	public ResponseEntity<Boolean> insert(@RequestBody Client client) {
		boolean status = clientService.insertClient(client);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Client>> clients() {
		List<Client> clients = clientService.clients();
		return new ResponseEntity<>(clients, HttpStatus.OK);
	}
	
}
