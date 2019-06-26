
1. WAQ to diplay the employees working in dept 20.
mysql-> Select * from Employee where  DeptNo =20;

2. WAQ to display the employees earning more than 2500.
mysql-> Select * from Employee where salary > 2500;

3.WAQ to display all the employees whose job type is software developer.
mysql-> Select * from Employee where JobType = 'Software Developer';

4.WAQ to display  the employees working in dept 10,20,and 40.
mysql-> Select * from Employee where DeptNo IN(10,20,40);

5..WAQ to display all the employees whose name starts with 's'.
mysql-> Select * from Employee where FirstName like 's%';

6. WAQ to display the employees whose firstname is having letter  'L' as 2nd character.
mysql-> Select * from Employee where FirstName like '_L%';

7.WAQ to display all the employees whose First_name  is having atleast 2'A'.
mysql-> Select * from Employee where FirstName like 'A%A%';

8. WAQ to display the employees whose lastname is having letter 'E' as the second last character.
mysql-> Select * from Employee where LastName like '%E_';

9.WAQ to display all the employees who are having exactly 5 characters in their lastname.
mysql-> Select * from Employee where LastName like '_____';

10.WAQ to display all the employees whose salary is between 2000 and 30000.
mysql-> Select * from Employee where salary between 20000 And 30000;

