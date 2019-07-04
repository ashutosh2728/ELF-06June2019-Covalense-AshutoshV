
1.WAQ to display all the employees whose name and job is exactly 5 characters.
select * from Employee where FirstName like '_____' or job like '_____';

2. WAQ to display the employees whose job starts with 'soft'.
Select * from employee where job like 'soft%';

3. WAQ to display the maximum salary for each job.
select max(salary),job from employee group by job;

4. WAQ to display the departmentnumbers along with the number of employees working in it.
select count(*), deptNo from employee group by deptNo;

5. WAQ to display the minimum salary for each of the job excluding all the employees whose name ends with 's'.
select min(salary),job from employee where FirstName not like 's%' group by job;

6.WAQ to display the list of the employees who is working in 'ADMIN' department.
select * from employee e join department d on e.deptNo=d.DeptNo where d.DeptName = 'ADMIN';

7. WAQ to display the list of the department names that are working as 'software Developer'
select d.dname from department d inner join employee e on e.deptno=d.deptno where job_type='software developer';

8. WAQ to display the 2nd maximum salary.
select max(salary) from employee where salary <>(select max(salary) from employee );

9.  WAQ to display the 3rd maximum salary.
select max(salary) from employee where salary < (select max(salary) from employee where salary<>(select max(salary) from employee));

10.  WAQ to display the 4th least salary.
select min(salary) from employee where salary > (select min(salary) from employee where salary>(select min(salary) from employee where salary <>(select min(salary) from employee)));



