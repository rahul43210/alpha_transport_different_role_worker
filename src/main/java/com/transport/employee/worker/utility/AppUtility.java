package com.transport.employee.worker.utility;

import java.util.UUID;

public class AppUtility {

	public static String uniqueId() {
		String uniqueId = UUID.randomUUID()
                .toString()
                .replace("-", "");
		return uniqueId;
	}
}
