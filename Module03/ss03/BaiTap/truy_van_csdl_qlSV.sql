use quanlysinhvien;

select * from student
 where student_name like "h%";
 
 select * from class
 where month(date) = 04;
 
 select * from `subject`
 where credit between 3 and 5;
 
 select * from student;
 
 set SQL_SAFE_UPDATES = 0;
 update student set class_id = 2 
 where student.student_name = 'Hung';
 
 -- sub name???
 select student_name,mark.mark 
 from student 
 join mark on student.student_id = mark.student_id
order by mark desc, student_name asc;
 
 