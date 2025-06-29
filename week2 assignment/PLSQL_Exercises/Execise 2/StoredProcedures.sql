SET SERVEROUTPUT ON;

-- 1. Drop table if it already exists (safe drop)
BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE employees';
EXCEPTION
  WHEN OTHERS THEN
    NULL; -- ignore error if table does not exist
END;
/

-- 2. Create table
BEGIN
  EXECUTE IMMEDIATE '
    CREATE TABLE employees (
      emp_id NUMBER PRIMARY KEY,
      name   VARCHAR2(100),
      salary NUMBER
    )';
END;
/

-- 3. Insert data
BEGIN
  INSERT INTO employees VALUES (1, ''Alice'', 30000);
  INSERT INTO employees VALUES (2, ''Bob'', 40000);
  INSERT INTO employees VALUES (3, ''Charlie'', 50000);
  COMMIT;
END;
/

-- 4. Create stored procedure
CREATE OR REPLACE PROCEDURE raise_salary (
  p_emp_id IN NUMBER,
  p_increase IN NUMBER
) IS
BEGIN
  UPDATE employees
  SET salary = salary + p_increase
  WHERE emp_id = p_emp_id;

  IF SQL%ROWCOUNT = 0 THEN
    DBMS_OUTPUT.PUT_LINE('❌No employee found with ID ' || p_emp_id);
  ELSE
    DBMS_OUTPUT.PUT_LINE(' Salary updated for Employee ID ' || p_emp_id);
  END IF;
END;
/

-- 5. Call the procedure
BEGIN
  raise_salary(2, 5000);
END;
/

-- 6. View results
SELECT * FROM employees;
