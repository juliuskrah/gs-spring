package com.juliuskrah.gs;

import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
	private MessageService messageService;

	public MessagePrinter(MessageService messageService) {
		this.messageService = messageService;
	}

	public void printMessage() {
		System.out.println(this.messageService.getMessage());
	}
}
