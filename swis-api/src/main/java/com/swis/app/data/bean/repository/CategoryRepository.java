package com.swis.app.data.bean.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swis.app.data.bean.Category;

/**
 * @author Lokesh
 *
 */
@Repository
@Transactional
public interface CategoryRepository extends CrudRepository<Category, Long> {
	@Transactional
	@Modifying
	void deleteById(Long id);
}
