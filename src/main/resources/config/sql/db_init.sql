/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     17/06/2020 17:13:35                          */
/*==============================================================*/


drop table if exists CHEVAUX;

drop table if exists COURSE;

drop table if exists ECURIES2;

drop table if exists REUNION;

drop table if exists ECURIES;

/*==============================================================*/
/* Table: CHEVAUX                                               */
/*==============================================================*/
create table CHEVAUX
(
   IDCOURSE             int not null,
   IDCHEVAL             int not null,
   numCheval            int not null,
   NOMCHEVAL            varchar(100),
   ESTPARTANTCHEVAL     smallint not null,
   DATEPARTANTCHEVAL    time,
   primary key (IDCOURSE, IDCHEVAL)
);

/*==============================================================*/
/* Table: COURSE                                                */
/*==============================================================*/
create table COURSE
(
   IDCOURSE             int not null,
   IDREUNION            int not null,
   CODECOURSE           varchar(20) not null,
   STATUSCOURSE         varchar(20) not null,
   dateCourse           date,
   heureCourse          time,
   primary key (IDCOURSE)
);

/*==============================================================*/
/* Table: ECURIES2                                             */
/*==============================================================*/
create table ECURIES2
(
   IDCOURSE             int not null,
   CHE_IDCHEVAL         int not null,
   CHE_IDCOURSE         int not null,
   IDCHEVAL             int not null,
   nomEucurie           char(1) not null,
   primary key (CHE_IDCOURSE, IDCOURSE, CHE_IDCHEVAL, IDCHEVAL)
);

/*==============================================================*/
/* Table: REUNION                                               */
/*==============================================================*/
create table REUNION
(
   IDREUNION            int not null,
   idHypodromeDeroulement int,
   idHypodromeOrganisateur int,
   CODEREUNION          varchar(3) not null,
   DATEREUNION          date not null,
   heureDemarrageReunion time,
   primary key (IDREUNION)
);

/*==============================================================*/
/* Table: ECURIES                                              */
/*==============================================================*/
create table ECURIES
(
   idCourse             int not null,
   idProduit            int not null,
   nomEcurie            char(1),
   primary key (idProduit, idCourse)
);

alter table CHEVAUX add constraint FK_association7 foreign key (IDCOURSE)
      references COURSE (IDCOURSE) on delete restrict on update restrict;

alter table COURSE add constraint FK_association9 foreign key (IDREUNION)
      references REUNION (IDREUNION) on delete restrict on update restrict;

alter table ECURIES2 add constraint FK_ecuries foreign key (IDCOURSE, CHE_IDCHEVAL)
      references CHEVAUX (IDCOURSE, IDCHEVAL) on delete restrict on update restrict;

alter table ECURIES2 add constraint FK_ecuries2 foreign key (CHE_IDCOURSE, IDCHEVAL)
      references CHEVAUX (IDCOURSE, IDCHEVAL) on delete restrict on update restrict;
