package com.myworld.jasypt.utils;

import org.jasypt.util.digest.Digester;
import org.jasypt.util.password.BasicPasswordEncryptor;

public final class JasyptUtils {

	/**
	 * {@link Digester} which performs message digesting at a
	 * binary level, and which results are equivalent to the ones obtained from
	 * a java.security.MessageDigest object, although acting in a thread-safe
	 * way and implementing an interface more suitable for use in a bean-centric
	 * environment.
	 * 
	 * @param message
	 * @param algorithm
	 * @return
	 */
	public static byte[] digestMessage(String message, String algorithm) {
		if (algorithm == null) {
			algorithm = "SHA-1";
		}
		if (message == null) {
			return null;
		}
		Digester d = new Digester(algorithm);
		return d.digest(message.getBytes());
	}

	/**
	 * {@link BasicPasswordEncryptor} which can be used to both
	 * encrypt passwords when users sign up and check input passwords when users
	 * sign in.
	 * 
	 * @param password
	 * @return
	 */
	public static String basicPasswordEncryptor(String password) {
		if (password == null)
			throw new IllegalArgumentException("Input data is null.");

		BasicPasswordEncryptor enc = new BasicPasswordEncryptor();
		String encryptPassword = enc.encryptPassword(password);
		return encryptPassword;
	}
}
