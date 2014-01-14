package br.com.genericdelivery.model.dao.generic;

import java.io.Serializable;
import java.util.List;

/**
 * @author renan.paula
 *
 * @param <T> entity class
 */
public interface GenericDAO <T extends Serializable>{
	void save(T t);
	void update(T t);
	void remove(Serializable id);
	T findById(Serializable id);
	List<T> findAll();
	List<?> findByJPQL(String jpql, Object... parans);
	Object findSingleResultByJPQL(String jpql, Object... parans);
	int count();
}
