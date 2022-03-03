CREATE TABLE `booking` (
  `bookingId` int NOT NULL,
  `bookingdesc` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `status` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `timestamp` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`bookingId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin