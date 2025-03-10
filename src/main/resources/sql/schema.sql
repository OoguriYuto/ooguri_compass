CREATE TABLE IF NOT EXISTS `users` (
    `id` INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(255),
    `mail` VARCHAR(128) NOT NULL, -- メールアドレス
    `password` VARCHAR(64) NOT NULL, -- パスワードのハッシュ値（spring security）
    `roles` VARCHAR(255) NOT NULL, -- ロール（カンマ区切り） "ROLE_USER,ROLE_ADMIN"（spring security）
    `created` DATETIME NOT NULL, -- 作成時刻
    `last_logined` DATETIME NOT NULL, -- 最終ログイン時刻
    `enabled` TINYINT(1) NOT NULL, -- 有効（1）・無効（0）フラグ
    UNIQUE KEY (`mail`)
);
