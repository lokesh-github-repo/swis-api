package com.swis.app.data.bean.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
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
	
	@Query("SELECT a FROM Category a " + "WHERE a.id = :id")
	Category findByCategoryId(@Param(value = "id") Long id);
	
	List<Category> findAll();

}
