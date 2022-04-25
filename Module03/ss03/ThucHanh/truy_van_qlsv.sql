USE quanlysinhvien;

SELECT *
FROM Student
WHERE Status = true;

SELECT *
FROM Subject
WHERE Credit < 10;


SELECT S.Student_Id, S.Student_Name, C.Class_Name
FROM Student  S join Class  C on S.Class_Id = C.Class_ID;

SELECT S.Student_Id, S.Student_Name, C.Class_Name
FROM Student S join Class C on S.ClassId = C.ClassID
WHERE C.ClassName = 'A1';

SELECT S.Student_Id, S.Student_Name, Sub.Sub_Name, M.Mark
FROM Student S 
join Mark M on S.Student_Id = M.Student_Id 
join Subject Sub on M.Sub_Id = Sub.Sub_Id






