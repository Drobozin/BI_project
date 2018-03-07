INSERT INTO doc_type (id, name, code) VALUES (1, 'Паспорт гражданина РФ', 21);
INSERT INTO Country (id, name, code) VALUES (1, 'Российская федерация', 643);

INSERT INTO Organization(id, name, full_name, inn, kpp, address, phone, is_active)
      VALUES (1, 'JI', 'Java Integrator', 7707083893, 773601001, 'Moscow, Vavilova 19', 4951230077,TRUE );

INSERT INTO Office (id, org_id, name, address, phone, is_active)
      VALUES (1, 1, 'Centrum', 'Roten Platz', 4953332211, TRUE );

INSERT INTO Worker (id, office_id, first_name, last_name, middle_name, position, phone, doc_name, doc_number, doc_code, citezenship_name, citezenship_code, is_identified)
      VALUES (1, 1, 'Ivan', 'Ivanonv', 'Vsileivich', 'manager', 9160007799, 'Паспорт гражданина РФ', 448678, 21, 'Moscow', 777, TRUE );

