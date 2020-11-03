package com.valdir.mc.services;

import org.springframework.mail.SimpleMailMessage;

import com.valdir.mc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido pedido);
	void sendEmail(SimpleMailMessage msg);
}
