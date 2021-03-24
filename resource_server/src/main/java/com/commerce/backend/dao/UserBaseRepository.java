package com.commerce.backend.dao;

import com.commerce.backend.model.entity.ProductType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface UserBaseRepository<T extends ProductType>
        extends CrudRepository<T, Long> {


}
