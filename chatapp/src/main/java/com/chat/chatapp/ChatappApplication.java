package com.chat.chatapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 카카오톡 처럼 (주)가 채팅이면 웹소켓
 * 당근마켓 처럼 (주)가 채팅이 아니고, 가끔 한다면 SSE
 */
@SpringBootApplication
public class ChatappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatappApplication.class, args);
	}

}
