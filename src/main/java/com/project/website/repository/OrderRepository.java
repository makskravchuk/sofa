package com.project.website.repository;

import com.project.website.models.OrderInfo;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderInfo,Long> {
}
