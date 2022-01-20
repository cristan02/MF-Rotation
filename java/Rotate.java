

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Rotate extends javax.swing.JFrame {

    public Rotate() {
        initComponents();
        this.setSize(584,657);
        this.setResizable(false);
        part_no.setVisible(false);
        
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        get_n = new javax.swing.JPanel();
        rotate_title = new javax.swing.JLabel();
        IMAGE = new javax.swing.JLabel();
        stp1 = new javax.swing.JLabel();
        stp2 = new javax.swing.JLabel();
        note_bord = new javax.swing.JPanel();
        note2 = new javax.swing.JLabel();
        note1 = new javax.swing.JLabel();
        cont_next = new javax.swing.JButton();
        part_no = new javax.swing.JPanel();
        Enter_part = new javax.swing.JLabel();
        participant_number = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        get_n.setBackground(new java.awt.Color(0, 0, 0));
        get_n.setOpaque(false);
        get_n.setLayout(null);

        rotate_title.setBackground(new java.awt.Color(255, 255, 51));
        rotate_title.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        rotate_title.setForeground(new java.awt.Color(255, 255, 51));
        rotate_title.setText("ROTATE");
        get_n.add(rotate_title);
        rotate_title.setBounds(150, 80, 160, 50);

        IMAGE.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        IMAGE.setForeground(new java.awt.Color(255, 255, 51));
        IMAGE.setText("IMAGE");
        get_n.add(IMAGE);
        IMAGE.setBounds(164, 140, 130, 40);

        stp1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        stp1.setForeground(new java.awt.Color(153, 255, 255));
        stp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stp1.setText("Step 1: Enter size of matrix ");
        get_n.add(stp1);
        stp1.setBounds(90, 220, 290, 30);

        stp2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        stp2.setForeground(new java.awt.Color(153, 255, 255));
        stp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stp2.setText("Step 2: Enter elements in matrix");
        get_n.add(stp2);
        stp2.setBounds(90, 260, 290, 30);

        note_bord.setBackground(new java.awt.Color(0, 0, 0));
        note_bord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        note_bord.setOpaque(false);
        note_bord.setLayout(null);

        note2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        note2.setForeground(new java.awt.Color(255, 102, 102));
        note2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        note2.setText("from -999 to 999 for better user experience");
        note_bord.add(note2);
        note2.setBounds(0, 20, 350, 30);

        note1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        note1.setForeground(new java.awt.Color(255, 102, 102));
        note1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        note1.setText("Note: In Matrix kindly enter number range ");
        note_bord.add(note1);
        note1.setBounds(0, 0, 350, 30);

        get_n.add(note_bord);
        note_bord.setBounds(60, 320, 350, 60);

        cont_next.setBackground(new java.awt.Color(51, 51, 51));
        cont_next.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        cont_next.setForeground(new java.awt.Color(255, 255, 255));
        cont_next.setText("Continue");
        cont_next.setFocusPainted(false);
        cont_next.setMargin(new java.awt.Insets(1, 2, 1, 2));
        cont_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cont_nextActionPerformed(evt);
            }
        });
        get_n.add(cont_next);
        cont_next.setBounds(170, 420, 120, 40);

        part_no.setBackground(new java.awt.Color(0, 0, 0));
        part_no.setOpaque(false);
        part_no.setLayout(null);

        Enter_part.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Enter_part.setForeground(new java.awt.Color(153, 255, 255));
        Enter_part.setText("Enter side of matrix:");
        part_no.add(Enter_part);
        Enter_part.setBounds(70, 40, 250, 40);

        participant_number.setBackground(new java.awt.Color(0, 0, 0));
        participant_number.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        participant_number.setForeground(new java.awt.Color(255, 255, 255));
        participant_number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        participant_number.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        participant_number.setHighlighter(null);
        participant_number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                participant_numberKeyPressed(evt);
            }
        });
        part_no.add(participant_number);
        participant_number.setBounds(133, 100, 66, 46);

        get_n.add(part_no);
        part_no.setBounds(60, 220, 350, 160);

        getContentPane().add(get_n);
        get_n.setBounds(60, 60, 450, 510);

        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\ashbo\\Desktop\\background.png")); // NOI18N
        background.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.setRequestFocusEnabled(false);
        background.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(background);
        background.setBounds(0, 0, 570, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void participant_numberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_participant_numberKeyPressed
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            participant_number.setEditable(true);
        }
        else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            participant_number.setEditable(true);
            else if(evt.getExtendedKeyCode()== KeyEvent.VK_UP || evt.getExtendedKeyCode()== KeyEvent.VK_DOWN )
            participant_number.setEditable(true);
            else if(evt.getExtendedKeyCode()== KeyEvent.VK_LEFT ||evt.getExtendedKeyCode()== KeyEvent.VK_RIGHT)
            participant_number.setEditable(true);
            else
            {
                participant_number.setEditable(false);
                JOptionPane.showMessageDialog(this,"Error!!cannot input character","Admin",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_participant_numberKeyPressed

    private void cont_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cont_nextActionPerformed
        String str1 ="Continue";
        String str2 =cont_next.getText();
        String numb;
        if(str2.equals(str1))
        {
            note_bord.setVisible(false);
            stp1.setVisible(false);
            stp2.setVisible(false);
            part_no.setVisible(true);
            cont_next.setText("NEXT");
        }
        else{
            numb=participant_number.getText();
            if(numb.length()<1)
            {
                JOptionPane.showMessageDialog(this,"Error!!enter size of matrix","Admin",JOptionPane.ERROR_MESSAGE);
                participant_number.requestFocus();
            }
            else
            {
                int n=Integer.parseInt(numb);
                Rotation rot = new Rotation(n);
                rot.setVisible(true);
                rot.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }
        }
    }//GEN-LAST:event_cont_nextActionPerformed

   
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
            java.util.logging.Logger.getLogger(Rotate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rotate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rotate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rotate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Rotate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Enter_part;
    private javax.swing.JLabel IMAGE;
    private javax.swing.JLabel background;
    private javax.swing.JButton cont_next;
    private javax.swing.JPanel get_n;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel note1;
    private javax.swing.JLabel note2;
    private javax.swing.JPanel note_bord;
    private javax.swing.JPanel part_no;
    private javax.swing.JTextField participant_number;
    private javax.swing.JLabel rotate_title;
    private javax.swing.JLabel stp1;
    private javax.swing.JLabel stp2;
    // End of variables declaration//GEN-END:variables
}
