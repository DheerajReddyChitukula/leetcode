SELECT EmployeeUNI.unique_id, Employees.name 
FROM Employees 
left JOIN EmployeeUNI 
ON Employees.id = EmployeeUNI.id;



# select 
# eu.unique_id as unique_id, e.name as name
# from Employees e left join EmployeeUNI eu on e.id = eu.id