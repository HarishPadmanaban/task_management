package com.task.TaskManagement.Repository;

import com.task.TaskManagement.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,String> {
}
