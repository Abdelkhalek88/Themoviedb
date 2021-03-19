package com.example.themoviedb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Movies (
    @ColumnInfo(name="Movie_Title") val Movie_Title:String
        ){

        @PrimaryKey(autoGenerate = true)
        var id : Int = 0

}