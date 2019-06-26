1. WAQ to display all the details of the software developer in dept 30.
mysql-> Select * from Employee where job = 'Software Developer' and deptNo = 30;

2. WAQ to display the list for all the software developer in dept number 40 and having ssalary greater than  5000.
mysql-> Select * from Employee where job = 'Software Developer' and deptNo = 40 and salary >5000;

3. WAQ to display list all the employees except those who are working in dept 10 and 20.
mysql-> Select * from Employee where deptNo not in(10,20);

4.WAQ to display list the employees who are not working as software developer and clerks in dept 10 and 20 with a salary in the range of 1000 to 3000.
mysql-> Select * from Employee where job Not IN('Software Developer','Clerk') and deptNo in(10,20) and salary between 10000 and 30000;

5.WAQ to display the  list employees whose salary is  not in the range of 10000 to 20000 in dept 10,20,30 except all salesman.
mysql-> Select * from Employee where salary not between 10000 and 20000 and deptNo in(10,20,30) and job != 'Salesman';

6. WAQ to arrange all the employees by their salary in descending order.
mysql-> Select * from Employee order by salary desc;

7. WAQ to display the maximum salary, minimum salary and total salary from employee.
mysql-> Select max(salary),min(salary),sum(salary) from Employee;

8. WAQ to display the list of the number of software developer in department 20.
mysql-> Select * from Employee where job = 'Software Developer' and deptNo = 20; 

9.WAQ to display the list of the highest and lowest salary earned by salesman.
mysql-> Select max(salary),min(salary),FirstName from Employee where job ='Salesman';

10. WAQ to display the total salary of all departments.
mysql-> Select deptNo, sum(salary) from Employee group by deptNo;