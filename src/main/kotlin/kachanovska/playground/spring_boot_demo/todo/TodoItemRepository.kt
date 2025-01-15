package kachanovska.playground.spring_boot_demo.todo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository


interface TodoItemRepository : JpaRepository<TodoItem?, Long?> {

    @Query("select t from TodoItem t where t.isCompleted=true")
    fun findCompleted(): List<TodoItem>
}