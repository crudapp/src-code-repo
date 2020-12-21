
package com.jft.bservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jft.cdao.IupdateDao;
import com.jft.domain.User;

@Service
@Transactional
public class UpdateServiceImpl implements IupdateService {
	
	@Autowired
	private IupdateDao userDaoImpl;	

	/* Update a record */
	@Override
	public void updateUser(User user) {
		userDaoImpl.save(user);

		System.out.println("Record updated!!!");
	}

	@Override
	public String toString() {
		return "UpdateServiceImpl";
	}

}