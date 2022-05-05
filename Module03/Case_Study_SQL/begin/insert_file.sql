

-- vi tri
INSERT INTO `vi_tri` (`ma_vi_tri`, `ten_vi_tri`) VALUES ('1', 'Quang Ly'), ('2', 'Nhan vien');


-- trinh do

INSERT INTO `case_study`.`trinh_do` (`ma_trinh_do`, `ten_trinh_do`) VALUES ('1', 'Trung Cấp');
INSERT INTO `case_study`.`trinh_do` (`ma_trinh_do`, `ten_trinh_do`) VALUES ('2', 'Cao Đẳng');
INSERT INTO `case_study`.`trinh_do` (`ma_trinh_do`, `ten_trinh_do`) VALUES ('3', 'Đại Học');
INSERT INTO `case_study`.`trinh_do` (`ma_trinh_do`, `ten_trinh_do`) VALUES ('4', 'Sau Đại Học');


-- loai khach

INSERT INTO `case_study`.`loai_khach` (`ma_loai_khach`, `ten_loai_khach`) VALUES ('1', 'Diamond');
INSERT INTO `case_study`.`loai_khach` (`ma_loai_khach`, `ten_loai_khach`) VALUES ('2', 'Platinium');
INSERT INTO `case_study`.`loai_khach` (`ma_loai_khach`, `ten_loai_khach`) VALUES ('3', 'Gold');
INSERT INTO `case_study`.`loai_khach` (`ma_loai_khach`, `ten_loai_khach`) VALUES ('4', 'Silver');
INSERT INTO `case_study`.`loai_khach` (`ma_loai_khach`, `ten_loai_khach`) VALUES ('5', 'Member');


-- ma kieu thue

INSERT INTO `case_study`.`kieu_thue` (`ma_kieu_thue`, `ten_kieu_thue`) VALUES ('1', 'year');
INSERT INTO `case_study`.`kieu_thue` (`ma_kieu_thue`, `ten_kieu_thue`) VALUES ('2', 'month');
INSERT INTO `case_study`.`kieu_thue` (`ma_kieu_thue`, `ten_kieu_thue`) VALUES ('3', 'day');
INSERT INTO `case_study`.`kieu_thue` (`ma_kieu_thue`, `ten_kieu_thue`) VALUES ('4', 'hour');

-- loai dich vu
INSERT INTO `case_study`.`loai_dich_vu` (`ma_loai_dich_vu`, `ten_loai_dich_vu`) VALUES ('1', 'Villa');
INSERT INTO `case_study`.`loai_dich_vu` (`ma_loai_dich_vu`, `ten_loai_dich_vu`) VALUES ('2', 'House');
INSERT INTO `case_study`.`loai_dich_vu` (`ma_loai_dich_vu`, `ten_loai_dich_vu`) VALUES ('3', 'Room');

-- k hang
INSERT INTO `khach_hang` VALUES ('1', '5', 'Nguyen Thi Hao', '1970-11-07', 0 ,'643431213', '945423362', 'thihao07@gmail.com', '23 Nguyễn Hoàng, Đà Nẵng');
INSERT INTO `khach_hang` VALUES ('2', '3', 'Pham Xuan Dieu', '1992-08-08', 1, '865342123', '954333333', 'xuandieu92@gmail.com', 'K77/22 Thái Phiên, Quảng Trị');
INSERT INTO `khach_hang` VALUES ('3', '1', 'Truong Dinh Nghe', '1990-02-27', 1, '488645199', '373213122', 'nghenhan2702@gmail.com', 'K323/12 Ông Ích Khiêm, Vinh');
INSERT INTO `khach_hang` VALUES ('4', '1', 'Duong Van Quan', '1981-07-08', 1, '543432111', '490039241', 'duongquan@gmail.com', 'K453/12 Lê Lợi, Đà Nẵng');
INSERT INTO `khach_hang` VALUES ('5', '4', 'Hoang Tran Nhi Nhi', '1995-12-09', 0, '795453345', '312345678', 'nhinhi123@gmail.com', '224 Lý Thái Tổ, Gia Lai');
INSERT INTO `khach_hang` VALUES ('6', '4', 'Ton Nu Moc Chau', '2005-12-06', 0, '732434215', '988888844', 'tonnuchau@gmail.com', '37 Yên Thế, Đà Nẵng');
INSERT INTO `khach_hang` VALUES ('7', '1', 'Nguyen My Kiem', '1984-04-08', 0, '856453123', '912345698', 'kimcuong84@gmail.com', 'K123/45 Lê Lợi, Hồ Chí Minh');
INSERT INTO `khach_hang` VALUES ('8', '3', 'Nguyen Thi Hao', '1999-04-08', 0, '965656433', '763212345', 'haohao99@gmail.com', '55 Nguyễn Văn Linh, Kon Tum');
INSERT INTO `khach_hang` VALUES ('9', '1', 'Tran Dai Danh', '1994-07-01', 1, '432341235', '643343433', 'danhhai99@gmail.com', '24 Lý Thường Kiệt, Quảng Ngãi');
INSERT INTO `khach_hang` VALUES ('10', '2', 'Nguen Tam Dac', '1989-07-01', 1, '344343432', '987654321', 'dactam@gmail.com', '22 Ngô Quyền, Đà Nẵng');

-- nhan vien
INSERT INTO `nhan_vien` VALUES ('1', 'Nguyễn Văn An', '1970-11-07', '456231786', '10000000', '901234121', 'annguyen@gmail.com', '295 Nguyễn Tất Thành, Đà Nẵng', '1', '3', '1');
INSERT INTO `nhan_vien` VALUES ('2', 'Lê Văn Bình', '1997-04-09', '654231234', '7000000', '934212314', 'binhlv@gmail.com', '22 Yên Bái, Đà Nẵng', '1', '2', '2');
INSERT INTO `nhan_vien` VALUES ('3', 'Hồ Thị Yến', '1995-12-12', '999231723', '14000000', '412352315', 'thiyen@gmail.com', 'K234/11 Điện Biên Phủ, Gia Lai', '1', '3', '2');
INSERT INTO `nhan_vien` VALUES ('4', 'Võ Công Toản', '1980-04-04', '123231365', '17000000', '374443232', 'toan0404@gmail.com', '77 Hoàng Diệu, Quảng Trị', '1', '4', '4');
INSERT INTO `nhan_vien` VALUES ('5', 'Nguyễn Bỉnh Phát', '1999-12-09', '454363232', '6000000', '902341231', 'phatphat@gmail.com', '43 Yên Bái, Đà Nẵng', '2', '1', '1');
INSERT INTO `nhan_vien` VALUES ('6', 'Khúc Nguyễn An Nghi', '2000-11-08', '964542311', '7000000', '978653213', 'annghi20@gmail.com', '294 Nguyễn Tất Thành, Đà Nẵng', '2', '2', '3');
INSERT INTO `nhan_vien` VALUES ('7', 'Nguyễn Hữu Hà', '1993-01-01', '534323231', '8000000', '941234553', 'nhh0101@gmail.com', '4 Nguyễn Chí Thanh, Huế', '2', '3', '2');
INSERT INTO `nhan_vien` VALUES ('8', 'Nguyễn Hà Đông', '1989-09-03', '234414123', '9000000', '642123111', 'donghanguyen@gmail.com', '111 Hùng Vương, Hà Nội', '2', '4', '4');
INSERT INTO `nhan_vien` VALUES ('9', 'Tòng Hoang', '1982-09-03', '256781231', '6000000', '245144444', 'hoangtong@gmail.com', '213 Hàm Nghi, Đà Nẵng', '2', '4', '4');
INSERT INTO `nhan_vien` VALUES ('10', 'Nguyễn Công Đạo', '1994-01-08', '755434343', '8000000', '988767111', 'nguyencongdao12@gmail.com', '6 Hoà Khánh, Đồng Nai', '2', '3', '2');


-- hop dong
INSERT INTO `hop_dong` VALUES ('1', '2020-12-08', '2020-12-08', '0', '3', '1', '3');
INSERT INTO `hop_dong` VALUES ('2', '2020-07-14', '2020-07-21', '200000', '7', '3', '1');
INSERT INTO `hop_dong` VALUES ('3', '2021-03-15', '2021-03-17', '50000', '3', '4', '2');
INSERT INTO `hop_dong` VALUES ('4', '2021-01-14', '2021-01-18', '100000', '7', '5', '5');
INSERT INTO `hop_dong` VALUES ('5', '2021-07-14', '2021-07-15', '0', '7', '2', '6');
INSERT INTO `hop_dong` VALUES ('6', '2021-06-01', '2021-06-03', '0', '7', '7', '6');
INSERT INTO `hop_dong` VALUES ('7', '2021-09-02', '2021-09-05', '100000', '7', '4', '4');
INSERT INTO `hop_dong` VALUES ('8', '2021-06-17', '2021-06-18', '150000', '3', '4', '1');
INSERT INTO `hop_dong` VALUES ('9', '2020-11-19', '2020-11-19', '0', '3', '4', '3');
INSERT INTO `hop_dong` VALUES ('10', '2021-04-12', '2021-04-14', '0', '10', '3', '5');
INSERT INTO `hop_dong` VALUES ('11', '2021-04-25', '2021-04-25', '0', '2', '2', '1');
INSERT INTO `hop_dong` VALUES ('12', '2021-05-25', '2021-05-27', '0', '7', '10', '1');


-- - hd chi tiet
INSERT INTO `hop_dong_chi_tiet` VALUES ('1', '2', '4', '5');
INSERT INTO `hop_dong_chi_tiet` VALUES ('2', '2', '5', '8');
INSERT INTO `hop_dong_chi_tiet` VALUES ('3', '2', '6', '15');
INSERT INTO `hop_dong_chi_tiet` VALUES ('4', '3', '1', '1');
INSERT INTO `hop_dong_chi_tiet` VALUES ('5', '3', '2', '11');
INSERT INTO `hop_dong_chi_tiet` VALUES ('6', '1', '3', '1');
INSERT INTO `hop_dong_chi_tiet` VALUES ('7', '1', '2', '2');



