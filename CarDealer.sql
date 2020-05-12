truncate table payments;
truncate table offers;
truncate table customer;

drop table car;
drop table customer;
drop table offers;
drop table payments;

create table car(
car_id number (20),
car_brand varchar2(20),
car_mileage float,
car_year integer,
car_price float,
car_isbought integer);

ALTER TABLE car
  ADD (
    CONSTRAINT car_pk PRIMARY KEY (car_id)
  );

CREATE SEQUENCE car_sequence;

CREATE OR REPLACE TRIGGER cars_on_insert
  BEFORE INSERT ON car
  FOR EACH ROW
BEGIN
  SELECT car_sequence.nextval
  INTO :new.car_id
  FROM dual;
END;

create table customer(
customer_id number (20),
customer_name varchar2(20),
customer_last_name varchar2(20)
);

ALTER TABLE customer
  ADD (
    CONSTRAINT customer_pk PRIMARY KEY (customer_id)
  );

CREATE SEQUENCE customer_sequence;

CREATE OR REPLACE TRIGGER customer_on_insert
  BEFORE INSERT ON customer
  FOR EACH ROW
BEGIN
  SELECT customer_sequence.nextval
  INTO :new.customer_id
  FROM dual;
END;

create table offers(
offer_id number (20),
customer_id number(20),
car_id number(20),
car_price float,
car_price_offer float,
offer_status varchar2
);

ALTER TABLE offers
  ADD (
    CONSTRAINT offersr_pk PRIMARY KEY (offer_id)
  );

CREATE SEQUENCE offers_sequence;

CREATE OR REPLACE TRIGGER offers_on_insert
  BEFORE INSERT ON offers
  FOR EACH ROW
BEGIN
  SELECT offers_sequence.nextval
  INTO :new.offer_id
  FROM dual;
END;

create table payments(
payment_id number (20),
car_id number(20),
customer_id number(20),
car_price float,
car_payment float,
car_balance varchar2
);

ALTER TABLE payments
  ADD (
    CONSTRAINT payments_pk PRIMARY KEY (payment_id)
  );

CREATE SEQUENCE payments_sequence;

CREATE OR REPLACE TRIGGER payments_on_insert
  BEFORE INSERT ON payments
  FOR EACH ROW
BEGIN
  SELECT payments_sequence.nextval
  INTO :new.payment_id
  FROM dual;
END;

create table car_owned(
car_owned_id number(20),
car_id number (20),
customer_id number(20),
car_brand varchar2(20),
car_year integer);

drop table car_owned;

ALTER TABLE car_owned
  ADD (
    CONSTRAINT car_owned_pk PRIMARY KEY (car_owned_id)
  );
  
CREATE SEQUENCE car_owned_sequence;

CREATE OR REPLACE TRIGGER car_owned_on_insert
  BEFORE INSERT ON car_owned
  FOR EACH ROW
BEGIN
  SELECT car_owned_sequence.nextval
  INTO :new.car_owned_id
  FROM dual;
END;
/
