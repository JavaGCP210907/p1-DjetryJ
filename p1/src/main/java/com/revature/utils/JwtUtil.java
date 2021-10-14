package com.revature.utils;

import java.sql.Timestamp;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

public class JwtUtil {

	private static final String secret = "Fries and shakes are a godly combo";
	private static final Algorithm algorithm = Algorithm.HMAC256(secret);
	
	public static String generate(String username, String password) {
		String token = JWT.create()
				.withClaim("username", username)
				.withClaim("password", password)
				.sign(algorithm);
		
		return token;
	}
	
	public static DecodedJWT isValidJWT(String token) {
		DecodedJWT jwt = JWT.require(algorithm).build().verify(token);
		return jwt;
	}

	public static String generate(int reimb_ID, int reimb_amount, Timestamp reimb_submitted, String reimb_description) {
		// TODO Auto-generated method stub
		return null;
	}
}
