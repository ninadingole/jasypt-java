package com.myworld.jasypt.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class JasyptUtilsTest {

	@Test
	public void testDigest() {
		byte[] digestMessage = JasyptUtils.digestMessage("Hello World", "SHA-1");
		assertNotNull(digestMessage);
		for (byte b : digestMessage) {
			System.out.print(b);
		}
	}

}
