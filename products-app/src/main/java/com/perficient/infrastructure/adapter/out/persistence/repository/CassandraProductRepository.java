package com.perficient.infrastructure.adapter.out.persistence.repository;

import com.perficient.infrastructure.adapter.out.persistence.entity.ProductEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;

@Repository
public interface CassandraProductRepository  extends CassandraRepository<ProductEntity, UUID>{
    @Query(allowFiltering = true)
    List<ProductEntity> findProductEntityByRestaurantId(int id);
}
