package com.acdevs.todo.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(todo: Todo)

    @Update
    suspend fun updateTodo(todo: Todo)

    @Delete
    suspend fun deleteTodo(todo: Todo)


    @Query("SELECT * FROM todoTable ORDER BY timeStamp DESC")
    suspend fun getAllTodos(): Flow<List<Todo>>

    @Query("SELECT * FROM todoTable WHERE uid = :id")
    fun getTodoById(id: String): Flow<Todo?>
}
