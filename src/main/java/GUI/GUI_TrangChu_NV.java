package GUI;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

//import entity.NhanVien;
public class GUI_TrangChu_NV extends javax.swing.JFrame {

//    public GUI_QUANLY gui_quanly; 
//    public QuanLyNhanVien gui_QuanLyNV; 
//    public GUI_BaoCao gui_baocao; 
//    public QuanLyNhanVien gui_quanlynhanvien; 
//    public GUI_TT gui_ThongTin;
    public GUI_DatVe gui_Datve; 
    public GUI_CacVeNgayDi gui_CacVeNgayDi; 
//    public GUI_ThongTinKhachHang gui_ThongTinKhachHang; 

    


    public GUI_TrangChu_NV() {
        initComponents();

//        gui_quanly = new GUI_QUANLY(); 
//        gui_quanlynhanvien = new QuanLyNhanVien(); 
//        gui_baocao = new GUI_BaoCao(); 
//        gui_ThongTin = new GUI_TT(); 
            gui_Datve = new GUI_DatVe(); 
            gui_CacVeNgayDi = new GUI_CacVeNgayDi(); 
//            gui_ThongTinKhachHang = new GUI_ThongTinKhachHang(); 
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void initComponents() {

        PnlChuyenHuong = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuBar1.setBackground(new Color(0x30A0B0));
       

        menuTT = new javax.swing.JMenu();
        menuQuanLyDatVe = new javax.swing.JMenu();
        menuQuanLyKhachHang = new javax.swing.JMenu();
        menuBaoCao = new javax.swing.JMenu();
        menuTK = new javax.swing.JMenu();
        menuQuanLyChuyenBay = new javax.swing.JMenu();

        menuDatVe = new javax.swing.JMenuItem();
        menuThongTinKH = new javax.swing.JMenuItem();
        menuXemBaoCao = new javax.swing.JMenuItem();
        menuQuanLiTK = new javax.swing.JMenuItem();
        menuNhapVe = new javax.swing.JMenuItem();
        menuTrangChu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlChuyenHuong.setBackground(new java.awt.Color(255, 255, 255));
        PnlChuyenHuong.setLayout(new java.awt.BorderLayout());
        getContentPane().add(PnlChuyenHuong, java.awt.BorderLayout.CENTER);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setMinimumSize(new java.awt.Dimension(222, 52));
        jPanel5.setPreferredSize(new java.awt.Dimension(302, 52));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 5));

        btnDangXuat.setBackground(new java.awt.Color(15, 145, 239));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setMargin(new java.awt.Insets(1, 14, 1, 14));
        btnDangXuat.setPreferredSize(new java.awt.Dimension(120, 40));
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnDangXuatActionPerformed(evt);
            }
        });
        jPanel5.add(btnDangXuat);

        btnThoat.setBackground(new java.awt.Color(15, 145, 239));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Trở về");
        btnThoat.setMargin(new java.awt.Insets(1, 14, 1, 14));
        btnThoat.setPreferredSize(new java.awt.Dimension(120, 40));
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnThoatActionPerformed(evt);
            }
        });
        jPanel5.add(btnThoat);
        jPanel5.add(filler1);

        getContentPane().add(jPanel5, java.awt.BorderLayout.SOUTH);

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBar1.setMargin(new java.awt.Insets(0, 8, 0, 8));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(23941, 50));

        // Trang Chu ///////////////////////////////////////////////////////////////////////////////////////
        menuTT.setForeground(new java.awt.Color(15, 145, 239));
        menuTT.setText("Trang chủ");
        menuTT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuTT.setMargin(new java.awt.Insets(3, 10, 3, 10));

        menuTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuTrangChu.setText("Trang Chủ");
        menuTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTTActionPerformed(evt);
            }
        });
        menuTT.add(menuTrangChu);
        jMenuBar1.add(menuTT);

        // Đặt vé///////////////////////////////////////////////////////////////////////////////////////
        menuQuanLyDatVe.setForeground(new java.awt.Color(15, 145, 239));
        menuQuanLyDatVe.setText("Quản lý đặt vé");
        menuQuanLyDatVe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuQuanLyDatVe.setMargin(new java.awt.Insets(3, 10, 3, 10));

        menuDatVe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuDatVe.setText("Đặt vé");
        menuDatVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                menuDatVeActionPerformed(evt);
            }
        });
        menuQuanLyDatVe.add(menuDatVe);
        jMenuBar1.add(menuQuanLyDatVe);

        // Xem thông tin (ql khách hàng) ///////////////////////////////////////////////////////////////////////////////////////
        menuQuanLyKhachHang.setForeground(new java.awt.Color(15, 145, 239));
        menuQuanLyKhachHang.setText("Quản lý khách hàng");
        menuQuanLyKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuQuanLyKhachHang.setMargin(new java.awt.Insets(3, 10, 3, 10));

        menuThongTinKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuThongTinKH.setText("Xem thông tin");
        menuThongTinKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuXemThongTinActionPerformed(evt);
            }
        });
        menuQuanLyKhachHang.add(menuThongTinKH);
        jMenuBar1.add(menuQuanLyKhachHang);

        // nhập vé máy bay///////////////////////////////////////////////////////////////////////////////////////
        menuQuanLyChuyenBay.setForeground(new java.awt.Color(15, 145, 239));
        menuQuanLyChuyenBay.setText("Quản lý chuyến bay");
        menuQuanLyChuyenBay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuQuanLyChuyenBay.setMargin(new java.awt.Insets(3, 10, 3, 10));

        menuNhapVe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuNhapVe.setText("Nhập vé máy bay");
        menuNhapVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNhapVeMayBayActionPerformed(evt);
            }
        });
        menuQuanLyChuyenBay.add(menuNhapVe);
        jMenuBar1.add(menuQuanLyChuyenBay);

        // báo cáo///////////////////////////////////////////////////////////////////////////////////////
        menuBaoCao.setForeground(new java.awt.Color(15, 145, 239));
        menuBaoCao.setText("Báo cáo");
        menuBaoCao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuBaoCao.setMargin(new java.awt.Insets(3, 10, 3, 10));

        menuXemBaoCao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuXemBaoCao.setText("Xem báo cáo");
        menuXemBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuXemBaoCaoActionPerformed(evt);
            }
        });
        menuBaoCao.add(menuXemBaoCao);
        jMenuBar1.add(menuBaoCao);

        // thông kê ///////////////////////////////////////////////////////////////////////////////////////
        menuTK.setForeground(new java.awt.Color(15, 145, 239));
        menuTK.setText("Thống kê");
        menuTK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuTK.setMargin(new java.awt.Insets(3, 10, 3, 10));

        menuQuanLiTK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuQuanLiTK.setText("Quản lí thông kê");
        menuQuanLiTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQuanLiTKActionPerformed(evt);
            }
        });
        menuTK.add(menuQuanLiTK);
//        jMenuBar1.add(menuTK);

        setJMenuBar(jMenuBar1);
        pack();
    }

    public void clearSelectedMenu() {
        menuTT.setSelected(false);
        menuQuanLyDatVe.setSelected(false);
        menuQuanLyKhachHang.setSelected(false);
        menuBaoCao.setSelected(false);
        menuTK.setSelected(false);
    }

    public void thayDoiPanelChinh(JComponent component, JMenuItem menu) {
        clearSelectedMenu();
        menu.setSelected(true);
        this.PnlChuyenHuong.removeAll();
        this.PnlChuyenHuong.repaint();
        this.PnlChuyenHuong.revalidate();

        this.PnlChuyenHuong.add(component);
        this.PnlChuyenHuong.repaint();
        this.PnlChuyenHuong.revalidate();
    }

    /// su kien item menu
    private void menuTTActionPerformed(java.awt.event.ActionEvent evt) {
		this.thayDoiPanelChinh(gui_Datve, menuTrangChu);
    }


    private void menuXemThongTinActionPerformed(java.awt.event.ActionEvent evt) {
//        this.thayDoiPanelChinh(gui_ThongTinKhachHang, menuThongTinKH);
    }

    private void menuNhapVeMayBayActionPerformed(java.awt.event.ActionEvent evt) {
  //      this.thayDoiPanelChinh(gui_CacVeNgayDi, ql);
    }

    private void menuXemBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {
        this.thayDoiPanelChinh(gui_CacVeNgayDi, menuXemBaoCao);
    }

    private void menuQuanLiTKActionPerformed(java.awt.event.ActionEvent evt) {
//        this.thayDoiPanelChinh(gui_ThongKe, menuQuanLiTK);
    }

    /// su kien button 
//    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {     
//    	int confirmed = JOptionPane.showConfirmDialog(this,
//                "Bạn có chắc chắn muốn đăng xuất không?", "Xác nhận đăng xuất",
//                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//    	if (confirmed == JOptionPane.YES_OPTION) {
//    		this.dispose(); 
//    		gui_login = new GUI_Login();
//    		gui_login.setVisible(true);
//    	}
//    }
    
//    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {
//        this.thayDoiPanelChinh(gui_BTN, menuTrangChu);
//    }
    // Variables
    private javax.swing.JPanel PnlChuyenHuong;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnThoat;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JMenu menuQuanLyDatVe;
    private javax.swing.JMenu menuBaoCao;
    private javax.swing.JMenu menuQuanLyKhachHang;
    private javax.swing.JMenu menuTK;
    private javax.swing.JMenu menuTT;
    private javax.swing.JMenu menuQuanLyChuyenBay;
    private javax.swing.JMenuItem menuThongTinKH;
    private javax.swing.JMenuItem menuQuanLiTK;
    private javax.swing.JMenuItem menuDatVe;
    private javax.swing.JMenuItem menuNhapVe;
    private javax.swing.JMenuItem menuTrangChu;
    private javax.swing.JMenuItem menuXemBaoCao;

}
