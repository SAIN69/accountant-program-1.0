//package Components;

import java.awt.*;

import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Paths;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;

public class MyFrame extends JFrame implements ActionListener{


    JButton button;
    JButton button1;

    //Between 1000 and 10000
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button10;
    JButton button11;
    JButton button12;
    JButton button13;



    JTextField textfield;
    JTextField textfield1;
    static JTextField textfield2;
    JTextField textfield3;
    JTextField textfield4;
    JTextField textfield5;
    JTextField textfield6;
    JTextField textfield7;
    JTextField textfield8;





    JLabel label;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;


    JLabel windows;
    JLabel linux;

    JLabel yes1;
    JLabel yes2;


    JLabel background;

    static JCheckBox box1;
    static JCheckBox box2;
    static JCheckBox box3;
    static JCheckBox box4;
    static JCheckBox box5;

    JTextPane jtp;
    JTextPane jtp2;
    JTextPane jtp3;
    JTextPane jtp4;


    MyFrame()
    {


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,850);
        this.setLayout(null);
        //this.setPreferredSize(new Dimension(490,850));

        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);

        //The checkbox for windows and Linux
        box1 = new JCheckBox();
        box1.setBounds(10, 670, 20, 20);

        box2 = new JCheckBox();
        box2.setBounds(120, 670, 20, 20);

        box3 = new JCheckBox();
        box3.setBounds(560, 155, 20, 20);

        box4 = new JCheckBox();
        box4.setBounds(600, 285, 20, 20);

        box5 = new JCheckBox();
        box5.setBounds(600, 400, 20, 20);






        //Submit button
        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);
        button.setPreferredSize(new Dimension(150,50));
        button.setBounds(10, 700, 100, 100);

        //Print button
        button1 = new JButton();
        button1.setText("Print");
        button1.addActionListener(this);
        button1.setPreferredSize(new Dimension(150,50));
        button1.setBounds(120, 700, 100, 100);


        //Dev tools show button
        button12 = new JButton();
        button12.setText("Show");
        button12.addActionListener(this);
        button12.setBounds(230, 700, 100, 40);

        //Dev tools hide button (used to be here)





        //Name
        label = new JLabel();
        label.setText("Enter name:");
        label.setFont(new Font("Comic Sans MS",Font.PLAIN,30));
        label.setBounds(10, 10, 200, 40);

        //Surname
        label1 = new JLabel();
        label1.setText("Enter surname:");
        label1.setFont(new Font("Comic Sans MS",Font.PLAIN,30));
        label1.setBounds(420, -28, 250, 120);

        //Salary
        label2 = new JLabel();
        label2.setText("Enter salary:");
        label2.setFont(new Font("Comic Sans MS",Font.PLAIN,30));
        label2.setBounds(10, 100, 190, 120);

        //Experience
        label3 = new JLabel();
        label3.setText("Enter experience:");
        label3.setFont(new Font("Comic Sans MS",Font.PLAIN,30));
        label3.setBounds(10, 230, 270, 120);

        //File name
        label4 = new JLabel();
        label4.setText("Enter file name:");
        label4.setFont(new Font("Comic Sans MS",Font.PLAIN,30));
        label4.setBounds(10, 490, 240, 120);

        //Dev Tools
        label5 = new JLabel();
        label5.setText("<HTML><u>Dev Tools</u><HTML>");
        label5.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
        label5.setBounds(230, 635, 100, 100);

        //Days off
        label6 = new JLabel();
        label6.setText("Отпуск:");
        label6.setFont(new Font("Comic Sans MS",Font.PLAIN,30));
        label6.setBounds(420, 125, 400, 70);

        //Contagion
        label7 = new JLabel();
        label7.setText("Болничен:");
        label7.setFont(new Font("Comic Sans MS",Font.PLAIN,30));
        label7.setBounds(420, 230, 260, 120);

        //Both
        label8 = new JLabel();
        label8.setText("И двете?");
        label8.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
        label8.setBounds(620, 390, 100, 40);

        //Labels for checkboxes
        windows = new JLabel();
        windows.setText("Windows");
        windows.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
        windows.setBounds(35, 630, 100, 100);

        linux = new JLabel();
        linux.setText("Linux");
        linux.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
        linux.setBounds(145, 630, 100, 100);

        yes1 = new JLabel();
        yes1.setText("Да");
        yes1.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
        yes1.setBounds(580, 145, 40, 40);

        yes2 = new JLabel();
        yes2.setText("Да");
        yes2.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
        yes2.setBounds(620, 275, 40, 40);






        //1-st textfield
        textfield = new JTextField();
        textfield.setPreferredSize(new Dimension(400,70));
        textfield.setFont(new Font("Comic Sans",Font.PLAIN,30));
        textfield.setForeground(new Color(0x808080));
        //textfield.setBackground(Color.black);
        textfield.setCaretColor(Color.black);
        //textfield.setText("Name...");
        textfield.setBounds(10, 60, 400, 70);

        //2-st textfield
        textfield1 = new JTextField();
        textfield1.setPreferredSize(new Dimension(400,70));
        textfield1.setFont(new Font("Comic Sans",Font.PLAIN,30));
        textfield1.setForeground(new Color(0x808080));
        //textfield1.setBackground(Color.black);
        textfield1.setCaretColor(Color.black);
        //textfield1.setText("Surname...");
        textfield1.setBounds(420, 60, 400, 70);

        //3-st textfield
        textfield2 = new JTextField();
        textfield2.setPreferredSize(new Dimension(400,70));
        textfield2.setFont(new Font("Comic Sans",Font.PLAIN,30));
        textfield2.setForeground(new Color(0x808080));
        //textfield2.setBackground(Color.black);
        textfield2.setCaretColor(Color.black);
        //textfield2.setText("Salary...");
        textfield2.setBounds(10, 190, 400, 70);

        //4-st textfield
        textfield3= new JTextField();
        textfield3.setPreferredSize(new Dimension(400,70));
        textfield3.setFont(new Font("Comic Sans",Font.PLAIN,30));
        textfield3.setForeground(new Color(0x808080));
        //textfield3.setBackground(Color.);
        textfield3.setCaretColor(Color.black);
        //textfield3.setText("Experience...");
        textfield3.setBounds(10, 320, 400, 70);

        //5-st textfield
        textfield4= new JTextField();
        textfield4.setPreferredSize(new Dimension(400,70));
        textfield4.setFont(new Font("Comic Sans",Font.PLAIN,30));
        textfield4.setForeground(new Color(0x808080));
        //textfield4.setBackground(Color.black);
        textfield4.setCaretColor(Color.black);
        //textfield4.setText("File name...");
        textfield4.setBounds(10, 580, 400, 70);

        //6-st textfield
        textfield5= new JTextField();
        textfield5.setPreferredSize(new Dimension(400,70));
        textfield5.setFont(new Font("Comic Sans",Font.PLAIN,30));
        textfield5.setForeground(new Color(0x808080));
        //textfield5.setBackground(Color.black);
        textfield5.setCaretColor(Color.black);
        //textfield5.setText("Working days in the month");
        textfield5.setText("0");
        textfield5.setBounds(420, 190, 100, 70);

        //7-st textfield
        textfield6= new JTextField();
        textfield6.setPreferredSize(new Dimension(400,70));
        textfield6.setFont(new Font("Comic Sans",Font.PLAIN,30));
        textfield6.setForeground(new Color(0x808080));
        //textfield6.setBackground(Color.black);
        textfield6.setCaretColor(Color.black);
        //textfield6.setText("The days you want to be absent ");
        textfield6.setText("0");
        textfield6.setBounds(530, 190, 100, 70);

        //8-st textfield
        textfield7= new JTextField();
        textfield7.setPreferredSize(new Dimension(400,70));
        textfield7.setFont(new Font("Comic Sans",Font.PLAIN,30));
        textfield7.setForeground(new Color(0x808080));
        //textfield7.setBackground(Color.black);
        textfield7.setCaretColor(Color.black);
        //textfield7.setText("Sick days");
        textfield7.setText("0");
        textfield7.setBounds(420, 320, 100, 70);

        //9-st textfield
        textfield8= new JTextField();
        textfield8.setPreferredSize(new Dimension(400,70));
        textfield8.setFont(new Font("Comic Sans",Font.PLAIN,30));
        textfield8.setForeground(new Color(0x808080));
        //textfield7.setBackground(Color.black);
        textfield8.setCaretColor(Color.black);
        //textfield7.setText("Sick days");
        textfield8.setText("0");
        textfield8.setBounds(530, 320, 100, 70);







        this.setVisible(true);
        this.setTitle("Helper Form");


        this.add(label);
        //name
        this.add(textfield);
        this.add(label1);
        //surname
        this.add(textfield1);
        this.add(label2);
        //salary
        this.add(textfield2);
        this.add(label3);
        //experience
        this.add(textfield3);
        this.add(label4);
        //fileName
        this.add(textfield4);
        //Days off
        this.add(textfield5);
        this.add(label6);
        this.add(yes1);
        this.add(textfield6);

        //Contagion
        this.add(label7);
        this.add(label8);


        //Submit button
        this.add(button);
        this.add(button1);
        //Dev Tools
        this.add(label5);
        this.add(button12);

        //For the checkbox
        this.add(windows);
        this.add(linux);
        this.add(yes2);
        this.add(textfield7);
        this.add(textfield8);
        //Buttons 1000-10000

        this.add(box1);
        this.add(box2);
        this.add(box3);
        this.add(box4);
        this.add(box5);

        //this.add(background);





        //this.pack();


    }

    //Метод за запзване на информацията във файл
    //Method for saving the file
    public static void appendtext(String fileName, String fileContents,String fileContents2
            ,double fileContents3,int fileContents4,double fileContents5,double fileContents6
            ,double fileContents7, double fileContents8,double fileContents9, double fileContents10,
                                  double fileContents11, double fileContents12, double fileContents13,double fileContents14, double fileContents15)
    {
        //String path = Paths.get("//home//da1") + "//Desktop//" +fileName + ".txt";
        //String path = System.getProperty("user.home") + "\\Desktop\\" + fileName + ".txt";

        String path = "";
        if(box1.isSelected())
        {
            path = System.getProperty("user.home") + "\\Desktop\\" + fileName + ".txt";
        }
        else if(box2.isSelected())
        {
            path = Paths.get("//home//") + "Desktop//" + fileName + ".txt";

        }

        try
        {
            FileWriter fw = new FileWriter(path,true);
            PrintWriter pw = new PrintWriter(fw);

            fw.write("Фиш за изплатена заплата:");
            fw.write("\n.........................................");
            fw.write("\n. Име на работника: " +fileContents);
            fw.write("\n.........................................");
            fw.write("\n. Фамилия на работника: " +fileContents2);
            fw.write("\n.........................................");
            fw.write("\n");
            fw.write("\n.........................................");
            pw.print("\n. Стаж на работника: " + fileContents4);
            fw.write("\n.........................................");
            pw.printf("\n. Данък Общ Доход : %.2f  ", fileContents6);
            fw.write("\n.........................................");
            pw.printf("\n. Заплата на работника: %.2f", fileContents3);
            fw.write("\n.........................................");
            pw.printf("\n. Облагаема сума на работника : %.2f  ", fileContents5);
            fw.write("\n.........................................");
            pw.printf("\n. Сума за изплащане : %.2f  ", fileContents7);
            fw.write("\n.........................................");
            pw.printf("\n. При заплата > 3400 : %.2f  ", fileContents15);
            fw.write("\n.........................................");
            pw.printf("\n. Болничен за 3 дни сума: %.2f  ", fileContents10);
            fw.write("\n.........................................");
            pw.printf("\n. Сума за останалите дни болничен: %.2f  ", fileContents12);
            fw.write("\n.........................................");
            pw.printf("\n. Отпуск сума (колко дни си бил в отпуск): %.2f  ", fileContents8);
            fw.write("\n.........................................");
            pw.printf("\n. Сума за отработените дни (Оставащи от месеца в които си ползвал отпуск): %.2f  ", fileContents11);
            fw.write("\n.........................................");
            pw.printf("\n");
            fw.write("\n.........................................");
            pw.printf("\n. Начисляване (Отпуск): %.2f  ", fileContents9);
            fw.write("\n.........................................");
            pw.printf("\n. Начисляване (Болничен): %.2f  ", fileContents13);
            fw.write("\n.........................................");
            pw.printf("\n. Начисляване (Болничен и Отпуск): %.2f  ", fileContents14);
            fw.write("\n.........................................");
            fw.write("\n");
            fw.write("\n");
            fw.write("\n");





            fw.close();
        }
        catch(IOException e )
        {
            e.printStackTrace();
        }
        //System.out.println();
        //System.out.println("File contents saved into " + fileName);


    }

    //Clean salary

    public static void appendtext1(String fileName, String fileContents,String fileContents2
            ,double fileContents3,int fileContents4,double fileContents5,double fileContents6
            ,double fileContents7)
    {
        //String path = Paths.get("//home//da1") + "//Desktop//" +fileName + ".txt";
        //String path = System.getProperty("user.home") + "\\Desktop\\" + fileName + ".txt";

        String path = "";
        if(box1.isSelected())
        {
            path = System.getProperty("user.home") + "\\Desktop\\" + fileName + ".txt";
        }
        else if(box2.isSelected())
        {
            path = Paths.get("//home//da1") + "//Desktop//" + fileName + ".txt";
            //path = Paths.get("user.home") + "//Desktop//" + fileName + ".txt";
        }






        //System.out.println();
        //System.out.println(path);




        try
        {
            FileWriter fw = new FileWriter(path,true);
            PrintWriter pw = new PrintWriter(fw);

            fw.write("Фиш за изплатена заплата:");
            fw.write("\n.........................................");
            fw.write("\n. Име на работника: " +fileContents);
            fw.write("\n.........................................");
            fw.write("\n. Фамилия на работника: " +fileContents2);
            fw.write("\n.........................................");
            fw.write("\n");
            fw.write("\n.........................................");
            pw.printf("\n. Заплата на работника: %.2f", fileContents3);
            fw.write("\n.........................................");
            pw.print("\n. Стаж на работника: " + fileContents4);
            fw.write("\n.........................................");
            pw.printf("\n. Облагаема сума на работника : %.2f  ", fileContents5);
            fw.write("\n.........................................");
            pw.printf("\n. Данък Общ Доход : %.2f  ", fileContents6);
            fw.write("\n.........................................");
            pw.printf("\n. Дължима сума за работника : %.2f  ", fileContents7);
            fw.write("\n.........................................");

            fw.write("\n");
            fw.write("\n");
            fw.write("\n");




            fw.close();
        }
        catch(IOException e )
        {
            e.printStackTrace();
        }
        //System.out.println();
        //System.out.println("File contents saved into " + fileName);


    }


    //If you are sick
    public static void appendtext2(String fileName, String fileContents,String fileContents2
            ,double fileContents3,int fileContents4,double fileContents5,double fileContents6
            ,double fileContents7, double fileContents8,double fileContents9,
                                   double fileContents11)
    {
        //String path = Paths.get("//home//da1") + "//Desktop//" +fileName + ".txt";
        //String path = System.getProperty("user.home") + "\\Desktop\\" + fileName + ".txt";

        String path = "";
        if(box1.isSelected())
        {
            path = System.getProperty("user.home") + "\\Desktop\\" + fileName + ".txt";
        }
        else if(box2.isSelected())
        {
            path = Paths.get("//home//da1") + "//Desktop//" + fileName + ".txt";
        }

        try
        {
            FileWriter fw = new FileWriter(path,true);
            PrintWriter pw = new PrintWriter(fw);

            fw.write("Фиш за изплатена заплата:");
            fw.write("\n.........................................");
            fw.write("\n. Име на работника: " +fileContents);
            fw.write("\n.........................................");
            fw.write("\n. Фамилия на работника: " +fileContents2);
            fw.write("\n.........................................");
            fw.write("\n");
            fw.write("\n.........................................");
            pw.print("\n. Стаж на работника: " + fileContents4);
            fw.write("\n.........................................");
            pw.printf("\n. Данък Общ Доход : %.2f  ", fileContents6);
            fw.write("\n.........................................");
            pw.printf("\n. Заплата на работника: %.2f", fileContents3);
            fw.write("\n.........................................");
            pw.printf("\n. Облагаема сума на работника : %.2f  ", fileContents5);
            fw.write("\n.........................................");
            pw.printf("\n. Сума за изплащане : %.2f  ", fileContents7);
            fw.write("\n.........................................");
            pw.printf("\n. Отпуск сума (колко дни си бил в отпуск): %.2f  ", fileContents8);
            fw.write("\n.........................................");
            pw.printf("\n. Сума за отработените дни (Оставащи от месеца в които си ползвал отпуск): %.2f  ", fileContents11);
            fw.write("\n.........................................");
            pw.printf("\n");
            fw.write("\n.........................................");
            pw.printf("\n. Начисляване (Отпуск): %.2f  ", fileContents9);
            fw.write("\n.........................................");
            fw.write("\n");
            fw.write("\n");
            fw.write("\n");





            fw.close();
        }
        catch(IOException e )
        {
            e.printStackTrace();
        }
        //System.out.println();
        //System.out.println("File contents saved into " + fileName);


    }


    //If you took a break
    public static void appendtext3(String fileName, String fileContents,String fileContents2
            ,double fileContents3,int fileContents4,double fileContents5,double fileContents6
            ,double fileContents7, double fileContents10, double fileContents12, double fileContents13)
    {
        //String path = Paths.get("//home//da1") + "//Desktop//" +fileName + ".txt";
        //String path = System.getProperty("user.home") + "\\Desktop\\" + fileName + ".txt";

        String path = "";
        if(box1.isSelected())
        {
            path = System.getProperty("user.home") + "\\Desktop\\" + fileName + ".txt";
        }
        else if(box2.isSelected())
        {
            path = Paths.get("//home//da1") + "//Desktop//" + fileName + ".txt";
        }

        try
        {
            FileWriter fw = new FileWriter(path,true);
            PrintWriter pw = new PrintWriter(fw);

            fw.write("Фиш за изплатена заплата:");
            fw.write("\n.........................................");
            fw.write("\n. Име на работника: " +fileContents);
            fw.write("\n.........................................");
            fw.write("\n. Фамилия на работника: " +fileContents2);
            fw.write("\n.........................................");
            fw.write("\n");
            fw.write("\n.........................................");
            pw.print("\n. Стаж на работника: " + fileContents4);
            fw.write("\n.........................................");
            pw.printf("\n. Данък Общ Доход : %.2f  ", fileContents6);
            fw.write("\n.........................................");
            pw.printf("\n. Заплата на работника: %.2f", fileContents3);
            fw.write("\n.........................................");
            pw.printf("\n. Облагаема сума на работника : %.2f  ", fileContents5);
            fw.write("\n.........................................");
            pw.printf("\n. Сума за изплащане : %.2f  ", fileContents7);
            fw.write("\n.........................................");
            pw.printf("\n. Болничен за 3 дни сума: %.2f  ", fileContents10);
            fw.write("\n.........................................");
            pw.printf("\n. Сума за останалите дни болничен: %.2f  ", fileContents12);
            fw.write("\n.........................................");
            pw.printf("\n");
            fw.write("\n.........................................");
            pw.printf("\n. Начисляване (Болничен): %.2f  ", fileContents13);
            fw.write("\n.........................................");
            fw.write("\n");
            fw.write("\n");
            fw.write("\n");





            fw.close();
        }
        catch(IOException e )
        {
            e.printStackTrace();
        }
        //System.out.println();
        //System.out.println("File contents saved into " + fileName);


    }


    //If you took a break but you were also sick
    public static void appendtext4(String fileName, String fileContents,String fileContents2
            ,double fileContents3,int fileContents4,double fileContents5,double fileContents6
            ,double fileContents7, double fileContents8,double fileContents10,
                                   double fileContents11, double fileContents12,double fileContents14)
    {
        //String path = Paths.get("//home//da1") + "//Desktop//" +fileName + ".txt";
        //String path = System.getProperty("user.home") + "\\Desktop\\" + fileName + ".txt";

        String path = "";
        if(box1.isSelected())
        {
            path = System.getProperty("user.home") + "\\Desktop\\" + fileName + ".txt";
        }
        else if(box2.isSelected())
        {
            //path = Paths.get("user.home") + "//Desktop//" + fileName + ".txt";
            path = Paths.get("//home//da1") + "//Desktop//" + fileName + ".txt";
        }

        try
        {
            FileWriter fw = new FileWriter(path,true);
            PrintWriter pw = new PrintWriter(fw);

            fw.write("Фиш за изплатена заплата:");
            fw.write("\n.........................................");
            fw.write("\n. Име на работника: " +fileContents);
            fw.write("\n.........................................");
            fw.write("\n. Фамилия на работника: " +fileContents2);
            fw.write("\n.........................................");
            fw.write("\n");
            fw.write("\n.........................................");
            pw.print("\n. Стаж на работника: " + fileContents4);
            fw.write("\n.........................................");
            pw.printf("\n. Данък Общ Доход : %.2f  ", fileContents6);
            fw.write("\n.........................................");
            pw.printf("\n. Заплата на работника: %.2f", fileContents3);
            fw.write("\n.........................................");
            pw.printf("\n. Облагаема сума на работника : %.2f  ", fileContents5);
            fw.write("\n.........................................");
            pw.printf("\n. Сума за изплащане : %.2f  ", fileContents7);
            fw.write("\n.........................................");
            pw.printf("\n. Болничен за 3 дни сума: %.2f  ", fileContents10);
            fw.write("\n.........................................");
            pw.printf("\n. Сума за останалите дни болничен: %.2f  ", fileContents12);
            fw.write("\n.........................................");
            pw.printf("\n. Отпуск сума (колко дни си бил в отпуск): %.2f  ", fileContents8);
            fw.write("\n.........................................");
            pw.printf("\n. Сума за отработените дни (Оставащи от месеца в които си ползвал отпуск): %.2f  ", fileContents11);
            fw.write("\n.........................................");
            pw.printf("\n");
            fw.write("\n.........................................");
            pw.printf("\n. Начисляване (Болничен и Отпуск): %.2f  ", fileContents14);
            fw.write("\n.........................................");
            fw.write("\n");
            fw.write("\n");
            fw.write("\n");





            fw.close();
        }
        catch(IOException e )
        {
            e.printStackTrace();
        }
        //System.out.println();
        //System.out.println("File contents saved into " + fileName);


    }


    //If the salary is above 3750 (before it was 3400)
    public static void appendtext5(String fileName, String fileContents,String fileContents2
            ,double fileContents3,int fileContents4,double fileContents5,
                                   double fileContents6,double fileContents15)
    {
        //String path = Paths.get("//home//da1") + "//Desktop//" +fileName + ".txt";
        //String path = System.getProperty("user.home") + "\\Desktop\\" + fileName + ".txt";

        String path = "";
        if(box1.isSelected())
        {
            path = System.getProperty("user.home") + "\\Desktop\\" + fileName + ".txt";
        }
        else if(box2.isSelected())
        {
            //path = Paths.get("//home//") + "Desktop//" + fileName + ".txt";
            path = Paths.get("//home//da1") + "//Desktop//" + fileName + ".txt";

        }

        try
        {
            FileWriter fw = new FileWriter(path,true);
            PrintWriter pw = new PrintWriter(fw);

            fw.write("Фиш за изплатена заплата:");
            fw.write("\n.........................................");
            fw.write("\n. Име на работника: " +fileContents);
            fw.write("\n.........................................");
            fw.write("\n. Фамилия на работника: " +fileContents2);
            fw.write("\n.........................................");
            fw.write("\n");
            fw.write("\n.........................................");
            pw.print("\n. Стаж на работника: " + fileContents4);
            fw.write("\n.........................................");
            pw.printf("\n. Данък Общ Доход : %.2f  ", fileContents6);
            fw.write("\n.........................................");
            pw.printf("\n. Заплата на работника: %.2f", fileContents3);
            fw.write("\n.........................................");
            //pw.printf("\n. Облагаема сума на работника : %.2f  ", fileContents5);
            //fw.write("\n.........................................");
            pw.printf("\n. При заплата > 3400 : %.2f  ", fileContents15);
            fw.write("\n.........................................");
            fw.write("\n");
            fw.write("\n");
            fw.write("\n");





            fw.close();
        }
        catch(IOException e )
        {
            e.printStackTrace();
        }
        //System.out.println();
        //System.out.println("File contents saved into " + fileName);


    }


    //Submit function / All the math is here lmao
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {

            //IF ALL OR ANY TEXTFIELDS ARE EMPTY / CREATE ERROR MESSAGE
            if((textfield.getText().isEmpty()) || (textfield1.getText().isEmpty())
                    || (textfield2.getText().isEmpty()) || (textfield3.getText().isEmpty())
                    || (textfield4.getText().isEmpty()))
            {
                JOptionPane.showMessageDialog(null, "Error while creating the file\n" + "Please fill in all the textfields");

                return;
            }
            else if(box1.isSelected() == false && box2.isSelected() == false)
            {
                JOptionPane.showMessageDialog(null, "Please select the platform you're on!\n" + "Use the checkbox on the main window!" );

                return;
            }
            else if(box1.isSelected() && box2.isSelected())
            {
                JOptionPane.showMessageDialog(null, "Please select only one platform!");

                return;
            }

            //salary
            double n = Double.parseDouble(textfield2.getText());
            double osigurovki = 0;
            double sumataZaDanuka = 0;
            double danukObshtDohod = 0;
            double sumaZaPoluchavane = 0;



            //The file name
            int a = Integer.parseInt(textfield3.getText());
            //Taxes
            double fondPensioneer = 6.58;
            double fondNoWork = 0.40;
            double healthInsurance = 3.20;
            double ozm = 1.40;
            double dzpoFace = 2.20;



            //За отпуската
            int rabotniDniVMeseca = Integer.parseInt(textfield5.getText());
            int kolkoDniOtpusk = Integer.parseInt(textfield6.getText());
            double sumaZaEdinDenOtpusk = 0;
            double sumaZaIzbraniteDniOtpusk = 0;
            double sumaZaOstanaliteDni = 0;
            double nachislqvaneZaOtpuska = 0;



            //За болничният
            int rabotniDniVMeseca2 = Integer.parseInt(textfield7.getText());
            int dniOtpuskZaNOI = Integer.parseInt(textfield8.getText());

            double sumaZaEdinDenBolnichen = 0;
            double sumaZaTriteDniBolnichen = 0;
            double sumaZaSled70Procenta = 0;

            int ostanaliDni = 0;

            double sumaZaOstanaliteDniVmeseca = 0;

            double finalnaSuma = 0;

            //За болничен + отпуск
            double ostanaliteDni = 0 ;
            double sumaZaOstanaliDni = 0 ;
            double finalnataSuma = 0;




            //Sum for the taxes
            double totalSum = 0;
            totalSum = ((fondPensioneer*n)/100) + ((fondNoWork*n)/100) +
                    ((healthInsurance*n)/100) +
                    ((ozm*n)/100) + ((dzpoFace*n)/100);

            //Сума със удръжки
            //Sum with the taxes
            double obligatorySalary = 0;
            obligatorySalary = n - totalSum;

            //От облагаемата сума вадим 10% и получаван Данък Общ Доход
            //From the Obligatory Salary we subtract 10% and receive Dod
            double dod = 0;
            dod = ((n - totalSum)*10)/100;

            //От облагаемата сума вадим Данъка Общ Доход и получаваме Дължимата сума
            //From the Obligatory Salary we subtract the Dod and receive the Obligatory Sum
            double deservedSum = 0;
            deservedSum = (n - totalSum) - (((n - totalSum)*10)/100);




            //Ако имаме отпуск (САМО)
            if(box3.isSelected())
            {


                sumaZaEdinDenOtpusk = n / rabotniDniVMeseca;
                //Сума за избраните дни
                sumaZaIzbraniteDniOtpusk = sumaZaEdinDenOtpusk * kolkoDniOtpusk;
                //Сума за останалите дни
                sumaZaOstanaliteDni = n - sumaZaIzbraniteDniOtpusk;

                //Начисляване на отпуската
                nachislqvaneZaOtpuska = sumaZaOstanaliteDni + sumaZaIzbraniteDniOtpusk;

                if(n > 3750) //3400

                {
                    osigurovki = (3750 * 13.78) / 100; //3400
                    sumataZaDanuka = n - osigurovki;
                    danukObshtDohod = (sumataZaDanuka * 10) / 100;
                    sumaZaPoluchavane = n - osigurovki - danukObshtDohod;

                    obligatorySalary = 0;
                    deservedSum = 0;

                    String fileName = textfield4.getText();

                    //Saving the values into "file" variables
                    String fileContents = textfield.getText();
                    String fileContents2 = textfield1.getText();
                    double fileContents3 = n;
                    int fileContents4 = a;
                    double fileContents5 = obligatorySalary;
                    double fileContents6 = dod;
                    double fileContents15 =  sumaZaPoluchavane;


                    appendtext5(fileName,fileContents,fileContents2,fileContents3,fileContents4,
                            fileContents5, fileContents6,fileContents15);

                    return;

                }



                //Saving the values into "file" variables
                String fileName = textfield4.getText();
                String fileContents = textfield.getText();
                String fileContents2 = textfield1.getText();
                double fileContents3 = n;
                int fileContents4 = a;
                double fileContents5 = obligatorySalary;
                double fileContents6 = dod;
                double fileContents7 = deservedSum;
                double fileContents8 = sumaZaIzbraniteDniOtpusk;
                double fileContents11 = sumaZaOstanaliteDni;
                double fileContents9 = nachislqvaneZaOtpuska;


                appendtext2(fileName,fileContents,fileContents2,fileContents3,fileContents4,
                        fileContents5, fileContents6, fileContents7,fileContents8,fileContents9,
                        fileContents11);

                return;

            }



            //Ако имаме болничен (САМО)
            if(box4.isSelected())
            {

                sumaZaEdinDenBolnichen = n / rabotniDniVMeseca2;
                sumaZaTriteDniBolnichen = sumaZaEdinDenBolnichen * 3;
                //Сума след 70% процента
                sumaZaSled70Procenta = (sumaZaTriteDniBolnichen * 70) / 100;

                //Останали работни дни от месеца
                ostanaliDni = rabotniDniVMeseca2 - 3 - dniOtpuskZaNOI;
                //Сума за тези останали дни от месеца
                sumaZaOstanaliteDniVmeseca = (n / rabotniDniVMeseca2) * ostanaliDni;

                //Начисляване на болничния
                finalnaSuma = sumaZaSled70Procenta + sumaZaOstanaliteDniVmeseca;

                if(n > 3750) //3400

                {
                    osigurovki = (3750 * 13.78) / 100; //3400
                    sumataZaDanuka = n - osigurovki;
                    danukObshtDohod = (sumataZaDanuka * 10) / 100;
                    sumaZaPoluchavane = n - osigurovki - danukObshtDohod;

                    obligatorySalary = 0;
                    deservedSum = 0;

                    String fileName = textfield4.getText();

                    //Saving the values into "file" variables
                    String fileContents = textfield.getText();
                    String fileContents2 = textfield1.getText();
                    double fileContents3 = n;
                    int fileContents4 = a;
                    double fileContents5 = obligatorySalary;
                    double fileContents6 = dod;
                    double fileContents15 =  sumaZaPoluchavane;


                    appendtext5(fileName,fileContents,fileContents2,fileContents3,fileContents4,
                            fileContents5, fileContents6,fileContents15);

                    return;

                }

                String fileName = textfield4.getText();

                //Saving the values into "file" variables
                String fileContents = textfield.getText();
                String fileContents2 = textfield1.getText();
                double fileContents3 = n;
                int fileContents4 = a;
                double fileContents5 = obligatorySalary;
                double fileContents6 = dod;
                double fileContents7 = deservedSum;

                double fileContents10 = sumaZaSled70Procenta;
                double fileContents12 = sumaZaOstanaliteDniVmeseca;
                double fileContents13 = finalnaSuma;


                appendtext3(fileName,fileContents,fileContents2,fileContents3,fileContents4,
                        fileContents5, fileContents6, fileContents7,
                        fileContents10, fileContents12,
                        fileContents13);

                return;

            }




            //Ако пък имаме и двете
            if(box5.isSelected())
            {

                ostanaliteDni = rabotniDniVMeseca - (kolkoDniOtpusk + 3 + dniOtpuskZaNOI);
                sumaZaOstanaliDni = (n / rabotniDniVMeseca) * ostanaliteDni;

                sumaZaEdinDenOtpusk = n / rabotniDniVMeseca;
                //Сума за избраните дни
                sumaZaIzbraniteDniOtpusk = sumaZaEdinDenOtpusk * kolkoDniOtpusk;

                //Сума за останалите дни
                sumaZaOstanaliteDni = n - sumaZaIzbraniteDniOtpusk;


                sumaZaEdinDenBolnichen = n / rabotniDniVMeseca2;
                sumaZaTriteDniBolnichen = sumaZaEdinDenBolnichen * 3;
                //Сума след 70% процента
                sumaZaSled70Procenta = (sumaZaTriteDniBolnichen * 70) / 100;

                //Останали работни дни от месеца
                ostanaliDni = rabotniDniVMeseca2 - 3 - dniOtpuskZaNOI;
                //Сума за тези останали дни от месеца
                sumaZaOstanaliteDniVmeseca = (n / rabotniDniVMeseca2) * ostanaliDni;

                finalnataSuma = sumaZaOstanaliDni + sumaZaIzbraniteDniOtpusk + sumaZaSled70Procenta;

                if(n > 3750) //3400

                {
                    osigurovki = (3750 * 13.78) / 100; //3400
                    sumataZaDanuka = n - osigurovki;
                    danukObshtDohod = (sumataZaDanuka * 10) / 100;
                    sumaZaPoluchavane = n - osigurovki - danukObshtDohod;

                    obligatorySalary = 0;
                    deservedSum = 0;

                    String fileName = textfield4.getText();

                    //Saving the values into "file" variables
                    String fileContents = textfield.getText();
                    String fileContents2 = textfield1.getText();
                    double fileContents3 = n;
                    int fileContents4 = a;
                    double fileContents5 = obligatorySalary;
                    double fileContents6 = dod;
                    double fileContents15 =  sumaZaPoluchavane;


                    appendtext5(fileName,fileContents,fileContents2,fileContents3,fileContents4,
                            fileContents5, fileContents6,fileContents15);

                    return;

                }


                String fileName = textfield4.getText();

                //Saving the values into "file" variables
                String fileContents = textfield.getText();
                String fileContents2 = textfield1.getText();
                double fileContents3 = n;
                int fileContents4 = a;
                double fileContents5 = obligatorySalary;
                double fileContents6 = dod;
                double fileContents7 = deservedSum;
                double fileContents8 = sumaZaIzbraniteDniOtpusk;
                double fileContents11 = sumaZaOstanaliteDni;


                double fileContents10 = sumaZaSled70Procenta;
                double fileContents12 = sumaZaOstanaliteDniVmeseca;
                double fileContents14 = finalnataSuma ;


                appendtext4(fileName,fileContents,fileContents2,fileContents3,fileContents4,
                        fileContents5, fileContents6, fileContents7,fileContents8,
                        fileContents10,fileContents11, fileContents12, fileContents14);


                return;

            }



            if(n < 0)
            {
                JOptionPane.showMessageDialog(null, "Please enter only positive numbers!");

                return;
            }
            if(n < 933)
            {
                JOptionPane.showMessageDialog(null, "Value must not be entered below the minimum salary!");

                return;
            }

            if(a < 0)
            {
                JOptionPane.showMessageDialog(null, "I am sorry, negative experience doesn't exist!");

                return;
            }


			/*if(n > 3750) //3400
			{
				osigurovki = (3750 * 13.78) / 100; //3400
				sumataZaDanuka = n - osigurovki;
				danukObshtDohod = (sumataZaDanuka * 10) / 100;
				sumaZaPoluchavane = n - osigurovki - danukObshtDohod;

				obligatorySalary = 0;
				deservedSum = 0;
			}*/

            if(n > 3750) //3400

            {
                osigurovki = (3750 * 13.78) / 100; //3400
                sumataZaDanuka = n - osigurovki;
                danukObshtDohod = (sumataZaDanuka * 10) / 100;
                sumaZaPoluchavane = n - osigurovki - danukObshtDohod;

                obligatorySalary = 0;
                deservedSum = 0;

                String fileName = textfield4.getText();

                //Saving the values into "file" variables
                String fileContents = textfield.getText();
                String fileContents2 = textfield1.getText();
                double fileContents3 = n;
                int fileContents4 = a;
                double fileContents5 = obligatorySalary;
                double fileContents6 = dod;
                double fileContents15 =  sumaZaPoluchavane;


                appendtext5(fileName,fileContents,fileContents2,fileContents3,fileContents4,
                        fileContents5, fileContents6,fileContents15);

                return;

            }


            //Scanner sc = new Scanner(System.in);
            //System.out.println("Enter file name");
            String fileName = textfield4.getText();

            //Saving the values into "file" variables
            String fileContents = textfield.getText();
            String fileContents2 = textfield1.getText();
            double fileContents3 = n;
            int fileContents4 = a;
            double fileContents5 = obligatorySalary;
            double fileContents6 = dod;
            double fileContents7 = deservedSum;

			/*
			//Calling out the method
			appendtext(fileName,fileContents,fileContents2,fileContents3,fileContents4,
					fileContents5, fileContents6, fileContents7,fileContents8,fileContents9,
					fileContents10,fileContents11, fileContents12,
					fileContents13,fileContents14, fileContents15);*/

            appendtext1(fileName,fileContents,fileContents2,fileContents3,fileContents4,
                    fileContents5, fileContents6, fileContents7);




        }






        //Print Function
        if(e.getSource() == button1)
        {



            JFrame jframe = new JFrame("Insert credentials here");
            jframe.setSize(800, 510);
            jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);



            //JEditorPane edit = new JEditorPane();


            final JTextPane jTextPane = new JTextPane();
            jTextPane.setFont(new Font("Comic Sans MS",30,30));
            jTextPane.setEditorKit(new HTMLEditorKit());


            JButton btn = new JButton("Print");


            btn.addActionListener(new ActionListener()
            {



                @Override
                public void actionPerformed(ActionEvent e) {
                    try {


                        //edit.setContentType("text/html");
                        //jTextPane.setContentType("text/html");


                        //boolean done = edit.print();
                        boolean done = jTextPane.print();


                        if (done) {
                            JOptionPane.showMessageDialog(null, "Printing is done");
                        } else {
                            JOptionPane.showMessageDialog(null, "Error while printing");
                        }
                    }
                    catch (Exception pex) {
                        JOptionPane.showMessageDialog(null, "Error while printing");
                        pex.printStackTrace();

                    }
                }

            });



            jframe.add(btn, BorderLayout.SOUTH);
            //jframe.add(edit);
            jframe.add(jTextPane);
            jframe.setVisible(true);
        }



        //1000-2000 lv
        if(e.getSource() == button2)
        {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            int start = 1000;
            int end = 2000;
            int result = rand.nextInt(end - start) + start;


            textfield2.setText(Integer.toString(result));
        }

        //2000-3000 lv
        if(e.getSource() == button3)
        {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            int start = 2000;
            int end = 3000;
            int result = rand.nextInt(end - start) + start;


            textfield2.setText(Integer.toString(result));
        }

        //3000-4000 lv
        if(e.getSource() == button4)
        {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            int start = 3000;
            int end = 4000;
            int result = rand.nextInt(end - start) + start;


            textfield2.setText(Integer.toString(result));
        }

        //4000-5000 lv
        if(e.getSource() == button5)
        {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            int start = 4000;
            int end = 5000;
            int result = rand.nextInt(end - start) + start;


            textfield2.setText(Integer.toString(result));
        }

        //5000-6000 lv
        if(e.getSource() == button6)
        {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            int start = 5000;
            int end = 6000;
            int result = rand.nextInt(end - start) + start;


            textfield2.setText(Integer.toString(result));
        }

        //6000-7000 lv
        if(e.getSource() == button7)
        {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            int start = 6000;
            int end = 7000;
            int result = rand.nextInt(end - start) + start;


            textfield2.setText(Integer.toString(result));
        }

        //7000-8000 lv
        if(e.getSource() == button8)
        {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            int start = 7000;
            int end = 8000;
            int result = rand.nextInt(end - start) + start;


            textfield2.setText(Integer.toString(result));
        }

        //8000-9000 lv
        if(e.getSource() == button9)
        {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            int start = 8000;
            int end = 9000;
            int result = rand.nextInt(end - start) + start;


            textfield2.setText(Integer.toString(result));
        }

        //9000-10000 lv
        if(e.getSource() == button10)
        {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            int start = 9000;
            int end = 10000;
            int result = rand.nextInt(end - start) + start;


            textfield2.setText(Integer.toString(result));
        }

        // > 10000 lv
        if(e.getSource() == button11)
        {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            int start = 10000;
            int end = 16000;
            int result = rand.nextInt(end - start) + start;


            textfield2.setText(Integer.toString(result));
        }

        //Show dev tool button
        if(e.getSource() == button12)
        {
            JFrame frame = new JFrame("Faster salary entry");
            frame.setSize(350, 450);
            frame.setLocationRelativeTo(null);
            frame.setLayout(null);
            frame.setResizable(false);





            //1000-2000 lv
            button2 = new JButton();
            button2.setText("1000-2000 лв.");
            button2.addActionListener(this);
            button2.setBounds(30, 10, 270, 30);


            //2000-3000 lv
            button3 = new JButton();
            button3.setText("2000-3000 лв.");
            button3.addActionListener(this);
            button3.setBounds(30, 40, 270, 30);

            //3000-4000 lv
            button4 = new JButton();
            button4.setText("3000-4000 лв.");
            button4.addActionListener(this);
            button4.setBounds(30, 70, 270, 30);

            //4000-5000 lv
            button5 = new JButton();
            button5.setText("4000-5000 лв.");
            button5.addActionListener(this);
            button5.setBounds(30, 100, 270, 30);

            //5000-6000 lv
            button6 = new JButton();
            button6.setText("5000-6000 лв.");
            button6.addActionListener(this);
            button6.setBounds(30, 130, 270, 30);

            //6000-7000 lv
            button7 = new JButton();
            button7.setText("6000-7000 лв.");
            button7.addActionListener(this);
            button7.setBounds(30, 160, 270, 30);

            //7000-8000 lv
            button8 = new JButton();
            button8.setText("7000-8000 лв.");
            button8.addActionListener(this);
            button8.setBounds(30, 190, 270, 30);

            //8000-9000 lv
            button9 = new JButton();
            button9.setText("8000-9000 лв.");
            button9.addActionListener(this);
            button9.setBounds(30, 220, 270, 30);

            //9000-10000 lv
            button10 = new JButton();
            button10.setText("9000-10000 лв.");
            button10.addActionListener(this);
            button10.setBounds(30, 250, 270, 30);


            // > 10000 lv
            button11 = new JButton();
            button11.setText("   > 10000   лв.");
            button11.addActionListener(this);
            button11.setBounds(30, 280, 270, 30);

            button13 = new JButton();
            button13.setText("Hide");
            button13.addActionListener(new ActionListener()
            {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == button13)
                    {
                        frame.dispose();
                    }

                }

            });
            button13.setBounds(30, 330, 270, 40);



            frame.setVisible(true);

            frame.add(button2);
            frame.add(button3);
            frame.add(button4);
            frame.add(button5);
            frame.add(button6);
            frame.add(button7);
            frame.add(button8);
            frame.add(button9);
            frame.add(button10);
            frame.add(button11);
            frame.add(button13);


            //frame.pack();

            //Hide dev tools button



        }







    }

}
