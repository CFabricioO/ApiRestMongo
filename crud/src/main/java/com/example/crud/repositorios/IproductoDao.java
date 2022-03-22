package com.example.crud.repositorios;

import com.example.crud.modelos.produtco;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IproductoDao extends MongoRepository<produtco,String> {
}
