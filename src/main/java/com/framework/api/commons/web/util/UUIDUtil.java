package com.framework.api.commons.web.util;

import java.util.UUID;

public class UUIDUtil {

	public static String createUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}
}
