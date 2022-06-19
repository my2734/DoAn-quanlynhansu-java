package qlns;

public class nhanvien {
	private String maNhanVien, hoTen, gioiTinh, diaChi,chucVu, maPhongBan;
	private long namSinh,luong;
	
	public nhanvien() {
		this.maNhanVien = new String();
		this.hoTen = new String();
		this.namSinh = 0;
		this.gioiTinh = new String();
		this.diaChi = new String();
		this.luong = 0;
		this.chucVu = new String();
		this.maPhongBan = new String();
	}
	
	public nhanvien(String maNhanVien,String hoTen, long namSinh, String gioiTinh,String diaChi, long luong, String chucVu,String maPhongBan) {
		this.maNhanVien = new String(maNhanVien);
		this.hoTen = new String(hoTen);
		this.namSinh = namSinh;
		this.gioiTinh = new String(gioiTinh);
		this.diaChi = new String(diaChi);
		this.luong = luong;
		this.chucVu = new String(chucVu);
		this.maPhongBan = new String(maPhongBan);
	}
	
	public nhanvien(nhanvien n) {
		this.maNhanVien = new String(n.maNhanVien);
		this.hoTen = new String(n.hoTen);
		this.namSinh = n.namSinh;
		this.gioiTinh = new String(n.gioiTinh);
		this.diaChi = new String(n.diaChi);
		this.luong = n.luong;
		this.chucVu = new String(n.chucVu);
		this.maPhongBan = new String(n.maPhongBan);
	}

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public String getMaPhongBan() {
		return maPhongBan;
	}

	public void setMaPhongBan(String maPhongBan) {
		this.maPhongBan = maPhongBan;
	}

	public long getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(long namSinh) {
		this.namSinh = namSinh;
	}

	public long getLuong() {
		return luong;
	}

	public void setLuong(long luong) {
		this.luong = luong;
	}
	
	
}










