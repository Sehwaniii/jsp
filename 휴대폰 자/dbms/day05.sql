SELECT * FROM EMPLOYEES e ;

SELECT * FROM EMP_DETAILS_VIEW edv ;

SELECT * FROM EMPLOYEES e ;

/* view */
CREATE VIEW v_emp(emp_id,first_name,job_id,hiredate,dept_id)
AS
SELECT 	EMPLOYEE_ID , FIRST_NAME 
	, 	JOB_ID , HIRE_DATE , DEPARTMENT_ID 
FROM 	EMPLOYEES e 
WHERE 	JOB_ID = 'ST_CLERK'
;

SELECT * FROM v_emp;

-- view 삭제
DROP VIEW V_EMP ;

---------------------
CREATE OR REPLACE VIEW v_emp(
	emp_id, first_name, job_id, hiredate, dept_id
) AS 
SELECT 	NVL(EMPLOYEE_ID, ''), NVL(FIRST_NAME, '')  , JOB_ID 
	,	HIRE_DATE , DEPARTMENT_ID 
FROM 	EMPLOYEES e 
;
SELECT * FROM v_emp;

-- 102 Lex
-- 함수로 작성된 부분은 수정 불가
UPDATE V_EMP SET FIRST_NAME = 'kim' 
WHERE FIRST_NAME = 'Lex'; 
--------------------------------------------------
CREATE OR REPLACE VIEW v_emp2(
	emp_id, first_name, job_id, hiredate, dept_id
) AS 
SELECT 	NVL(EMPLOYEE_ID, ''), FIRST_NAME  , JOB_ID 
	,	HIRE_DATE , DEPARTMENT_ID 
FROM 	EMPLOYEES e 
;
SELECT * FROM v_emp2;
-- 102 Lex
-- 함수로 작성된 부분은 수정 불가
UPDATE V_EMP2 SET FIRST_NAME = 'kim' 
WHERE FIRST_NAME = 'Lex'; 
SELECT * FROM EMPLOYEES e WHERE EMPLOYEE_ID = 102;

-- UPDATE EMPLOYEES SET FIRST_NAME = 'Lex' 

SELECT * FROM EMPLOYEES e 
WHERE EMPLOYEE_ID = 102;






