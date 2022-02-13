package com.jy.crud.user.service;

import com.jy.crud.user.model.UserEntity;
import com.jy.crud.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

// 회원 서비스
@Service
@Slf4j
public class UserService {

    public final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 회원가입
    public UserEntity create(UserEntity entity) {
        System.out.println("Service :: " + entity);
        // 입력된 정보가 없는 경우
        if (entity == null || entity.getEmail() == null) {
//        if (entity == null || entity.getId() == null) {
            throw new RuntimeException("Invalid arguments");
        }

        // 먼저 가입한 id가 있을 경우
        final String email = entity.getEmail();
        if (userRepository.existsByEmail(email)) {
            log.warn("ID already exist {} ", email);
            throw new RuntimeException("Email already exist");
        }

        // 중복체크
        System.out.println("여기까진?");

        return userRepository.save(entity);
    }


    // 로그인
    // table 에서 id와 pwd 조회해서 값 비교하기
//    public UserEntity signInUserByUserID(String id, String pwd, PasswordEncoder passwordEncoder) {
    public UserEntity signInUserByUserID(String email, String pwd, PasswordEncoder passwordEncoder) {

        // 암호화 전
//        return userRepository.findByIdAndPwd(id, pwd);

//        log.info("#### id, pwd ### " + email + " " + pwd);

        final UserEntity originalUser = userRepository.findByEmail(email);
//        final UserEntity originalUser = userRepository.findByIdAndPwd(id, pwd);

        log.info("### 로그인 정보 ### " + originalUser);

        if (originalUser != null && passwordEncoder.matches(pwd, originalUser.getPwd())) {
            return originalUser;
        }

        return null;
    }

}
