-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th7 23, 2020 lúc 11:03 AM
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
  `Madonhang` int(11) NOT NULL,
  `Tenkhachhang` varchar(30) NOT NULL,
  `Tensanpham` varchar(1000) NOT NULL,
  `Tongsoluong` int(11) NOT NULL,
  `Tongtien` double NOT NULL,
  `Ngaymua` date NOT NULL,
  `Diachi` varchar(100) NOT NULL COMMENT 'Địa chỉ khách hàng',
  `Sodienthoai` varchar(20) NOT NULL COMMENT 'Số điện thoại khách hàng',
  `Email` varchar(50) NOT NULL,
  `Tinhtrangdonhang` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Bảng hiển thị thông tin đơn hàng';

--
-- Đang đổ dữ liệu cho bảng `donhang`
--

INSERT INTO `donhang` (`Madonhang`, `Tenkhachhang`, `Tensanpham`, `Tongsoluong`, `Tongtien`, `Ngaymua`, `Diachi`, `Sodienthoai`, `Email`, `Tinhtrangdonhang`) VALUES
(1, 'Huynh Thi Nhien', ' Nike Metcon 5 Nike LegendX 7 Nike Tanjun Jordan Max 20', 10, 1167, '2020-07-23', 'Can Tho', '0902777999', 'nhienht@gmail.com', 'Already'),
(2, 'Huynh Thi Nhien', ' Nike LegendX 7', 7, 1050, '2020-07-23', 'Can Tho', '0902777999', 'nhienht@gmail.com', 'Already'),
(3, 'Huynh Ba Dat', ' Nike Metcon 5 Nike LegendX 7 Jordan Max 20 Nike Kyrie 6', 4, 767, '2020-07-23', 'Sa Dec', '0939657217', 'dathb@fpt.edu.vn', 'Already');

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
('DC-2017', 'Hang out', 'NCC-ADIDAS-001', 'Used to go out luxurious places\r\n'),
('TT-2017', 'Sport', 'NCC-NIKE-001', 'Used to exercise\r\n');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhacungcap`
--

CREATE TABLE `nhacungcap` (
  `Manhacungcap` varchar(30) NOT NULL,
  `Tennhacungcap` varchar(20) NOT NULL,
  `Diachi` varchar(30) NOT NULL,
  `Sodienthoai` varchar(20) NOT NULL,
  `Logo` varchar(1000) NOT NULL,
  `Mota` text NOT NULL,
  `TinhtrangNcc` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Bảng hiển thị thông tin nhà cung cấp';

--
-- Đang đổ dữ liệu cho bảng `nhacungcap`
--

INSERT INTO `nhacungcap` (`Manhacungcap`, `Tennhacungcap`, `Diachi`, `Sodienthoai`, `Logo`, `Mota`, `TinhtrangNcc`) VALUES
('NCC-NIKE-001', 'NIKE', 'USA1', '01697638366', 'images\\nike.jpg', 'Nike is one of the leading manufacturer and supplier of sports equipment, footwear and apparels. Nike is a global brand and it continuously creates products using high technology and design innovation. Nike has a vast collection of sports shoes for men at Snapdeal. You can explore our range of basketball shoes, football shoes, cricket shoes, tennis shoes, running shoes, daily shoes or lifestyle shoes. Take your pick from an array of sports shoes in vibrant colours like red, yellow, green, blue, brown, black, grey, olive, pink, beige and white. Designed for top performance, these shoes match the way you play or run. Available in materials like leather, canvas, suede leather, faux leather, mesh etc, these shoes are lightweight, comfortable, sturdy and extremely sporty. The sole of all Nike shoes is designed to provide an increased amount of comfort and the material is good enough to provide an improved fit. These shoes are easy to maintain and last for a really long time given to their durability. Buy Nike shoes for men online with us at some unbelievable discounts and great prices. So get faster and run farther with your Nike shoes and track how hard you can play.', 'Already');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phanhoi`
--

CREATE TABLE `phanhoi` (
  `Idphanhoi` int(11) NOT NULL,
  `Chude` varchar(50) NOT NULL,
  `Tentaikhoan` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Noidung` text NOT NULL,
  `Ngaygio` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Bảng hiển thị thông tin phản hồi của khách hàng';

--
-- Đang đổ dữ liệu cho bảng `phanhoi`
--

INSERT INTO `phanhoi` (`Idphanhoi`, `Chude`, `Tentaikhoan`, `Email`, `Noidung`, `Ngaygio`) VALUES
(1, 'Delete all', 'Tieu Khoi', 'khoithace140252@gmail.com', 'Please delete all your product', '2020-07-23');

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
  `Manhacungcap` varchar(50) NOT NULL,
  `Maloai` varchar(20) NOT NULL,
  `Hinhanh` varchar(1000) NOT NULL,
  `Soluongnhap` int(11) NOT NULL,
  `Soluongban` int(11) NOT NULL,
  `Tinhtrang` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Bảng hiển thị thông tin sản phẩm';

--
-- Đang đổ dữ liệu cho bảng `sanpham`
--

INSERT INTO `sanpham` (`Masanpham`, `Ten`, `Giadagiam`, `Giaban`, `Soluong`, `Manhacungcap`, `Maloai`, `Hinhanh`, `Soluongnhap`, `Soluongban`, `Tinhtrang`) VALUES
('AT001', 'Nike LegendX 7', 0, 150, 41, 'NCC-NIKE-001', '11HZ72-9MA', 'images\\nike-legendx-7.jpg', 50, 9, 'Already'),
('AT002', 'Nike Tanjun', 0, 100, 43, 'NCC-NIKE-001', 'LG6Z7J-98V', 'images\\nike-tanjun.jpg', 50, 7, 'Already'),
('AT003', 'Jordan Westbrook', 0, 210, 50, 'NCC-NIKE-001', 'BLS472-9F4', 'images\\jordan-westbrook.jpg', 50, 0, 'Already'),
('AT004', 'Nike Kyrie 6', 0, 300, 49, 'NCC-NIKE-001', 'BLA472-KJI', 'images\\kyrie-6.jpg', 50, 1, 'Already'),
('AT005', 'Zoom Freak 1 Multi', 2, 280, 50, 'NCC-NIKE-001', 'BK5F72-LD1', 'images\\zoom-freak-1-multi.jpg', 50, 0, 'Already'),
('AT006', 'Kyrie 6 AS EP', 1, 199, 50, 'NCC-NIKE-001', 'BLP072-168', 'images\\kyrie-6-as-ep-basketball-shoe-Rr5kzh.jpg', 50, 0, 'Already'),
('AT007', 'Nike SB Charge', 0, 300, 50, 'NCC-NIKE-001', 'BQ6I92-1KA', 'images\\sb-charge-canvas-skate-shoe-RgSxkT.jpg', 50, 0, 'Already'),
('AT008', 'Nike SB Blazer Low', 0, 300, 50, 'NCC-NIKE-001', 'BQ6G81-LOA', 'images\\sb-blazer-low-gt-skate-shoe-zbjr5n.jpg', 50, 0, 'Already'),
('AT009', 'Air Jordan 1 Mid', 3, 300, 50, 'NCC-NIKE-001', 'BQ6472-164', 'images\\air-jordan-1-mid.jpg', 50, 0, 'Already'),
('AT010', 'Air Jordan Low', 1, 199, 50, 'NCC-NIKE-0011', 'ZX6475-8941', 'images\\air-jordan-low-pf.jpg', 50, 0, 'Already'),
('AT011', 'Air Jordan OG1', 1, 289, 50, 'NCC-NIKE-0011', 'GH7825-5261', 'images\\air-ghost-racer.jpg', 50, 0, 'Already'),
('AT012', 'Jordan Mars', 2, 156, 50, 'NCC-NIKE-001', 'HK3561-265', 'images\\jordan-mars-270.jpg', 50, 0, 'Already'),
('AT013', 'Jordan Max 20', 11, 155, 48, 'NCC-NIKE-002', 'AP2345-8909', 'images\\jordan-max-200.jpg', 50, 2, 'Already'),
('AT014', 'KD13 EP', 0, 300, 50, 'NCC-NIKE-001', 'HJ4675-908', 'images\\kd13.jpg', 50, 0, 'Already'),
('AT015', 'LeBron 7 QS', 3, 120, 50, 'NCC-NIKE-001', 'LK8364-189', 'images\\lebron-7-qs.jpg', 50, 0, 'Already'),
('AT016', 'LeBron 17', 2, 290, 50, 'NCC-NIKE-001', 'ER6892-772', 'images\\lebron-17.jpg', 50, 0, 'Already'),
('AT017', 'Nike Air Max 95 SP', 10, 299, 50, 'NCC-NIKE-001', 'LM6882-994', 'images\\air-max-95.jpg', 50, 0, 'Already'),
('AT018', 'Nike Air Max 97 Utility', 1, 199, 50, 'NCC-NIKE-001', 'MA6002-004', 'images\\air-max-97-utility.jpg', 50, 0, 'Already'),
('AT019', 'Nike Challenger', 0, 189, 50, 'NCC-NIKE-001', 'AQ6332-009', 'images\\challenger.jpg', 50, 0, 'Already'),
('AT020', 'Nike Metcon 5', 0, 179, 48, 'NCC-NIKE-001', 'HZ6002-304', 'images\\metcon-5.jpg', 50, 2, 'Already');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taikhoan`
--

CREATE TABLE `taikhoan` (
  `IdTaikhoan` int(11) NOT NULL,
  `Tentaikhoan` varchar(50) NOT NULL,
  `Matkhau` varchar(250) NOT NULL,
  `Tenkhachhang` varchar(250) NOT NULL,
  `Gioitinh` varchar(6) NOT NULL,
  `Sodienthoai` varchar(20) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Ngaysinh` date NOT NULL,
  `Diachi` varchar(100) NOT NULL,
  `Soluotmua` int(11) NOT NULL,
  `Vaitro` varchar(10) NOT NULL,
  `Tinhtrangtaikhoan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `taikhoan`
--

INSERT INTO `taikhoan` (`IdTaikhoan`, `Tentaikhoan`, `Matkhau`, `Tenkhachhang`, `Gioitinh`, `Sodienthoai`, `Email`, `Ngaysinh`, `Diachi`, `Soluotmua`, `Vaitro`, `Tinhtrangtaikhoan`) VALUES
(1, 'anhkhoi', 'cc970aceb38a011f5ec4e529f68e3ea3', 'Tieu Ha Anh Khoi', 'Male', '0901011100', 'ginkizero123@gmail.com', '2000-01-11', 'Hau Giang', 0, 'Manager', 'Used'),
(2, 'huudang', '9b034cc2fe48de29404612242a374c15', 'Chau Huu Dang', 'Male', '0939777999', 'dangchce140529@fpt.edu.vn', '2000-07-07', 'Ca Mau', 0, 'Manager', 'Used'),
(3, 'nhuthao', '471cea29438e0eda621da3fa02f4a225', 'Vo Nhut Hao 123', 'Male', '0979222999', 'haovnce140475@gmail.com', '2000-05-11', 'Kien Giang', 0, 'Manager', 'Used'),
(4, 'thinhien', '0842ae5d76a660f572cd32c194ce4115', 'Huynh Thi Nhien', 'Male', '0577967890', 'nhienht@gmail.com', '2000-11-11', 'Hau Giang', 17, 'Customer', 'Used'),
(5, 'thanhnhan', '8bb23a5000d187f75b898223abf9251f', 'Le Thanh Nhan', 'Male', '01697638366', 'nhanlt@fpt.edu.vn', '2000-03-04', 'Can Tho', 0, 'Customer', 'Used'),
(6, 'dathb', 'e10adc3949ba59abbe56e057f20f883e', 'Huynh Ba Dat1', 'Male', '0939657217', 'dathbce140456@fpt.edu.vn', '1999-12-01', 'Sa Dec', 4, 'Customer', 'Used');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thongtinsanpham`
--

CREATE TABLE `thongtinsanpham` (
  `Masanpham` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Mota1` text NOT NULL,
  `Hinhanhchitiet1` varchar(500) NOT NULL,
  `Hinhanhchitiet2` varchar(500) NOT NULL,
  `Hinhanhchitiet3` varchar(500) NOT NULL,
  `Hinhanhchitiet4` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `thongtinsanpham`
--

INSERT INTO `thongtinsanpham` (`Masanpham`, `Mota1`, `Hinhanhchitiet1`, `Hinhanhchitiet2`, `Hinhanhchitiet3`, `Hinhanhchitiet4`) VALUES
('AT001', 'The Nike LegendX 7 Club TF Shoe has textured synthetic leather lined with foam for great touch and durability. A rubber sole with studs gives you traction on turf surfaces.', 'images\\ttsp1.1.jpg', 'images\\ttsp1.2.jpg', 'images\\ttsp1.3.jpg', 'images\\ttsp1.4.jpg'),
('AT002', 'Named after the Japanese word for simplicity, the Nike Tanjun Men Shoe offers a streamlined, modern design for an elevated everyday look.', 'images\\ttsp2.1.jpg', 'images\\ttsp2.2.jpg', 'images\\ttsp2.3.jpg', 'images\\ttsp2.4.jpg'),
('AT003', 'Inspired by the edgy designs of Russell Westbrook Why Not series, the Jordan Westbrook One Take PF combines extra-durable traction and forefoot responsiveness to help players stay in control on outdoor courts. The clash of colours and materials gives it a chaotic style, aligning with Russ intense game and personality.', 'images\\ttsp3.1.jpg', 'images\\ttsp3.2.jpg', 'images\\ttsp3.3.jpg', 'images\\ttsp3.4.jpg'),
('AT004', 'Featuring a mix of soft pastels with bright yellow and red accents, the Kyrie 6 Asia Irving honours his older sister, Asia, while sounding the call for worldwide gender equality. Asia success as a model, fashion designer and entrepreneur are shining examples of what possible when everyone plays by the same rules.', 'images\\ttsp4.1.jpg', 'images\\ttsp4.2.jpg', 'images\\ttsp4.3.jpg', 'images\\ttsp4.4.jpg'),
('AT005', 'Get your freak on in Giannis Antetokounmpo debut signature shoe, Nike first ever for the international basketball sensation. The Zoom Freak 1 has the extra-responsive cushioning, forefoot lockdown and multi-directional traction needed to complement his freakishly athletic game.', 'images\\ttsp5.1.jpg', 'images\\ttsp5.2.jpg', 'images\\ttsp5.3.jpg', 'images\\ttsp5.4.jpg'),
('AT006', 'Designed for Kyrie Irving unpredictable creativity on the court, the Kyrie 6 focuses on comfort, control and energy return to help him go fast and stay fresh. Bouncy cushioning is paired with soft yet supportive foam for responsiveness and a smooth heel-to-toe transition. The midfoot strap and plush, padded collar lock him in and help keep him a step ahead of the competition.', 'images\\ttsp6.1.jpg', 'images\\ttsp6.2.jpg', 'images\\ttsp6.3.jpg', 'images\\ttsp6.4.jpg'),
('AT007', 'Crafted from lightweight canvas, the Nike SB Charge Canvas Premium elevates a skate essential with bright stripes.', 'images\\ttsp7.1.jpg', 'images\\ttsp7.2.jpg', 'images\\ttsp7.3.jpg', 'images\\ttsp7.4.jpg'),
('AT008', 'The Nike SB Blazer Low GT pairs a supportive feel with lightweight, responsive cushioning for everyday use. Just like Grant Taylor, it blends contemporary style with old-school traditions.', 'images\\ttsp8.1.jpg', 'images\\ttsp8.2.jpg', 'images\\ttsp8.3.jpg', 'images\\ttsp8.4.jpg'),
('AT009', 'The Air Jordan 1 Mid Shoe is inspired by the first AJ1, offering OG fans a look at how far the Jordan brand has come since 1985.', 'images\\ttsp9.1.jpg', 'images\\ttsp9.2.jpg', 'images\\ttsp9.3.jpg', 'images\\ttsp9.4.jpg'),
('AT010', 'Introducing the Air Jordan XXXIV Low PF, a game shoe that laser-focused on reducing design elements to make it as light as possible. It has the same shape and features of the inline 34, with some tweaks. A lower collar, synthetic leather toe cap (instead of mesh) and an updated heel overlay material outfit the low-profile shoe. An extra-durable rubber outsole makes it ideal for use on outdoor courts.', 'images\\ttsp10.1.jpg', 'images\\ttsp10.2.jpg', 'images\\ttsp10.3.jpg', 'images\\ttsp10.4.jpg'),
('AT011', 'First released in 98, the Air Jordan OG was designed for the women basketball community who wanted an AJ all of their own. The original Air Jordan for women has dimpled leather and midsole sculpting inspired by the AJ13.', 'images\\ttsp33.1.jpg', 'images\\ttsp33.2.jpg', 'images\\ttsp33.3.jpg', 'images\\ttsp33.4.jpg'),
('AT012', 'Drawing inspiration from four classic Air Jordans, the Jordan Mars 270 is a modern-day remix that offers a heavy dose of heritage, plus an enormous Max Air unit and springy foam for non-stop comfort.', 'images\\ttsp12.1.jpg', 'images\\ttsp12.2.jpg', 'images\\ttsp12.3.jpg', 'images\\ttsp12.4.jpg'),
('AT013', 'With design elements inspired by the Air Jordan 4, the Jordan Max 200 brings a new level of Air to Jordan, for details anchored in legacy and comfort made for the future.', 'images\\ttsp13.1.jpg', 'images\\ttsp13.2.jpg', 'images\\ttsp13.3.jpg', 'images\\ttsp13.4.jpg'),
('AT014', 'In the game crucial moments, KD thrives. He takes over on both ends of the court, making defenders fear his unstoppable moves and shutting down opponents with his defensive prowess. The KD13 EP helps him play at an elite level with full-length cushioning and an extra forefoot unit. This EP version is designed with an extra-durable outsole for use on outdoor courts.', 'images\\ttsp14.1.jpg', 'images\\ttsp14.2.jpg', 'images\\ttsp14.3.jpg', 'images\\ttsp14.4.jpg'),
('AT015', 'Make your head-turning journey to the top comfortable. Built strong and sleek, the LeBron 7 QS features a mix of materials on the upper for a look that lasts. Metal accents and multiple LeBron crests celebrate a king, while full-length cushioning graces your every step.', 'images\\ttsp15.1.jpg', 'images\\ttsp15.2.jpg', 'images\\ttsp15.3.jpg', 'images\\ttsp15.4.jpg'),
('AT016', 'The LeBron 17 harnesses LeBron strength and speed with containment and support for all-court domination. It features a lightweight mix of knit and heat-moulded yarns that gives each one a durable look and feel. Combined cushioning provides LeBron with the impact support and responsive energy return he needs to power through the long season.', 'images\\ttsp16.1.jpg', 'images\\ttsp16.2.jpg', 'images\\ttsp16.3.jpg', 'images\\ttsp16.4.jpg'),
('AT017', 'Taking inspiration from the human body, the Nike Air Max 95 SP mixes unbelievable comfort with running DNA. The iconic side panels represent muscles, while Nike Air in the heel and forefoot cushions your every step.', 'images\\ttsp17.1.jpg', 'images\\ttsp17.2.jpg', 'images\\ttsp17.3.jpg', 'images\\ttsp17.4.jpg'),
('AT018', 'The Nike Air Max 97 Utility puts a cold-weather spin on a classic style. Synthetic panels, engineered rubber and reflective design touches let you feel secure when hitting the streets.', 'images\\ttsp18.1.jpg', 'images\\ttsp18.2.jpg', 'images\\ttsp18.3.jpg', 'images\\ttsp18.4.jpg'),
('AT019', 'Nearly a 1-to-1 remake of the OG running shoe that offered runners a distinct look in the 70s, the Nike Challenger OG marries soft suedes, shimmering fabric and breathable mesh. Plush padding around the ankle combines with its sleek, springy midsole to make it the comfy trendsetter—the diamond from underground.', 'images\\ttsp19.1.jpg', 'images\\ttsp19.2.jpg', 'images\\ttsp19.3.jpg', 'images\\ttsp19.4.jpg'),
('AT020', 'The Nike Metcon 5 is our most tuned Metcon yet. This means specific stability for heavy lifting, traction made for speed and durability where you need it. It even includes a Hyperlift insert that compatible with all prior versions of the Metcon. Meet your secret weapon for weight-lifting and high-impact training.', 'images\\ttsp20.1.jpg', 'images\\ttsp20.2.jpg', 'images\\ttsp20.3.jpg', 'images\\ttsp20.4.jpg');

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
-- Chỉ mục cho bảng `phanhoi`
--
ALTER TABLE `phanhoi`
  ADD PRIMARY KEY (`Idphanhoi`),
  ADD KEY `Tentaikhoan` (`Tentaikhoan`),
  ADD KEY `Email` (`Email`);

--
-- Chỉ mục cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`Masanpham`),
  ADD KEY `Manhacungcap` (`Manhacungcap`);

--
-- Chỉ mục cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`IdTaikhoan`);

--
-- Chỉ mục cho bảng `thongtinsanpham`
--
ALTER TABLE `thongtinsanpham`
  ADD PRIMARY KEY (`Masanpham`),
  ADD KEY `Masanpham` (`Masanpham`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `donhang`
--
ALTER TABLE `donhang`
  MODIFY `Madonhang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `phanhoi`
--
ALTER TABLE `phanhoi`
  MODIFY `Idphanhoi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  MODIFY `IdTaikhoan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
