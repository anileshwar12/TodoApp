package com.acdevs.todo.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todoTable")
data class Todo(
    @PrimaryKey(autoGenerate = true) val uid: String,
    val title: String,
    val status: Boolean,
    val timeStamp: String
)
