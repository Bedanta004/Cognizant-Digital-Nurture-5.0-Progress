CREATE TABLE product
(
    id          INT AUTO_INCREMENT NOT NULL,
    name        VARCHAR(255)       NULL,
    `desc`      VARCHAR(255)       NULL,
    brand       VARCHAR(255)       NULL,
    price       DECIMAL            NULL,
    category    VARCHAR(255)       NULL,
    releasedate datetime           NULL,
    quantity    INT                NOT NULL,
    CONSTRAINT pk_product PRIMARY KEY (id)
);