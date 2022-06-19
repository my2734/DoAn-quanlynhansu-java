package qlns;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class updateNhanVien {
	public static void deleteNhanVien(String maNhanVien) {
		Connection conn = JDBCConnection.getJDBCConnection();
		String sql_deleteNhanVien = "delete from nhanvien where maNhanVien = ?";
		try {

			//2 tim ma phong ban
			String maPhongBan = null;
			String sql_selectNhanVien = "select * from nhanvien where maNhanVien = ?";
			PreparedStatement ptmt_selectNhanVien  = conn.prepareStatement(sql_selectNhanVien);
			ptmt_selectNhanVien.setString(1, maNhanVien);
			ResultSet rs_selectNhanVien = ptmt_selectNhanVien.executeQuery();
			while(rs_selectNhanVien.next()) {
				maPhongBan  = rs_selectNhanVien.getString("maPhongBan");
			}
			System.out.println(maPhongBan);
			
			//3 dem so maPhongBan
			String sql_selectNhanVien2 = "select * from nhanvien where maPhongBan = ?";
			PreparedStatement ptmt_selectNhanVien2 = conn.prepareStatement(sql_selectNhanVien2);
			ptmt_selectNhanVien2.setString(1, maPhongBan);
			ResultSet rs_selectNhanVien2 = ptmt_selectNhanVien2.executeQuery();
			int i=0;
			while(rs_selectNhanVien2.next()) {
				i++;
			}
			
			if(i==1) {
				updatePhongBan.deletePhongBan(maPhongBan);
			}
			else {
				PreparedStatement ptmt_deleteNhanVien = conn.prepareStatement(sql_deleteNhanVien);
				ptmt_deleteNhanVien.setString(1, maNhanVien);
				int rs_deleteNhanVien = ptmt_deleteNhanVien.executeUpdate();
				if(rs_deleteNhanVien > 0) {
					System.out.println("Xoa nhan vien thanh cong");
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertNhanVien(nhanvien n) {
		Connection conn = JDBCConnection.getJDBCConnection();
		//1 kiem tra phong ban
		String sql_selectPhongBan = "select * from phongban where maPhongBan = ?";
		try {
			//1 insert vao phong ban
			PreparedStatement ptmt_selecPhongBan = conn.prepareStatement(sql_selectPhongBan);
			ptmt_selecPhongBan.setString(1,n.getMaPhongBan());
			ResultSet rs_selectPhongBan = ptmt_selecPhongBan.executeQuery();
			int i=0;
			while(rs_selectPhongBan.next()) {
				i++;
			}
			if(i==0) {
				phongban b = new phongban(n.getMaPhongBan(),"Tên phòng ban");
				updatePhongBan.insertPhongBan(b);
			}
			
			//2 insert vao nhanvien
			String sql_insertNhanVien  = "insert into nhanvien values (?,?,?,?,?,?,?,?)";
			
			PreparedStatement ptmt_insertNhanVien = conn.prepareStatement(sql_insertNhanVien);
			ptmt_insertNhanVien.setString(1, n.getMaNhanVien());
			ptmt_insertNhanVien.setString(2, n.getHoTen());
			ptmt_insertNhanVien.setLong(3, n.getNamSinh());
			ptmt_insertNhanVien.setString(4, n.getGioiTinh());
			ptmt_insertNhanVien.setString(5, n.getDiaChi());
			ptmt_insertNhanVien.setLong(6, n.getLuong());
			ptmt_insertNhanVien.setString(7, n.getChucVu());
			ptmt_insertNhanVien.setString(8, n.getMaPhongBan());
			
			int rs_insertNhanVien = ptmt_insertNhanVien.executeUpdate();
			if(rs_insertNhanVien > 0) {
				System.out.println("insert nhan vien thanh cong");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void updateNhanVien(nhanvien n) {
		Connection conn = JDBCConnection.getJDBCConnection();
		String maPhongBanMoi = n.getMaPhongBan();
		
		try {
			//1 them maPhongBan neu xuat hien maphongban moi
			String sql_selectPhongBan = "select * from phongban where maPhongBan  = ?";
			PreparedStatement ptmt_selectPhongBan = conn.prepareStatement(sql_selectPhongBan);
			ptmt_selectPhongBan.setString(1, maPhongBanMoi);
			ResultSet rs_selectPhongBan = ptmt_selectPhongBan.executeQuery();
			int i=0;
			while(rs_selectPhongBan.next()) {
				i++;
			}
			if(i==0) { // => chua ton tai ==> them vao maPhongBan
				phongban b = new phongban(maPhongBanMoi,"Tên phòng ban");
				updatePhongBan.insertPhongBan(b);
			}
			
			//2 xet maPhongBan cu
			String sql_selectNhanVien = "select * from nhanvien where maNhanVien = ?";
			PreparedStatement ptmt_selectNhanVien = conn.prepareStatement(sql_selectNhanVien);
			ptmt_selectNhanVien.setString(1, n.getMaNhanVien());
			ResultSet rs_selectNhanVien = ptmt_selectNhanVien.executeQuery();
			String maPhongBanCu = null;
			while(rs_selectNhanVien.next()) {
				maPhongBanCu = rs_selectNhanVien.getString("maPhongBan");
				System.out.println("ma phong ban cu: "+maPhongBanCu);
			}
			
			String sql_selectNhanVien2 = "select * from nhanvien where maPhongBan = ?";
			PreparedStatement ptmt_selectNhanVien2 = conn.prepareStatement(sql_selectNhanVien2);
			ptmt_selectNhanVien2.setString(1, maPhongBanCu);
			ResultSet rs_selectNhanVien2 = ptmt_selectNhanVien2.executeQuery();
			int j=0;
			while(rs_selectNhanVien2.next()) {
				j++;
			}
			
			//3 update nhan vien
			String sql = "update nhanvien set hoTen = ? , namSinh = ? ,  gioiTinh = ?  , "
					+ "	diaChi = ?  ,  luong =?  ,  chucVu = ?  ,  maPhongBan =?"
					+ "    where maNhanVien = ?";
			PreparedStatement ptmt_insertNhanVien = conn.prepareStatement(sql);
			ptmt_insertNhanVien.setString(1, n.getHoTen());
			ptmt_insertNhanVien.setLong(2, n.getNamSinh());
			ptmt_insertNhanVien.setString(3, n.getGioiTinh());
			ptmt_insertNhanVien.setString(4, n.getDiaChi());
			ptmt_insertNhanVien.setLong(5, n.getLuong());
			ptmt_insertNhanVien.setString(6, n.getChucVu());
			ptmt_insertNhanVien.setString(7, n.getMaPhongBan());
			ptmt_insertNhanVien.setString(8, n.getMaNhanVien());
			
			int rs_updateNhanVien = ptmt_insertNhanVien.executeUpdate();
			if(rs_updateNhanVien > 0) {
				System.out.println("Update nhan vien thanh cong");
			}
			
			
			if(j==1) {
				updatePhongBan.deletePhongBan(maPhongBanCu);
				System.out.println("Xoa thanh cong phong ban cu");
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void loadDataNhanVien(ArrayList<nhanvien> nhanvienList) {
		Connection conn = JDBCConnection.getJDBCConnection();
		String sql = "select * from nhanvien";
		try {
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ResultSet rs = ptmt.executeQuery();
			while(rs.next()) {
				String maNhanVien = rs.getString("maNhanVien");
				String hoTen = rs.getString("hoTen");
				long namSinh = rs.getLong("namSinh");
				String gioiTinh = rs.getString("gioiTinh");
				String diaChi = rs.getString("diaChi");
				long luong = rs.getLong("luong");
				String chucVu = rs.getString("chucVu");
				String maPhongBan = rs.getString("maPhongBan");
//				System.out.println(maNhanVien+namSinh+maPhongBan);
				nhanvien n = new nhanvien(maNhanVien,hoTen,namSinh,gioiTinh,diaChi,luong,chucVu,maPhongBan);
				nhanvienList.add(n);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void sortLuong(ArrayList<nhanvien> nhanvienList) {
		Collections.sort(nhanvienList, new Comparator<nhanvien>() {

			@Override
			public int compare(nhanvien a, nhanvien b) {
				// TODO Auto-generated method stub
				if(a.getLuong() > b.getLuong())
					return 1;
				else if(a.getLuong() < b.getLuong()) {
					return -1;
				}
				else return 0;
			}
			
		});
	}
	
	public static void sortNamSinh(ArrayList<nhanvien> nhanvienList) {
		Collections.sort(nhanvienList, new Comparator<nhanvien>() {

			@Override
			public int compare(nhanvien o1, nhanvien o2) {
				// TODO Auto-generated method stub
				if(o1.getNamSinh() > o2.getNamSinh()) {
					return 1;
				}
				else if(o1.getNamSinh() < o2.getNamSinh()) {
					return -1;
				}
				else return 0;
			}
			
		});
	}
	
	public static void main(String[] args) {
//		deleteNhanVien("003");
		
//		nhanvien n = new nhanvien("011","Nguyễn Văn Minh Mẩn55",2003,"Nam","Ninh Kiều, Cần Thơ",3000,"Giám đốc điều hành","kt4");
//		insertNhanVien(n);
		
//		nhanvien n = new nhanvien("006","Nguyễn Văn Minh Mẩn55",2003,"Nam","Ninh Kiều, Cần Thơ",3000,"Giám đốc điều hành","kt4");
//		updateNhanVien(n);
		
		
//		ArrayList<nhanvien> nhanvienList =new ArrayList<nhanvien>();
//		loadDataNhanVien(nhanvienList);
//		System.out.println("sau khi load");
//		for(nhanvien n1 : nhanvienList) {
//			System.out.println(n1.getMaPhongBan()+" "+n1.getLuong());
//		}
//		System.out.println("Sau khi sap xep luong");
//		sortLuong(nhanvienList);
//		for(nhanvien n1 : nhanvienList) {
//			System.out.println(n1.getMaPhongBan()+" "+n1.getLuong());
//		}
		
//		nhanvien n = new nhanvien("002","Nguyễn Văn Minh Mẩn55",1998,"Nam","Ninh Kiều, Cần Thơ",4000,"Giám đốc điều hành","kt1");
//		updateNhanVien(n);
		
	}
}
 