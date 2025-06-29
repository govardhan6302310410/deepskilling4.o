-- SET SERVEROUTPUT ON;

DECLARE
   n NUMBER := 10; 
   i NUMBER;
   sum_even NUMBER := 0;
BEGIN   



   -- 1. IF-ELSE: Check EVEN or ODD
   IF MOD(n, 2) = 0 THEN
      DBMS_OUTPUT.PUT_LINE(n || ' is Even');
   ELSE
      DBMS_OUTPUT.PUT_LINE(n || ' is Odd');
   END IF;
            



   -- 2. FOR LOOP: Print 1 to N
   DBMS_OUTPUT.PUT_LINE('Numbers from 1 to ' || n || ':');
   FOR i IN 1..n LOOP
      DBMS_OUTPUT.PUT_LINE(i);
   END LOOP;




   -- 3. WHILE LOOP: Sum of even numbers from 1 to N
   i := 1;
   WHILE i <= n LOOP
      IF MOD(i, 2) = 0 THEN
         sum_even := sum_even + i;
      END IF;
      i := i + 1;
   END LOOP;

   DBMS_OUTPUT.PUT_LINE('Sum of even numbers from 1 to ' || n || ' is ' || sum_even);
END;
/
