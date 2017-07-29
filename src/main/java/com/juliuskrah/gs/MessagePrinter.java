package com.juliuskrah.gs;

import javax.inject.Inject;

import org.jvnet.hk2.annotations.Service;

@Service
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
