package com.jft.cdao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jft.domain.User;

@Repository
public interface IcreateDao extends CrudRepository<User, Integer> {

	/* Create a record */
	public User save(User user);

}

//long count()
//void delete(T entity)
//void deleteAll()
//void deleteAll(Iterable<? extends T> entities)
//void deleteById(ID id)
//boolean existsById(ID id)
//Iterable<T> findAll()
//Iterable<T> findAllById(Iterable<ID> ids)
//Optional<T> findById(ID id)
//<S extends T>S save(S entity)
//<S extends T>Iterable<S> saveAll(Iterable<S> entities)
