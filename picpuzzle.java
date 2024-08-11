import java.awt.event.*;  
import java.awt.*;  
import javax.swing.*;  
class picpuzzle extends JFrame implements ActionListener{  
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,sample,starB;  
Icon star;  
Icon ic0=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\01.jpg");  
Icon ic20=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\college.jpg");  
Icon samicon1=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\main.jpg");  
Icon samicon3=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\college.jpg");  
Icon ic1=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\WhatsApp Image 2024-08-08 at 21.43.20_236d22c4.jpg");  
Icon ic2=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\WhatsApp Image 2024-08-08 at 21.43.16_4c90522f.jpg");  
Icon ic3=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\12.jpg");  
Icon ic4=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\WhatsApp Image 2024-08-08 at 21.43.17_676ca869.jpg");  
Icon ic5=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\WhatsApp Image 2024-08-08 at 21.43.18_68596ad3.jpg");  
Icon ic6=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\13.jpg");  
Icon ic7=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\14.jpg");  
Icon ic8=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\WhatsApp Image 2024-08-08 at 21.43.19_1fcb1ae8.jpg");  
Icon ic9=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\16.jpg");  

  
Icon ic21=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\image_part_001.jpg");  
Icon ic22=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\image_part_002.jpg");  
Icon ic23=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\image_part_003.jpg");  
Icon ic24=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\image_part_004.jpg");  
Icon ic25=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\image_part_005.jpg");  
Icon ic26=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\image_part_006.jpg");  
Icon ic27=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\image_part_007.jpg");  
Icon ic28=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\image_part_008.jpg");  
Icon ic29=new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\image_part_009.jpg");  
  
picpuzzle(){  
  
super("pic puzzle(created by HAZEERA)");  
  
b1=new JButton(ic1);  
b1.setBounds(10,100,200,200);  
b2=new JButton(ic2);  
b2.setBounds(210,100,200,200);  
b3=new JButton(ic3);  
b3.setBounds(410,100,200,200);  
b4=new JButton(ic4);  
b4.setBounds(10,300,200,200);  
b5=new JButton(ic5);  
b5.setBounds(210,300,200,200);  
b6=new JButton(ic6);  
b6.setBounds(410,300,200,200);  
b7=new JButton(ic7);  
b7.setBounds(10,500,200,200);  
b8=new JButton(ic8);  
b8.setBounds(210,500,200,200);  
b9=new JButton(ic9);  
b9.setBounds(410,500,200,200);  
sample=new JButton(samicon1);  
sample.setBounds(800,110,600,600);  
    
b1=new JButton(ic21);  
b1.setBounds(10,100,200,200);  
b2=new JButton(ic22);  
b2.setBounds(210,100,200,200);  
b3=new JButton(ic23);  
b3.setBounds(410,100,200,200);  
b4=new JButton(ic24);  
b4.setBounds(10,300,200,200);  
b5=new JButton(ic25);  
b5.setBounds(210,300,200,200);  
b6=new JButton(ic26);  
b6.setBounds(410,300,200,200);  
b7=new JButton(ic27);  
b7.setBounds(10,500,200,200);  
b8=new JButton(ic28);  
b8.setBounds(210,500,200,200);  
b9=new JButton(ic29);  
b9.setBounds(410,500,200,200);  
sample=new JButton(samicon3);  
sample.setBounds(800,110,600,600);  
JLabel l1=new JLabel("Sample:");  
l1.setBounds(330,200,200,20);  
JLabel l2=new JLabel("icon has power to swap with neighbour icon=");  
l2.setBounds(5,15,500,20);  
JLabel l3=new JLabel(" puzzle:");  
l3.setBounds(680,320,200,200);  
l3.setForeground(Color.red);  
  
starB=new JButton(ic0);  
starB.setBounds(330,5,50,50);  
star=b9.getIcon();  
  
add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);  
add(b9);add(sample);add(l1);add(l2);add(starB);add(l3);  
b1.addActionListener(this); b2.addActionListener(this);  
 b3.addActionListener(this); b4.addActionListener(this);   
b5.addActionListener(this); b6.addActionListener(this);  
 b7.addActionListener(this); b8.addActionListener(this);  
 b9.addActionListener(this);   
  
sample.addActionListener(this);  
setLayout(null);  
setSize(1000,1000);  
setVisible(true);  
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
}  
  
public void actionPerformed(ActionEvent e){  
if(e.getSource()==b1){  
    Icon s1=b1.getIcon();  
      if(b2.getIcon()==star){  
        b2.setIcon(s1);  
        b1.setIcon(star);  
      } else if(b4.getIcon()==star){  
                    b4.setIcon(s1);  
                    b1.setIcon(star);  
                   }  
  }//end of if  
  
if(e.getSource()==b2){  
    Icon s1=b2.getIcon();  
      if(b1.getIcon()==star){  
        b1.setIcon(s1);  
        b2.setIcon(star);  
      } else if(b5.getIcon()==star){  
                    b5.setIcon(s1);  
                    b2.setIcon(star);  
                   }  
         else if(b3.getIcon()==star){  
                    b3.setIcon(s1);  
                    b2.setIcon(star);  
                   }  
  }//end of if  
  
if(e.getSource()==b3){  
    Icon s1=b3.getIcon();  
      if(b2.getIcon()==star){  
        b2.setIcon(s1);  
        b3.setIcon(star);  
      } else if(b6.getIcon()==star){  
                    b6.setIcon(s1);  
                    b3.setIcon(star);  
                   }  
  }//end of if  
  
if(e.getSource()==b4){  
    Icon s1=b4.getIcon();  
      if(b1.getIcon()==star){  
        b1.setIcon(s1);  
        b4.setIcon(star);  
      } else if(b5.getIcon()==star){  
                    b5.setIcon(s1);  
                    b4.setIcon(star);  
                   }  
         else if(b7.getIcon()==star){  
                    b7.setIcon(s1);  
                    b4.setIcon(star);  
                   }  
  }//end of if  
  
if(e.getSource()==b5){  
    Icon s1=b5.getIcon();  
      if(b2.getIcon()==star){  
        b2.setIcon(s1);  
        b5.setIcon(star);  
      } else if(b4.getIcon()==star){  
                    b4.setIcon(s1);  
                    b5.setIcon(star);  
                   }  
         else if(b6.getIcon()==star){  
                    b6.setIcon(s1);  
                    b5.setIcon(star);  
                   }  
          else if(b8.getIcon()==star){  
                    b8.setIcon(s1);  
                    b5.setIcon(star);  
                   }  
  }//end of if  
  
if(e.getSource()==b6){  
    Icon s1=b6.getIcon();  
      if(b3.getIcon()==star){  
        b3.setIcon(s1);  
        b6.setIcon(star);  
      } else if(b5.getIcon()==star){  
                    b5.setIcon(s1);  
                    b6.setIcon(star);  
                   }  
         else if(b9.getIcon()==star){  
                    b9.setIcon(s1);  
                    b6.setIcon(star);  
                   }  
}//end of if  
  
if(e.getSource()==b7){  
    Icon s1=b7.getIcon();  
      if(b4.getIcon()==star){  
        b4.setIcon(s1);  
        b7.setIcon(star);  
      } else if(b8.getIcon()==star){  
                    b8.setIcon(s1);  
                    b7.setIcon(star);  
                   }  
 }//end of if  
  
   if(e.getSource()==b8){  
    Icon s1=b8.getIcon();  
      if(b7.getIcon()==star){  
        b7.setIcon(s1);  
        b8.setIcon(star);  
      } else if(b5.getIcon()==star){  
                    b5.setIcon(s1);  
                    b8.setIcon(star);  
                   }  
         else if(b9.getIcon()==star){  
                    b9.setIcon(s1);  
                    b8.setIcon(star);  
                   }  
  
  }//end of if  
  
 if(e.getSource()==b9){  
    Icon s1=b9.getIcon();  
      if(b8.getIcon()==star){  
        b8.setIcon(s1);  
        b9.setIcon(star);  
      } else if(b6.getIcon()==star){  
                    b6.setIcon(s1);  
                    b9.setIcon(star);  
                   }  
  }//end of if  
  
if(e.getSource()==sample){  
Icon s1=sample.getIcon();  
 if(s1==samicon3){  
sample.setIcon(samicon1);  
b1.setIcon(ic1);  
b2.setIcon(ic2);  
b3.setIcon(ic3);  
b4.setIcon(ic4);  
b5.setIcon(ic5);  
b6.setIcon(ic6);  
b7.setIcon(ic7);  
b8.setIcon(ic8);  
b9.setIcon(ic9);  
star=b9.getIcon();  
starB.setIcon(ic0);  
}//eof if  
 
//eof else  
else{  
sample.setIcon(samicon3);  
b1.setIcon(ic21);  
b2.setIcon(ic22);  
b3.setIcon(ic23);  
b4.setIcon(ic24);  
b5.setIcon(ic25);  
b6.setIcon(ic26);  
b7.setIcon(ic27);  
b8.setIcon(ic28);  
b9.setIcon(ic29);  
star=b6.getIcon();  
starB.setIcon(ic20);  
}//eof else  
  
}  
}//end of actionPerformed  
  
public static void main(String args[]){  
new picpuzzle();  
}//end of main  
}//end of class
