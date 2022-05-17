package co.simplon.whatstream.security;

import java.util.Objects;

public final class Jwt {

    private final String token;

    Jwt(String token) {
	Objects.requireNonNull(token, "token cannot be null");
	this.token = token;
    }

    public String getToken() {
	return token;
    }

    @Override
    public String toString() {
	return String.format("{token=%s}", "[PROTECTED]");
    }
}
