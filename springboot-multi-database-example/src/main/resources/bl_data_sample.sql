CREATE TABLE `BL_HD` (
  `BLNO` varchar(20) NOT NULL,
  `SHIPPER` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `CONSIGNEE` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `timestamp` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`BLNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin

CREATE TABLE `BL_CNTR` (
  `BLNO` varchar(20) NOT NULL,
  `CNTRNO` varchar(45) NOT NULL,
  `WGT` float(10,2) NOT NULL,
  PRIMARY KEY (BLNO,CNTRNO)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin

insert  into bl_hd values ('ABCBL' , 'ABCLINER' , 'BBBCON','2022-03-03');
insert  into bl_hd values ('ABCBL2' , 'ABCLINER' , 'BBBCON','2022-03-03');


insert  into bl_cntr values ('ABCBL' , 'CNTRABC' , 10.5);
insert  into bl_cntr values ('ABCBL' , 'CNTRABC2' , 10.5);
insert  into bl_cntr values ('ABCBL' , 'CNTRABC3' , 10.5);

insert  into bl_cntr values ('ABCBL2' , 'CNTBBB3' , 10.5);
insert  into bl_cntr values ('ABCBL2' , 'CNTBBB4' , 10.5);
insert  into bl_cntr values ('ABCBL2' , 'CNTBBB5' , 10.5);