package com.example.modul8.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DAONote {
    @Insert(onConflict = onConflictStrategy.IGNORE)
    void insert (Note note);
    @Update
    void update (Note note);
    @Delete
    void delete (Note note);
    @Query("SELECT * from note ORDER BY id ASC")
    LiveData<List<Note>> getAllNotes();
}
