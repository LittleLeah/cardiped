INSERT INTO Person(id, name, email) VALUES ( 1,'John', 'john@john.john');
INSERT INTO Person(id, name, email) VALUES ( 2,'Jane', 'jane@john.john');
INSERT INTO Person(id, name, email) VALUES ( 3,'Anna', 'anna@john.john');

INSERT INTO Kennel(id,name, prefix, prependPrefix) VALUES (1,"Kennel Guldfeldt", "Guldfeldts", 0);
INSERT INTO Kennel(id,name, prefix, prependPrefix) VALUES (2,"Kennel Aasted", "Aasteds", 0);

INSERT INTO Dog(id, breeder_id, name, sex) values (1, 1, 'bluey', 0);
Insert INTO Dog(id, breeder_id, name, sex) values (2, 1, 'grey boy', 1);
INSERT INTO Dog(id, breeder_id, name, sex, sire_id, dam_id) VALUES (3,2, 'booboo', 1,1,2);

INSERT INTO OwnerDogs(owner_id, dog_id) VALUES (1,1);
INSERT INTO OwnerDogs(owner_id, dog_id)  VALUES (1,2);
INSERT INTO OwnerDogs(owner_id, dog_id)  VALUES (2,3);