package com.example.cseghrender;
import org.springframework.data.jpa.repository.JpaRepository;   

public interface UserRepository extends JpaRepository<Users, Integer> 
{
    Users findByEmail(String email);


}
