package com.guru;

import javax.crypto.Cipher;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;

public class App 
{
	public static void good() throws NoSuchAlgorithmException, NoSuchPaddingException {
		Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
	}

	public static void bad() throws NoSuchAlgorithmException, NoSuchPaddingException {
		Cipher cipher = Cipher.getInstance("AES/CB/NoPadding");
	}

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException {
		System.out.println("Welcome to this little App!");
		good();
		bad();
		System.exit(0);
	}
}
