/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_agency;
import java.awt.Color;
import java.sql.*;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Dell
 */
public class member_details extends javax.swing.JFrame {
Connection con=null;
static int a=0;
Statement stmt = null;
    ResultSet rs = null;
    String query="select * from members ;";
    /**
     * Creates new form member_details
     */
    public member_details() {
        initComponents();
        
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        address = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        female = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        options = new javax.swing.JComboBox<>();
        password = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        mob_no = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        doj = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        address.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        address.setForeground(new java.awt.Color(51, 51, 255));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Back to main menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Username");
        jLabel1.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Mobile Number");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Address");

        name.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        name.setForeground(new java.awt.Color(51, 51, 255));

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        female.setForeground(new java.awt.Color(51, 51, 255));
        female.setText("Female");

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 255));
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Date of joining");

        search.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        search.setText("Type here");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        options.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        options.setForeground(new java.awt.Color(51, 51, 255));
        options.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Membership_id", "Username" }));

        password.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        password.setForeground(new java.awt.Color(51, 51, 255));

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        male.setForeground(new java.awt.Color(51, 51, 255));
        male.setText("Male");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name");

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Search");

        username.setEditable(false);
        username.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        username.setForeground(new java.awt.Color(51, 51, 255));

        id.setEditable(false);
        id.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        id.setForeground(new java.awt.Color(51, 51, 255));

        mob_no.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        mob_no.setForeground(new java.awt.Color(51, 51, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Membership Id");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password");
        jLabel2.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Gender");

        doj.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        doj.setForeground(new java.awt.Color(51, 51, 255));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("First ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        next.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        next.setForeground(new java.awt.Color(51, 51, 255));
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 255));
        jButton5.setText("Previous");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 255));
        jButton6.setText("Last");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jButton1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(next)
                                .addGap(57, 57, 57)
                                .addComponent(jButton5)
                                .addGap(34, 34, 34)
                                .addComponent(jButton6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(name)
                                            .addComponent(doj)
                                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mob_no, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(male)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(female)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel9)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(doj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mob_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(male)
                            .addComponent(female))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(next)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(64, 64, 64)
                .addComponent(jButton2)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
//      stmt=con.createStatement();
//            rs=stmt.executeQuery(query);
  
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        staff_main_page obj=new staff_main_page();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try
        {

            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/agencytravel","root","");

            String o=(String)options.getSelectedItem();
            String s= search.getText();
            String query = "select * from members where "+o+"='"+search.getText()+"' ;";
            JOptionPane.showMessageDialog(null, "Final Query :"+query);
            Statement stmt=con.createStatement();
            rs=stmt.executeQuery(query);
            int a=0;
            if(rs.next())
            {
                
                username.setText(rs.getString("username"));
                id.setText(rs.getString("membership_id"));
                doj.setText(rs.getString("date_of_joining"));
                address.setText(rs.getString("address"));
                password.setText(rs.getString("password"));
                name.setText(rs.getString("name"));
                String ab=rs.getString("gender");
                if(ab.compareTo("male")==0)
                {
                    male.setSelected(true);
                }
                else
                if(ab.compareTo("female")==0)
                {
                    female.setSelected(true);
                }
                mob_no.setText(rs.getString("mobile_no"));
                a++;
               
            }
            if(a==0)
            {
                
                JOptionPane.showMessageDialog(null, "No record found");
            }
            
            stmt.close();
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try
        {

            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/agencytravel","root","");

           
            stmt=con.createStatement();
            rs=stmt.executeQuery(query);
            a=1;
            if(rs.next())
            {
               
                username.setText(rs.getString("username"));
                id.setText(rs.getString("membership_id"));
                doj.setText(rs.getString("date_of_joining"));
                address.setText(rs.getString("address"));
                password.setText(rs.getString("password"));
                name.setText(rs.getString("name"));
                String ab=rs.getString("gender");
                if(ab.compareTo("male")==0)
                {
                    male.setSelected(true);
                }
                else
                if(ab.compareTo("female")==0)
                {
                    female.setSelected(true);
                }
                mob_no.setText(rs.getString("mobile_no"));

               
            }
            if(a==0)
            {
                
                JOptionPane.showMessageDialog(null, "No record found");
            }
//            rs.close();
//            stmt.close();
//            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
       try
        {

            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/agencytravel","root","");

            if(rs.next())
            {
                
                username.setText(rs.getString("username"));
                id.setText(rs.getString("membership_id"));
                doj.setText(rs.getString("date_of_joining"));
                address.setText(rs.getString("address"));
                password.setText(rs.getString("password"));
                name.setText(rs.getString("name"));
                String ab=rs.getString("gender");

                if(ab.compareTo("male")==0)
                {
                    male.setSelected(true);
                }
                else
                if(ab.compareTo("female")==0)
                {
                    female.setSelected(true);
                }
                mob_no.setText(rs.getString("mobile_no"));
                 

               
            }
            else {
                JOptionPane.showMessageDialog(null, "You are at last record position");
            }
             
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_nextActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try
        {

            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/agencytravel","root","");

            
//            Statement stmt1=con.createStatement();
//            ResultSet rs=stmt.executeQuery(query);
            
            if(rs.previous())
            {
                
                username.setText(rs.getString("username"));
                id.setText(rs.getString("membership_id"));
                doj.setText(rs.getString("date_of_joining"));
                address.setText(rs.getString("address"));
                password.setText(rs.getString("password"));
                name.setText(rs.getString("name"));
                String ab=rs.getString("gender");

                if(ab.compareTo("male")==0)
                {
                    male.setSelected(true);
                }
                else
                if(ab.compareTo("female")==0)
                {
                    female.setSelected(true);
                }
                mob_no.setText(rs.getString("mobile_no"));
                
               
            }
            else {
                JOptionPane.showMessageDialog(null, "You are at First record position");
            }
                
//            rs.close();
//            stmt.close();
//            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        try
        {

            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/agencytravel","root","");

            
             stmt=con.createStatement();
             rs=stmt.executeQuery(query);
            
            if(rs.first())
            {
                
                username.setText(rs.getString("username"));
                id.setText(rs.getString("membership_id"));
                doj.setText(rs.getString("date_of_joining"));
                address.setText(rs.getString("address"));
                password.setText(rs.getString("password"));
                name.setText(rs.getString("name"));
                String ab=rs.getString("gender");

                if(ab.compareTo("male")==0)
                {
                    male.setSelected(true);
                }
                else
                if(ab.compareTo("female")==0)
                {
                    female.setSelected(true);
                }
                mob_no.setText(rs.getString("mobile_no"));

               a = 1;
            }
            else {
                JOptionPane.showMessageDialog(null, "You are at First record position");
            }
                
            
           
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
                try
        {

            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/agencytravel","root","");

            
             stmt=con.createStatement();
             rs=stmt.executeQuery(query);
            
            if(rs.last())
            {
                
                username.setText(rs.getString("username"));
                id.setText(rs.getString("membership_id"));
                doj.setText(rs.getString("date_of_joining"));
                address.setText(rs.getString("address"));
                password.setText(rs.getString("password"));
                name.setText(rs.getString("name"));
                String ab=rs.getString("gender");

                if(ab.compareTo("male")==0)
                {
                    male.setSelected(true);
                }
                else
                if(ab.compareTo("female")==0)
                {
                    female.setSelected(true);
                }
                mob_no.setText(rs.getString("mobile_no"));

               a = 1;
            }
            else {
                JOptionPane.showMessageDialog(null, "You are at First record position");
            }
                
            
           
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(member_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(member_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(member_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(member_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new member_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField doj;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField mob_no;
    private javax.swing.JTextField name;
    private javax.swing.JButton next;
    private javax.swing.JComboBox<String> options;
    private javax.swing.JTextField password;
    private javax.swing.JTextField search;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}