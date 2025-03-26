package com.seungwook.r2r;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.TimeZone;

@Slf4j
@EnableJpaRepositories("com.seungwook.r2r.repository") // 패키지 구조 변경으로 인해 이 애노테이션을 붙혀야 함
@SpringBootApplication
public class Receipt2Recipe
{

	@Value("${ip-filter.block-foreign-ip:true}")
	private boolean isBlockedForeignIP; // 해외 아이피 차단 활성화 여부

	@Value("${app.log.directory}")
	private String LOG_DIRECTORY; // 로그 파일 경로

	@Value("${file.upload-dir}")
	private String uploadDir; // 파일 저장 경로

	@PostConstruct
	public void init()
	{
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul")); // JVM의 기본 시간대를 Asia/Seoul로 설정
		log.info("-----------------------------------------------------");
		log.info("---------------------서버 재시작 됨---------------------");
		log.info("-----------------------------------------------------");
		log.info("JVM 시간대 : {}", TimeZone.getDefault().getID());
		log.info("로그 파일 경로 : {}", LOG_DIRECTORY);
		log.info("업로드 파일 저장 경로 : {}", uploadDir);
		log.info("해외 아이피 차단 활성화 여부 : {}", isBlockedForeignIP);
	}

	public static void main(String[] args) {
		SpringApplication.run(Receipt2Recipe.class, args);
	}

}
