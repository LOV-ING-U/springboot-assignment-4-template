package com.wafflestudio.spring2025.postlike.model // 패키지 경로는 컨트롤러에 맞게 조정

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.relational.core.mapping.Table
import java.time.Instant

@Table("post_likes")
class PostLike(
    @Id
    var id: Long? = null,
    var userId: Long, // users 테이블의 ID (외래 키)
    var postId: Long, // posts 테이블의 ID (외래 키)
    @CreatedDate
    var createdAt: Instant? = null,
    @LastModifiedDate
    var updatedAt: Instant? = null,
)
