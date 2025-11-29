CREATE TABLE post_likes (
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id     BIGINT NOT NULL, -- 좋아요를 누른 사용자
    post_id     BIGINT NOT NULL, -- 좋아요를 받은 게시글

    created_at  TIMESTAMP(6) NOT NULL,
    updated_at  TIMESTAMP(6) NOT NULL,

    -- 외래 키 설정
    FOREIGN KEY (user_id) REFERENCES users (id),
    FOREIGN KEY (post_id) REFERENCES posts (id) ON DELETE CASCADE,

    -- 동시성 문제 및 중복 방지를 위한 UNIQUE 제약조건
    CONSTRAINT uk_post_like_user_post UNIQUE (user_id, post_id)
);
