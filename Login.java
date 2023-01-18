package login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Login extends JFrame{

    JFrame bWindow = new JFrame("Restaurant");
    JPanel bPanel =  new JPanel();
    
    JLabel lblFirstName, lblMiddleName, lblLastName;
    JButton btnCreate = new JButton("Create");
    JButton btnRead = new JButton("Read");
    JButton btnUpdate = new JButton("Update");
    JButton btnDelete = new JButton("Delete");
    
    JFrame loginFrame = new JFrame("LOGIN");
    JPanel loginPanel = new JPanel();
    JLabel lblUsername = new JLabel("USERNAME:");
    JLabel lblPassword = new JLabel("PASSWORD:");
    JTextField fldUsername = new JTextField(15);
    JTextField fldPassword = new JTextField(15);
    JButton btnLogin = new JButton("LOGIN");
    
    
    public static void main(String[] args) {
        new Login();
    }
    public Login(){
        
        
       
        loginFrame.setSize(400,200);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setResizable(false);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        loginFrame.add(loginPanel);
        loginPanel.add(bPanel);
        loginPanel.setLayout(null);
        loginPanel.setBounds(800,800,200,100);
        
        loginPanel.add(lblUsername);
        lblUsername.setBounds(50, 20, 100 , 30);
        loginPanel.add(fldUsername);
        fldUsername.setBounds(130 , 20, 200 , 30);
        loginPanel.add(lblPassword);
        lblPassword.setBounds(50, 60, 100 , 30);
        loginPanel.add(fldPassword);
        fldPassword.setBounds(130, 60, 200 , 30);
        loginPanel.add(btnLogin);
        btnLogin.setBounds(140, 100, 100, 30);
        btnLogin.addActionListener(new loginButton());
        
        loginFrame.setVisible(true);
            
    }
    public class loginButton implements ActionListener{
         
         JFrame floginFrame = new JFrame("LOGIN FAILED");
         JPanel floginPanel = new JPanel();
         JLabel lblFailed = new JLabel("Incorrect username or password.");
         JButton btnRetry = new JButton("RETRY");
        @Override
        public void actionPerformed(ActionEvent p){
            String username = fldUsername.getText();
            String password = fldPassword.getText();
            if(!username.equals("Dumol") || !password.equals("@Angpoginisirjay")){
               
                
                floginFrame.add(floginPanel);
                floginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                floginFrame.setLocationRelativeTo(null);
                floginFrame.setSize(400,200);
                floginPanel.setLayout(null);
                floginPanel.setBounds(800, 800, 200, 100);
                floginPanel.add(lblFailed);
                lblFailed.setBounds(100, 60, 200, 20);
                floginPanel.add(btnRetry);
                btnRetry.setBounds(140, 100, 100, 30);
                btnRetry.addActionListener(new retryButton());
                
                floginFrame.setVisible(true);
                loginFrame.dispose();
        }
            else{
                createBWindow();
                bWindow.setVisible(true); 
                loginFrame.dispose();
            }
