-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 03 Jan 2019 pada 19.26
-- Versi server: 10.1.37-MariaDB
-- Versi PHP: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `betybatikdb`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin_login`
--

CREATE TABLE `admin_login` (
  `id_login` char(5) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `admin_login`
--

INSERT INTO `admin_login` (`id_login`, `username`, `password`) VALUES
('A0001', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `KODE_BARANG` char(5) NOT NULL,
  `NAMA_BARANG` varchar(50) NOT NULL,
  `Jenis_BARANG` varchar(50) NOT NULL,
  `stok` char(13) NOT NULL,
  `merek` varchar(50) NOT NULL,
  `ukuran` varchar(10) NOT NULL,
  `HARGA` decimal(18,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `detailpembelian`
--

CREATE TABLE `detailpembelian` (
  `KODE_DPembelian` char(10) NOT NULL,
  `total` decimal(18,0) NOT NULL,
  `subtotal` decimal(18,0) NOT NULL,
  `hargabeli` decimal(18,0) NOT NULL,
  `kode_pembelian` char(10) NOT NULL,
  `kode_barang` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `detailpenjualan`
--

CREATE TABLE `detailpenjualan` (
  `KODE_DP` char(10) NOT NULL,
  `jumlah` decimal(18,0) NOT NULL,
  `HARGA` decimal(18,0) NOT NULL,
  `kode_penjualan` char(10) NOT NULL,
  `kode_barang` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `kasir`
--

CREATE TABLE `kasir` (
  `id_kasir` char(5) NOT NULL,
  `NAMA_kasir` varchar(50) NOT NULL,
  `alamat_kasir` varchar(100) NOT NULL,
  `no_telp` char(13) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kasir`
--

INSERT INTO `kasir` (`id_kasir`, `NAMA_kasir`, `alamat_kasir`, `no_telp`, `username`, `password`) VALUES
('KI9T0', '123', '123', '123', '123', '123'),
('KO20T', '1212', '1221', '2121', '1221', '1212'),
('KVXLE', 'widis', 'sdsda', 'sdsd', 'andito', 'andito');

-- --------------------------------------------------------

--
-- Struktur dari tabel `laporan`
--

CREATE TABLE `laporan` (
  `KODE_Laporan` char(5) NOT NULL,
  `jenis_Laporan` varchar(30) NOT NULL,
  `nama_Laporan` varchar(50) NOT NULL,
  `isi_Laporan` varchar(300) NOT NULL,
  `tanggal` date NOT NULL,
  `kode_Penjualan` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `member`
--

CREATE TABLE `member` (
  `id_member` varchar(8) NOT NULL,
  `NAMA_member` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `no_hp` char(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `member`
--

INSERT INTO `member` (`id_member`, `NAMA_member`, `alamat`, `no_hp`) VALUES
('BT7KWC1I', 'kwowowo', '2ooowo', '1010101'),
('BTC9HLL0', 'ardian', 'Yogyakarta', '1234567890'),
('BTH2GU4L', 'wow', 'Yogyakarta', '00000'),
('BTI4ASL4', 'arif', '121221', '121212'),
('BTIKZIT1', 'Mahmud', 'Bekasi', '12345'),
('BTKB0CBJ', 'Otong', 'Jakarta', '90101010'),
('BTL46JWD', 'budi', 'bekasi', '01010101');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembelian`
--

CREATE TABLE `pembelian` (
  `KODE_Pembelian` char(10) NOT NULL,
  `tanggal` date NOT NULL,
  `id_supplier` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemilik_login`
--

CREATE TABLE `pemilik_login` (
  `id_login` char(5) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pemilik_login`
--

INSERT INTO `pemilik_login` (`id_login`, `username`, `password`) VALUES
('P0001', 'pemilik', 'pemilik');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjualan`
--

CREATE TABLE `penjualan` (
  `KODE_Penjualan` char(10) NOT NULL,
  `tanggal` date NOT NULL,
  `NAMA_BARANG` varchar(50) NOT NULL,
  `Jenis_BARANG` varchar(50) NOT NULL,
  `diskon` char(10) DEFAULT NULL,
  `jumlah` varchar(10) NOT NULL,
  `id_kasir` char(5) DEFAULT NULL,
  `id_member` char(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `supplier`
--

CREATE TABLE `supplier` (
  `id_supplier` char(10) NOT NULL,
  `NAMA_supplier` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `no_hp` char(13) NOT NULL,
  `jenisBrg` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `supplier`
--

INSERT INTO `supplier` (`id_supplier`, `NAMA_supplier`, `alamat`, `email`, `no_hp`, `jenisBrg`) VALUES
('SPPPUV06', 'dfdf', 'dfdf', 'dfdffd', 'dfdf', 'Kain'),
('SPYU35TX', 'sdsd', 'sds', 'sds', 'dsd', 'Kain'),
('SPZ8RPHQ', 'wewe', 'weew', 'wewew', 'ewwe', 'Kain');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin_login`
--
ALTER TABLE `admin_login`
  ADD PRIMARY KEY (`id_login`);

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`KODE_BARANG`);

--
-- Indeks untuk tabel `detailpembelian`
--
ALTER TABLE `detailpembelian`
  ADD PRIMARY KEY (`KODE_DPembelian`);

--
-- Indeks untuk tabel `detailpenjualan`
--
ALTER TABLE `detailpenjualan`
  ADD PRIMARY KEY (`KODE_DP`);

--
-- Indeks untuk tabel `kasir`
--
ALTER TABLE `kasir`
  ADD PRIMARY KEY (`id_kasir`);

--
-- Indeks untuk tabel `laporan`
--
ALTER TABLE `laporan`
  ADD PRIMARY KEY (`KODE_Laporan`);

--
-- Indeks untuk tabel `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`id_member`);

--
-- Indeks untuk tabel `pembelian`
--
ALTER TABLE `pembelian`
  ADD PRIMARY KEY (`KODE_Pembelian`);

--
-- Indeks untuk tabel `pemilik_login`
--
ALTER TABLE `pemilik_login`
  ADD PRIMARY KEY (`id_login`);

--
-- Indeks untuk tabel `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`KODE_Penjualan`);

--
-- Indeks untuk tabel `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id_supplier`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
