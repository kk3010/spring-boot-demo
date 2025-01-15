package kachanovska.playground.spring_boot_demo;

import org.assertj.core.api.Assertions.*
import kachanovska.playground.spring_boot_demo.todo.TodoItem
import kachanovska.playground.spring_boot_demo.todo.TodoItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment

@SpringBootTest(webEnvironment = WebEnvironment.NONE)
class TodoItemRepositoryTest {

    @Autowired
    var repository: TodoItemRepository? = null;

    @Test
    fun exploreRepository(){
        val item = TodoItem(topic = "Kaffee kaufen")
        val saved = repository!!.save(item)

        assertThat(saved.id).isNotNull()

        val found = repository!!.findById(saved.id!!)
        assertThat(found).isNotEmpty
    }
}
