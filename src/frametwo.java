

import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moonc
 */
public class frametwo extends javax.swing.JFrame {

    /**
     * Creates new form frametwo
     */
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet res = null;
    String filename = "area";
    String label_name;
    String strr;
    
    int setDatabase = 0;
    
    public frametwo() {
        initComponents();
        update();
    }
    
    public frametwo(int i)
    {
        initComponents();
         setDatabase = i;
        // String str5 = Integer.toString(i);
        // filename = str5+".txt";
        // JOptionPane.showMessageDialog(null,filename);
         update_label();
         jLabel1.setText(label_name);
        update();
    }
    
    public void update_label()
    {
        if(setDatabase==1)
        {
            label_name = "বাদলগাছী";
        }else if(setDatabase==2)
        {
            label_name = "মথুরাপুর";
        }else if(setDatabase==3)
        {
            label_name = "পাহাড়পুর";
        }
        else if(setDatabase==4)
        {
            label_name = "মিঠাপুর";
        }
        else if(setDatabase==5)
        {
            label_name = "কোলা";
        }
        else if(setDatabase==6)
        {
            label_name = "বিলাসপুর";
        }
        else if(setDatabase==7)
        {
            label_name = "আধাইপুর";
        }
        else if(setDatabase==8)
        {
            label_name = "বালুভরা";
        }else
        {
            label_name = "Nope";
        }
    }

    
      public Connection setConnection()
      {
          Connection Conn = null;
          if(setDatabase == 1)
          {
              try{
                   Conn = Connector.dbConnection1();
                   return Conn;
              }catch(Exception e)
              {
                  JOptionPane.showMessageDialog(null, "Database 1 can't connect");
                  return null;
              }
          }else if(setDatabase == 2)
          {
              try{
                   Conn = Connector.dbConnection2();
                   return Conn;
              }catch(Exception e)
              {
                  JOptionPane.showMessageDialog(null, "Database 2 can't connect");
                  return null;
              }
          }else if(setDatabase==3)
          {
               try{
                   Conn = Connector.dbConnection3();
                   return Conn;
              }catch(Exception e)
              {
                  JOptionPane.showMessageDialog(null, "Database 3 can't connect");
                  return null;
              }
              
          }
          else if(setDatabase==4)
          {
               try{
                   Conn = Connector.dbConnection4();
                   return Conn;
              }catch(Exception e)
              {
                  JOptionPane.showMessageDialog(null, "Database 4 can't connect");
                  return null;
              }
              
          }
          else if(setDatabase==5)
          {
               try{
                   Conn = Connector.dbConnection5();
                   return Conn;
              }catch(Exception e)
              {
                  JOptionPane.showMessageDialog(null, "Database 5 can't connect");
                  return null;
              }
              
          }
          else if(setDatabase==6)
          {
               try{
                   Conn = Connector.dbConnection6();
                   return Conn;
              }catch(Exception e)
              {
                  JOptionPane.showMessageDialog(null, "Database 6 can't connect");
                  return null;
              }
              
          }
          else if(setDatabase==7)
          {
               try{
                   Conn = Connector.dbConnection7();
                   return Conn;
              }catch(Exception e)
              {
                  JOptionPane.showMessageDialog(null, "Database 7 can't connect");
                  return null;
              }
              
          }
          else if(setDatabase==8)
          {
               try{
                   Conn = Connector.dbConnection8();
                   return Conn;
              }catch(Exception e)
              {
                  JOptionPane.showMessageDialog(null, "Database 8 can't connect");
                  return null;
              }
              
          }else{
              return Conn;
          }
          
      }
    
      public void update(){
          con = setConnection();
        String sql = "select * from customerdetail";
        try {
            pst = con.prepareStatement(sql);
            res = pst.executeQuery();
            areaone.setModel(DbUtils.resultSetToTableModel(res));
        } catch (SQLException ex) {
            Logger.getLogger(frametwo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(frametwo.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaone = new javax.swing.JTable();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        imagelabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        openaccount = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        add = new javax.swing.JButton();
        textfield1 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        imagebtn = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Kalpurush", 0, 48)); // NOI18N
        jLabel1.setForeground(java.awt.Color.blue);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 350, 70));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Table :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 70, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Address :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 90, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Village :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 80, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 60, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Customer num:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 30));

        areaone.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer Id", "Name", "Village", "Address", "NID", "Mobile", "table"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        areaone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areaoneMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(areaone);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 740, 500));

        jDesktopPane1.add(imagelabel);
        imagelabel.setBounds(10, 10, 250, 250);

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 270, 270));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Mobile :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 70, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("NID :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 50, 30));

        openaccount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        openaccount.setText("Open Account");
        openaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openaccountActionPerformed(evt);
            }
        });
        jPanel1.add(openaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, -1));

        delete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 90, -1));

        update.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        add.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add.setText("Add To Accout");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        textfield1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textfield1.setForeground(new java.awt.Color(0, 0, 204));
        textfield1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textfield1KeyPressed(evt);
            }
        });
        jPanel1.add(textfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 210, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 650, 310, 30));

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 210, 30));

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 153));
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, 210, 30));

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 204));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 210, 30));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 153));
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 210, 30));

        imagebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        imagebtn.setText("Image");
        imagebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagebtnActionPerformed(evt);
            }
        });
        jPanel1.add(imagebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 90, 30));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 204));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 210, 30));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 153));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 210, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("250px");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 50, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("250px");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 70, 50));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaoneMouseClicked
        int row = areaone.getSelectedRow();
        String cusID = (areaone.getModel().getValueAt(row,0).toString());
        textfield1.setText(cusID);
        String name= (areaone.getModel().getValueAt(row,1).toString());
        jTextField2.setText(name);
        String village = (areaone.getModel().getValueAt(row,2).toString());
        jTextField3.setText(village);
        String address = (areaone.getModel().getValueAt(row,3).toString());
        jTextField4.setText(address);
        String nid = (areaone.getModel().getValueAt(row,4).toString());
        jTextField5.setText(nid);
        String mobile = (areaone.getModel().getValueAt(row,5).toString());
         jTextField6.setText(mobile);
         String table = (areaone.getModel().getValueAt(row, 6).toString());
         jTextField7.setText(table);
         
         
          try{
              con = setConnection();
              String sql = "select Image from customerdetail where customerID = ?";
              pst = con.prepareStatement(sql);
              pst.setString(1,cusID);
              res = pst.executeQuery();
              if(res.next())
              {
                  byte[] imageary = res.getBytes("Image");
                  format = new ImageIcon(imageary);
                  imagelabel.setIcon(format);
                  imagelabel.revalidate();
              }else
              {
                  JOptionPane.showMessageDialog(null,"Nope img");
                  imagelabel.setIcon(null);
                  imagelabel.revalidate();
              }
          }catch(Exception e)
          {
              JOptionPane.showMessageDialog(null,"No Image Available");
               imagelabel.setIcon(null);
                  imagelabel.revalidate();
          }
          
          try {
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(frametwo.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }//GEN-LAST:event_areaoneMouseClicked

    
    
    public void clear()
        {
                textfield1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField1.setText("");
        }
    
    
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            con = setConnection();
            String s0="",s1="",s2="",s3="",s4="",s5="";
            s0 = textfield1.getText();
            s1 = jTextField2.getText();
            s2=jTextField3.getText();
            s3=jTextField4.getText();
            s4=jTextField5.getText();
            s5=jTextField6.getText();
            
            String sql = "update customerdetail set Name = '"+s1+"' , Village = '"+s2+"' , Address = '"+s3+"' , NID = '"+s4+"' , Mobile = '"+s5+"' , Image = ? where customerID = '"+s0+"'";
            pst = con.prepareStatement(sql);
            pst.setBytes(1, person_image);
            pst.execute();
            clear();
            update();
        } catch (SQLException ex) {
            try {
                pst.close();
            } catch (SQLException ex1) {
                Logger.getLogger(frametwo.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(frametwo.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,"Can't Update");
        }
        
      
        
    }//GEN-LAST:event_updateActionPerformed

    
     public void drop_table()
     {
        try {
            con = setConnection();
            String sql = "drop table " + jTextField7.getText() ;
            pst = con.prepareStatement(sql);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(frametwo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(frametwo.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        String cusid = textfield1.getText();
        try{
            con = setConnection();
            String sql = "delete from customerdetail where customerID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1,cusid);
            pst.execute();
            update();
             drop_table();
             clear();
           
             
        }catch(Exception e)
        {
            try {
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(frametwo.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null,"Can't Delete");
        }
        
       
    }//GEN-LAST:event_deleteActionPerformed

    private void openaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openaccountActionPerformed
        String table_name = jTextField7.getText();
        String name1 = jTextField2.getText();
        setVisible(false);
        areaoneaccounts aoc = new areaoneaccounts(table_name,name1,setDatabase);
        aoc.setVisible(true);
       //
//        try{
//            con = Connector.dbConnection();
//            String sql = "select * from " + table_name ;
//            pst = con.prepareStatement(sql);
//            res = pst.executeQuery();
//            jTable1.setModel(DbUtils.resultSetToTableModel(res));
//            
//        }catch(Exception e )
//        {
//            
//        }
    }//GEN-LAST:event_openaccountActionPerformed

    public boolean CheckValidity()
    {
        try {
            con =setConnection();
            String cusidnum = textfield1.getText();
            String sql  = "select * from customerdetail where customerID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, cusidnum);
            res = pst.executeQuery();
            if(res.next())
            {
                textfield1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
 
                return false;
            }else
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(frametwo.class.getName()).log(Level.SEVERE, null, ex);
            return true;
        }
       
    }
    public void write(int num)
    {
        String str = Integer.toString(num);
        try {
            FileOutputStream fos = new FileOutputStream("1.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF(str);
        } catch (IOException ex) {
            Logger.getLogger(frametwo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String read() throws IOException
    {
        String str = "";
        FileInputStream fis = null;          
        try {
            fis = new FileInputStream("1.txt");
            DataInputStream dis = new DataInputStream(fis);
            str = dis.readUTF();
            return str;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frametwo.class.getName()).log(Level.SEVERE, null, ex);
            return str;
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(frametwo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public String create_table(String str)
    {
        try {
            con = setConnection();
            strr="tb"+str;
            String sql = "CREATE  TABLE "+ strr +"(Date 'CHAR' , Memo 'CHAR', Price 'CHAR',Paid 'CHAR', Due 'CHAR')";
            pst = con.prepareStatement(sql);
            pst.execute();
            pst.close();
            return "tb"+str;
        } catch (SQLException ex) {
            Logger.getLogger(frametwo.class.getName()).log(Level.SEVERE, null, ex);
             return str;
        }
 
    }
     
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
          
        
            try{
              con = setConnection(); 
              String str = read();
              int num = Integer.parseInt(str);
              num = num + 1;
              write(num);
               System.out.println(str);
              
              String p0 = "";
               p0 = str;
               String p1 = "";
               p1 = jTextField2.getText();
               String p2 ="";
               p2 = jTextField3.getText();
               String p3 = "";
             p3 = jTextField4.getText();
              String p4 = "";
              p4 = jTextField5.getText();
               String p5 = "";
               p5 = jTextField6.getText();
               String p6 = "";
               
               
               String table_name = create_table(str);
               
              p6 = table_name;
              
            
               //(customerID,Name,Village,Address,NID,Mobile,table)
               
               String sql = "insert into customerdetail values (?,?,?,?,?,?,?,?)";
               pst = con.prepareStatement(sql);
               pst.setString(1,p0);
               pst.setString(2,p1);
               pst.setString(3,p2);
               pst.setString(4,p3);
               pst.setString(5,p4);
               pst.setString(6,p5);
               pst.setString(7,p6);
               pst.setBytes(8, person_image);
               
               pst.execute();
               
                clear();

               update();

           
       }catch(Exception e )
       {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    Logger.getLogger(frametwo.class.getName()).log(Level.SEVERE, null, ex);
                }
           JOptionPane.showMessageDialog(null,"NO insert");
       }
            
       
        
    }//GEN-LAST:event_addActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void imagebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagebtnActionPerformed
       
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filepath = f.getAbsolutePath();
        jTextField1.setText(filepath);
        
        try{
            
            File image = new File(filepath);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
        }catch(Exception e)
        {
            
        }
        
    }//GEN-LAST:event_imagebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       setVisible(false);
       Frameone fone = new Frameone();
       fone.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jTextField3.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void textfield1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jTextField2.requestFocusInWindow();
        }
    }//GEN-LAST:event_textfield1KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jTextField4.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jTextField5.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jTextField6.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jTextField7.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextField6KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frametwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frametwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frametwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frametwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frametwo().setVisible(true);
            }
        });
    }
    
    String filepath;
    private ImageIcon format = null;
   private byte[] person_image = null;
   int s =0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTable areaone;
    private javax.swing.JButton delete;
    private javax.swing.JButton imagebtn;
    private javax.swing.JLabel imagelabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton openaccount;
    private javax.swing.JTextField textfield1;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
