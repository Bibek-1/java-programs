import javax.swing.*;
import java.awt.event.*;
public class rectangleCalculator extends JFrame implements ActionListener {
    JFrame f;
    JLabel lb1;
    JLabel lb2;
    JLabel lb3;
    JLabel lb4;
    JTextField t1,t2,arearesult,periresult;
    JButton b1;
    
public q4rectangleCalculator()
{
    f = new JFrame("Rectangle");
    lb1 = new JLabel("Enter length");
    lb2 = new JLabel("Enter breadth");
    lb3 = new JLabel ("Area:"); 
    lb4 = new JLabel("perimeter:");
    t1 = new JTextField();
    t2 = new JTextField();
    arearesult = new JTextField();
    periresult = new JTextField();
    
    b1 = new JButton ("calculate");
    
    f.setSize(300,300);
    f.setVisible(true);
    f.setDefaultCloseOperation(3);
    f.setLayout(null);
    
    lb1.setBounds(20, 20, 200, 25);
    lb2.setBounds(20, 50, 200, 25);
    lb3.setBounds(20, 90, 200, 25);
    lb4.setBounds(20, 120, 200, 25);
    
    t1.setBounds(140, 20, 100, 25);
    t2.setBounds(140, 50, 100, 25);
    arearesult.setBounds(140, 90, 100, 25);
    arearesult.setEditable(false);
    periresult.setBounds(140, 120,100,25);
    periresult.setEditable(false);
    
    b1.setBounds(100, 160, 100, 30);
    b1.addActionListener(this);
    
    f.add(lb1);
       f.add(lb2);
       f.add(lb3);
        f.add(lb4);
        f.add(t1);
        f.add(t2);
        f.add(arearesult);
        f.add(perimeterresult);
        f.add(b1);
     
}
@Override

public void actionPerformed(ActionEvent e) {
       double length = Double.parseDouble(t1.getText());
        double width = Double.parseDouble(t2.getText());
        double perimeter = 2 * (length + width);
        double area = length * width;
        perimeterresult.setText(String.valueOf(perimeter));
        arearesult.setText(String.valueOf(area));
}
public static void main (String[]args){
    {
           new rectangleCalculator();
}
}
}
