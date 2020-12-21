package com.jft.bservice;

import org.springframework.stereotype.Service;

import com.jft.domain.User;

@Service
public interface IcreateService {

	/* Create a record */
	public void createUser(User user);

}