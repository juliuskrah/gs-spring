package com.juliuskrah.gs;

import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;

public class Application {
	
	public static void main(String... args) {
		ServiceLocator locator = ServiceLocatorUtilities.createAndPopulateServiceLocator();
		MessagePrinter messagePrinter = locator.getService(MessagePrinter.class);

		messagePrinter.printMessage();
	}
}
