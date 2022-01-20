
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Rotation extends javax.swing.JFrame {
    int n;
    int[][] a;
    int seconds;
    JTextField matrix[][] = new JTextField[20][20]; 
    
    Timer timer = new Timer(1000, new ActionListener() {	
	@Override
	public void actionPerformed(ActionEvent e) {
            seconds--;
            if(seconds<=0) {
                rotate();
                seconds=5;
            }
        }
    });
    
    
    public Rotation(int num) {
        initComponents();
        this.setSize(584,657);
        this.setResizable(false);
        n=num;
        a = new int[n][n];
        stop.setVisible(false);
        start();
    }

    void start()
    {
        matrix_pan.setLayout(new GridLayout(n,n));
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=new JTextField("");
                matrix[i][j].setBackground(new java.awt.Color(0, 0, 0));
                matrix[i][j].setFont(new java.awt.Font("Times New Roman", 1, 24));
                matrix[i][j].setForeground(new java.awt.Color(255, 255, 255));
                matrix[i][j].setHorizontalAlignment(javax.swing.JTextField.CENTER);
                matrix[i][j].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
                matrix[i][j].setMargin(new java.awt.Insets(0, 0, 0, 0));
                matrix_pan.add(matrix[i][j]);
            }
        }
    }
    void rotate()
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i > j)
                {
                    a[i][j] = a[i][j] + a[j][i];
                    a[j][i] = a[i][j] - a[j][i];
                        a[i][j] = a[i][j] - a[j][i];
                }
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < (n / 2); j++)
            {
                a[i][j] = a[i][j] + a[i][n - 1 - j];
                a[i][n - 1 - j] = a[i][j] - a[i][n - 1 - j];
                a[i][j] = a[i][j] - a[i][n - 1 - j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                String int_num=String.valueOf(a[i][j]);
                matrix[i][j].setText(int_num);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mat_rot = new javax.swing.JPanel();
        rotate = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        restart = new javax.swing.JButton();
        matrix_pan = new javax.swing.JPanel();
        keep_rotation = new javax.swing.JLabel();
        stop = new javax.swing.JLabel();
        inst_2 = new javax.swing.JLabel();
        inst_1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        mat_rot.setBackground(new java.awt.Color(0, 0, 0));
        mat_rot.setOpaque(false);
        mat_rot.setLayout(null);

        rotate.setBackground(new java.awt.Color(102, 102, 102));
        rotate.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        rotate.setText("Rotate");
        rotate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rotate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotateActionPerformed(evt);
            }
        });
        mat_rot.add(rotate);
        rotate.setBounds(170, 380, 120, 40);

        exit.setBackground(new java.awt.Color(102, 102, 102));
        exit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        exit.setText("Exit");
        exit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        exit.setOpaque(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        mat_rot.add(exit);
        exit.setBounds(310, 430, 70, 30);

        restart.setBackground(new java.awt.Color(102, 102, 102));
        restart.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        restart.setText("New");
        restart.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });
        mat_rot.add(restart);
        restart.setBounds(80, 430, 70, 30);

        matrix_pan.setBackground(new java.awt.Color(0, 0, 0));
        matrix_pan.setLayout(null);
        mat_rot.add(matrix_pan);
        matrix_pan.setBounds(70, 30, 310, 300);

        keep_rotation.setIcon(new javax.swing.ImageIcon("C:\\Users\\ashbo\\Desktop\\rot_right.png")); // NOI18N
        keep_rotation.setText("jLabel2");
        keep_rotation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keep_rotationMouseClicked(evt);
            }
        });
        mat_rot.add(keep_rotation);
        keep_rotation.setBounds(210, 340, 30, 30);

        stop.setIcon(new javax.swing.ImageIcon("C:\\Users\\ashbo\\Desktop\\stop.png")); // NOI18N
        stop.setText("jLabel2");
        stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopMouseClicked(evt);
            }
        });
        mat_rot.add(stop);
        stop.setBounds(210, 340, 30, 30);

        inst_2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        inst_2.setForeground(new java.awt.Color(255, 0, 51));
        inst_2.setText("Press button above rotate to perform auto rotation");
        mat_rot.add(inst_2);
        inst_2.setBounds(70, 500, 340, 20);

        inst_1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        inst_1.setForeground(new java.awt.Color(255, 0, 51));
        inst_1.setText("Press rotate for Right rotation of Matrix");
        mat_rot.add(inst_1);
        inst_1.setBounds(70, 480, 340, 20);

        getContentPane().add(mat_rot);
        mat_rot.setBounds(60, 50, 450, 520);

        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\ashbo\\Desktop\\background.png")); // NOI18N
        background.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.setRequestFocusEnabled(false);
        background.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(background);
        background.setBounds(0, 0, 570, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rotateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotateActionPerformed
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               String val =  matrix[i][j].getText();
                if(val.length()<1)
                {
                    JOptionPane.showMessageDialog(this,"Error!! Blank space encountered","Admin",JOptionPane.ERROR_MESSAGE);
                    matrix[i][j].requestFocus();
                    return;
                }
                for(int k=0;k<val.length();k++)
                {
                   char test = val.charAt(k);
                   if(!(test>='0' && test<='9'))
                   {
                       JOptionPane.showMessageDialog(this,"Error!! Invalid character found","Admin",JOptionPane.ERROR_MESSAGE);
                       matrix[i][j].setText("");
                       matrix[i][j].requestFocus();
                       return;
                   }
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int val = Integer.parseInt(matrix[i][j].getText());
                a[i][j]=val;
            }
        }
        rotate();
    }//GEN-LAST:event_rotateActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
        Rotate rotate_c = new Rotate();
        rotate_c.setVisible(true);
        rotate_c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_restartActionPerformed

    private void keep_rotationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keep_rotationMouseClicked
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               String val =  matrix[i][j].getText();
                if(val.length()<1)
                {
                    JOptionPane.showMessageDialog(this,"Error!! Blank space encountered","Admin",JOptionPane.ERROR_MESSAGE);
                    matrix[i][j].requestFocus();
                    return;
                }
                for(int k=0;k<val.length();k++)
                {
                   char test = val.charAt(k);
                   if(!(test>='0' && test<='9'))
                   {
                       JOptionPane.showMessageDialog(this,"Error!! Invalid character found","Admin",JOptionPane.ERROR_MESSAGE);
                       matrix[i][j].setText("");
                       matrix[i][j].requestFocus();
                       return;
                   }
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int val = Integer.parseInt(matrix[i][j].getText());
                a[i][j]=val;
            }
        }
        
        seconds = 5;
        keep_rotation.setVisible(false);
        stop.setVisible(true);
        inst_2.setText("Press button above rotate to stop auto rotation");
        timer.start();
    }//GEN-LAST:event_keep_rotationMouseClicked

    private void stopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopMouseClicked
        timer.stop();
        keep_rotation.setVisible(true);
        stop.setVisible(false);
        inst_2.setText("Press button above rotate to perform auto rotation");
    }//GEN-LAST:event_stopMouseClicked

    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton exit;
    private javax.swing.JLabel inst_1;
    private javax.swing.JLabel inst_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel keep_rotation;
    private javax.swing.JPanel mat_rot;
    public javax.swing.JPanel matrix_pan;
    private javax.swing.JButton restart;
    private javax.swing.JButton rotate;
    private javax.swing.JLabel stop;
    // End of variables declaration//GEN-END:variables
}
