package com.idosinchuk.distributedtracing.user.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idosinchuk.distributedtracing.user.dto.User;
import com.idosinchuk.distributedtracing.user.entity.UserEntity;
import com.idosinchuk.distributedtracing.user.repository.UserRepository;
import com.idosinchuk.distributedtracing.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User getUser(Integer userId) throws Exception {

		log.info("Call userRepository to obtain User data by userId: {}", userId);
		
		Optional<UserEntity> userEntity = userRepository.findById(userId);

		if (userEntity.isPresent()) {
			return User.builder().userId(userEntity.get().getUserId()).name(userEntity.get().getName())
					.surname(userEntity.get().getSurname()).identityCard(userEntity.get().getIdentityCard())
					.dateOfBirth(userEntity.get().getDateOfBirth()).addressId(userEntity.get().getAddressId()).build();

		}

		return User.builder().build();
	}
}