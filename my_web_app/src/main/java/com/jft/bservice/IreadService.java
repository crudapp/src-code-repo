package com.jft.bservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jft.domain.User;

@Service
public interface IreadService {

	/* Select all records */
	public List<User> findAllUser();

}