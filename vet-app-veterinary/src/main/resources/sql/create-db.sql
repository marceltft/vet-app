CREATE TABLE `vet`.`veterinary` (
  `id` MEDIUMINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `phone` VARCHAR(15) NOT NULL,
  `email` VARCHAR(255)  NOT NULL,
  `social_id` VARCHAR(11)  NOT NULL,
  `picture_path` VARCHAR(1024),
   PRIMARY KEY (`id`)
  );
