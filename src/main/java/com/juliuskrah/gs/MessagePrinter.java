package com.juliuskrah.gs;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
	private MessageService messageService;

	@Inject
	public MessagePrinter(MessageService messageService) {
		this.messageService = messageService;
	}

	public void printMessage() {
		System.out.println(this.messageService.getMessage());
	}
}
