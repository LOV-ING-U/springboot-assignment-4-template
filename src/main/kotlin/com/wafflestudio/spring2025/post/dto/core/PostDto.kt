package com.wafflestudio.spring2025.post.dto.core

import com.wafflestudio.spring2025.board.dto.core.BoardDto
import com.wafflestudio.spring2025.board.model.Board
import com.wafflestudio.spring2025.post.model.Post
import com.wafflestudio.spring2025.post.model.PostWithUserAndBoard
import com.wafflestudio.spring2025.user.dto.core.UserDto
import com.wafflestudio.spring2025.user.model.User

data class PostDto(
    val id: Long,
    val title: String,
    val content: String,
    val likeCount: Long,
    val user: UserDto,
    val board: BoardDto,
    val createdAt: Long,
    val updatedAt: Long,
) {
    constructor(post: Post, user: User, board: Board, likeCount: Long) : this(
        id = post.id!!,
        title = post.title,
        content = post.content,
        likeCount = likeCount,
        user = UserDto(user),
        board = BoardDto(board),
        createdAt = post.createdAt!!.toEpochMilli(),
        updatedAt = post.updatedAt!!.toEpochMilli(),
    )

    constructor(postWithUserAndBoard: PostWithUserAndBoard) : this(
        id = postWithUserAndBoard.id,
        title = postWithUserAndBoard.title,
        content = postWithUserAndBoard.content,
        likeCount = postWithUserAndBoard.likeCount,
        user =
            UserDto(
                id = postWithUserAndBoard.user!!.id,
                username = postWithUserAndBoard.user.username,
            ),
        board =
            BoardDto(
                id = postWithUserAndBoard.board!!.id,
                name = postWithUserAndBoard.board.name,
            ),
        createdAt = postWithUserAndBoard.createdAt.toEpochMilli(),
        updatedAt = postWithUserAndBoard.updatedAt.toEpochMilli(),
    )
}
