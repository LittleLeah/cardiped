INSERT INTO person(id, name, email) VALUES (1, 'John', 'john@john.john');
INSERT INTO person(id, name, email) VALUES (2, 'Jane', 'jane@john.john');
INSERT INTO person(id, name, email) VALUES (3, 'Anna', 'anna@john.john');

INSERT INTO dog(id, owner, name) values (1, 1, 'bluey');
Insert INTO dog(id, owner, name) values (2, 1, 'grey boy');
INSERT INTO dog(id, owner, name) VALUES (3,2, 'booboo')
ALTER SEQUENCE dog_seq RESTART WITH 4;