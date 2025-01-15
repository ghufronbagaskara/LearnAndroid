package com.loc.newsapp.data.remote.dto

import com.loc.newsapp.domain.model.Article

data class NewsResponses(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)