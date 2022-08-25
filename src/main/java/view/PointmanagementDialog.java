/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Grade;
import model.GradeDAO;
import model.Student;
import model.StudentDao;

/**
 *
 * @author This PC
 */
public class PointmanagementDialog extends javax.swing.JDialog {
 
    StudentDao sDAO=new StudentDao();
    GradeDAO dDAO=new GradeDAO();
    int index=0;
    /**
     * Creates new form PointmanagementDialog
     */
    public PointmanagementDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        TxtIDStudent.setEditable(false);
        TxtNameStudent.setEditable(false);
    }
    public void fillDataTable(){
        DefaultTableModel model= (DefaultTableModel)tbPointstudent.getModel(); 
       model.setRowCount(0);
       for (Grade g : dDAO.getAllGrades()){
           Object rowData[]=new Object[7];
           rowData[0]= g.getS().getID();
           rowData[1]= g.getS().getName();
           rowData[2]= g.getMath();
           rowData[3]= g.getPhysics();
           rowData[4]= g.getChemistry();
           rowData[5]= g.getGPA();
           rowData[6]= g.getRankedacademic();
           model.addRow(rowData);
           
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

        lblGPA = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        TxtIDStudent = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TxtNameStudent = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        TxtMath = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        TxtPhysics = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        TxtChemistry = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        BtnCreate = new javax.swing.JButton();
        BtnSave = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPointstudent = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        TxtFindstudentid = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnFrist = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 102));

        lblGPA.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblGPA.setText("0.0");

        jPanel5.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel5.setLayout(new java.awt.BorderLayout(0, 4));

        TxtIDStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIDStudentActionPerformed(evt);
            }
        });
        jPanel5.add(TxtIDStudent, java.awt.BorderLayout.CENTER);

        jLabel2.setBackground(new java.awt.Color(51, 255, 204));
        jLabel2.setForeground(new java.awt.Color(51, 255, 204));
        jLabel2.setText("ID");
        jPanel5.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel6.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel6.setLayout(new java.awt.BorderLayout(0, 4));

        jLabel3.setText("Name");
        jPanel6.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        TxtNameStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNameStudentActionPerformed(evt);
            }
        });
        jPanel6.add(TxtNameStudent, java.awt.BorderLayout.CENTER);

        jPanel7.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel7.setLayout(new java.awt.BorderLayout(0, 4));

        TxtMath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMathActionPerformed(evt);
            }
        });
        jPanel7.add(TxtMath, java.awt.BorderLayout.CENTER);

        jLabel4.setBackground(new java.awt.Color(51, 255, 204));
        jLabel4.setForeground(new java.awt.Color(51, 255, 204));
        jLabel4.setText("Math");
        jPanel7.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jPanel8.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel8.setLayout(new java.awt.BorderLayout(0, 4));

        jLabel5.setText("Physics");
        jPanel8.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        TxtPhysics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPhysicsActionPerformed(evt);
            }
        });
        jPanel8.add(TxtPhysics, java.awt.BorderLayout.CENTER);

        jPanel9.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel9.setLayout(new java.awt.BorderLayout(0, 4));

        jLabel6.setText("Chemistry");
        jPanel9.add(jLabel6, java.awt.BorderLayout.PAGE_START);

        TxtChemistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtChemistryActionPerformed(evt);
            }
        });
        jPanel9.add(TxtChemistry, java.awt.BorderLayout.CENTER);

        jPanel10.setBackground(new java.awt.Color(102, 255, 204));

        BtnCreate.setBackground(new java.awt.Color(51, 255, 51));
        BtnCreate.setText("Create");
        BtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateActionPerformed(evt);
            }
        });

        BtnSave.setBackground(new java.awt.Color(255, 255, 51));
        BtnSave.setText("Save");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        BtnUpdate.setBackground(new java.awt.Color(51, 255, 204));
        BtnUpdate.setText("Update");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        BtnDelete.setBackground(new java.awt.Color(255, 51, 51));
        BtnDelete.setText("Delete");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCreate)
                    .addComponent(BtnUpdate))
                .addGap(55, 55, 55)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnDelete)
                    .addComponent(BtnSave))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCreate)
                    .addComponent(BtnSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnUpdate)
                    .addComponent(BtnDelete))
                .addGap(17, 17, 17))
        );

        tbPointstudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Math", "Physics", "Chemisty", "GPA", "Ranked "
            }
        ));
        tbPointstudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPointstudentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbPointstudent);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel11.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel11.setLayout(new java.awt.BorderLayout(0, 4));

        jLabel7.setText("StudentID");
        jPanel11.add(jLabel7, java.awt.BorderLayout.PAGE_START);

        TxtFindstudentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFindstudentidActionPerformed(evt);
            }
        });
        jPanel11.add(TxtFindstudentid, java.awt.BorderLayout.CENTER);

        btnsearch.setBackground(new java.awt.Color(255, 0, 255));
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addComponent(btnsearch)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(95, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(btnsearch)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("GPA :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setText("Point    management");

        btnFrist.setText("<");
        btnFrist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFristActionPerformed(evt);
            }
        });

        btnBack.setText("<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(487, 487, 487)
                        .addComponent(btnFrist, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(461, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(266, 266, 266)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFrist)
                    .addComponent(btnBack)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(lblGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jLabel9)
                    .addContainerGap(621, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtIDStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIDStudentActionPerformed

    private void TxtNameStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNameStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNameStudentActionPerformed

    private void TxtMathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMathActionPerformed

    private void TxtPhysicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPhysicsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPhysicsActionPerformed

    private void TxtChemistryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtChemistryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtChemistryActionPerformed

    private void BtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateActionPerformed
        // TODO add your handling code here:
       

    }//GEN-LAST:event_BtnCreateActionPerformed

    public boolean validateForm(){
        if (TxtIDStudent.getText().isEmpty()
                || TxtNameStudent.getText().isEmpty()
                ||TxtMath.getText().isEmpty()
                ||TxtPhysics.getText().isEmpty()
                ||TxtChemistry.getText().isEmpty()){
            return false;
        }
        else{
            try {
                double ma = Double.parseDouble(TxtMath.getText());
                double ph= Double.parseDouble(TxtPhysics.getText());
                 double ch= Double.parseDouble(TxtChemistry.getText());
                 
            if (ma < 0 || ma > 10) {
                return false;
                
            }
                if (ph<0 || ma>10) {
                    return false;
                    
                }
                if (ch<0 || ch>10) {
                    return false;
                    
                }
            
                
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
    public Grade getModel(){
        Grade g =new Grade();
        g.setId(0);
        Student s= new Student(TxtIDStudent.getText(),TxtNameStudent.getText());
        g.setS(s);
        g.setMath(Double.parseDouble(TxtMath.getText()));
        g.setChemistry(Double.parseDouble(TxtChemistry.getText()));
        g.setPhysics(Double.parseDouble(TxtPhysics.getText()));
        return g;
        
    }
    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        // TODO add your handling code here:
        if (validateForm()){
            Grade g=getModel();
            if (dDAO.add(g)>0) {
                fillDataTable();
                
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Please check the information");
        }
        
    }//GEN-LAST:event_BtnSaveActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        // TODO add your handling code here:
        if (validateForm()){
        Grade d = getModel();
            if (dDAO.updateByIDStudent(d)>0) {
                JOptionPane.showMessageDialog(this, "Update successful");
                fillDataTable();
            }
        
        }else{
            JOptionPane.showMessageDialog(this, "You have not entered user information");
        }
  
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        // TODO add your handling code here:
        if (validateForm()){
            if (dDAO.delGrade(TxtIDStudent.getText())>0) {
                JOptionPane.showMessageDialog(this, "Update successful");
                fillDataTable();
            }
        
        }else{
            JOptionPane.showMessageDialog(this, "You have not entered user information");
        }
     
    }//GEN-LAST:event_BtnDeleteActionPerformed

    public void setModel(Grade g){
        TxtMath.setText(String.valueOf(g.getMath()));
        TxtPhysics.setText(String.valueOf(g.getPhysics()));
        TxtChemistry.setText(String.valueOf(g.getChemistry()));
        TxtIDStudent.setText(g.getS().getID());
        TxtNameStudent.setText(g.getS().getName());
        lblGPA.setText(String.valueOf(g.getGPA()));
    }
    private void tbPointstudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPointstudentMouseClicked
        // TODO add your handling code here:
        int id = tbPointstudent.rowAtPoint(evt.getPoint());
        String masv =tbPointstudent.getValueAt(id, 0).toString();
        Grade d =dDAO.getOneGradeByIDStudent(masv);
        setModel(d);
    }//GEN-LAST:event_tbPointstudentMouseClicked

    private void TxtFindstudentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFindstudentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFindstudentidActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        if(TxtFindstudentid.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "You have not entered your student code  ");
            
        }else{
            Student s =sDAO.getStudentByID(TxtFindstudentid.getText());
            if (s != null){
                Grade d = dDAO.getOneGradeByIDStudent(s.getID());
                if (d !=null){
                    setModel(d);
                }else{
                TxtIDStudent.setText(s.getID());
                TxtNameStudent.setText(s.getName());
                TxtMath.setText("-1");
                TxtPhysics.setText("-1");
                TxtChemistry.setText("-1");
                lblGPA.setText("0.0");
            }
            }
        }
        
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnFristActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFristActionPerformed
        // TODO add your handling code here:
        index = 0;
        Grade d = dDAO.getAtPosition(index);
        setModel(d);
       
    }//GEN-LAST:event_btnFristActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        index = dDAO.getAllGrades().size()-1;
        Grade d = dDAO.getAtPosition(index);
        setModel(d);
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        index --;
        if (index <=0){
            index =0;
        }
        Grade d = dDAO.getAtPosition(index);
        setModel(d);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
           index ++;
        if (index >= dDAO.getAllGrades().size()-1){
            index = dDAO.getAllGrades().size()-1;
        }
        Grade d = dDAO.getAtPosition(index);
        setModel(d);
    }//GEN-LAST:event_btnNextActionPerformed

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
            java.util.logging.Logger.getLogger(PointmanagementDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PointmanagementDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PointmanagementDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PointmanagementDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PointmanagementDialog dialog = new PointmanagementDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCreate;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnSave;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JTextField TxtChemistry;
    private javax.swing.JTextField TxtFindstudentid;
    private javax.swing.JTextField TxtIDStudent;
    private javax.swing.JTextField TxtMath;
    private javax.swing.JTextField TxtNameStudent;
    private javax.swing.JTextField TxtPhysics;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFrist;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGPA;
    private javax.swing.JTable tbPointstudent;
    // End of variables declaration//GEN-END:variables
}
