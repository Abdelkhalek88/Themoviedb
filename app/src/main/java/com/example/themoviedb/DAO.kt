@file:Suppress("AndroidUnresolvedRoomSqlReference")

package com.example.themoviedb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DAO {
   @Query("SELECT * FROM Movies")
   fun getAll():List<Movies>

    @Insert
     fun insertnewNote( Movies: Movies)

    @Query("DELETE FROM Movies")
    fun deleteall()

    @Query("DELETE FROM Movies WHERE id=:id")
    fun deletenotebyid(id:Int)

//    @Query(value = "UPDATE Movies SET Title=:title , about=:desc ,  Date=:date WHERE id=:id")
//    fun updateNote(id:Int,title:String,date:String,desc:String)
//    @Query("DELETE FROM notes_Table WHERE id=id")
//    fun deletebyid(id:Int)
}
