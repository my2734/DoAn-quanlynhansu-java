package qlns;

public class phongban {
	private String maPhongBan,tenPhongBan;
	
	public phongban() {
		this.maPhongBan = new String();
		this.tenPhongBan = new String();
	}
	
	public phongban(String maPhongBan, String tenPhongBan) {
		this.maPhongBan = maPhongBan;
		this.tenPhongBan = tenPhongBan;
	}
	
	public phongban(phongban p) {
		this.maPhongBan = p.maPhongBan;
		this.tenPhongBan = p.tenPhongBan;
	}

	public String getMaPhongBan() {
		return maPhongBan;
	}

	public void setMaPhongBan(String maPhongBan) {
		this.maPhongBan = maPhongBan;
	}

	public String getTenPhongBan() {
		return tenPhongBan;
	}

	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}
	
	
}
