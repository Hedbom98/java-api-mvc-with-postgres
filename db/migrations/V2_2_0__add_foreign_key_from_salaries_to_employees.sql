ALTER TABLE IF EXISTS employees
ADD COLUMN salaryID INTEGER;

ALTER TABLE IF EXISTS employees
ADD CONSTRAINT fk_salaryID FOREIGN KEY(salaryID) REFERENCES salaries(id);