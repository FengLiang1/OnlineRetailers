
CREATE DATABASE seckill;

CREATE TABLE seckill(
  `id` CHARACTER(120) not NULL COMMENT '商品ID',
  `name` CHARACTER(120) NOT NULL COMMENT '商品名字',
  `number` int not null COMMENT '储存数量',
  `startTime` DATETIME COMMENT '商品开始秒杀时间',
  `endTime` DATETIME COMMENT '商品结束秒杀时间',
  `createTime` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '商品创建时间',
  PRIMARY KEY (id),
  key index_start_time(startTime),
  key index_end_time(endTime),
  key index_create_time(createTime)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀库存';

CREATE TABLE user(
  `id` CHARACTER(120) not NULL COMMENT '用户ID',
  `name` CHARACTER(120) NOT NULL COMMENT '用户名字',
  `age` INT COMMENT '用户年龄',
  `birth` DATE COMMENT '出生年月',
  `phoneNum` INT NOT NULL COMMENT '手机号'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

CREATE TABLE user_seckill(
  `id` CHARACTER(120) NOT NULL COMMENT 'id',
  `seckillId` CHARACTER(120) not NULL COMMENT '用户ID',
  `phoneNum` BIGINT NOT NULL COMMENT '用户名字',
  `state` INT NOT NULL DEFAULT -1 COMMENT '-1 无效， 0： 成功， 1： 已付款',
  `createTime` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (id),
  key index_create_time(createTime),
  key index_id(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀明细';