SELECT DISTINCT A.Email
FROM Person A
         LEFT OUTER JOIN Person B
                         ON A.Email = B.Email
WHERE A.ID != B.ID
