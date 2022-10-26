package com.sparta.backend5959.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // CORS 설정
    @Override
    public void addCorsMappings(CorsRegistry reg) {
        reg
                // 전부 허용
                .addMapping("/**")
                .allowedOrigins("http://localhost:3000", "http://localhost:3001")
                .allowedMethods("GET","POST","PUT","DELETE")
//                .allowedMethods(
//                        HttpMethod.GET.name(),
//                        HttpMethod.POST.name(),
//                        HttpMethod.PUT.name(),
//                        HttpMethod.DELETE.name()
//                )
//                .allowedHeaders("*")
                .exposedHeaders("Authorization","RefreshToken")
                .allowCredentials(true);
    }
}
                // localhost 3000번 포트의 접속 허용
//                .allowedOrigins("http://localhost:3000")
//                .allowedOrigins("http://1.237.195.205:3000")
//                .allowedOrigins("http://1.237.195.205:3001")
//                .allowedOrigins("http://localhost:3000")
//                .allowedOrigins("http://1.237.195.205:3000")
//                .allowedOrigins("175.213.101.84:3000")
//                .allowedOrigins("1.237.195.205:3000")
//                .allowedOrigins("https://1.237.195.205:3000")
//                .allowedOrigins("http://175.213.101.84:3000")
//                .allowedOrigins("https://175.213.101.84:3000")
//                .allowedOrigins("localhost:3000")
//                .allowedOrigins("http://localhost:3000")

//make client read header("jwt-token")

// 외부에서의 Controller 메소드의 진입 허용 리스트
//                .allowedMethods(
//
//                        HttpMethod.GET.name(),
//                        HttpMethod.POST.name(),
//                        HttpMethod.PUT.name(),
//                        HttpMethod.DELETE.name()
//                );

///*
//    preflight
//    Simple request가 아닌 요청 메시지보다 먼저 보내는 메시지로, 브라우저는 응답값으로 실제 데이터 전송 여부를 판단.
//
//    CORS는 응답이 Access-Control-Allow-Credentials: true 을 가질 경우, Access-Controll-Allow-Origin의 값으로 *를 사용하지 못하게 막고 있다
//    Access-Control-Allow-Credentials: true를 사용하는 경우는 사용자 인증이 필요한 리소스 접근이 필요한 경우인데,
//    만약 Access-Control-Allow-Origin: *를 허용한다면,
//    CSRF 공격에 매우 취약해져 악의적인 사용자가 인증이 필요한 리소스를 마음대로 접근할 수 있음.
// */
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//  @Override
//  public void addCorsMappings(CorsRegistry registry) {
//    registry
//      .addMapping("/**") // 프로그램에서 제공하는 URL
//      .allowedOrigins("*") // 청을 허용할 출처를 명시, 전체 허용 (가능하다면 목록을 작성한다.
//      .allowedHeaders("*") // 어떤 헤더들을 허용할 것인지
//      .allowedMethods("*") // 어떤 메서드를 허용할 것인지 (GET, POST...)
//      .allowCredentials(false) // 쿠키 요청을 허용한다(다른 도메인 서버에 인증하는 경우에만 사용해야하며, true 설정시 보안상 이슈가 발생할 수 있다)
//      // .maxAge(1500) // preflight 요청에 대한 응답을 브라우저에서 캐싱하는 시간 ;
//  }
//}

//                .allowedOrigins("*")
//                .allowedMethods("*")
//                .exposedHeaders("Authorization","Refresh-Token")
//                .allowCredentials(true);