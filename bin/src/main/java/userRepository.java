package com.qa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<Account, Long>{

}
