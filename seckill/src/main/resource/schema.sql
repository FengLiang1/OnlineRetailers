CREATE TABLE product(
  `id` CHARACTER(120) not NULL COMMENT '商品ID',
  `name` CHARACTER(120) NOT NULL COMMENT '商品名字',
  `startTime` DATETIME COMMENT '商品开始秒杀时间',
  `endTime` DATETIME COMMENT '商品结束秒杀时间',
  `createTime` DATETIME COMMENT '商品创建时间'
);

CREATE TABLE user(
  `id` CHARACTER(120) not NULL COMMENT '用户ID',
  `name` CHARACTER(120) NOT NULL COMMENT '用户名字',
  `age` INT COMMENT '用户年龄',
  `birth` DATE COMMENT '出生年月'
);