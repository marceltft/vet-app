CREATE SCHEMA `client` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;

CREATE TABLE `client`.`owner` (
  `id` MEDIUMINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45)  NOT NULL,
  `social_id` VARCHAR(11)  NOT NULL,
  PRIMARY KEY (`id`)
     

  );


CREATE TABLE `client`.`animal` (
 `id` MEDIUMINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `birthday` DATE NULL,
  `sex` VARCHAR(1) NULL,
  `breed` VARCHAR(255) NULL,
  `species` VARCHAR(255) NULL,
  `owner_id` MEDIUMINT not NULL,
  PRIMARY KEY (`id`),
  INDEX owner_ind (owner_id),
    FOREIGN KEY (owner_id)
        REFERENCES owner(id)
        ON DELETE CASCADE
  
  );
