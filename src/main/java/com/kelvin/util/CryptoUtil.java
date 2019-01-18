package com.kelvin.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;

public class CryptoUtil {

	private static final MessageDigest md5MessageDigest;
//	private static final MessageDigest sha512MessageDigest;

	static {
		try {
			md5MessageDigest = MessageDigest.getInstance("md5");
//			sha512MessageDigest = MessageDigest.getInstance("sha512");
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * md5 hash
	 * 
	 * @param data
	 * @return
	 */
	public synchronized static byte[] md5Hash(byte[] data) {
		return md5MessageDigest.digest(data);
	}

	/**
	 * md5 hash and convert to string
	 * 
	 * @param data
	 * @return
	 */
	public static String md5HashToStr(byte[] data) {
		byte[] result = md5Hash(data);
		return HexBin.encode(result);
	}
	
	/**
	 * md5 hash and convert to string
	 * 
	 * @param data
	 * @return
	 */
	public static String md5HashToStr(String data) {
		return md5HashToStr(data.getBytes());
	}

	/**
	 * sha512
	 * 
	 * @param data
	 * @return
	 */
//	public synchronized static byte[] sha512Hash(byte[] data) {
//		return sha512MessageDigest.digest(data);
//	}

	/**
	 * sha512
	 * 
	 * @param data
	 * @return
	 */
//	public static String sha512HashToStr(byte[] data) {
//		byte[] result = sha512Hash(data);
//		return HexBin.encode(result);
//	}

}
