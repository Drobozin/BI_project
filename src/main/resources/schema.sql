CREATE TABLE Organization(
    id        INTEGER PRIMARY KEY AUTO_INCREMENT,
    name      VARCHAR (140) NOT NULL,
    full_name  VARCHAR (600) NOT NULL,
    inn       VARCHAR(12) NOT NULL,
    kpp       VARCHAR(9) NOT NULL,
    address    VARCHAR(1000) NOT NULL,
    phone     VARCHAR(16) NOT NULL,
    is_active  TRUE
);
CREATE INDEX idx_organization
ON Organization (name, full_name, inn, address, phone);

CREATE TABLE Office(
  id      INTEGER PRIMARY KEY AUTO_INCREMENT,
  org_id   INTEGER NOT NULL,
  name    VARCHAR(600) NOT NULL,
  address  VARCHAR(1000) NOT NULL,
  phone   VARCHAR(16) NOT NULL,
  is_active TRUE,
  FOREIGN KEY (org_id) REFERENCES Organization(id)
);
CREATE INDEX idx_office
ON Office (name, org_id, address, phone);

CREATE TABLE Worker(
  id      INTEGER PRIMARY KEY AUTO_INCREMENT,
  office_id INTEGER NOT NULL,
  first_name VARCHAR(140) NOT NULL,
  last_name VARCHAR(140) NOT NULL,
  middle_name VARCHAR(140),
  position VARCHAR(280) NOT NULL,
  phone VARCHAR(16) NOT NULL,
  doc_code VARCHAR (2) NOT NULL,
  doc_number VARCHAR(140) NOT NULL,
  doc_date VARCHAR(50) NOT NULL,
  citezenship_name VARCHAR(140) NOT NULL,
  citezenship_code INTEGER NOT NULL,
  is_identified TRUE,
  FOREIGN KEY (office_id) REFERENCES Office(id)
);
CREATE INDEX idx_worker
ON Worker (frist_name, last_name, middle_name, position, phone, doc_code);

CREATE TABLE doc_type(
  id    INTEGER PRIMARY  KEY AUTO_INCREMENT,
  name  VARCHAR(240) NOT NULL,
  code  VARCHAR(2) NOT NULL,
  FOREIGN KEY (code) REFERENCES Worker (doc_code)
);

CREATE TABLE Country(
  id    INTEGER PRIMARY KEY AUTO_INCREMENT,
  name  VARCHAR (140) NOT NULL,
  code  VARCHAR(4) NOT NULL
);