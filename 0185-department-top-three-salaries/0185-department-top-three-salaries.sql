SELECT d.name AS Department,e.name AS Employee,e.salary AS salary
FROM Employee e
JOIN Department d
ON e.departmentId=d.id
where 3>(
    SELECT COUNT(DISTINCT salary)
    FROM Employee e2
    WHERE e.departmentId=e2.departmentId AND e.salary<e2.salary
);
