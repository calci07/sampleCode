package finalProject;

import java.awt.Color;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Window2 {
    private JFrame frame;
    private JPanel signPanel;
    private ImageIcon bg;
    private JLabel signUpIcon;
    private JLabel userLabel1;
    private JLabel fNameLabel;
    private JLabel lNameLabel;
    private JTextField userName;
    private JLabel userNameInvalid;
    private JTextField fName;
    private JLabel fNameInvalid;
    private JTextField lName;
    private JLabel lNameInvalid;
    private JLabel mobiLabel;
    private JTextField mobileNum;
    private JLabel mobileNumInvalid;
    private JLabel passLabel;
    private JPasswordField pass;
    private JLabel passInvalid;
    private JLabel confirmLabel;
    private JPasswordField confirmPass;
    private JLabel confirmPassInvalid;
    private JButton signUpBtn;
    private JButton cancelBtn;
    

    public Window2() {
        frame = new JFrame();
        frame.setSize(3200, 1800); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Sign Up");
        frame.setLocationRelativeTo(null);
        

        bg = new ImageIcon(getClass().getResource("/finalProject/bgPage3.png"));

        signPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                Image image = bg.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        
        signPanel.setLayout(null); 
        signPanel.setBounds(36, 27, 1210, 640);
        signPanel.setBackground(new Color(0x5F6E4F));
        signPanel.setVisible(true);

       


        signUpIcon = new JLabel();
        signUpIcon.setText("Sign Up");
        signUpIcon.setFont(new Font("Poppins Medium", Font.BOLD, 25));
        signUpIcon.setBounds(670, 35, 200, 90);
        signUpIcon.setForeground(new Color(0x3F3F3F));

        userLabel1 = new JLabel();
        userLabel1.setText("Username");
        userLabel1.setFont(new Font("Poppins Light", Font.BOLD, 18));
        userLabel1.setBounds(775, 80, 200, 90);
        userLabel1.setForeground(new Color(0x3F3F3F));
        



        userNameInvalid = new JLabel();
        userNameInvalid.setText("Invalid username");
        userNameInvalid.setFont(new Font("Poppins Light", Font.BOLD, 10));
        userNameInvalid.setBounds(775, 130, 200, 90);
        userNameInvalid.setForeground(new Color(0xFF2626));
        userNameInvalid.setVisible(false);
        




        userName = new JTextField();
        userName.setFont(new Font("Poppins Light", Font.BOLD, 15));
        userName.setBounds(775, 135, 360, 30);
        userName.setForeground(new Color(0x3F3F3F));
        userName.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        


        fNameLabel = new JLabel();
        fNameLabel.setText("First Name");
        fNameLabel.setFont(new Font("Poppins Light", Font.BOLD, 18));
        fNameLabel.setBounds(775, 160, 200, 90);
        fNameLabel.setForeground(new Color(0x3F3F3F));


        fName = new JTextField();
        fName.setFont(new Font("Poppins Light", Font.BOLD, 15));
        fName.setBounds(775, 215, 360, 30);
        fName.setForeground(new Color(0x3F3F3F));
        fName.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


        fNameInvalid = new JLabel();
        fNameInvalid.setText("Invalid first name");
        fNameInvalid.setFont(new Font("Poppins Light", Font.BOLD, 10));
        fNameInvalid.setBounds(775, 210, 200, 90);
        fNameInvalid.setForeground(new Color(0xFF2626));
        fNameInvalid.setVisible(false);


        lNameLabel = new JLabel();
        lNameLabel.setText("Last Name");
        lNameLabel.setFont(new Font("Poppins Light", Font.BOLD, 18));
        lNameLabel.setBounds(775, 240, 200, 90);
        lNameLabel.setForeground(new Color(0x3F3F3F));


        lName = new JTextField();
        lName.setFont(new Font("Poppins Light", Font.BOLD, 15));
        lName.setBounds(775, 295, 360, 30);
        lName.setForeground(new Color(0x3F3F3F));
        lName.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


        lNameInvalid = new JLabel();
        lNameInvalid.setText("Invalid last name");
        lNameInvalid.setFont(new Font("Poppins Light", Font.BOLD, 10));
        lNameInvalid.setBounds(775, 290, 200, 90);
        lNameInvalid.setForeground(new Color(0xFF2626));
        lNameInvalid.setVisible(false);



       


        mobiLabel = new JLabel();
        mobiLabel.setText("Mobile Number");
        mobiLabel.setFont(new Font("Poppins Light", Font.BOLD, 18));
        mobiLabel.setBounds(775, 320, 200, 90);
        mobiLabel.setForeground(new Color(0x3F3F3F));

        mobileNum = new JTextField(11);
        mobileNum.setFont(new Font("Poppins Light", Font.BOLD, 15));
        mobileNum.setBounds(775, 375, 360, 30);
        mobileNum.setForeground(new Color(0x3F3F3F));
        mobileNum.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


        mobileNumInvalid = new JLabel();
        mobileNumInvalid.setText("Please enter a valid mobile number");
        mobileNumInvalid.setFont(new Font("Poppins Light", Font.BOLD, 10));
        mobileNumInvalid.setBounds(775, 370, 200, 90);
        mobileNumInvalid.setForeground(new Color(0xFF2626));
        mobileNumInvalid.setVisible(false);



        
        


        passLabel = new JLabel();
        passLabel.setText("Enter Password");
        passLabel.setFont(new Font("Poppins Light", Font.BOLD, 18));
        passLabel.setBounds(775, 400, 200, 90);
        passLabel.setForeground(new Color(0x3F3F3F));


        pass = new JPasswordField();
        pass.setBounds(775, 455, 360, 30);
        pass.setForeground(new Color(0x3F3F3F));
        pass.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        passInvalid = new JLabel();
        passInvalid.setText("Password is too short");
        passInvalid.setFont(new Font("Poppins Light", Font.BOLD, 10));
        passInvalid.setBounds(775, 450, 200, 90);
        passInvalid.setForeground(new Color(0xFF2626));
        passInvalid.setVisible(false);


        confirmLabel = new JLabel();
        confirmLabel.setText("Confirm Password");
        confirmLabel.setFont(new Font("Poppins Light", Font.BOLD, 18));
        confirmLabel.setBounds(775, 480, 200, 90);
        confirmLabel.setForeground(new Color(0x3F3F3F));


        confirmPass = new JPasswordField();
        confirmPass.setBounds(775, 535, 360, 30);
        confirmPass.setForeground(new Color(0x3F3F3F));
        confirmPass.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        confirmPassInvalid = new JLabel();
        confirmPassInvalid.setText("Those passwords didn't match. Try again");
        confirmPassInvalid.setFont(new Font("Poppins Light", Font.BOLD, 10));
        confirmPassInvalid.setBounds(775, 530, 250, 90);
        confirmPassInvalid.setForeground(new Color(0xFF2626));
        confirmPassInvalid.setVisible(false);




        signUpBtn = new JButton();
        signUpBtn.setText("Sign Up ->");
        signUpBtn.setFont(new Font("Poppins SemiBold", Font.BOLD, 20));
        signUpBtn.setFocusable(false);
        signUpBtn.setBounds(775, 590, 170, 45);
        signUpBtn.setBackground(new Color(0xFEC901));
        signUpBtn.setForeground(new Color(0x5F6E4F));



        cancelBtn = new JButton();
        cancelBtn.setText("Cancel");
        cancelBtn.setFont(new Font("Poppins SemiBold", Font.BOLD, 20));
        cancelBtn.setFocusable(false);
        cancelBtn.setBounds(965, 590, 170, 45);
        cancelBtn.setBackground(new Color(0xFEC901));
        cancelBtn.setForeground(new Color(0x5F6E4F));
        
        
        

        signUpBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userNme = userName.getText();
                String fNme = fName.getText();
                String lNme = lName.getText();
                String mNum = mobileNum.getText();
                char[] passWArray = pass.getPassword();
                char[] confirmPassArray = confirmPass.getPassword();
                
                String passW = new String(passWArray); 
                String confirmPassW = new String(confirmPassArray); 
        
               
                String namePattern = "^[a-zA-Z0-9]+$";
                String mobilePattern = "^[0-9]+$";
        
                if (userNme.length() < 5 || !userNme.matches(namePattern)) {
                    
                    userNameInvalid.setVisible(true);
                    userName.setBorder(BorderFactory.createLineBorder(new Color(0xFF2626), 1));
                    userLabel1.setForeground(new Color(0xFF2626));
                    
                } else if (userNme.length() >= 15) {
                    userNameInvalid.setText("Username is too long");
                    userNameInvalid.setVisible(true);
                    userLabel1.setForeground(new Color(0xFF2626));
                } else {
                    userNameInvalid.setVisible(false);
                    userName.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                    userLabel1.setForeground(Color.BLACK);
                }
        
                if (fNme.length() <= 2 || !fNme.matches(namePattern)) {
                   
                    fNameInvalid.setVisible(true);
                    fNameLabel.setForeground(new Color(0xFF2626));
                    fName.setBorder(BorderFactory.createLineBorder(new Color(0xFF2626), 1));
                } else {
                    fNameInvalid.setVisible(false);
                    fNameLabel.setForeground(Color.BLACK);
                    fName.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                }
        
                if (lNme.length() < 2 || !lNme.matches(namePattern)) {
                    
                    lNameInvalid.setVisible(true);
                    lNameLabel.setForeground(new Color(0xFF2626));
                    lName.setBorder(BorderFactory.createLineBorder(new Color(0xFF2626), 1));
                } else {
                    lNameInvalid.setVisible(false);
                    lNameLabel.setForeground(Color.BLACK);
                    lName.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                }
        
                if (mNum.length() != 11 || !mNum.matches(mobilePattern)) {
                    
                    mobileNumInvalid.setVisible(true);
                    mobiLabel.setForeground(new Color(0xFF2626));
                    mobileNum.setBorder(BorderFactory.createLineBorder(new Color(0xFF2626), 1));
                } else {
                    mobileNumInvalid.setVisible(false);
                    mobiLabel.setForeground(Color.BLACK);
                    mobileNum.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                }
        
                if (!passW.equals(confirmPassW)) {
                    confirmPassInvalid.setVisible(true);
                    confirmPass.setBorder(BorderFactory.createLineBorder(new Color(0xFF2626), 1));
                    confirmLabel.setForeground(new Color(0xFF2626));

                } else {
                    confirmPassInvalid.setVisible(false);
                    confirmPass.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                    confirmLabel.setForeground(Color.BLACK);
                }
        
                if (passW.length() < 8) {
                    passInvalid.setVisible(true);
                    pass.setBorder(BorderFactory.createLineBorder(new Color(0xFF2626), 1));
                    passLabel.setForeground(new Color(0xFF2626));
                } else {
                    passInvalid.setVisible(false);
                    pass.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                    passLabel.setForeground(Color.BLACK);
                }
            }
        });
        


        cancelBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==cancelBtn) {
                    frame.dispose();
                    Window1 firstWindow = new Window1();
                   
                    
                }
            }
            
        });




        
      
        



        signPanel.add(signUpIcon);
        signPanel.add(userLabel1);
        signPanel.add(userName);
        signPanel.add(userNameInvalid);
        signPanel.add(fName);
        signPanel.add(fNameLabel);
        signPanel.add(fNameInvalid);
        signPanel.add(lNameLabel);
        signPanel.add(lName);
        signPanel.add(lNameInvalid);
        signPanel.add(mobiLabel);
        signPanel.add(mobileNum);
        signPanel.add(mobileNumInvalid);
        signPanel.add(passLabel);
        signPanel.add(pass);
        signPanel.add(passInvalid);
        signPanel.add(confirmLabel);
        signPanel.add(confirmPass);
        signPanel.add(confirmPassInvalid);
        signPanel.add(signUpBtn);
        signPanel.add(cancelBtn);

       


        
        frame.add(signPanel);



        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Window2();
    }
}
