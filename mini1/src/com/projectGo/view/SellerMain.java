package com.projectGo.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.projectGo.controller.SellerController;

public class SellerMain extends MainFrame {
	JFrame frame;
	SellerController sc = new SellerController();

	public SellerMain() {




		frame = MainFrame.mainFrame;
		frame.getContentPane().removeAll();
		frame.validate();
		frame.repaint();
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setBounds(0, 0, 550, 800);
		
		
		JButton bt1 = new JButton("가게 등록");
		JButton bt2 = new JButton("주문 조회");
		JButton bt3 = new JButton("회원 정보");
		
		JButton bt4 = new JButton("가게 수정");
		
		bt1.setBounds(100, 260, 150, 100);
		bt2.setBounds(300, 260, 150, 100);
		bt3.setBounds(200, 400, 150, 100);
		bt4.setBounds(100, 260, 150, 100);
		
		bt1.setBackground(Color.orange);
		bt2.setBackground(Color.orange);
		bt3.setBackground(Color.orange);
		bt4.setBackground(Color.orange);
		
		bt1.setForeground(Color.white);
		bt2.setForeground(Color.white);
		bt3.setForeground(Color.white);
		bt4.setForeground(Color.white);
		
		bt1.setFont(new Font("굴림", Font.BOLD, 15));
		bt2.setFont(new Font("굴림", Font.BOLD, 15));
		bt3.setFont(new Font("굴림", Font.BOLD, 15));
		bt4.setFont(new Font("굴림", Font.BOLD, 15));
		
		bt1.setBorderPainted(false); 
		bt1.setFocusPainted(false);
		bt2.setBorderPainted(false); 
		bt3.setFocusPainted(false);
		bt3.setBorderPainted(false); 
		bt3.setFocusPainted(false);
		
		bt4.setBorderPainted(false); 
		bt4.setFocusPainted(false);
		
		
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new StoreAddView();
				
			}
		});
		
		bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MenuAddView();
				
			}
		});
		
		bt3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MemberInfoFrame();
				
			}
		});
		

		bt4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new StoreModifyView();
				
			}
		});
		
		


		if (sc.checkStore() == true) {
			frame.add(bt4);
		} else {
			frame.add(bt1);
		}
		
		
		frame.add(bt2);
		frame.add(bt3);
		
		
		frame.validate();
		frame.repaint();

	}

}
