use quanlysinhvien;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select s.*, max(credit) as "M" from subject s;

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select s.sub_name, max(mark) as Max from subject s
join  mark m on s.sub_id = m.sub_id
group by s.sub_id
having max(mark) >= 
all( select max(mark)  from mark  );


-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên,
-- xếp hạng theo thứ tự điểm giảm dần


select st.* , avg(m.mark) as "AVG" from student st 
join mark m on st.student_id = m.student_id 
group by student_id
order by "AVG" desc;

