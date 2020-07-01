package org.springframework.mvc.extensions.ajax.accessingdatamysql;
import org.springframework.mvc.extensions.ajax.accessingdatamysql.User;

import org.springframework.mvc.extensions.ajax.accessingdatamysql.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends JpaRepository<User, Integer> {

}