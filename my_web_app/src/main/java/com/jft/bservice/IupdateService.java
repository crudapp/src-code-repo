package com.jft.bservice;

import org.springframework.stereotype.Service;

import com.jft.domain.User;

@Service
public interface IupdateService {

	/* Update a record */
	public void updateUser(User user);

}