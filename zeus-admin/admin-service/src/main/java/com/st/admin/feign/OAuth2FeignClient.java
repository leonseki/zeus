package com.st.admin.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author leon
 * @date 2024/2/29 00:14
 */
@FeignClient(value = "authorization-server")
public interface OAuth2FeignClient {
    @PostMapping("/oauth/token")
    ResponseEntity<JwtToken> getToken(
            @RequestParam("grant_type") String grantType,
            @RequestParam("username")String username,
            @RequestParam("password")String password,
            @RequestParam("login_type")String loginType,
            @RequestHeader("Authorization") String basicToken
    );
}
