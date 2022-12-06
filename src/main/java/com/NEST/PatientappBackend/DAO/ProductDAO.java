package com.NEST.PatientappBackend.DAO;

import com.NEST.PatientappBackend.model.ProductModel;
import org.springframework.data.repository.CrudRepository;

public interface ProductDAO extends CrudRepository<ProductModel, Integer> {
}
