import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class calci{
        JFrame f=new JFrame("Calci");
        JButton b0=new JButton("0");
        JButton b1=new JButton("1");
        JButton b2=new JButton("2");
        JButton b3=new JButton("3");
        JButton b4=new JButton("4");
        JButton b5=new JButton("5");
        JButton b6=new JButton("6");
        JButton b7=new JButton("7");
        JButton b8=new JButton("8");
        JButton b9=new JButton("9");
        JButton bm=new JButton("*");
        JButton bs=new JButton("-");
        JButton ba=new JButton("+");
        JButton bd=new JButton("/");
        JButton be=new JButton("=");
        JButton bc=new JButton("Clear");
        TextField t=new TextField("Enter values");
        boolean b=true;
        int n;
        String s="";
    calci()
    {
        JPanel num = new JPanel();
        num.add(b7);
        num.add(b8);
        num.add(b9);
        num.add(ba);
        num.add(b4);
        num.add(b5);
        num.add(b6);
        num.add(bs);
        num.add(b1);
        num.add(b2);
        num.add(b3);
        num.add(bm);
        num.add(bc);
        num.add(b0);
        num.add(be);
        num.add(bd);
        b0.addActionListener(new number());
        b1.addActionListener(new number());
        b2.addActionListener(new number());
        b3.addActionListener(new number());
        b4.addActionListener(new number());
        b5.addActionListener(new number());
        b6.addActionListener(new number());
        b7.addActionListener(new number());
        b8.addActionListener(new number());
        b9.addActionListener(new number());
        bm.addActionListener(new operator());
        ba.addActionListener(new operator());
        bs.addActionListener(new operator());
        bd.addActionListener(new operator());
        bc.addActionListener(new operator());
        be.addActionListener(new operator());
        t.setBounds(30, 40,90,30);
        num.setLayout(new GridLayout(4,4,2,2));
        f.add(t);
        f.add(num);
        f.setLayout(new GridLayout(2,1,0,0));
        f.setSize(320,420);
        // f.setFocusable(true); 
        // f.setFocusTraversalKeysEnabled(false);
        f.setResizable(false);
        f.setVisible(true);
    }
    class number implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String temp="";
            if(e.getSource()==b0)
            {
              if(!b)
              temp=t.getText();
              t.setText(temp+"0");  
            }
            if(e.getSource()==b1)
            {
                if(!b)
                temp=t.getText();
              t.setText(temp+"1");
            }
            if(e.getSource()==b2)
            {
                if(!b)
                temp=t.getText();
              t.setText(temp+"2");
            }
            if(e.getSource()==b3)
            {
                if(!b)
                temp=t.getText();
              t.setText(temp+"3");
            }
            if(e.getSource()==b4)
            {
                if(!b)
                temp=t.getText();
                t.setText(temp+"4"); 
            }
            if(e.getSource()==b5)
            {
                if(!b)
                temp=t.getText();
              t.setText(temp+"5");
            }
            if(e.getSource()==b6)
            {
                if(!b)
                temp=t.getText();
                t.setText(temp+"6"); 
            }
            if(e.getSource()==b7)
            {
                if(!b)
                temp=t.getText();
                t.setText(temp+"7"); 
            }
            if(e.getSource()==b8)
            {
                if(!b)
                temp=t.getText();
                t.setText(temp+"8"); 
            }
            if(e.getSource()==b9)
            {
                if(!b)
                temp=t.getText();
                t.setText(temp+"9"); 
            }
            b=false;
        }

    }
    class operator implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==ba)
            {
                s=t.getText();
                n=1;t.setText("");
            }
            if(e.getSource()==bs)
            {
                s=t.getText();
                n=2;t.setText("");
            }
            if(e.getSource()==bm)
            {
                s=t.getText();
                n=3;t.setText("");
            }
            if(e.getSource()==bd)
            {
                s=t.getText();
                n=4;t.setText("");
            }
            if(e.getSource()==bc)
            {
                t.setText("Enter values");
                b=true;
            }
            if(e.getSource()==be)
            {
                int k;
                if(n==0){
                k=Integer.parseInt(s);
                t.setText(String.valueOf(k));
                }
                else if(n==1)
                {
                    k=Integer.parseInt(s)+Integer.parseInt(t.getText());
                    t.setText(String.valueOf(k));
                }
                else if(n==2)
                {
                    k=Integer.parseInt(s)-Integer.parseInt(t.getText());
                    t.setText(String.valueOf(k));
                }
                else if(n==3)
                {
                    k=Integer.parseInt(s)*Integer.parseInt(t.getText());
                    t.setText(String.valueOf(k));
                }
                else if(n==4)
                {
                    k=Integer.parseInt(s)/Integer.parseInt(t.getText());
                    t.setText(String.valueOf(k));
                }
            }
        }

    }
    public static void main(String[] args) 
    {
       new calci();
    }
}