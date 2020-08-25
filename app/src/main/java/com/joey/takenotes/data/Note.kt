package com.joey.takenotes.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

/**
 * Represents the SQLite table for the notes.
 */
@Entity(tableName = "take_notes")
data class Note(var title: String, var body: String, var date: Date) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
