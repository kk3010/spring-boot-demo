package kachanovska.playground.spring_boot_demo.todo;

import jakarta.persistence.*;

@Entity
class TodoItem (
    @Id
    @GeneratedValue
    var id: Long? = null,
    var topic: String,
    @Column(length = 2047, ) var description: String? = null,
    var isCompleted : Boolean? = false,
){

}
