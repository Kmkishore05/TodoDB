package com.example.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todoapp.entity.TodoEntity;

public interface TodoRepository extends JpaRepository<TodoEntity,Long>{
    
}
