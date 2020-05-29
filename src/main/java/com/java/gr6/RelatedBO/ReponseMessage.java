package com.java.gr6.RelatedBO;

public class ReponseMessage {
	private String message;
	private Long idComplaint;

	public ReponseMessage(String message) {
		super();
		this.message = message;
	}

	public ReponseMessage() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getIdComplaint() {
		return idComplaint;
	}

	public void setIdComplaint(Long idComplaint) {
		this.idComplaint = idComplaint;
	}

}
