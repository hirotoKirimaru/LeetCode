# mysql

SELECT IF(
            (SELECT Salary
             FROM Employee
             GROUP BY Salary
             ORDER BY Salary DESC
             LIMIT 1
             OFFSET 1) IS NULL, NULL, (
                                         (SELECT Salary
                                          FROM Employee
                                          ORDER BY Salary DESC
                                          LIMIT 1
                                          OFFSET 1))) AS SecondHighestSalary