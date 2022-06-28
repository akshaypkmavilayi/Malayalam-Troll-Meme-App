package com.mtmapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mtmapp.entities.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

}
