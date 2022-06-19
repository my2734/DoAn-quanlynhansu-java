package qlns;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class updatePhongBan {
	public static void deletePhongBan(String maPhongBan) {
		Connection conn = JDBCConnection.getJDBCConnection();
		try {
			//1 delete nhanvien co maPhongBan
			String sql_deleteNhanVien = "delete from nhanvien where maPhongBan = ?";
			PreparedStatement ptmt_deleteNhanVien = conn.prepareStatement(sql_deleteNhanVien);
			ptmt_deleteNhanVien.setString(1, maPhongBan);
			int rs_deleteNhanVien = ptmt_deleteNhanVien.executeUpdate();
			if(rs_deleteNhanVien > 0) {
				System.out.println("Xoa nhan vien thanh cong");
			}
			
			//2. delete phongban co maPhongBan
			String sql_deletePhongBan = "delete from phongban where maPhongBan = ?";
			PreparedStatement ptmt_deletePhongBan = conn.prepareStatement(sql_deletePhongBan);
			ptmt_deletePhongBan.setString(1, maPhongBan);
			int rs_deletePhongBan = ptmt_deletePhongBan.executeUpdate();
			if(rs_deletePhongBan > 0) {
				System.out.println("Xoa phong ban thanh cong");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertPhongBan(phongban b) {
		Connection conn = JDBCConnection.getJDBCConnection();
		String sql_insertPhongBan = "insert into phongban values (?,?)";
		try {
			PreparedStatement ptmt_insertPhongBan = conn.prepareStatement(sql_insertPhongBan);
			ptmt_insertPhongBan.setString(1,b.getMaPhongBan());
			ptmt_insertPhongBan.setString(2, b.getTenPhongBan());
			int rs_insertPhongBan = ptmt_insertPhongBan.executeUpdate();
			if(rs_insertPhongBan > 0) {
				System.out.println("insert thanh cong");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void updatePhongBan(phongban b) { // doi ten phong ban
		Connection conn = JDBCConnection.getJDBCConnection();
		String sql_updatePhongBan = "update phongban set tenPhongBan = ? where maPhongBan = ?";
		try {
			PreparedStatement ptmt_updatePhongBan = conn.prepareStatement(sql_updatePhongBan);
			ptmt_updatePhongBan.setString(1, b.getTenPhongBan());
			ptmt_updatePhongBan.setString(2,b.getMaPhongBan());
			int rs_updatePhongBan = ptmt_updatePhongBan.executeUpdate();
			if(rs_updatePhongBan > 0) {
				System.out.println("Update phong ban thanh cong");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void loadDataPhongBan(ArrayList<phongban> phongbanList) {
		Connection conn = JDBCConnection.getJDBCConnection();
		String sql = "select * from phongban";
		try {
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ResultSet rs = ptmt.executeQuery();
			while(rs.next()) {
				String maPhongBan = rs.getString("maPhongBan");
				String tenPhongBan = rs.getString("tenPhongBan");
				System.out.println(maPhongBan + tenPhongBan);
				phongban b = new phongban(maPhongBan,tenPhongBan);
				phongbanList.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		deletePhongBan("kt1");
		
//		phongban b = new phongban("ns","Phòng nhân sự");
//		insertPhongBan(b);
		
//		phongban b = new phongban("ns","Phòng nhân sự 1");
//		updatePhongBan(b);
//		ArrayList<phongban> phongbanList = new ArrayList<phongban>();
//		loadDataPhongBan(phongbanList);
//		System.out.println("Sau khi load");
//		for( phongban b : phongbanList) {
//			System.out.println(b.getMaPhongBan()+b.getTenPhongBan());
//		}
	}
}
