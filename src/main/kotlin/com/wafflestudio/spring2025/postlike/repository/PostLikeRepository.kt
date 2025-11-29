package com.wafflestudio.spring2025.postlike.repository

import com.wafflestudio.spring2025.postlike.model.PostLike
import org.springframework.data.repository.ListCrudRepository

interface PostLikeRepository : ListCrudRepository<PostLike, Long> {
    fun findByUserIdAndPostId(
        userId: Long,
        postId: Long,
    ): PostLike?

    fun deleteByUserIdAndPostId(
        userId: Long,
        postId: Long,
    ): Long

    fun existsByUserIdAndPostId(
        userId: Long,
        postId: Long,
    ): Boolean
}
