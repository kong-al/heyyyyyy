package game1;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.UIManager;

import game1.ImagePanel;

import java.awt.FlowLayout;

public class Swing {
	
	private JFrame frame;
	private JPanel startPanel1;
	private JPanel gamePanel;
	private JPanel choice1Panel;
	private JPanel choice2Panel;
	private JPanel finalPanel;
	boolean check = false;
	
	ImagePanel startPanelImg = new ImagePanel(new ImageIcon("D:\\minigame\\miniGame\\game1\\src\\image\\001.png").getImage());
	ImagePanel gamePanelImg = new ImagePanel(new ImageIcon("D:\\minigame\\miniGame\\game1\\src\\image\\002.png").getImage());
	ImagePanel choice1PanelImg = new ImagePanel(new ImageIcon("D:\\minigame\\miniGame\\game1\\src\\image\\003.png").getImage());
	ImagePanel choice2PanelImg = new ImagePanel(new ImageIcon("D:\\minigame\\miniGame\\game1\\src\\image\\004.png").getImage());
	ImagePanel finalPanelImg = new ImagePanel(new ImageIcon("D:\\minigame\\miniGame\\game1\\src\\image\\005.png").getImage());
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JPanel getStartPanel1() {
		return startPanel1;
	}

	public void setStartPanel1(JPanel startPanel1) {
		this.startPanel1 = startPanel1;
	}

	public JPanel getGamePanel() {
		return gamePanel;
	}

	public void setGamePanel(JPanel gamePanel) {
		this.gamePanel = gamePanel;
	}

	public JPanel getChoice1Panel() {
		return choice1Panel;
	}

	public void setChoice1Panel(JPanel choice1Panel) {
		this.choice1Panel = choice1Panel;
	}

	public JPanel getChoice2Panel() {
		return choice2Panel;
	}

	public void setChoice2Panel(JPanel choice2Panel) {
		this.choice2Panel = choice2Panel;
	}

	public JPanel getFinalPanel() {
		return finalPanel;
	}

	public void setFinalPanel(JPanel finalPanel) {
		this.finalPanel = finalPanel;
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing window = new Swing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	    
		Menu menu = new Menu();			// ????????????????????? ????????? ????????? ??????
	    
		frame = new JFrame("????????????:D");
		
		frame.setSize(new Dimension(411,620));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		

        
		 startPanelImg = new ImagePanel(new ImageIcon("D:\\\\minigame\\\\miniGame\\\\game1\\\\src\\\\image\\\\001.png").getImage());
		 gamePanelImg = new ImagePanel(new ImageIcon("D:\\minigame\\miniGame\\game1\\src\\image\\002.png").getImage());
		 choice1PanelImg = new ImagePanel(new ImageIcon("D:\\minigame\\miniGame\\game1\\src\\image\\003.png").getImage());
		 choice2PanelImg = new ImagePanel(new ImageIcon("D:\\minigame\\miniGame\\game1\\src\\image\\004.png").getImage());
		 finalPanelImg = new ImagePanel(new ImageIcon("D:\\minigame\\miniGame\\game1\\src\\image\\005.png").getImage());
		 
					start(menu);
					order(menu);
			
/*--------------------------?????? ????????? ??????-------------------------------------------*/

/*--------------------------?????? ????????? ???-------------------------------------------*/
		
        
	}
	//	?????? ?????????
	public void start(Menu menu) {
        startPanel1 = new JPanel();
        frame.getContentPane().add(startPanelImg, BorderLayout.CENTER);
        startPanelImg.setLayout(null);
//      ???????????? ????????? ????????? ?????? ????????? 
        JButton startBtn = new JButton("????????????");
        startBtn.setBorderPainted(false);
        startBtn.setFocusPainted(false);
        startBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	//???????????????
				startPanelImg.setVisible(false);	
				menuChoice(menu);
			}});
        
        startBtn.setForeground(new Color(205, 133, 63));
        startBtn.setFont(new Font("??????????????? ??????", Font.PLAIN, 30));
        startBtn.setBackground(new Color(255, 255, 240));
        startBtn.setBounds(122, 479, 159, 40);
        startPanelImg.add(startBtn);
        startPanel1.setLayout(null);
        
        gamePanelImg.setLayout(null);
        gamePanelImg.setBounds(0, 0, 411, 620);
        frame.getContentPane().add(gamePanelImg);
        
        check = false;
        System.out.println("?????????????????????");
	}
	//	?????? ????????? ??????	
	public void menuChoice(Menu menu) {
		
	       gamePanel = new JPanel();
	       frame.getContentPane().add(gamePanelImg, BorderLayout.CENTER);
	       gamePanelImg.setLayout(null);
	       gamePanelImg.setVisible(false);	
	       
	       gamePanelImg.setVisible(true);
	       
	       System.out.println("?????????????????????");
	       
		       JButton mc1 = new JButton("");
		       mc1.setContentAreaFilled(false);					//?????? ?????? ??????
		       mc1.setBorderPainted(false);						//?????? ????????? ??????
		       mc1.setFocusPainted(false);						//?????? ????????? ??????
		       ActionListener mc1on = new ActionListener() {
		       public void actionPerformed(ActionEvent e) {
		            gamePanelImg.setVisible(false);				//?????? ??? ?????????
		            choice1( choice1PanelImg, menu );
		            choice2( choice1PanelImg, menu );
		       	}
		       };
		       mc1.addActionListener(mc1on);
		       System.out.println();
		       mc1.setForeground(UIManager.getColor("MenuBar.background"));
		       mc1.setBounds(55, 311, 131, 52);
		      
		       gamePanelImg.add(mc1);

//		     ????????? ????????? ??????
		       JButton mc2 = new JButton("");
		       mc2.setContentAreaFilled(false);
		       mc2.setBorderPainted(false);
		       mc2.setFocusPainted(false);
		       mc2.addActionListener(new ActionListener() {
		       	public void actionPerformed(ActionEvent e) {
		       		System.out.println("------------------- setMenu1111");
		       		menu.setChoiceNum(1);
		            gamePanelImg.setVisible(false);
		            choice1( choice1PanelImg, menu );
		            choice2( choice1PanelImg, menu );
		       	}
		       });
		       mc2.setBounds(214, 311, 142, 52);
		       gamePanelImg.add(mc2);
		       
//		     ????????? ????????? ??????       
		       JButton mc3 = new JButton("");
		       mc3.setContentAreaFilled(false);
		       mc3.setBorderPainted(false);
		       mc3.setFocusPainted(false);
		       mc3.addActionListener(new ActionListener() {
		       	public void actionPerformed(ActionEvent e) {
		       		menu.setChoiceNum(2);
		            gamePanelImg.setVisible(false);
		            choice1( choice1PanelImg, menu );
		            choice2( choice1PanelImg, menu );
		            }
		       });
		       mc3.setBounds(55, 383, 131, 52);
		       gamePanelImg.add(mc3);
		       
//		     ????????? ????????? ??????      
		       JButton mc4 = new JButton("");
		       mc4.setContentAreaFilled(false);
		       mc4.setBorderPainted(false);
		       mc4.setFocusPainted(false);
		       mc4.addActionListener(new ActionListener() {
		       	public void actionPerformed(ActionEvent e) {
		       		menu.setChoiceNum(3);
		            gamePanelImg.setVisible(false);
		            choice1( choice1PanelImg, menu ); 
		            choice2( choice1PanelImg, menu );}
		       });
		       mc4.setBounds(224, 383, 132, 52);
		       gamePanelImg.add(mc4);
		  
//		     ???????????? ????????? ??????       
		       JButton mc5 = new JButton("");
		       mc5.setContentAreaFilled(false);
		       mc5.setBorderPainted(false);
		       mc5.setFocusPainted(false);
		       mc5.addActionListener(new ActionListener() {
		       	public void actionPerformed(ActionEvent e) {
		       		menu.setChoiceNum(4);
		            gamePanelImg.setVisible(false);
		            choice1( choice1PanelImg, menu );
		            choice2( choice1PanelImg, menu );
		       	}
		       });
		       mc5.setBounds(55, 445, 131, 52);
		       gamePanelImg.add(mc5);
		       
//		     ???????????? ????????? ??????
		       JButton mc6 = new JButton("");
		       mc6.setContentAreaFilled(false);
		       mc6.setBorderPainted(false);
		       mc6.setFocusPainted(false);
		       mc6.addActionListener(new ActionListener() {
		       	public void actionPerformed(ActionEvent e) {
		       		menu.setChoiceNum(5);
		            gamePanelImg.setVisible(false);
		            choice1( choice1PanelImg, menu );
		            choice2( choice1PanelImg, menu );
		       	}
		       });
		       mc6.setBounds(223, 445, 133, 52);
		       gamePanelImg.add(mc6);
		       
//		     ???????????? ????????? ??????
		       JButton mc7 = new JButton("");
		       mc7.setContentAreaFilled(false);
		       mc7.setBorderPainted(false);
		       mc7.setFocusPainted(false);
		       mc7.addActionListener(new ActionListener() {
		       	public void actionPerformed(ActionEvent e) {
		       		menu.setChoiceNum(6);
		            gamePanelImg.setVisible(false);
		            choice1( choice1PanelImg, menu );
		            choice2( choice1PanelImg, menu );
		       	}
		       });
		       mc7.setBounds(55, 517, 139, 46);
		       gamePanelImg.add(mc7);
		       
//		     ???????????? ????????? ??????
		       JButton mc8 = new JButton("");
		       mc8.setContentAreaFilled(false);
		       mc8.setBorderPainted(false);
		       mc8.setFocusPainted(false);
		       mc8.addActionListener(new ActionListener() {
		    	   
	  	    public void actionPerformed(ActionEvent e) {
	  		   menu.setChoiceNum(7);
	  		   gamePanelImg.setVisible(false);
	  		   choice1( choice1PanelImg, menu );
	  		   choice2( choice1PanelImg, menu );
	  	    }
		       });
		       mc8.setBounds(220, 519, 136, 44);
		       gamePanelImg.add(mc8);
		       
		       System.out.println("??????????????????");
	}

	//	?????? ?????? ??????
	
	//	???????????? ?????? ??????      
	public void order(Menu menu) {
	       
	       JLabel ranMenu = new JLabel(menu.order());		
	       ranMenu.setHorizontalAlignment(SwingConstants.CENTER);
	       ranMenu.setBackground(new Color(240, 240, 240));
	       ranMenu.setFont(new Font("??????????????? ??????", Font.PLAIN, 17));
	       ranMenu.setBounds(55, 34, 301, 39);
	       gamePanelImg.add(ranMenu);
	       System.out.println(menu.getNum());
	       
	       System.out.println("??????????????????");
	};
	
	//	 ?????? ????????? ??????
	public void choice1(ImagePanel choice1PanelImg, Menu menu) {
        System.out.println( menu.getMenu()[menu.getChoiceNum()][0] );
        JLabel lblNewLabel = new JLabel("?????? ????????? ?????????  " + menu.getMenu()[menu.getChoiceNum()][0] + "!");
        System.out.println("?????? : " + menu.getMenu()[menu.getChoiceNum()][0]);
        System.out.println("????????? ????????? ??????" + menu.getChoiceNum());
        lblNewLabel.setFont(new Font("??????????????? ??????", Font.PLAIN, 17));
        lblNewLabel.setBounds(80, 34, 301, 39);
        choice1PanelImg.add(lblNewLabel);
	}

	//	????????? ?????? ???????????????  ??????	
	public void choice2(ImagePanel choice1PanelImg ,Menu menu) {
        choice1Panel = new JPanel();
        frame.getContentPane().add(choice1PanelImg, BorderLayout.CENTER);
        choice1PanelImg.setLayout(null);
        System.out.println("??????????????? ???????????????");
        
        JButton cr1_1 = new JButton("");
        cr1_1.setContentAreaFilled(false);
        cr1_1.setBorderPainted(false);
        cr1_1.setFocusPainted(false);
        cr1_1.setBounds(46, 360, 143, 49);
        cr1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		choice1PanelImg.setVisible(false);
                menu.setChoiceRecipe1(0);
                choice1(choice2PanelImg,menu);
                choice3(choice2PanelImg,menu);
        	}
        });
        choice1PanelImg.add(cr1_1);
        JButton cr1_2 = new JButton("");
        cr1_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		choice1PanelImg.setVisible(false);
                menu.setChoiceRecipe1(1);
                choice1(choice2PanelImg,menu);
                choice3(choice2PanelImg,menu);
        	}
        });
        cr1_2.setContentAreaFilled(false);
        cr1_2.setBorderPainted(false);
        cr1_2.setFocusPainted(false);
        cr1_2.setBounds(217, 360, 143, 49);
        choice1PanelImg.add(cr1_2);
        
        JButton cr1_3 = new JButton("");
        cr1_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		choice1PanelImg.setVisible(false);
                menu.setChoiceRecipe1(2);
                choice1(choice2PanelImg,menu);
                choice3(choice2PanelImg,menu);
        	}
        });
        cr1_3.setContentAreaFilled(false);
        cr1_3.setBorderPainted(false);
        cr1_3.setFocusPainted(false);
        cr1_3.setBounds(46, 462, 143, 49);
        choice1PanelImg.add(cr1_3);
        
        JButton cr1_4 = new JButton("");
        cr1_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		choice1PanelImg.setVisible(false);
                menu.setChoiceRecipe1(3);
                choice1(choice2PanelImg,menu);
                choice3(choice2PanelImg,menu);
        	}
        });
        cr1_4.setContentAreaFilled(false);
        cr1_4.setBorderPainted(false);
        cr1_4.setFocusPainted(false);
        cr1_4.setBounds(217, 462, 143, 49);
        choice1PanelImg.add(cr1_4);
        System.out.println("????????? ?????? ???");
}
	
	//	????????? ?????? ??????????????? 
	public void choice3(ImagePanel choice2Pane1Img, Menu menu) {
        choice2Panel = new JPanel();
        frame.getContentPane().add(choice2Pane1Img, BorderLayout.CENTER);
        choice2Pane1Img.setLayout(null);
        
        JButton cr2_1 = new JButton("");
        cr2_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		choice2Pane1Img.setVisible(false);
                menu.setChoiceRecipe2(0);
                finalP(menu);
        	}
        });
        cr2_1.setBounds(129, 330, 139, 51);
        cr2_1.setContentAreaFilled(false);
        cr2_1.setBorderPainted(false);
        cr2_1.setFocusPainted(false);
        choice2Pane1Img.add(cr2_1);
        
        
        JButton cr2_2 = new JButton("2");
        cr2_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		choice2Pane1Img.setVisible(false);
                menu.setChoiceRecipe2(1);
                finalP(menu);
        	}
        });
        cr2_2.setBounds(129, 398, 139, 51);
        cr2_2.setContentAreaFilled(false);
        cr2_2.setBorderPainted(false);
        cr2_2.setFocusPainted(false);
        choice2Pane1Img.add(cr2_2);
        
        JButton cr2_3 = new JButton("");
        cr2_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		choice2Pane1Img.setVisible(false);
                menu.setChoiceRecipe2(2);
                finalP(menu);
        	}
        });
        cr2_3.setBounds(129, 471, 139, 51);
        cr2_3.setContentAreaFilled(false);
        cr2_3.setBorderPainted(false);
        cr2_3.setFocusPainted(false);
        choice2Pane1Img.add(cr2_3);
	}
	
	//	??????????????? ??????
	public void finalP(Menu menu) {
		
        finalPanel = new JPanel();
        frame.getContentPane().add(finalPanelImg, BorderLayout.CENTER);
        finalPanelImg.setLayout(null);
        JLabel moneyAll = new JLabel(menu.check(menu.getChoiceNum(), menu.getChoiceRecipe1(), menu.getChoiceRecipe2()));
    	System.out.println("??????" + menu.getChoiceNum()+""+menu.getChoiceRecipe1()+""+menu.getChoiceRecipe2());
    	moneyAll.setForeground(new Color(128, 0, 0));
    	moneyAll.setHorizontalAlignment(SwingConstants.CENTER);
    	moneyAll.setFont(new Font("??????????????? ??????", Font.PLAIN, 30));
    	moneyAll.setBounds(94, 116, 223, 38);
    	finalPanelImg.add(moneyAll);
        
		JButton end = new JButton("");
       	end.setContentAreaFilled(false);
       	end.setBorderPainted(false);
       	end.setFocusPainted(false);
    	end.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			System.exit(0);
    		}
    	});
    	end.setBounds(222, 490, 140, 46);
    	finalPanelImg.add(end);
    	
    	JButton continue1 = new JButton("");
    	continue1.setContentAreaFilled(false);
    	continue1.setBorderPainted(false);
    	continue1.setFocusPainted(false);
    	continue1.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			finalPanelImg.setVisible(false);
    			menuChoice(menu);
    		}
    	});
    	check = true;
    	continue1.setBounds(58, 490, 140, 46);
    	finalPanelImg.add(continue1);
	}
}
