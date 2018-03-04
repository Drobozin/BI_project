INSERT INTO Docs (id, name, code) VALUES (1, 'Паспорт гражданина РФ', 21);
INSERT INTO Countries (id, name, code) VALUES (1, 'Российская федерация', 643);

INSERT INTO Organization(id, name, fullName, inn, kpp, adress, phone, isActive)
      VALUES (1, 'JI', 'Java Integrator', 7707083893, 773601001, 'Moscow, Vavilova 19', 4951230077,TRUE );

INSERT INTO Office (id, orgId, name, adress, phone, isActive)
      VALUES (1, 1, 'Centrum', 'Roten Platz', 4953332211, TRUE );

INSERT INTO Worker (id, officeId, firstName, lastName, middleName, position, phone, docName, docNumber, docCode, citezenshipName, citezenshipCode, isIdentified)
      VALUES (1, 1, 'Ivan', 'Ivanonv', 'Vsileivich', 'manager', 9160007799, 'Паспорт гражданина РФ', 448678, 21, 'Moscow', 777, TRUE );

/*INSERT INTO House (id, version, address) VALUES (1, 0, 'ул.Цюрупы, 16');

INSERT INTO House (id, version, address) VALUES (2, 0, 'ул.Карла Маркса, 20');

INSERT INTO Person (version, first_name, age, house_id) VALUES (0, 'John', 25, 1);

INSERT INTO Person (version, first_name, age, house_id) VALUES (0, 'Ivan', 12, 2);*/