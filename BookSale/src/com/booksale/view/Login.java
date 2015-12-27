
/**
 * 功能：登录界面
 */

package com.booksale.view;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {
	//定义所需的组件
	//需要2个JLabel,1个JTextField, 1 个 JPasswordField, 3 个 JButton 1 个JPanel;
	private JPanel contentPane;
	private JLabel userName, password;
	private JTextField user;
	private JPasswordField psd;
	private JButton login, cancel, register;
	private int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	private int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	
	
	//constructor 
	public Login(){
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//窗体基本属性
		setResizable(false);
		setTitle("登录");
		setLocationRelativeTo(null);
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//设置布局管理器
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//添加组件
		userName = new JLabel("用户名:");
		userName.setBounds(50, 50, 50, 20);
		contentPane.add(userName);
		
		user = new JTextField();
		user.setBounds(120, 50, 120, 20);
		contentPane.add(user);
		user.setColumns(10);
		
		password = new JLabel("密  码:");
		password.setBounds(50,80,50,20);
		contentPane.add(password);
		
		psd = new JPasswordField();
		psd.setBounds(120,80,120,20);
		psd.setFont(new Font("",Font.PLAIN,8));
		contentPane.add(psd);
		
		login = new JButton("登录");
		login.setBounds(30, 120, 60,30);
		contentPane.add(login);
		
		register = new JButton("注册");
		register.setBounds(110, 120, 60,30);
		contentPane.add(register);
		
		cancel = new JButton("取消");
		cancel.setBounds(190, 120, 60,30);
		contentPane.add(cancel);
		
		//添加事件监听
		
	}

	

	
	public static void main(String [] args){
		Login lg = new  Login();
		lg.setVisible(true);
	}
	
}
