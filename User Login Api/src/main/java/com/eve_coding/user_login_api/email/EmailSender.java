package com.eve_coding.user_login_api.email;

public interface EmailSender {
    void send(String to, String email);
}
