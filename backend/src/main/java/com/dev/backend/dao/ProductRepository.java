package com.dev.backend.dao;

import org.springframework.data.repository.CrudRepository;

import com.dev.backend.models.Product;

/**
 * A DAO for the entity User is simply created by extending the CrudRepository
 * interface provided by spring. The following methods are some of the ones
 * available from such interface: save, delete, deleteAll, findOne and findAll.
 * The magic is that such methods must not be implemented, and moreover it is
 * possible create new query methods working only by defining their signature!
 * 
 * @author jagbirs
 */

public interface ProductRepository extends CrudRepository<Product, String> {

}
