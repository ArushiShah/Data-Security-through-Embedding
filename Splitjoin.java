
package src;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Splitjoin extends javax.swing.JFrame {

    /** Creates new form Splitjoin */
    public Splitjoin() {
        initComponents();
        setTitle("SPLITTER-JOINER BY");
        setResizable(false);
        rs.setSelected(true);
        
         }

    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        c1 = new javax.swing.JTextField();
        c2 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        c4 = new javax.swing.JTextField();
        c5 = new javax.swing.JTextField();
        c6 = new javax.swing.JTextField();
        c7 = new javax.swing.JTextField();
        addfiles = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        split = new javax.swing.JPanel();
        rs = new javax.swing.JRadioButton();
        parts = new javax.swing.JTextField();
        rj = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf = new javax.swing.JTextField();
        Browse = new javax.swing.JButton();
        Open = new javax.swing.JButton();
        process = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        p = new javax.swing.JProgressBar();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        c1.setBorder(null);
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        c1.setBounds(0, 0, 380, 20);
        jDesktopPane1.add(c1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        c2.setBorder(null);
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        c2.setBounds(0, 20, 380, 20);
        jDesktopPane1.add(c2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        c3.setBorder(null);
        c3.setBounds(0, 40, 380, 20);
        jDesktopPane1.add(c3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        c4.setBorder(null);
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });
        c4.setBounds(0, 60, 380, 20);
        jDesktopPane1.add(c4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        c5.setBorder(null);
        c5.setBounds(0, 80, 380, 20);
        jDesktopPane1.add(c5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        c6.setBorder(null);
        c6.setBounds(0, 100, 380, 20);
        jDesktopPane1.add(c6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        c7.setBorder(null);
        c7.setBounds(0, 114, 380, 20);
        jDesktopPane1.add(c7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        addfiles.setBackground(new java.awt.Color(153, 204, 255));
        addfiles.setFont(new java.awt.Font("Times New Roman", 1, 18));
        addfiles.setForeground(new java.awt.Color(0, 0, 51));
        addfiles.setText("Add Files...");
        addfiles.setActionCommand("1");
        addfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfilesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Input Files:");

        split.setBackground(new java.awt.Color(51, 0, 51));
        split.setBorder(javax.swing.BorderFactory.createTitledBorder("Spltitter/Joiner"));

        buttonGroup1.add(rs);
        rs.setFont(new java.awt.Font("Times New Roman", 1, 14));
        rs.setText("Splitter");
        rs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsActionPerformed(evt);
            }
        });

        parts.setText("1");
        parts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partsActionPerformed(evt);
            }
        });

        buttonGroup1.add(rj);
        rj.setFont(new java.awt.Font("Times New Roman", 1, 14));
        rj.setText("Joiner");
        rj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("Parts:");

        javax.swing.GroupLayout splitLayout = new javax.swing.GroupLayout(split);
        split.setLayout(splitLayout);
        splitLayout.setHorizontalGroup(
            splitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(splitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(splitLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parts, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rs, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(rj)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        splitLayout.setVerticalGroup(
            splitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitLayout.createSequentialGroup()
                .addGroup(splitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rs)
                    .addComponent(rj))
                .addGap(18, 18, 18)
                .addGroup(splitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parts, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Output Folder:");

        Browse.setFont(new java.awt.Font("Times New Roman", 1, 18));
        Browse.setForeground(new java.awt.Color(0, 0, 51));
        Browse.setText("Browse...");
        Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseActionPerformed(evt);
            }
        });

        Open.setFont(new java.awt.Font("Times New Roman", 1, 18));
        Open.setForeground(new java.awt.Color(0, 0, 51));
        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });

        process.setBackground(new java.awt.Color(153, 255, 255));
        process.setFont(new java.awt.Font("Times New Roman", 1, 18));
        process.setForeground(new java.awt.Color(0, 0, 51));
        process.setText("process");
        process.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                processMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                processMouseEntered(evt);
            }
        });
        process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processActionPerformed(evt);
            }
        });

        remove.setBackground(new java.awt.Color(153, 255, 255));
        remove.setFont(new java.awt.Font("Times New Roman", 1, 18));
        remove.setForeground(new java.awt.Color(0, 0, 51));
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addfiles)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(Open, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(process, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Browse))))
                    .addComponent(split, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addfiles, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(split, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Browse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(tf, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Open, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(process, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void addfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfilesActionPerformed
// TODO add your handling code here:
    JOptionPane.showMessageDialog(this,"add only mp3 files !");
     int no;
     tf.setText(null);
     p.setValue(0);
     parts.setText(null);
   fc=new JFileChooser();
        
no=fc.showOpenDialog(this);
        int c;
        
if(no==JFileChooser.APPROVE_OPTION)
{ 
    
            String st = fc.getSelectedFile().getPath();
if(         "".equals(c1.getText()))       
{c1.setText(st);
fread=new File(fc.getSelectedFile().getPath());}
else if(    "".equals(c2.getText()))
{fread1=new File(fc.getSelectedFile().getPath());
c2.setText(st);  
fread2=new File(fc.getSelectedFile().getPath());}
else if(    "".equals(c3.getText()))
{c3.setText(st);
fread2=new File(fc.getSelectedFile().getPath());}
else if(    "".equals(c4.getText()))
{c4.setText(st);
fread3=new File(fc.getSelectedFile().getPath());}
else if(    "".equals(c5.getText()))
{c5.setText(st);
fread4=new File(fc.getSelectedFile().getPath());}
else if(    "".equals(c6.getText()))
{c6.setText(st);
fread5=new File(fc.getSelectedFile().getPath());}
else if(    "".equals(c7.getText()))
{c7.setText(st);
fread6=new File(fc.getSelectedFile().getPath());}
else
    JOptionPane.showMessageDialog(this, "cannot add more files");
}
else
{}
}//GEN-LAST:event_addfilesActionPerformed

private void BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseActionPerformed
// TODO add your handling code here:
    // TODO add your handling code here:
     int no;
    
no=fc.showSaveDialog(this);
if(no==JFileChooser.APPROVE_OPTION)
{if(rs.isSelected())
    fwrite=new File(fc.getSelectedFile().getPath()+"_rj_01.mp3");
else if(rj.isSelected())
    fwrite=new File(fc.getSelectedFile().getPath()+"_rj.mp3");
tf.setText(fwrite.getPath());
tf.setEditable(false);
}
else
{}
}//GEN-LAST:event_BrowseActionPerformed

private void processActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processActionPerformed
// TODO add your handling code here:
    
 if(rs.isSelected())
    { 
    int l=  (int) fread.length();
    
   int p1=Integer.parseInt(parts.getText());
   
  
   
    int by=0;
    by=(l/p1);
    byte [] b=new byte[by];
   int n=0;
           int i=1;
   try
    
   {   
       fis=new FileInputStream(fread);
     
     while((i!=(p1+1))&&(n=fis.read(b))!=-1)
    { fos=new FileOutputStream(fwrite);
        fos.write(b,0,n);
        fwrite=new File(fc.getSelectedFile().getPath()+"_rj_0"+(i+1)+".mp3");
       
    i++;
   
        int m=100/p1;
        
    
    }}
    catch(IOException ie){System.out.println(ie.getMessage());}
   finally
   {System.out.println("DONE");
       try{fis.close(); fos.close();}
   catch(IOException ie){}
   }
   }
 
 
 else if(rj.isSelected())
     {
        
     byte [] b=new byte[(int) fread.length()];
     
   int n=0;
   try
    
   { fos=new FileOutputStream(fwrite);  
       fis=new FileInputStream(fread);
     while((n=fis.read(b))!=-1)
     {
        
    fos.write(b,0,n);
       }
   b=new byte[(int) fread1.length()];
  fis=new FileInputStream(fread1);
     while(((n=fis.read(b))!=-1)&&fread1!=null)
     {
        
    fos.write(b,0,n);
       } 
     b=new byte[(int) fread2.length()];
  fis=new FileInputStream(fread2);
     while(((n=fis.read(b))!=-1)&&fread2!=null)
     {
        
    fos.write(b,0,n);
       } 
     b=new byte[(int) fread3.length()];
  fis=new FileInputStream(fread3);
     while(((n=fis.read(b))!=-1)&&fread3!=null)
     {
    
    fos.write(b,0,n);
       } 
     b=new byte[(int) fread4.length()];
  fis=new FileInputStream(fread4);
     while(((n=fis.read(b))!=-1)&&fread4!=null)
     {
    
    fos.write(b,0,n);
       } 
     b=new byte[(int) fread5.length()];
  fis=new FileInputStream(fread5);
     while(((n=fis.read(b))!=-1)&&fread5!=null)
     {
    
    fos.write(b,0,n);
       } 
     b=new byte[(int) fread6.length()];
  fis=new FileInputStream(fread6);
     while(((n=fis.read(b))!=-1)&&fread6!=null)
     {
    
    fos.write(b,0,n);
       } 
     
     
   }
   
    catch(Exception ie){System.out.println(ie.getMessage());}
   finally
   {System.out.println("DONE");
       try{fis.close(); fos.close();}
   catch(IOException ie){}
   }
     }
 JOptionPane.showMessageDialog(this,"job done !");

}//GEN-LAST:event_processActionPerformed

private void rsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsActionPerformed
// TODO add your handling code here:
  
  
    if(rs.isSelected())
    {
   split.setBorder(javax.swing.BorderFactory.createTitledBorder("Spltitter"));
 
   parts.setText("1");
   parts.setEditable(true);
   
   
    }
    else if(rj.isSelected())
    {split.setBorder(javax.swing.BorderFactory.createTitledBorder("Joiner")); 
    parts.setText("1");
    parts.setEditable(false);
    
    }
}//GEN-LAST:event_rsActionPerformed

private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
// TODO add your handling code here:
   tf.setText(null);
    p.setValue(0);
    c1.setText(null);
    c2.setText(null);
    c3.setText(null);
    c4.setText(null);
    c5.setText(null);
    c6.setText(null);
    c7.setText(null);
    
     fc=null;
}//GEN-LAST:event_removeActionPerformed

private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
// TODO add your handling code here:
    c1.setEditable(false);
}//GEN-LAST:event_c1ActionPerformed

private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed

     c2.setEditable(false);// TODO add your handling code here:
    
}//GEN-LAST:event_c2ActionPerformed

private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
 c4.setEditable(false);// TODO add your handling code here:
}//GEN-LAST:event_c4ActionPerformed

private void processMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_processMouseClicked
// TODO add your handling code here:
    int i=1;
    int l=  (int) fread.length();
    while(i<=l)
    {i++;
    p.setValue(i);
    }
}//GEN-LAST:event_processMouseClicked

private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
// TODO add your handling code here:
    try
    {Runtime pr=Runtime.getRuntime();
Process p2=null;
p2=pr.exec("explorer");

}
catch(Exception e)
{}
}//GEN-LAST:event_OpenActionPerformed

private void partsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partsActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_partsActionPerformed

private void processMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_processMouseEntered
// TODO add your handling code here:
 
}//GEN-LAST:event_processMouseEntered

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Splitjoin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splitjoin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splitjoin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splitjoin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Splitjoin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Browse;
    private javax.swing.JButton Open;
    private javax.swing.JButton addfiles;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c3;
    private javax.swing.JTextField c4;
    private javax.swing.JTextField c5;
    private javax.swing.JTextField c6;
    private javax.swing.JTextField c7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JProgressBar p;
    private javax.swing.JTextField parts;
    private javax.swing.JButton process;
    private javax.swing.JButton remove;
    private javax.swing.JRadioButton rj;
    private javax.swing.JRadioButton rs;
    private javax.swing.JPanel split;
    private javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
File fread=null,fread1=null,fread2=null,fread3=null,fread4=null,fread5=null,fread6=null;
File fwrite=null;
FileInputStream fis=null;
   FileOutputStream fos=null;
   JFileChooser fc=new JFileChooser();

}
