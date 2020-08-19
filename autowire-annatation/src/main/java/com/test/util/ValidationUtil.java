package com.test.util;

import org.springframework.stereotype.Component;

@Component
public class ValidationUtil {

	public boolean validateId(String id) {

		if (id == null || id.equals("")) {
			return false;
		}
		return true;
	}
}
