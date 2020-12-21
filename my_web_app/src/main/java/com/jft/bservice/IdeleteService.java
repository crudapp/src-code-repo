package com.jft.bservice;

import org.springframework.stereotype.Service;

import com.jft.domain.User;

@Service
public interface IdeleteService {

	/* Delete a record */
	public void deleteUserById(User user);

	/* Delete all records */
	public void deleteAll();

}