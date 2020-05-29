package com.java.gr6.common;

import com.java.gr6.RelatedBO.ReponseMessage;
import com.java.gr6.constant.Contants;

public class ResponseCommon {
	public static ReponseMessage success() {
		ReponseMessage mss = new ReponseMessage();
		mss.setMessage(Contants.SUCCESS);
		return mss;
	}

	public static ReponseMessage fail(String mess) {
		ReponseMessage mss = new ReponseMessage();
		mss.setMessage(mess);
		return mss;
	}
}
