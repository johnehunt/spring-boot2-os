package com.jjh.nosql.repository;

import com.jjh.nosql.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    @Query("{ 'name' : ?0 }")
    List<User> findUsersByName(String name);

    @Query("{ 'age' : { $gt: ?0, $lt: ?1 } }")
    List<User> findUsersByAgeBetween(int ageGT, int ageLT);

    @Query("{ 'name' : { $regex: ?0 } }")
    List<User> findUsersByRegexpName(String regexp);

    @Query(value = "{}", fields = "{name : 1}")
    List<User> findNameAndId();

    @Query(value = "{}", fields = "{_id : 0}")
    List<User> findNameAndAgeExcludeId();
}