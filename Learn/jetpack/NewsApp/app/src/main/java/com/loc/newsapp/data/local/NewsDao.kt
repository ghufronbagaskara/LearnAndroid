package com.loc.newsapp.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.loc.newsapp.domain.model.Article
import java.util.concurrent.Flow

@Dao
interface NewsDao {

    // this will update an insert
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article)

    @Delete
    suspend fun delete(article: Article)

    @Query("SELECT * FROM Article")
    fun getArticle(): kotlinx.coroutines.flow.Flow<List<Article>>

    @Query("SELECT * FROM Article WHERE url=:url")
    suspend fun getArticle(url: String): Article?

}