CREATE TABLE Organization(
    id        INTEGER PRIMARY KEY AUTO_INCREMENT,
    name      VARCHAR (50) NOT NULL,
    fullName  VARCHAR (50) NOT NULL,
    inn       INTEGER NOT NULL,
    kpp       INTEGER NOT NULL,
    address    VARCHAR(50) NOT NULL,
    phone     INTEGER NOT NULL,
    isActive  TRUE
);

CREATE TABLE Office(
  id      INTEGER PRIMARY KEY AUTO_INCREMENT,
  orgId   INTEGER NOT NULL,
  name    VARCHAR(50) NOT NULL,
  address  VARCHAR(50) NOT NULL,
  phone   INTEGER NOT NULL,
  isActive TRUE
)
CREATE TABLE Worker(
  id      INTEGER PRIMARY KEY AUTO_INCREMENT,
  officeId INTEGER NOT NULL,
  firstName VARCHAR(50) NOT NULL,
  lastNAme VARCHAR(50) NOT NULL,
  middleName VARCHAR(50),
  position VARCHAR(50) NOT NULL,
  phone INTEGER NOT NULL,
  docName VARCHAR(50) NOT NULL,
  docNumber INTEGER NOT NULL,
  docDate VARCHAR(50) NOT NULL,
  docCode INTEGER NOT NULL,
  citezenshipName VARCHAR(50) NOT NULL,
  citezenshipCode INTEGER NOT NULL,
  isIdentified TRUE
)

CREATE TABLE Docs(
  id    INTEGER PRIMARY  KEY AUTO_INCREMENT,
  name  VARCHAR(50) NOT NULL,
  code  INTEGER NOT NULL
)

CREATE TABLE Countries(
  id    INTEGER PRIMARY KEY AUTO_INCREMENT,
  name  VARCHAR (50) NOT NULL,
  code  INTEGER NOT NULL
)

/*CREATE TABLE IF NOT EXISTS Person (
    id         INTEGER  PRIMARY KEY AUTO_INCREMENT,
    version    INTEGER NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    house_id   INTEGER,
    age        INTEGER  NOT NULL
);

CREATE TABLE IF NOT EXISTS House (
    id         INTEGER  PRIMARY KEY AUTO_INCREMENT,
    version    INTEGER NOT NULL,
    address    VARCHAR(50) NOT NULL
);

CREATE INDEX IX_Person_House_Id ON Person (house_id);
ALTER TABLE Person ADD FOREIGN KEY (house_id) REFERENCES House(id);*/
