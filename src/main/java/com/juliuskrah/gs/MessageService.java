package com.juliuskrah.gs;

import org.jvnet.hk2.annotations.Contract;

@Contract
@FunctionalInterface
public interface MessageService {
	String getMessage();
}
