package com.zxl.tool;

import java.math.BigInteger;
import java.util.Date;

public class IdUtils {

	public static String creatUUID() {
		long nowDate = new Date().getTime();
		String sid = Integer.toHexString((int) nowDate);
		return new BigInteger(sid, 16).toString();
	}

	public static void main(String[] args) {
		String str = IdUtils.creatUUID();
		System.out.println(str);
	}
}