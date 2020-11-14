# mysql
WITH tmp AS
  (SELECT Salary
   FROM Employee
   GROUP BY Salary
   ORDER BY Salary DESC
   LIMIT 1
   OFFSET 1)
SELECT IF (
             (SELECT *
              FROM tmp) IS NULL,
                           NULL,
             (SELECT *
              FROM tmp)) AS SecondHighestSalary;