package com.internousdev.ecsite.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public String getDate() {
		Date date = new Date();
		SimpleDateFormat sompleDateFormat = new SimpleDateFormat("yyyy/MM/ddHH:mm:ss");

		return sompleDateFormat.format(date);
	}
}
