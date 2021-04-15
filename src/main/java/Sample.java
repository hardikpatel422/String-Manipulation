import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Sample {
      public static void main(String[] args)
    {
//        new Sample();
       
         JFrame f;
    JLabel inputLabel=new JLabel("Input String");
    JLabel skipLabel=new JLabel("Skip last");
    JLabel wordLabel=new JLabel("words in sentence");
    JLabel outLabel=new JLabel("Output");
    JTextArea iTextArea=new JTextArea(5,50);
    JTextField oTextArea=new JTextField();
    
    JTextArea outTextArea=new JTextArea(5,50);
 iTextArea.setLineWrap(true);
 outTextArea.setLineWrap(true);

    JButton runButton=new JButton("Run");
    
    f=new JFrame();
        f.setTitle("String Manipulation");
        f.setBounds(50,100,500,500);
        f.getContentPane().setBackground(Color.lightGray);
        f.getContentPane().setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        
        inputLabel.setBounds(20,20,80,70);
        iTextArea.setBounds(120,50,160,80);
        skipLabel.setBounds(120,130,80,70);
        oTextArea.setBounds(175,155,35,25);
        wordLabel.setBounds(220,130,80,70);
        outLabel.setBounds(20, 250, 80, 70);
        outTextArea.setBounds(120, 280, 160, 80);
        runButton.setBounds(160, 230, 80, 23);
        
        
         f.add(inputLabel);
        f.add(skipLabel);
        f.add(wordLabel);
        f.add(iTextArea);
        f.add(oTextArea);
        f.add(outLabel);
        f.add(outTextArea);
        f.add(runButton);
        
        
        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	// declaring variables 
                 String result = "",output="";
    String paragraph = iTextArea.getText();  
    
 // splitting string after . and storing in array
    String[] s=paragraph.split("\\.");
    
 // loop for swapping words
    for (int i = 0; i < s.length; i++) {    
    int n=Integer.parseInt(oTextArea.getText());
    
 // trimming array if extra space is there and storing all words in new array
    s[i]=s[i].trim();
    String[] words = s[i].split(" ");
    result = "";
    
 // if words are > 2 swap and reverse them append in new string
    if(words.length>n){
    for (int rev = words.length - (n+1); rev >= 0; rev--) {
        result += (words[rev] + " ");
    }   
    
    for (int k = (words.length-n); k < words.length; k++) {
        if(k == (words.length-1)){
            result += (words[k] + ".") ;
        }else{
            result += (words[k] + " ") ;
        }
    }
    output+=(result +" ");
    }
 // else append same words in string
    else{
        for (int k = 0; k < words.length; k++) {
            if(k == (words.length-1)){
                result += (words[k] + ".") ;
            }else{
                result += (words[k] + " ") ;
            }
        }
        output+=(result +" ");
    }
    }
    System.out.println(output);
     outTextArea.setText(output);

            }
        });
    }
   
}