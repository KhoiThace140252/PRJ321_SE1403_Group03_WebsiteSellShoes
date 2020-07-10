-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th7 03, 2020 lúc 03:48 PM
-- Phiên bản máy phục vụ: 10.1.38-MariaDB
-- Phiên bản PHP: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `group3`
--
CREATE DATABASE IF NOT EXISTS `group3` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `group3`;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `donhang`
--

CREATE TABLE `donhang` (
  `Madonhang` varchar(10) NOT NULL,
  `Tenkhachhang` varchar(30) NOT NULL,
  `Danhsachmuasanpham` varchar(20) NOT NULL,
  `Danhsachtensanpham` varchar(50) NOT NULL,
  `Tongsoluong` int(11) NOT NULL,
  `Tongtien` double NOT NULL,
  `Ngaymua` date NOT NULL,
  `Diachi` varchar(50) NOT NULL COMMENT 'Địa chỉ khách hàng',
  `Sodienthoai` varchar(20) NOT NULL COMMENT 'Số điện thoại khách hàng',
  `Email` varchar(50) NOT NULL,
  `Tinhtrangdonhang` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Bảng hiển thị thông tin đơn hàng';

--
-- Đang đổ dữ liệu cho bảng `donhang`
--

INSERT INTO `donhang` (`Madonhang`, `Tenkhachhang`, `Danhsachmuasanpham`, `Danhsachtensanpham`, `Tongsoluong`, `Tongtien`, `Ngaymua`, `Diachi`, `Sodienthoai`, `Email`, `Tinhtrangdonhang`) VALUES
('DH001', 'Tran Trong Tin', 'LN002', 'Li-ning den', 3, 10000, '2020-07-01', 'Lam Dong', '01697638366', 'ttt11@gmail.com', 'Da giao'),
('DH003', 'Hien Di', 'KS007', 'K-SWISS đen', 1, 10000, '2020-03-04', 'Quan 5', '01643023456', 'hiendi@gmail.com', 'Da giao');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaisanpham`
--

CREATE TABLE `loaisanpham` (
  `Maloai` varchar(20) NOT NULL,
  `Tenloai` varchar(20) NOT NULL,
  `Manhacungcap` varchar(30) NOT NULL,
  `Mota` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Bảng hiển thị thông tin loại sản phẩm';

--
-- Đang đổ dữ liệu cho bảng `loaisanpham`
--

INSERT INTO `loaisanpham` (`Maloai`, `Tenloai`, `Manhacungcap`, `Mota`) VALUES
('DC-2017', 'Đi chơi', 'NCC-ADIDAS-001', 'Dùng để đi chơi những nơi sang trọng\r\n'),
('TT-2017', 'Thể thao', 'NCC-NIKE-001', 'Dùng để tập thể dục\r\n');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhacungcap`
--

CREATE TABLE `nhacungcap` (
  `Manhacungcap` varchar(30) NOT NULL,
  `Tennhacungcap` varchar(20) NOT NULL,
  `Diachi` varchar(30) NOT NULL,
  `Sodienthoai` varchar(20) NOT NULL,
  `Logo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Bảng hiển thị thông tin nhà cung cấp';

--
-- Đang đổ dữ liệu cho bảng `nhacungcap`
--

INSERT INTO `nhacungcap` (`Manhacungcap`, `Tennhacungcap`, `Diachi`, `Sodienthoai`, `Logo`) VALUES
('NCC-ADIDAS-001', 'ADIDAS', 'Bến Tre', '01697638366', 'images/grid13.jpg');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sanpham`
--

CREATE TABLE `sanpham` (
  `Masanpham` varchar(20) NOT NULL,
  `Ten` varchar(50) NOT NULL,
  `Giadagiam` double NOT NULL,
  `Giaban` double NOT NULL,
  `Soluong` int(11) NOT NULL,
  `Nhacungcap` varchar(50) NOT NULL,
  `Maloai` varchar(20) NOT NULL,
  `Hinhanh` varchar(50) NOT NULL,
  `Soluongnhap` int(11) NOT NULL,
  `Soluongban` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Bảng hiển thị thông tin sản phẩm';

--
-- Đang đổ dữ liệu cho bảng `sanpham`
--

INSERT INTO `sanpham` (`Masanpham`, `Ten`, `Giadagiam`, `Giaban`, `Soluong`, `Nhacungcap`, `Maloai`, `Hinhanh`, `Soluongnhap`, `Soluongban`) VALUES
('AT001', 'ASICS TIGER trắng', 1300000, 1300000, 2, 'NCC-NIKE-001', 'DC-2017', 'images/gird13.jpg', 22, 6);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taikhoan`
--

CREATE TABLE `taikhoan` (
  `Tentaikhoan` varchar(50) NOT NULL,
  `Matkhau` varchar(30) NOT NULL,
  `Tenkhachhang` varchar(50) NOT NULL,
  `Gioitinh` varchar(6) NOT NULL,
  `Sodienthoai` varchar(20) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Ngaysinh` date NOT NULL,
  `Diachi` varchar(50) NOT NULL,
  `Soluotmua` int(11) NOT NULL,
  `Vaitro` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Bảng thông tin tài khoản (khách và quản lý)';

--
-- Đang đổ dữ liệu cho bảng `taikhoan`
--

INSERT INTO `taikhoan` (`Tentaikhoan`, `Matkhau`, `Tenkhachhang`, `Gioitinh`, `Sodienthoai`, `Email`, `Ngaysinh`, `Diachi`, `Soluotmua`, `Vaitro`) VALUES
('anhdinh', 'anhdinh11', 'Nguyễn Thị Anh Đình', 'Nữ', '0983452134', 'anhdinh@gmail.com', '1997-10-31', 'Quận 7', 1, 'Khách hàng'),
('anhkhoi', 'anhkhoi0100', 'Tiêu Hà Anh Khôi', 'Nam', '0901011100', 'khoi01@gmail.com', '2000-01-11', 'Hậu Giang', 0, 'Quản lý');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thongtinsanpham`
--

CREATE TABLE `thongtinsanpham` (
  `Masanpham` varchar(20) NOT NULL,
  `Mota1` text NOT NULL,
  `Hinhanhchitiet` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Bảng hiển thị thông tin sản phẩm chi tiết';

--
-- Đang đổ dữ liệu cho bảng `thongtinsanpham`
--

INSERT INTO `thongtinsanpham` (`Masanpham`, `Mota1`, `Hinhanhchitiet`) VALUES
('ADIDAS003', '', ''),
('AT009', '', '');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `donhang`
--
ALTER TABLE `donhang`
  ADD PRIMARY KEY (`Madonhang`);

--
-- Chỉ mục cho bảng `loaisanpham`
--
ALTER TABLE `loaisanpham`
  ADD PRIMARY KEY (`Maloai`),
  ADD UNIQUE KEY `Manhacungcap` (`Manhacungcap`);

--
-- Chỉ mục cho bảng `nhacungcap`
--
ALTER TABLE `nhacungcap`
  ADD PRIMARY KEY (`Manhacungcap`);

--
-- Chỉ mục cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`Masanpham`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
