package com.valdir.mc.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.valdir.mc.domain.Cliente;
import com.valdir.mc.repositories.ClienteRepository;
import com.valdir.mc.services.exceptions.ObjectNotFoubdException;

@Service
public class AuthService {
	
	private Random rand = new Random();
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private BCryptPasswordEncoder pe;
	
	@Autowired
	private EmailService emailService;

	public void sendNewPassword(String email) {
		Cliente cliente = clienteRepository.findByEmail(email);
		
		if (cliente == null) {
			throw new ObjectNotFoubdException("E-mail não cadastrado");
		}
		
		String newPass = newPassord();
		cliente.setSenha(pe.encode(newPass));
		
		clienteRepository.save(cliente);
		emailService.sendNewPasswordEmail(cliente, newPass);
	}

	private String newPassord() {
		char[] vet = new char[10];
		for(int i = 0; i < 10; i++) {
			vet[i] = randomChar();
		}
		return new String(vet);
	}

	private char randomChar() {
		int opt = rand.nextInt(3);
		
		if (opt == 0) { // Gera um dígito
			return (char) (rand.nextInt(10) + 48);
		} else if (opt == 1){ // Gera letra maiúscula
			return (char) (rand.nextInt(26) + 65);
		} else { // Gera letra minúscula
			return (char) (rand.nextInt(26) + 97);
		}
	}
	
}
