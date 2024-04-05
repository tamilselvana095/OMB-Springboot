package com.omb.utils;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.omb.entity.MaidEntity;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtils {
	
	private static String secretKey="JcUyS/r29Zwji416oR0SPcfWsOmQu6gLQREhYqpnAL5cKWE=";
	
	public String generateToken(MaidEntity maidEntity) {
		
		long currentTime=System.currentTimeMillis();
		long expiryTime=30000+currentTime;
		
		Date current=new Date(currentTime);
		Date expiry=new Date(expiryTime);
		
		return Jwts.builder().setIssuer(maidEntity.getMaidId().toString())
					  .claim("name", maidEntity.getName())
					  .claim("phone", maidEntity.getPhone())
					  .claim("address", maidEntity.getAddress())
					  .setIssuedAt(current)
					  .setExpiration(expiry)
					  .signWith(SignatureAlgorithm.HS256, secretKey)
					  .compact();
	}

}
