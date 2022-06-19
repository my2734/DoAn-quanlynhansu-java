package qlns;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Choice;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import java.awt.List;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FQuanLyNhanSu extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTextField txtMaNhanVien;
	private JTextField txtHoTen;
	private JTextField txtNamSinh;
	private JTextField txtDiaChi;
	private JTextField txtLuong;
	private JTextField txtChucVu;
	private JTextField txtMaPhongBan;
	private JTable tableNhanVien;
	private JTextField txtMaPhongBan1;
	private JTextField txtTenPhongBan;
	private JTable tablePhongBan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FQuanLyNhanSu frame = new FQuanLyNhanSu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FQuanLyNhanSu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1246, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setBounds(0, 0, 1330, 696);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel.setAutoscrolls(true);
		tabbedPane.addTab("Quản Lý Nhân Sự", new ImageIcon("C:\\Users\\Ngoc My\\eclipse-workspace\\doAn\\qlns\\src\\qlns\\img\\images.jpg"), panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUẢN LÝ NHÂN VIÊN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(548, 11, 230, 50);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nhập mã nhân viên:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(48, 63, 151, 29);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Nhập họ tên:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(48, 108, 151, 29);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Nhập giới tính:");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_2.setBounds(48, 198, 151, 29);
		panel.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Nhập năm sinh:");
		lblNewLabel_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_3.setBounds(48, 153, 151, 29);
		panel.add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("Nhập địa chỉ:");
		lblNewLabel_1_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_4.setBounds(48, 243, 151, 29);
		panel.add(lblNewLabel_1_1_1_4);
		
		JLabel lblNewLabel_1_1_1_5 = new JLabel("Nhập lương:");
		lblNewLabel_1_1_1_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_5.setBounds(48, 288, 151, 29);
		panel.add(lblNewLabel_1_1_1_5);
		
		JLabel lblNewLabel_1_1_1_6 = new JLabel("Nhập chức vụ:");
		lblNewLabel_1_1_1_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_6.setBounds(48, 333, 151, 29);
		panel.add(lblNewLabel_1_1_1_6);
		
		JLabel lblNewLabel_1_1_1_7 = new JLabel("Nhập mã phòng ban:");
		lblNewLabel_1_1_1_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_7.setBounds(48, 378, 151, 29);
		panel.add(lblNewLabel_1_1_1_7);
		
		txtMaNhanVien = new JTextField();
		txtMaNhanVien.setColumns(10);
		txtMaNhanVien.setBounds(201, 63, 200, 28);
		panel.add(txtMaNhanVien);
		
		txtHoTen = new JTextField();
		txtHoTen.setColumns(10);
		txtHoTen.setBounds(201, 108, 200, 28);
		panel.add(txtHoTen);
		
		txtNamSinh = new JTextField();
		txtNamSinh.setColumns(10);
		txtNamSinh.setBounds(201, 153, 200, 28);
		panel.add(txtNamSinh);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setColumns(10);
		txtDiaChi.setBounds(201, 243, 200, 28);
		panel.add(txtDiaChi);
		
		txtLuong = new JTextField();
		txtLuong.setColumns(10);
		txtLuong.setBounds(201, 288, 200, 28);
		panel.add(txtLuong);
		
		txtChucVu = new JTextField();
		txtChucVu.setColumns(10);
		txtChucVu.setBounds(201, 333, 200, 28);
		panel.add(txtChucVu);
		
		txtMaPhongBan = new JTextField();
		txtMaPhongBan.setColumns(10);
		txtMaPhongBan.setBounds(201, 378, 200, 28);
		panel.add(txtMaPhongBan);
		
		JComboBox txtGioiTinh = new JComboBox();
		txtGioiTinh.setModel(new DefaultComboBoxModel(new String[] {"Nam ", "Nữ"}));
		txtGioiTinh.setBounds(201, 199, 87, 28);
		panel.add(txtGioiTinh);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(89, 427, 1116, 146);
		panel.add(scrollPane);
		
		tableNhanVien = new JTable();
		tableNhanVien.setBackground(new Color(240, 255, 240));
		tableNhanVien.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 nh\u00E2n vi\u00EAn", "H\u1ECD t\u00EAn", "N\u0103m sinh", "Gi\u1EDBi t\u00EDnh", "\u0110\u1ECBa ch\u1EC9", "L\u01B0\u01A1ng", "Ch\u1EE9c v\u1EE5", "M\u00E3 ph\u00F2ng ban"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Long.class, String.class, String.class, Long.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableNhanVien.getColumnModel().getColumn(0).setPreferredWidth(90);
		tableNhanVien.getColumnModel().getColumn(1).setPreferredWidth(170);
		tableNhanVien.getColumnModel().getColumn(2).setPreferredWidth(120);
		tableNhanVien.getColumnModel().getColumn(3).setPreferredWidth(120);
		tableNhanVien.getColumnModel().getColumn(4).setPreferredWidth(270);
		tableNhanVien.getColumnModel().getColumn(5).setPreferredWidth(120);
		tableNhanVien.getColumnModel().getColumn(6).setPreferredWidth(120);
		tableNhanVien.getColumnModel().getColumn(7).setPreferredWidth(116);
		scrollPane.setViewportView(tableNhanVien);
		
		JButton btnNewButton = new JButton("Xóa nhân viên");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String maNhanVien = txtMaNhanVien.getText();
				updateNhanVien.deleteNhanVien(maNhanVien);
				
				ArrayList<phongban> phongbanList = new ArrayList<phongban>();
				updatePhongBan.loadDataPhongBan(phongbanList);
				DefaultTableModel model1 = new DefaultTableModel();
				tablePhongBan.getModel();
				model1 = (DefaultTableModel)tablePhongBan.getModel();
				model1.setRowCount(0);
				for(phongban b : phongbanList) { 
					model1.addRow(new Object[] {
							b.getMaPhongBan(),b.getTenPhongBan()
					});
				}
				

				ArrayList<nhanvien> nhanvienList  = new ArrayList<nhanvien>();
				updateNhanVien.loadDataNhanVien(nhanvienList);
				DefaultTableModel model = new DefaultTableModel();
				tableNhanVien.getModel();
				model = (DefaultTableModel)tableNhanVien.getModel();
				model.setRowCount(0);
				for(nhanvien n : nhanvienList) {
					model.addRow(new Object[] {
							n.getMaNhanVien(),n.getHoTen(),n.getNamSinh(),n.getGioiTinh(),n.getDiaChi(),n.getLuong(),n.getChucVu(),n.getMaPhongBan()
					});
				}
				
				JOptionPane.showMessageDialog(null, "Xóa nhân viên thành công");
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setBounds(500, 100, 178, 35);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Thêm nhân viên");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String maNhanVien = txtMaNhanVien.getText();
				String hoTen = txtHoTen.getText();
				long namSinh = Long.parseLong(txtNamSinh.getText());
				String gioiTinh = (String)txtGioiTinh.getSelectedItem();
				String diaChi = txtDiaChi.getText();
				long luong = Long.parseLong(txtLuong.getText());
				String chucVu = txtChucVu.getText();
				String maPhongBan = txtMaPhongBan.getText();
				
				nhanvien n = new nhanvien(maNhanVien,hoTen,namSinh,gioiTinh,diaChi,luong,chucVu,maPhongBan);
				updateNhanVien.insertNhanVien(n);
				ArrayList<phongban> phongbanList = new ArrayList<phongban>();
				updatePhongBan.loadDataPhongBan(phongbanList);
				DefaultTableModel model1 = new DefaultTableModel();
				tablePhongBan.getModel();
				model1 = (DefaultTableModel)tablePhongBan.getModel();
				model1.setRowCount(0);
				for(phongban b : phongbanList) { 
					model1.addRow(new Object[] {
							b.getMaPhongBan(),b.getTenPhongBan()
					});
				}
				JOptionPane.showMessageDialog(null, "Thêm nhân viên thành công");



				
				ArrayList<nhanvien> nhanvienList  = new ArrayList<nhanvien>();
				updateNhanVien.loadDataNhanVien(nhanvienList);
				DefaultTableModel model = new DefaultTableModel();
				tableNhanVien.getModel();
				model = (DefaultTableModel)tableNhanVien.getModel();
				model.setRowCount(0);
				for(nhanvien n1 : nhanvienList) {
					model.addRow(new Object[] {
							n1.getMaNhanVien(),n1.getHoTen(),n1.getNamSinh(),n1.getGioiTinh(),n1.getDiaChi(),n1.getLuong(),n1.getChucVu(),n1.getMaPhongBan()
					});
				}
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setBounds(500, 165, 178, 35);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMaNhanVien.setText("");
				txtHoTen.setText("");
				txtNamSinh.setText("");
				txtDiaChi.setText("");
				txtLuong.setText("");
				txtChucVu.setText("");
				txtMaPhongBan.setText("");
			}
		});
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.setBounds(500, 295, 178, 35);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cập nhật nhân viên");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String maNhanVien = txtMaNhanVien.getText();
				String hoTen = txtHoTen.getText();
				long namSinh = Long.parseLong(txtNamSinh.getText());
				String gioiTinh = (String)txtGioiTinh.getSelectedItem();
				String diaChi = txtDiaChi.getText();
				long luong = Long.parseLong(txtLuong.getText());
				String chucVu = txtChucVu.getText();
				String maPhongBan = txtMaPhongBan.getText();
				
				
				nhanvien n = new nhanvien(maNhanVien,hoTen,namSinh,gioiTinh,diaChi,luong,chucVu,maPhongBan);
				updateNhanVien.updateNhanVien(n);
				ArrayList<phongban> phongbanList = new ArrayList<phongban>();
				updatePhongBan.loadDataPhongBan(phongbanList);
				DefaultTableModel model1 = new DefaultTableModel();
				tablePhongBan.getModel();
				model1 = (DefaultTableModel)tablePhongBan.getModel();
				model1.setRowCount(0);
				for(phongban b : phongbanList) { 
					model1.addRow(new Object[] {
							b.getMaPhongBan(),b.getTenPhongBan()
					});
				}
				
				JOptionPane.showMessageDialog(null, "Cập nhật nhân viên thành công");



				
				ArrayList<nhanvien> nhanvienList  = new ArrayList<nhanvien>();
				updateNhanVien.loadDataNhanVien(nhanvienList);
				DefaultTableModel model = new DefaultTableModel();
				tableNhanVien.getModel();
				model = (DefaultTableModel)tableNhanVien.getModel();
				model.setRowCount(0);
				for(nhanvien n1 : nhanvienList) {
					model.addRow(new Object[] {
							n1.getMaNhanVien(),n1.getHoTen(),n1.getNamSinh(),n1.getGioiTinh(),n1.getDiaChi(),n1.getLuong(),n1.getChucVu(),n1.getMaPhongBan()
					});
				}
			}
		});
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBackground(SystemColor.activeCaption);
		btnNewButton_3.setBounds(500, 230, 178, 35);
		panel.add(btnNewButton_3);
		
		JButton btnSpXpTheo = new JButton("Sắp xếp theo tuổi nhân viên");
		btnSpXpTheo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<nhanvien> nhanvienList  = new ArrayList<nhanvien>();
				updateNhanVien.loadDataNhanVien(nhanvienList);
				updateNhanVien.sortNamSinh(nhanvienList);
				DefaultTableModel model = new DefaultTableModel();
				tableNhanVien.getModel();
				model = (DefaultTableModel)tableNhanVien.getModel();
				model.setRowCount(0);
				for(nhanvien n : nhanvienList) {
					model.addRow(new Object[] {
							n.getMaNhanVien(),n.getHoTen(),n.getNamSinh(),n.getGioiTinh(),n.getDiaChi(),n.getLuong(),n.getChucVu(),n.getMaPhongBan()
					});
				}
			}
		});
		btnSpXpTheo.setForeground(Color.BLACK);
		btnSpXpTheo.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSpXpTheo.setBackground(new Color(143, 188, 143));
		btnSpXpTheo.setBounds(500, 370, 250, 25);
		panel.add(btnSpXpTheo);
		
		JButton btnSpXpTheo_1 = new JButton("Sắp xếp theo lương nhân viên");
		btnSpXpTheo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<nhanvien> nhanvienList  = new ArrayList<nhanvien>();
				updateNhanVien.loadDataNhanVien(nhanvienList);
				updateNhanVien.sortLuong(nhanvienList);
				DefaultTableModel model = new DefaultTableModel();
				tableNhanVien.getModel();
				model = (DefaultTableModel)tableNhanVien.getModel();
				model.setRowCount(0);
				for(nhanvien n : nhanvienList) {
					model.addRow(new Object[] {
							n.getMaNhanVien(),n.getHoTen(),n.getNamSinh(),n.getGioiTinh(),n.getDiaChi(),n.getLuong(),n.getChucVu(),n.getMaPhongBan()
					});
				}
				
			}
		});
		btnSpXpTheo_1.setForeground(Color.BLACK);
		btnSpXpTheo_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSpXpTheo_1.setBackground(new Color(143, 188, 143));
		btnSpXpTheo_1.setBounds(841, 370, 250, 25);
		panel.add(btnSpXpTheo_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Ngoc My\\Desktop\\hello\\images.jpg"));
		lblNewLabel_2.setBounds(841, 103, 250, 221);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Quản Lý Phòng Ban", new ImageIcon("C:\\Users\\Ngoc My\\eclipse-workspace\\doAn\\qlns\\src\\qlns\\img\\images (1).jpg"), panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("QUẢN LÝ PHÒNG BAN");
		lblNewLabel_1.setBounds(548, 11, 230, 50);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_1_8 = new JLabel("Nhập mã phòng ban:");
		lblNewLabel_1_1_1_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_8.setBounds(275, 179, 151, 29);
		panel_1.add(lblNewLabel_1_1_1_8);
		
		JLabel lblNewLabel_1_1_1_9 = new JLabel("Nhập tên phòng ban: ");
		lblNewLabel_1_1_1_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_9.setBounds(275, 238, 151, 29);
		panel_1.add(lblNewLabel_1_1_1_9);
		
		txtMaPhongBan1 = new JTextField();
		txtMaPhongBan1.setColumns(10);
		txtMaPhongBan1.setBounds(436, 180, 200, 28);
		panel_1.add(txtMaPhongBan1);
		
		txtTenPhongBan = new JTextField();
		txtTenPhongBan.setColumns(10);
		txtTenPhongBan.setBounds(436, 239, 200, 28);
		panel_1.add(txtTenPhongBan);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(275, 348, 578, 192);
		panel_1.add(scrollPane_1);
		
		tablePhongBan = new JTable();
		tablePhongBan.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"M\u00E3 ph\u00F2ng ban", "T\u00EAn ph\u00F2ng ban"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tablePhongBan.getColumnModel().getColumn(0).setPreferredWidth(200);
		tablePhongBan.getColumnModel().getColumn(1).setPreferredWidth(378);
		scrollPane_1.setViewportView(tablePhongBan);
		
		JButton btnNewButton_4 = new JButton("Clear");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMaPhongBan1.setText("");
				txtTenPhongBan.setText("");
			}
		});
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.setBackground(SystemColor.activeCaption);
		btnNewButton_4.setBounds(885, 401, 178, 35);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Xóa phòng ban");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String maPhongBan = txtMaPhongBan1.getText();
				updatePhongBan.deletePhongBan(maPhongBan);
				
				ArrayList<phongban> phongbanList = new ArrayList<phongban>();
				updatePhongBan.loadDataPhongBan(phongbanList);
				DefaultTableModel model1 = new DefaultTableModel();
				tablePhongBan.getModel();
				model1 = (DefaultTableModel)tablePhongBan.getModel();
				model1.setRowCount(0);
				for(phongban b1 : phongbanList) { 
					model1.addRow(new Object[] {
							b1.getMaPhongBan(),b1.getTenPhongBan()
					});
				}
				
				
				ArrayList<nhanvien> nhanvienList  = new ArrayList<nhanvien>();
				updateNhanVien.loadDataNhanVien(nhanvienList);
				DefaultTableModel model = new DefaultTableModel();
				tableNhanVien.getModel();
				model = (DefaultTableModel)tableNhanVien.getModel();
				model.setRowCount(0);
				for(nhanvien n1 : nhanvienList) {
					model.addRow(new Object[] {
							n1.getMaNhanVien(),n1.getHoTen(),n1.getNamSinh(),n1.getGioiTinh(),n1.getDiaChi(),n1.getLuong(),n1.getChucVu(),n1.getMaPhongBan()
					});
				}
				
				JOptionPane.showMessageDialog(null, "Xóa phòng ban thành công");
			}
		});
		btnNewButton_5.setForeground(Color.BLACK);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5.setBackground(SystemColor.activeCaption);
		btnNewButton_5.setBounds(885, 175, 178, 35);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Thêm phòng ban");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String maPhongBan = txtMaPhongBan1.getText();
				String tenPhongBan = txtTenPhongBan.getText();
				phongban b = new phongban(maPhongBan,tenPhongBan);
				updatePhongBan.insertPhongBan(b);
				
				ArrayList<phongban> phongbanList = new ArrayList<phongban>();
				updatePhongBan.loadDataPhongBan(phongbanList);
				DefaultTableModel model1 = new DefaultTableModel();
				tablePhongBan.getModel();
				model1 = (DefaultTableModel)tablePhongBan.getModel();
				model1.setRowCount(0);
				for(phongban b2 : phongbanList) { 
					model1.addRow(new Object[] {
							b2.getMaPhongBan(),b2.getTenPhongBan()
					});
				}
				
				JOptionPane.showMessageDialog(null, "Thêm phòng ban thành công");
			}
		});
		btnNewButton_6.setForeground(Color.BLACK);
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_6.setBackground(SystemColor.activeCaption);
		btnNewButton_6.setBounds(885, 250, 178, 35);
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Cập nhật phòng ban");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String maPhongBan = txtMaPhongBan1.getText();
				String tenPhongBan = txtTenPhongBan.getText();
				
				phongban x = new phongban(maPhongBan,tenPhongBan);
				updatePhongBan.updatePhongBan(x);
				
				ArrayList<phongban> phongbanList = new ArrayList<phongban>();
				updatePhongBan.loadDataPhongBan(phongbanList);
				DefaultTableModel model1 = new DefaultTableModel();
				tablePhongBan.getModel();
				model1 = (DefaultTableModel)tablePhongBan.getModel();
				model1.setRowCount(0);
				for(phongban b : phongbanList) { 
					model1.addRow(new Object[] {
							b.getMaPhongBan(),b.getTenPhongBan()
					});
				}
				
				JOptionPane.showMessageDialog(null, "Cập nhật phòng ban thành công");

			}
		});
		btnNewButton_7.setForeground(Color.BLACK);
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_7.setBackground(SystemColor.activeCaption);
		btnNewButton_7.setBounds(885, 320, 178, 35);
		panel_1.add(btnNewButton_7);
		
		
		ArrayList<phongban> phongbanList = new ArrayList<phongban>();
		updatePhongBan.loadDataPhongBan(phongbanList);
		DefaultTableModel model1 = new DefaultTableModel();
		tablePhongBan.getModel();
		model1 = (DefaultTableModel)tablePhongBan.getModel();
		model1.setRowCount(0);
		for(phongban b : phongbanList) { 
			model1.addRow(new Object[] {
					b.getMaPhongBan(),b.getTenPhongBan()
			});
		}
		
		
		ArrayList<nhanvien> nhanvienList  = new ArrayList<nhanvien>();
		updateNhanVien.loadDataNhanVien(nhanvienList);
		DefaultTableModel model = new DefaultTableModel();
		tableNhanVien.getModel();
		model = (DefaultTableModel)tableNhanVien.getModel();
		model.setRowCount(0);
		for(nhanvien n : nhanvienList) {
			model.addRow(new Object[] {
					n.getMaNhanVien(),n.getHoTen(),n.getNamSinh(),n.getGioiTinh(),n.getDiaChi(),n.getLuong(),n.getChucVu(),n.getMaPhongBan()
			});
		}
		
		
	}
}
