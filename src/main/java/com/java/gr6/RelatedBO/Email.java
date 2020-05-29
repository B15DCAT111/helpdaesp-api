package com.java.gr6.RelatedBO;

public class Email {
    private String mailName;
    private String passMail;

    public Email() {
        super();
    }

    public Email(String mailName, String passMail) {
        this.mailName = mailName;
        this.passMail = passMail;
    }

    public String getMailName() {
        return mailName;
    }

    public void setMailName(String mailName) {
        this.mailName = mailName;
    }

    public String getPassMail() {
        return passMail;
    }

    public void setPassMail(String passMail) {
        this.passMail = passMail;
    }
}
