CREATE TABLE Organization(
    id        INTEGER PRIMARY KEY AUTO_INCREMENT,
    name      VARCHAR (50) NOT NULL,
    full_name  VARCHAR (50) NOT NULL,
    inn       VARCHAR(50) NOT NULL,
    kpp       VARCHAR(50) NOT NULL,
    address    VARCHAR(50) NOT NULL,
    phone     VARCHAR(50) NOT NULL,
    is_active  TRUE
);

CREATE TABLE Office(
  id      INTEGER PRIMARY KEY AUTO_INCREMENT,
  org_id   INTEGER NOT NULL,
  name    VARCHAR(50) NOT NULL,
  address  VARCHAR(50) NOT NULL,
  phone   VARCHAR(50) NOT NULL,
  is_active TRUE
)
CREATE TABLE Worker(
  id      INTEGER PRIMARY KEY AUTO_INCREMENT,
  office_id INTEGER NOT NULL,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  middle_name VARCHAR(50),
  position VARCHAR(50) NOT NULL,
  phone VARCHAR(50) NOT NULL,
  doc_name VARCHAR(50) NOT NULL,
  doc_number INTEGER NOT NULL,
  doc_date VARCHAR(50) NOT NULL,
  doc_code VARCHAR(50) NOT NULL,
  citezenship_name VARCHAR(50) NOT NULL,
  citezenship_code INTEGER NOT NULL,
  is_identified TRUE
)

CREATE TABLE doc_type(
  id    INTEGER PRIMARY  KEY AUTO_INCREMENT,
  name  VARCHAR(50) NOT NULL,
  code  INTEGER NOT NULL
)

CREATE TABLE Country(
  id    INTEGER PRIMARY KEY AUTO_INCREMENT,
  name  VARCHAR (50) NOT NULL,
  code  INTEGER NOT NULL
)