import javax.swing.*;

public class HelloWorld{
  public static void main(String args[]){
    JFrame f = new JFrame("Hello World");
    f.setBounds(200, 200, 300, 400);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
} 