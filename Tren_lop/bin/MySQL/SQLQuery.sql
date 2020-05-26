 
use sinhvien1
	
create table thongtin (
	masv nvarchar(10)
	constraint pk_thongtin_masv primary key,
	hodem nvarchar(25),
	ten nvarchar(15) ,
	ngaysinh datetime,
	noisinh nvarchar(255),
	gioitinh bit,
	malop nvarchar(25),
)
create table monhoc(
	mamonhoc nvarchar(10)
	constraint pf_monhoc_mamonhpc primary key,
	tenmonhoc nvarchar(25),
	sodvht tinyint,
)
create table diemthi(
	mamonhoc nvarchar(10),
	masv nvarchar(10),
	diem tinyint,
	constraint pk_diemthi_masv primary key(mamonhoc,masv),
	constraint fk_diemthi_monhoc
	foreign key (mamonhoc)
	references monhoc(mamonhoc)
	on delete cascade
	on update cascade,
	constraint fk_diemthi_masv
	foreign key(masv)
	references thongtin(masv)
	on delete cascade
	on update cascade,
)


