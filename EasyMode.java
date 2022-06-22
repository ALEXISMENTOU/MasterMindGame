
package mastermindgame;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;  
import java.io.FileNotFoundException; 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;
import java.util.Random;
import static mastermindgame.MasterMindGame.onomaArxeiou;
import static mastermindgame.MasterMindGame.playerUsername;

public class EasyMode extends javax.swing.JFrame implements ActionListener{
    
    public static int gameStart = 0;
    public static int availableRaw = -1;
    public static int roundsNumber = 1;   

    public static String epipedoDiskolias = "Easy";
    public static String playerUsernameEasy;
    public static String opponentUsername = "CM";
    public static int opponentPoints = 0;
    public static int playerPoints = 0;
    public static String codeBreakerIconColor;
    public static String pressedButton;
    
    ArrayList<String> secretCodeList = new ArrayList<String>();
    ArrayList<String> colorsToSelect = new ArrayList<String>();
    
    JLabel label;
    
    JPanel panel, panel2;
    
    JFrame window2, frame;
    
    JTextArea apoTxt;
    
    JComboBox box2;
    
    JButton ok, cancel;
    
    ImageIcon icon0 = new ImageIcon("C:\\Users\\amend\\Desktop\\MasterMindIcons\\KeyEmpty.png");
    Image image0 = icon0.getImage();
    Image newImage0 = image0.getScaledInstance(33, 30, java.awt.Image.SCALE_SMOOTH);
    ImageIcon keyEmpty = new ImageIcon(newImage0);
    
    ImageIcon icon01 = new ImageIcon("C:\\Users\\amend\\Desktop\\MasterMindIcons\\KeyWhite.png");
    Image image01 = icon01.getImage();
    Image newImage01 = image01.getScaledInstance(33, 30, java.awt.Image.SCALE_SMOOTH);
    ImageIcon keyWhite = new ImageIcon(newImage01);
    
    ImageIcon icon02 = new ImageIcon("C:\\Users\\amend\\Desktop\\MasterMindIcons\\KeyBlack.png");
    Image image02 = icon02.getImage();
    Image newImage02 = image02.getScaledInstance(33, 30, java.awt.Image.SCALE_SMOOTH);
    ImageIcon keyBlack = new ImageIcon(newImage02);
    
    ImageIcon icon = new ImageIcon("C:\\Users\\amend\\Desktop\\MasterMindIcons\\SecretCode.png");
    Image image = icon.getImage();
    Image newImage = image.getScaledInstance(46, 45, java.awt.Image.SCALE_SMOOTH);
    ImageIcon secretCode = new ImageIcon(newImage);
    
    ImageIcon icon1 = new ImageIcon("C:\\Users\\amend\\Desktop\\MasterMindIcons\\emptySlot.png");
    Image image1 = icon1.getImage();
    Image newImage1 = image1.getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);
    ImageIcon emptySlot = new ImageIcon(newImage1);
    
    ImageIcon icon2 = new ImageIcon("C:\\Users\\amend\\Desktop\\MasterMindIcons\\Red.png");
    Image image2 = icon2.getImage();
    Image newImage2 = image2.getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);
    ImageIcon redIcon = new ImageIcon(newImage2);
    
    ImageIcon icon3 = new ImageIcon("C:\\Users\\amend\\Desktop\\MasterMindIcons\\Black.png");
    Image image3 = icon3.getImage();
    Image newImage3 = image3.getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);
    ImageIcon blackIcon = new ImageIcon(newImage3);
    
    ImageIcon icon4 = new ImageIcon("C:\\Users\\amend\\Desktop\\MasterMindIcons\\Blue.png");
    Image image4 = icon4.getImage();
    Image newImage4 = image4.getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);
    ImageIcon blueIcon = new ImageIcon(newImage4);
    
    ImageIcon icon5 = new ImageIcon("C:\\Users\\amend\\Desktop\\MasterMindIcons\\Yellow.png");
    Image image5 = icon5.getImage();
    Image newImage5 = image5.getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);
    ImageIcon yellowIcon = new ImageIcon(newImage5);
    
    ImageIcon icon6 = new ImageIcon("C:\\Users\\amend\\Desktop\\MasterMindIcons\\White.png");
    Image image6 = icon6.getImage();
    Image newImage6 = image6.getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);
    ImageIcon whiteIcon = new ImageIcon(newImage6);
    
    ImageIcon icon7 = new ImageIcon("C:\\Users\\amend\\Desktop\\MasterMindIcons\\Green.png");
    Image image7 = icon7.getImage();
    Image newImage7 = image7.getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);
    ImageIcon greenIcon = new ImageIcon(newImage7);

    public EasyMode() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        
        playerUsernameEasy = playerUsername;

        jPanel1 = new javax.swing.JPanel();
        sButton2 = new javax.swing.JButton();
        sButton3 = new javax.swing.JButton();
        sButton4 = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        sButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        iButton1 = new javax.swing.JButton();
        iButton2 = new javax.swing.JButton();
        iButton3 = new javax.swing.JButton();
        iButton4 = new javax.swing.JButton();
        iButton5 = new javax.swing.JButton();
        iButton6 = new javax.swing.JButton();
        iButton7 = new javax.swing.JButton();
        iButton8 = new javax.swing.JButton();
        iButton9 = new javax.swing.JButton();
        iButton10 = new javax.swing.JButton();
        iButton11 = new javax.swing.JButton();
        iButton12 = new javax.swing.JButton();
        iButton13 = new javax.swing.JButton();
        iButton14 = new javax.swing.JButton();
        iButton15 = new javax.swing.JButton();
        iButton16 = new javax.swing.JButton();
        iButton17 = new javax.swing.JButton();
        iButton18 = new javax.swing.JButton();
        iButton19 = new javax.swing.JButton();
        iButton20 = new javax.swing.JButton();
        iButton21 = new javax.swing.JButton();
        iButton22 = new javax.swing.JButton();
        iButton23 = new javax.swing.JButton();
        iButton24 = new javax.swing.JButton();
        iButton25 = new javax.swing.JButton();
        iButton26 = new javax.swing.JButton();
        iButton27 = new javax.swing.JButton();
        iButton28 = new javax.swing.JButton();
        iButton29 = new javax.swing.JButton();
        iButton30 = new javax.swing.JButton();
        iButton31 = new javax.swing.JButton();
        iButton32 = new javax.swing.JButton();
        iButton33 = new javax.swing.JButton();
        iButton34 = new javax.swing.JButton();
        iButton35 = new javax.swing.JButton();
        iButton36 = new javax.swing.JButton();
        iButton37 = new javax.swing.JButton();
        iButton38 = new javax.swing.JButton();
        iButton39 = new javax.swing.JButton();
        iButton40 = new javax.swing.JButton();
        iButton41 = new javax.swing.JButton();
        iButton42 = new javax.swing.JButton();
        iButton43 = new javax.swing.JButton();
        iButton44 = new javax.swing.JButton();
        iButton45 = new javax.swing.JButton();
        iButton46 = new javax.swing.JButton();
        iButton47 = new javax.swing.JButton();
        iButton48 = new javax.swing.JButton();
        scorePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        opponentScore = new javax.swing.JLabel();
        playerScore = new javax.swing.JLabel();
        opponentName = new javax.swing.JLabel();
        playerName = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuGame = new javax.swing.JMenu();
        menuNewGame = new javax.swing.JMenuItem();
        Restart = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuHistory = new javax.swing.JMenu();
        showHistory = new javax.swing.JMenuItem();
        hideHistory = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Mastermind");

        sButton2.setIcon(secretCode);
        sButton2.setBorderPainted(false);
        sButton2.setFocusPainted(false);
        sButton2.setBorder(new EmptyBorder(0,0,0,0));
        sButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButton2ActionPerformed(evt);
            }
        });

        sButton3.setIcon(secretCode);
        sButton3.setBorderPainted(false);
        sButton3.setFocusPainted(false);
        sButton3.setBorder(new EmptyBorder(0,0,0,0));
        sButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButton3ActionPerformed(evt);
            }
        });

        sButton4.setIcon(secretCode);
        sButton4.setBorderPainted(false);
        sButton4.setFocusPainted(false);
        sButton4.setBorder(new EmptyBorder(0,0,0,0));
        sButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButton4ActionPerformed(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        sButton1.setIcon(secretCode);
        sButton1.setBorderPainted(false);
        sButton1.setFocusPainted(false);
        sButton1.setBorder(new EmptyBorder(0,0,0,0));
        sButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jButton1.setIcon(emptySlot);
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setBorder(new EmptyBorder(0,0,0,0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(emptySlot);
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.setBorder(new EmptyBorder(0,0,0,0));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(emptySlot);
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.setBorder(new EmptyBorder(0,0,0,0));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(emptySlot);
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.setBorder(new EmptyBorder(0,0,0,0));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(emptySlot);
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.setBorder(new EmptyBorder(0,0,0,0));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(emptySlot);
        jButton6.setBorderPainted(false);
        jButton6.setFocusPainted(false);
        jButton6.setBorder(new EmptyBorder(0,0,0,0));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(emptySlot);
        jButton7.setBorderPainted(false);
        jButton7.setFocusPainted(false);
        jButton7.setBorder(new EmptyBorder(0,0,0,0));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(emptySlot);
        jButton8.setBorderPainted(false);
        jButton8.setFocusPainted(false);
        jButton8.setBorder(new EmptyBorder(0,0,0,0));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(emptySlot);
        jButton9.setBorderPainted(false);
        jButton9.setFocusPainted(false);
        jButton9.setBorder(new EmptyBorder(0,0,0,0));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(emptySlot);
        jButton10.setBorderPainted(false);
        jButton10.setFocusPainted(false);
        jButton10.setBorder(new EmptyBorder(0,0,0,0));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setIcon(emptySlot);
        jButton11.setBorderPainted(false);
        jButton11.setFocusPainted(false);
        jButton11.setBorder(new EmptyBorder(0,0,0,0));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setIcon(emptySlot);
        jButton12.setBorderPainted(false);
        jButton12.setFocusPainted(false);
        jButton12.setBorder(new EmptyBorder(0,0,0,0));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setIcon(emptySlot);
        jButton13.setBorderPainted(false);
        jButton13.setFocusPainted(false);
        jButton13.setBorder(new EmptyBorder(0,0,0,0));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setIcon(emptySlot);
        jButton14.setBorderPainted(false);
        jButton14.setFocusPainted(false);
        jButton14.setBorder(new EmptyBorder(0,0,0,0));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setIcon(emptySlot);
        jButton15.setBorderPainted(false);
        jButton15.setFocusPainted(false);
        jButton15.setBorder(new EmptyBorder(0,0,0,0));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setIcon(emptySlot);
        jButton16.setBorderPainted(false);
        jButton16.setFocusPainted(false);
        jButton16.setBorder(new EmptyBorder(0,0,0,0));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setIcon(emptySlot);
        jButton17.setBorderPainted(false);
        jButton17.setFocusPainted(false);
        jButton17.setBorder(new EmptyBorder(0,0,0,0));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setIcon(emptySlot);
        jButton18.setBorderPainted(false);
        jButton18.setFocusPainted(false);
        jButton18.setBorder(new EmptyBorder(0,0,0,0));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setIcon(emptySlot);
        jButton19.setBorderPainted(false);
        jButton19.setFocusPainted(false);
        jButton19.setBorder(new EmptyBorder(0,0,0,0));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setIcon(emptySlot);
        jButton20.setBorderPainted(false);
        jButton20.setFocusPainted(false);
        jButton20.setBorder(new EmptyBorder(0,0,0,0));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setIcon(emptySlot);
        jButton21.setBorderPainted(false);
        jButton21.setFocusPainted(false);
        jButton21.setBorder(new EmptyBorder(0,0,0,0));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setIcon(emptySlot);
        jButton22.setBorderPainted(false);
        jButton22.setFocusPainted(false);
        jButton22.setBorder(new EmptyBorder(0,0,0,0));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setIcon(emptySlot);
        jButton23.setBorderPainted(false);
        jButton23.setFocusPainted(false);
        jButton23.setBorder(new EmptyBorder(0,0,0,0));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setIcon(emptySlot);
        jButton24.setBorderPainted(false);
        jButton24.setFocusPainted(false);
        jButton24.setBorder(new EmptyBorder(0,0,0,0));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setIcon(emptySlot);
        jButton25.setBorderPainted(false);
        jButton25.setFocusPainted(false);
        jButton25.setBorder(new EmptyBorder(0,0,0,0));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setIcon(emptySlot);
        jButton26.setBorderPainted(false);
        jButton26.setFocusPainted(false);
        jButton26.setBorder(new EmptyBorder(0,0,0,0));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setIcon(emptySlot);
        jButton27.setBorderPainted(false);
        jButton27.setFocusPainted(false);
        jButton27.setBorder(new EmptyBorder(0,0,0,0));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setIcon(emptySlot);
        jButton28.setBorderPainted(false);
        jButton28.setFocusPainted(false);
        jButton28.setBorder(new EmptyBorder(0,0,0,0));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setIcon(emptySlot);
        jButton29.setBorderPainted(false);
        jButton29.setFocusPainted(false);
        jButton29.setBorder(new EmptyBorder(0,0,0,0));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setIcon(emptySlot);
        jButton30.setBorderPainted(false);
        jButton30.setFocusPainted(false);
        jButton30.setBorder(new EmptyBorder(0,0,0,0));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setIcon(emptySlot);
        jButton31.setBorderPainted(false);
        jButton31.setFocusPainted(false);
        jButton31.setBorder(new EmptyBorder(0,0,0,0));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setIcon(emptySlot);
        jButton32.setBorderPainted(false);
        jButton32.setFocusPainted(false);
        jButton32.setBorder(new EmptyBorder(0,0,0,0));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setIcon(emptySlot);
        jButton33.setBorderPainted(false);
        jButton33.setFocusPainted(false);
        jButton33.setBorder(new EmptyBorder(0,0,0,0));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setIcon(emptySlot);
        jButton34.setBorderPainted(false);
        jButton34.setFocusPainted(false);
        jButton34.setBorder(new EmptyBorder(0,0,0,0));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setIcon(emptySlot);
        jButton35.setBorderPainted(false);
        jButton35.setFocusPainted(false);
        jButton35.setBorder(new EmptyBorder(0,0,0,0));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setIcon(emptySlot);
        jButton36.setBorderPainted(false);
        jButton36.setFocusPainted(false);
        jButton36.setBorder(new EmptyBorder(0,0,0,0));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setIcon(emptySlot);
        jButton37.setBorderPainted(false);
        jButton37.setFocusPainted(false);
        jButton37.setBorder(new EmptyBorder(0,0,0,0));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setIcon(emptySlot);
        jButton38.setBorderPainted(false);
        jButton38.setFocusPainted(false);
        jButton38.setBorder(new EmptyBorder(0,0,0,0));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setIcon(emptySlot);
        jButton39.setBorderPainted(false);
        jButton39.setFocusPainted(false);
        jButton39.setBorder(new EmptyBorder(0,0,0,0));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setIcon(emptySlot);
        jButton40.setBorderPainted(false);
        jButton40.setFocusPainted(false);
        jButton40.setBorder(new EmptyBorder(0,0,0,0));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setIcon(emptySlot);
        jButton41.setBorderPainted(false);
        jButton41.setFocusPainted(false);
        jButton41.setBorder(new EmptyBorder(0,0,0,0));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setIcon(emptySlot);
        jButton42.setBorderPainted(false);
        jButton42.setFocusPainted(false);
        jButton42.setBorder(new EmptyBorder(0,0,0,0));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setIcon(emptySlot);
        jButton43.setBorderPainted(false);
        jButton43.setFocusPainted(false);
        jButton43.setBorder(new EmptyBorder(0,0,0,0));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setIcon(emptySlot);
        jButton44.setBorderPainted(false);
        jButton44.setFocusPainted(false);
        jButton44.setBorder(new EmptyBorder(0,0,0,0));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setIcon(emptySlot);
        jButton45.setBorderPainted(false);
        jButton45.setFocusPainted(false);
        jButton45.setBorder(new EmptyBorder(0,0,0,0));
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setIcon(emptySlot);
        jButton46.setBorderPainted(false);
        jButton46.setFocusPainted(false);
        jButton46.setBorder(new EmptyBorder(0,0,0,0));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.setIcon(emptySlot);
        jButton47.setBorderPainted(false);
        jButton47.setFocusPainted(false);
        jButton47.setBorder(new EmptyBorder(0,0,0,0));
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.setIcon(emptySlot);
        jButton48.setBorderPainted(false);
        jButton48.setFocusPainted(false);
        jButton48.setBorder(new EmptyBorder(0,0,0,0));
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        iButton1.setIcon(keyEmpty);
        iButton1.setBorderPainted(false);
        iButton1.setFocusPainted(false);
        iButton1.setBorder(new EmptyBorder(0,0,0,0));
        iButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iButton1ActionPerformed(evt);
            }
        });

        iButton2.setIcon(keyEmpty);
        iButton2.setBorderPainted(false);
        iButton2.setFocusPainted(false);
        iButton2.setBorder(new EmptyBorder(0,0,0,0));

        iButton3.setIcon(keyEmpty);
        iButton3.setBorderPainted(false);
        iButton3.setFocusPainted(false);
        iButton3.setBorder(new EmptyBorder(0,0,0,0));

        iButton4.setIcon(keyEmpty);
        iButton4.setBorderPainted(false);
        iButton4.setFocusPainted(false);
        iButton4.setBorder(new EmptyBorder(0,0,0,0));

        iButton5.setIcon(keyEmpty);
        iButton5.setBorderPainted(false);
        iButton5.setFocusPainted(false);
        iButton5.setBorder(new EmptyBorder(0,0,0,0));

        iButton6.setIcon(keyEmpty);
        iButton6.setBorderPainted(false);
        iButton6.setFocusPainted(false);
        iButton6.setBorder(new EmptyBorder(0,0,0,0));

        iButton7.setIcon(keyEmpty);
        iButton7.setBorderPainted(false);
        iButton7.setFocusPainted(false);
        iButton7.setBorder(new EmptyBorder(0,0,0,0));

        iButton8.setIcon(keyEmpty);
        iButton8.setBorderPainted(false);
        iButton8.setFocusPainted(false);
        iButton8.setBorder(new EmptyBorder(0,0,0,0));

        iButton9.setIcon(keyEmpty);
        iButton9.setBorderPainted(false);
        iButton9.setFocusPainted(false);
        iButton9.setBorder(new EmptyBorder(0,0,0,0));

        iButton10.setIcon(keyEmpty);
        iButton10.setBorderPainted(false);
        iButton10.setFocusPainted(false);
        iButton10.setBorder(new EmptyBorder(0,0,0,0));

        iButton11.setIcon(keyEmpty);
        iButton11.setBorderPainted(false);
        iButton11.setFocusPainted(false);
        iButton11.setBorder(new EmptyBorder(0,0,0,0));

        iButton12.setIcon(keyEmpty);
        iButton12.setBorderPainted(false);
        iButton12.setFocusPainted(false);
        iButton12.setBorder(new EmptyBorder(0,0,0,0));

        iButton13.setIcon(keyEmpty);
        iButton13.setBorderPainted(false);
        iButton13.setFocusPainted(false);
        iButton13.setBorder(new EmptyBorder(0,0,0,0));

        iButton14.setIcon(keyEmpty);
        iButton14.setBorderPainted(false);
        iButton14.setFocusPainted(false);
        iButton14.setBorder(new EmptyBorder(0,0,0,0));

        iButton15.setIcon(keyEmpty);
        iButton15.setBorderPainted(false);
        iButton15.setFocusPainted(false);
        iButton15.setBorder(new EmptyBorder(0,0,0,0));

        iButton16.setIcon(keyEmpty);
        iButton16.setBorderPainted(false);
        iButton16.setFocusPainted(false);
        iButton16.setBorder(new EmptyBorder(0,0,0,0));

        iButton17.setIcon(keyEmpty);
        iButton17.setBorderPainted(false);
        iButton17.setFocusPainted(false);
        iButton17.setBorder(new EmptyBorder(0,0,0,0));

        iButton18.setIcon(keyEmpty);
        iButton18.setBorderPainted(false);
        iButton18.setFocusPainted(false);
        iButton18.setBorder(new EmptyBorder(0,0,0,0));

        iButton19.setIcon(keyEmpty);
        iButton19.setBorderPainted(false);
        iButton19.setFocusPainted(false);
        iButton19.setBorder(new EmptyBorder(0,0,0,0));

        iButton20.setIcon(keyEmpty);
        iButton20.setBorderPainted(false);
        iButton20.setFocusPainted(false);
        iButton20.setBorder(new EmptyBorder(0,0,0,0));

        iButton21.setIcon(keyEmpty);
        iButton21.setBorderPainted(false);
        iButton21.setFocusPainted(false);
        iButton21.setBorder(new EmptyBorder(0,0,0,0));

        iButton22.setIcon(keyEmpty);
        iButton22.setBorderPainted(false);
        iButton22.setFocusPainted(false);
        iButton22.setBorder(new EmptyBorder(0,0,0,0));

        iButton23.setIcon(keyEmpty);
        iButton23.setBorderPainted(false);
        iButton23.setFocusPainted(false);
        iButton23.setBorder(new EmptyBorder(0,0,0,0));

        iButton24.setIcon(keyEmpty);
        iButton24.setBorderPainted(false);
        iButton24.setFocusPainted(false);
        iButton24.setBorder(new EmptyBorder(0,0,0,0));

        iButton25.setIcon(keyEmpty);
        iButton25.setBorderPainted(false);
        iButton25.setFocusPainted(false);
        iButton25.setBorder(new EmptyBorder(0,0,0,0));

        iButton26.setIcon(keyEmpty);
        iButton26.setBorderPainted(false);
        iButton26.setFocusPainted(false);
        iButton26.setBorder(new EmptyBorder(0,0,0,0));

        iButton27.setIcon(keyEmpty);
        iButton27.setBorderPainted(false);
        iButton27.setFocusPainted(false);
        iButton27.setBorder(new EmptyBorder(0,0,0,0));

        iButton28.setIcon(keyEmpty);
        iButton28.setBorderPainted(false);
        iButton28.setFocusPainted(false);
        iButton28.setBorder(new EmptyBorder(0,0,0,0));

        iButton29.setIcon(keyEmpty);
        iButton29.setBorderPainted(false);
        iButton29.setFocusPainted(false);
        iButton29.setBorder(new EmptyBorder(0,0,0,0));

        iButton30.setIcon(keyEmpty);
        iButton30.setBorderPainted(false);
        iButton30.setFocusPainted(false);
        iButton30.setBorder(new EmptyBorder(0,0,0,0));

        iButton31.setIcon(keyEmpty);
        iButton31.setBorderPainted(false);
        iButton31.setFocusPainted(false);
        iButton31.setBorder(new EmptyBorder(0,0,0,0));

        iButton32.setIcon(keyEmpty);
        iButton32.setBorderPainted(false);
        iButton32.setFocusPainted(false);
        iButton32.setBorder(new EmptyBorder(0,0,0,0));

        iButton33.setIcon(keyEmpty);
        iButton33.setBorderPainted(false);
        iButton33.setFocusPainted(false);
        iButton33.setBorder(new EmptyBorder(0,0,0,0));

        iButton34.setIcon(keyEmpty);
        iButton34.setBorderPainted(false);
        iButton34.setFocusPainted(false);
        iButton34.setBorder(new EmptyBorder(0,0,0,0));

        iButton35.setIcon(keyEmpty);
        iButton35.setBorderPainted(false);
        iButton35.setFocusPainted(false);
        iButton35.setBorder(new EmptyBorder(0,0,0,0));

        iButton36.setIcon(keyEmpty);
        iButton36.setBorderPainted(false);
        iButton36.setFocusPainted(false);
        iButton36.setBorder(new EmptyBorder(0,0,0,0));

        iButton37.setIcon(keyEmpty);
        iButton37.setBorderPainted(false);
        iButton37.setFocusPainted(false);
        iButton37.setBorder(new EmptyBorder(0,0,0,0));

        iButton38.setIcon(keyEmpty);
        iButton38.setBorderPainted(false);
        iButton38.setFocusPainted(false);
        iButton38.setBorder(new EmptyBorder(0,0,0,0));

        iButton39.setIcon(keyEmpty);
        iButton39.setBorderPainted(false);
        iButton39.setFocusPainted(false);
        iButton39.setBorder(new EmptyBorder(0,0,0,0));

        iButton40.setIcon(keyEmpty);
        iButton40.setBorderPainted(false);
        iButton40.setFocusPainted(false);
        iButton40.setBorder(new EmptyBorder(0,0,0,0));

        iButton41.setIcon(keyEmpty);
        iButton41.setBorderPainted(false);
        iButton41.setFocusPainted(false);
        iButton41.setBorder(new EmptyBorder(0,0,0,0));

        iButton42.setIcon(keyEmpty);
        iButton42.setBorderPainted(false);
        iButton42.setFocusPainted(false);
        iButton42.setBorder(new EmptyBorder(0,0,0,0));

        iButton43.setIcon(keyEmpty);
        iButton43.setBorderPainted(false);
        iButton43.setFocusPainted(false);
        iButton43.setBorder(new EmptyBorder(0,0,0,0));

        iButton44.setIcon(keyEmpty);
        iButton44.setBorderPainted(false);
        iButton44.setFocusPainted(false);
        iButton44.setBorder(new EmptyBorder(0,0,0,0));

        iButton45.setIcon(keyEmpty);
        iButton45.setBorderPainted(false);
        iButton45.setFocusPainted(false);
        iButton45.setBorder(new EmptyBorder(0,0,0,0));

        iButton46.setIcon(keyEmpty);
        iButton46.setBorderPainted(false);
        iButton46.setFocusPainted(false);
        iButton46.setBorder(new EmptyBorder(0,0,0,0));

        iButton47.setIcon(keyEmpty);
        iButton47.setBorderPainted(false);
        iButton47.setFocusPainted(false);
        iButton47.setBorder(new EmptyBorder(0,0,0,0));

        iButton48.setIcon(keyEmpty);
        iButton48.setBorderPainted(false);
        iButton48.setFocusPainted(false);
        iButton48.setBorder(new EmptyBorder(0,0,0,0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(iButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(iButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(iButton17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(iButton21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(iButton25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(iButton29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(iButton33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton36))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(iButton37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton40))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(iButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(iButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(iButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iButton8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(iButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iButton4))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(iButton41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iButton42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iButton43))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(iButton45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iButton46))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(iButton47)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iButton48)
                            .addComponent(iButton44))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(iButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iButton33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iButton38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iButton42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iButton45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iButton46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Rounds:");

        jLabel2.setText(roundsNumber + "");

        opponentScore.setText("0");

        playerScore.setText("0");

        opponentName.setText("CM");

        playerName.setText(playerUsernameEasy.toUpperCase());

        javax.swing.GroupLayout scorePanelLayout = new javax.swing.GroupLayout(scorePanel);
        scorePanel.setLayout(scorePanelLayout);
        scorePanelLayout.setHorizontalGroup(
            scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scorePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(scorePanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(opponentScore, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playerScore, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(scorePanelLayout.createSequentialGroup()
                        .addGroup(scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, scorePanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(opponentName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(playerName))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, scorePanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        scorePanelLayout.setVerticalGroup(
            scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scorePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerScore)
                    .addComponent(opponentScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opponentName)
                    .addComponent(playerName)))
        );

        menuGame.setText("Game");

        menuNewGame.setText("New Game");
        menuNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNewGameActionPerformed(evt);
            }
        });
        menuGame.add(menuNewGame);

        Restart.setText("Restart");
        Restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartActionPerformed(evt);
            }
        });
        menuGame.add(Restart);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        menuGame.add(exit);

        jMenuBar1.add(menuGame);

        jMenu2.setText("Options");

        menuHistory.setText("History");

        showHistory.setText("Show History");
        showHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHistoryActionPerformed(evt);
            }
        });
        menuHistory.add(showHistory);

        hideHistory.setText("Hide History");
        hideHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hideHistoryActionPerformed(evt);
            }
        });
        menuHistory.add(hideHistory);

        jMenu2.add(menuHistory);

        jMenuBar1.add(jMenu2);

        menuHelp.setText("Help");

        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        menuHelp.add(about);

        jMenuBar1.add(menuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scorePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scorePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }                        

    private void secretCodeSelectIcons() {
        window2 = new JFrame("Mastermind");
        window2.setLayout(new GridLayout(4,1));
        window2.setSize(250,185);
        window2.setResizable(false);
        window2.setVisible(true);
        window2.setDefaultCloseOperation(window2.DISPOSE_ON_CLOSE);
        
        panel = new JPanel();
        panel2 = new JPanel();
        
        ok = new JButton("OK");
        ok.addActionListener(this);
        ok.setActionCommand("ok");
        
        cancel = new JButton("Cancel");
        cancel.addActionListener(this);
        cancel.setActionCommand("cancel");
        
        label = new JLabel("Select code peg:");
        
        panel.add(ok, BorderLayout.CENTER);
        panel.add(cancel, BorderLayout.LINE_END);
        
        String[] colors = {"Red", "Black", "Green", "Blue", "Yellow", "White"};
        
        box2 = new JComboBox(colors);
        box2.setBackground(Color.WHITE);
        box2.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList list, Object value,
                    int index, boolean isSelected, boolean cellHasFocus) {
                Component c = super.getListCellRendererComponent(
                        list, value, index, isSelected, cellHasFocus);
                if (c instanceof JLabel) {
                    JLabel l = (JLabel) c;
                    if (value.equals("Red") || value.equals("Black") || value.equals("Green") || value.equals("Blue") || value.equals("Yellow") || value.equals("White")) {
                        l.setBackground(Color.WHITE);
                        if (isSelected) {
                            list.setSelectionForeground(Color.BLACK);
                            list.setSelectionBackground(Color.WHITE);
                        } else {
                            list.setSelectionForeground(Color.BLUE);
                            //list.setSelectionBackground(Color.BLACK);
                        }
                    }
                    return l;
                }
                return c;
            }            
        });
        
        window2.add(label);
        window2.add(box2);
        window2.add(panel);
        window2.add(panel2);
    }
    
    public void roundPoints() {
        if (roundsNumber <= 7) {
            playerPoints = playerPoints + 2;
            playerScore.setText(playerPoints + "");
        } else {
            playerPoints ++;
            playerScore.setText(playerPoints + "");
        }
    }
    
    public void winCheck() {
        if (opponentPoints >= 10) {
            JOptionPane.showMessageDialog(null, "Winner of game :\n"
                + opponentUsername.toString(),
                    "Game End", 1);
            endGame();
            
            String onomaPaixti = playerUsernameEasy;
            String epipedo = epipedoDiskolias;
            String onomaAntipalou = opponentUsername;
            int pontoiPaixti = playerPoints;
            int pontoiAntipalou = opponentPoints;
            
            FileOutputStream outputStream = null;
            try {
                outputStream = new FileOutputStream((onomaArxeiou), true);
            } catch(FileNotFoundException e) {
                System.out.println("Error opening the file stuff.txt.");
                System.exit(0);
            }
            
            PrintWriter outputWriter = new PrintWriter(outputStream);
            
            System.out.println("Writing to file.");
            outputWriter.println("RESULT: COMPUTER WON");
            outputWriter.println("DIFFICULTY: " + epipedo.toUpperCase());
            outputWriter.println("PLAYER USERNAME: " + onomaPaixti.toUpperCase() + "   POINTS: " + pontoiPaixti);
            outputWriter.println("OPPONENT USERNAME: " + onomaAntipalou.toUpperCase() + "   POINTS: " + pontoiAntipalou);
            outputWriter.println("\n");
            outputWriter.close();
            System.out.println("End of program.");
        }
        
        if (playerPoints >= 10) {
            JOptionPane.showMessageDialog(null, "Winner of game :\n"
                + playerUsernameEasy.toString(),
                    "Game End", 1);
            
            endGame();
            
            String onomaPaixti = playerUsernameEasy;
            String epipedo = epipedoDiskolias;
            String onomaAntipalou = opponentUsername;
            int pontoiPaixti = playerPoints;
            int pontoiAntipalou = opponentPoints;
            
            FileOutputStream outputStream = null;
            try {
                outputStream = new FileOutputStream((onomaArxeiou), true);
            } catch(FileNotFoundException e) {
                System.out.println("Error opening the file stuff.txt.");
                System.exit(0);
            }
            
            PrintWriter outputWriter = new PrintWriter(outputStream);
            
            System.out.println("Writing to file.");
            outputWriter.println("RESULT: PLAYER WON");
            outputWriter.println("DIFFICULTY: " + epipedo.toUpperCase());
            outputWriter.println("PLAYER USERNAME: " + onomaPaixti.toUpperCase() + "   POINTS: " + pontoiPaixti);
            outputWriter.println("OPPONENT USERNAME: " + onomaAntipalou.toUpperCase() + "   POINTS: " + pontoiAntipalou);
            outputWriter.println("\n");
            outputWriter.close();
            System.out.println("End of program.");
        }
    }
    
    public void endGame() {
        sButton1.setEnabled(false);
        sButton2.setEnabled(false);
        sButton3.setEnabled(false);
        sButton4.setEnabled(false);
        
        submit.setEnabled(false);
        
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        jButton14.setEnabled(false);
        jButton15.setEnabled(false);
        jButton16.setEnabled(false);
        jButton17.setEnabled(false);
        jButton18.setEnabled(false);
        jButton19.setEnabled(false);
        jButton20.setEnabled(false);
        
        jButton21.setEnabled(false);
        jButton22.setEnabled(false);
        jButton23.setEnabled(false);
        jButton24.setEnabled(false);
        jButton25.setEnabled(false);
        jButton26.setEnabled(false);
        jButton27.setEnabled(false);
        jButton28.setEnabled(false);
        jButton29.setEnabled(false);
        jButton30.setEnabled(false);
        
        jButton31.setEnabled(false);
        jButton32.setEnabled(false);
        jButton33.setEnabled(false);
        jButton34.setEnabled(false);
        jButton35.setEnabled(false);
        jButton36.setEnabled(false);
        jButton37.setEnabled(false);
        jButton38.setEnabled(false);
        jButton39.setEnabled(false);
        jButton40.setEnabled(false);
        
        jButton41.setEnabled(false);
        jButton42.setEnabled(false);
        jButton43.setEnabled(false);
        jButton44.setEnabled(false);
        jButton45.setEnabled(false);
        jButton46.setEnabled(false);
        jButton47.setEnabled(false);
        jButton48.setEnabled(false);
        
        iButton1.setEnabled(false);
        iButton2.setEnabled(false);
        iButton3.setEnabled(false);
        iButton4.setEnabled(false);
        iButton5.setEnabled(false);
        iButton6.setEnabled(false);
        iButton7.setEnabled(false);
        iButton8.setEnabled(false);
        iButton9.setEnabled(false);
        iButton10.setEnabled(false);
        
        iButton11.setEnabled(false);
        iButton12.setEnabled(false);
        iButton13.setEnabled(false);
        iButton14.setEnabled(false);
        iButton15.setEnabled(false);
        iButton16.setEnabled(false);
        iButton17.setEnabled(false);
        iButton18.setEnabled(false);
        iButton19.setEnabled(false);
        iButton20.setEnabled(false);
        
        iButton21.setEnabled(false);
        iButton22.setEnabled(false);
        iButton23.setEnabled(false);
        iButton24.setEnabled(false);
        iButton25.setEnabled(false);
        iButton26.setEnabled(false);
        iButton27.setEnabled(false);
        iButton28.setEnabled(false);
        iButton29.setEnabled(false);
        iButton30.setEnabled(false);
        
        iButton31.setEnabled(false);
        iButton32.setEnabled(false);
        iButton33.setEnabled(false);
        iButton34.setEnabled(false);
        iButton35.setEnabled(false);
        iButton36.setEnabled(false);
        iButton37.setEnabled(false);
        iButton38.setEnabled(false);
        iButton39.setEnabled(false);
        iButton40.setEnabled(false);
        
        iButton41.setEnabled(false);
        iButton42.setEnabled(false);
        iButton43.setEnabled(false);
        iButton44.setEnabled(false);
        iButton45.setEnabled(false);
        iButton46.setEnabled(false);
        iButton47.setEnabled(false);
        iButton48.setEnabled(false);
    }
    
    public void roundLoser() {
        
        secretCodeList.clear();
        gameStart = 0;
        availableRaw = -1;
        roundsNumber = 1;
        
        jLabel2.setText(roundsNumber + "");
        
        opponentPoints = opponentPoints + 2;
        opponentScore.setText(opponentPoints + "");
        
        defaultIcons();        
        winCheck();
    }
    
    public void roundWinner() {        
        roundPoints();        
        secretCodeList.clear();
        gameStart = 0;
        availableRaw = -1;
        roundsNumber = 1;
        
        jLabel2.setText(roundsNumber + "");
        
        defaultIcons();
        winCheck();
        
    }
    
    private void defaultIcons() {
        jButton1.setIcon(emptySlot);
        jButton2.setIcon(emptySlot);
        jButton3.setIcon(emptySlot);
        jButton4.setIcon(emptySlot);
        jButton5.setIcon(emptySlot);
        jButton6.setIcon(emptySlot);
        jButton7.setIcon(emptySlot);
        jButton8.setIcon(emptySlot);
        jButton9.setIcon(emptySlot);
        jButton10.setIcon(emptySlot);
        
        jButton11.setIcon(emptySlot);
        jButton12.setIcon(emptySlot);
        jButton13.setIcon(emptySlot);
        jButton14.setIcon(emptySlot);
        jButton15.setIcon(emptySlot);
        jButton16.setIcon(emptySlot);
        jButton17.setIcon(emptySlot);
        jButton18.setIcon(emptySlot);
        jButton19.setIcon(emptySlot);
        jButton20.setIcon(emptySlot);
        
        jButton21.setIcon(emptySlot);
        jButton22.setIcon(emptySlot);
        jButton23.setIcon(emptySlot);
        jButton24.setIcon(emptySlot);
        jButton25.setIcon(emptySlot);
        jButton26.setIcon(emptySlot);
        jButton27.setIcon(emptySlot);
        jButton28.setIcon(emptySlot);
        jButton29.setIcon(emptySlot);
        jButton30.setIcon(emptySlot);
        
        jButton31.setIcon(emptySlot);
        jButton32.setIcon(emptySlot);
        jButton33.setIcon(emptySlot);
        jButton34.setIcon(emptySlot);
        jButton35.setIcon(emptySlot);
        jButton36.setIcon(emptySlot);
        jButton37.setIcon(emptySlot);
        jButton38.setIcon(emptySlot);
        jButton39.setIcon(emptySlot);
        jButton40.setIcon(emptySlot);
        
        jButton41.setIcon(emptySlot);
        jButton42.setIcon(emptySlot);
        jButton43.setIcon(emptySlot);
        jButton44.setIcon(emptySlot);
        jButton45.setIcon(emptySlot);
        jButton46.setIcon(emptySlot);
        jButton47.setIcon(emptySlot);
        jButton48.setIcon(emptySlot);
        
        iButton1.setIcon(keyEmpty);
        iButton2.setIcon(keyEmpty);
        iButton3.setIcon(keyEmpty);
        iButton4.setIcon(keyEmpty);
        iButton5.setIcon(keyEmpty);
        iButton6.setIcon(keyEmpty);
        iButton7.setIcon(keyEmpty);
        iButton8.setIcon(keyEmpty);
        iButton9.setIcon(keyEmpty);
        iButton10.setIcon(keyEmpty);
        
        iButton11.setIcon(keyEmpty);
        iButton12.setIcon(keyEmpty);
        iButton13.setIcon(keyEmpty);
        iButton14.setIcon(keyEmpty);
        iButton15.setIcon(keyEmpty);
        iButton16.setIcon(keyEmpty);
        iButton17.setIcon(keyEmpty);
        iButton18.setIcon(keyEmpty);
        iButton19.setIcon(keyEmpty);
        iButton20.setIcon(keyEmpty);
        
        iButton21.setIcon(keyEmpty);
        iButton22.setIcon(keyEmpty);
        iButton23.setIcon(keyEmpty);
        iButton24.setIcon(keyEmpty);
        iButton25.setIcon(keyEmpty);
        iButton26.setIcon(keyEmpty);
        iButton27.setIcon(keyEmpty);
        iButton28.setIcon(keyEmpty);
        iButton29.setIcon(keyEmpty);
        iButton30.setIcon(keyEmpty);
        
        iButton31.setIcon(keyEmpty);
        iButton32.setIcon(keyEmpty);
        iButton33.setIcon(keyEmpty);
        iButton34.setIcon(keyEmpty);
        iButton35.setIcon(keyEmpty);
        iButton36.setIcon(keyEmpty);
        iButton37.setIcon(keyEmpty);
        iButton38.setIcon(keyEmpty);
        iButton39.setIcon(keyEmpty);
        iButton40.setIcon(keyEmpty);
        
        iButton41.setIcon(keyEmpty);
        iButton42.setIcon(keyEmpty);
        iButton43.setIcon(keyEmpty);
        iButton44.setIcon(keyEmpty);
        iButton45.setIcon(keyEmpty);
        iButton46.setIcon(keyEmpty);
        iButton47.setIcon(keyEmpty);
        iButton48.setIcon(keyEmpty);
    }
    
    public void showSuitableIcons1() {
	if (jButton1.getIcon() == redIcon && secretCodeList.get(0).equals("Red") ||
		jButton1.getIcon() == blackIcon && secretCodeList.get(0).equals("Black") ||
		jButton1.getIcon() == blueIcon && secretCodeList.get(0).equals("Blue") ||
		jButton1.getIcon() == greenIcon && secretCodeList.get(0).equals("Green") ||
		jButton1.getIcon() == yellowIcon && secretCodeList.get(0).equals("Yellow") ||
		jButton1.getIcon() == whiteIcon && secretCodeList.get(0).equals("White")) {
		if (jButton2.getIcon() == redIcon && secretCodeList.get(1).equals("Red") ||
			jButton2.getIcon() == blackIcon && secretCodeList.get(1).equals("Black") ||
			jButton2.getIcon() == blueIcon && secretCodeList.get(1).equals("Blue") ||
			jButton2.getIcon() == greenIcon && secretCodeList.get(1).equals("Green") ||
			jButton2.getIcon() == yellowIcon && secretCodeList.get(1).equals("Yellow") ||
			jButton2.getIcon() == whiteIcon && secretCodeList.get(1).equals("White")) {
			if (jButton3.getIcon() == redIcon && secretCodeList.get(2).equals("Red") ||
				jButton3.getIcon() == blackIcon && secretCodeList.get(2).equals("Black") ||
				jButton3.getIcon() == blueIcon && secretCodeList.get(2).equals("Blue") ||
				jButton3.getIcon() == greenIcon && secretCodeList.get(2).equals("Green") ||
				jButton3.getIcon() == yellowIcon && secretCodeList.get(2).equals("Yellow") ||
				jButton3.getIcon() == whiteIcon && secretCodeList.get(2).equals("White")) {
				if (jButton4.getIcon() == redIcon && secretCodeList.get(3).equals("Red") ||
					jButton4.getIcon() == blackIcon && secretCodeList.get(3).equals("Black") ||
					jButton4.getIcon() == blueIcon && secretCodeList.get(3).equals("Blue") ||
					jButton4.getIcon() == greenIcon && secretCodeList.get(3).equals("Green") ||
					jButton4.getIcon() == yellowIcon && secretCodeList.get(3).equals("Yellow") ||
					jButton4.getIcon() == whiteIcon && secretCodeList.get(3).equals("White")) {

					iButton1.setIcon(keyBlack);
					iButton2.setIcon(keyBlack);
					iButton3.setIcon(keyBlack);
					iButton4.setIcon(keyBlack);
                                        
                                        JOptionPane.showMessageDialog(null, "Winner of round :\n"
                                            + playerUsernameEasy.toString(),
                                            "Round End", 1);
                                        roundWinner();
                                        
				} else {
					iButton1.setIcon(keyBlack);
	                iButton2.setIcon(keyBlack);
	                iButton3.setIcon(keyBlack);

	                if (jButton4.getIcon() == redIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(3).equals("Red")) {
	                			iButton4.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Red")) {
	                			iButton4.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton4.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton4.getIcon() == blackIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(3).equals("Black")) {
	                			iButton4.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Black")) {
	                			iButton4.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton4.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton4.getIcon() == blueIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(3).equals("Blue")) {
	                			iButton4.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Blue")) {
	                			iButton4.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton4.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton4.getIcon() == greenIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(3).equals("Green")) {
	                			iButton4.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Green")) {
	                			iButton4.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton4.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton4.getIcon() == yellowIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(3).equals("Yellow")) {
	                			iButton4.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Yellow")) {
	                			iButton4.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton4.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton4.getIcon() == whiteIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(3).equals("White")) {
	                			iButton4.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("white")) {
	                			iButton4.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton4.setIcon(keyEmpty);
	                		}
	                	}
	                }
				}
			} else {
				iButton1.setIcon(keyBlack);
	            iButton2.setIcon(keyBlack);

	            if (jButton3.getIcon() == redIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(2).equals("Red")) {
	                			iButton3.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Red")) {
	                			iButton3.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton3.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton3.getIcon() == blackIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(2).equals("Black")) {
	                			iButton3.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Black")) {
	                			iButton3.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton3.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton3.getIcon() == blueIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(2).equals("Blue")) {
	                			iButton3.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Blue")) {
	                			iButton3.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton3.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton3.getIcon() == greenIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(2).equals("Green")) {
	                			iButton3.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Green")) {
	                			iButton3.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton3.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton3.getIcon() == yellowIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(2).equals("Yellow")) {
	                			iButton3.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Yellow")) {
	                			iButton3.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton3.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton3.getIcon() == whiteIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(2).equals("White")) {
	                			iButton3.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("white")) {
	                			iButton3.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton3.setIcon(keyEmpty);
	                		}
	                	}
	                }

	            if (jButton4.getIcon() == redIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(3).equals("Red")) {
	                			iButton4.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Red")) {
	                			iButton4.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton4.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton4.getIcon() == blackIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(3).equals("Black")) {
	                			iButton4.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Black")) {
	                			iButton4.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton4.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton4.getIcon() == blueIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(3).equals("Blue")) {
	                			iButton4.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Blue")) {
	                			iButton4.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton4.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton4.getIcon() == greenIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(3).equals("Green")) {
	                			iButton4.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Green")) {
	                			iButton4.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton4.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton4.getIcon() == yellowIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(3).equals("Yellow")) {
	                			iButton4.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Yellow")) {
	                			iButton4.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton4.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton4.getIcon() == whiteIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(3).equals("White")) {
	                			iButton4.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("white")) {
	                			iButton4.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton4.setIcon(keyEmpty);
	                		}
	                	}
	                }
				}
			} else {
				iButton1.setIcon(keyBlack);

				if (jButton2.getIcon() == redIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(1).equals("Red")) {
	                			iButton2.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Red")) {
	                			iButton2.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton2.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton2.getIcon() == blackIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(1).equals("Black")) {
	                			iButton2.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Black")) {
	                			iButton2.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton2.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton2.getIcon() == blueIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(1).equals("Blue")) {
	                			iButton2.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Blue")) {
	                			iButton2.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton2.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton2.getIcon() == greenIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(1).equals("Green")) {
	                			iButton2.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Green")) {
	                			iButton2.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton2.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton2.getIcon() == yellowIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(1).equals("Yellow")) {
	                			iButton2.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Yellow")) {
	                			iButton2.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton2.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton2.getIcon() == whiteIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(1).equals("White")) {
	                			iButton2.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("white")) {
	                			iButton2.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton2.setIcon(keyEmpty);
	                		}
	                	}
	                }

				if (jButton3.getIcon() == redIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(2).equals("Red")) {
	                			iButton3.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Red")) {
	                			iButton3.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton3.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton3.getIcon() == blackIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(2).equals("Black")) {
	                			iButton3.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Black")) {
	                			iButton3.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton3.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton3.getIcon() == blueIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(2).equals("Blue")) {
	                			iButton3.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Blue")) {
	                			iButton3.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton3.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton3.getIcon() == greenIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(2).equals("Green")) {
	                			iButton3.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Green")) {
	                			iButton3.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton3.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton3.getIcon() == yellowIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(2).equals("Yellow")) {
	                			iButton3.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Yellow")) {
	                			iButton3.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton3.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton3.getIcon() == whiteIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(2).equals("White")) {
	                			iButton3.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("white")) {
	                			iButton3.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton3.setIcon(keyEmpty);
	                		}
	                	}
	                }

	            if (jButton4.getIcon() == redIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(3).equals("Red")) {
	                			iButton4.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Red")) {
	                			iButton4.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton4.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton4.getIcon() == blackIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(3).equals("Black")) {
	                			iButton4.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Black")) {
	                			iButton4.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton4.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton4.getIcon() == blueIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(3).equals("Blue")) {
	                			iButton4.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Blue")) {
	                			iButton4.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton4.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton4.getIcon() == greenIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(3).equals("Green")) {
	                			iButton4.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Green")) {
	                			iButton4.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton4.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton4.getIcon() == yellowIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(3).equals("Yellow")) {
	                			iButton4.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("Yellow")) {
	                			iButton4.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton4.setIcon(keyEmpty);
	                		}
	                	}
	                } else if (jButton4.getIcon() == whiteIcon) {
	                	for (int i=0; i<4; i++) {
	                		if (secretCodeList.get(3).equals("White")) {
	                			iButton4.setIcon(keyBlack);
	                			break;
	                		} else if (secretCodeList.get(i).equals("white")) {
	                			iButton4.setIcon(keyWhite);
	                			break;
	                		} else {
	                			iButton4.setIcon(keyEmpty);
	                		}
	                	}
	                }

			}
		} else {
			if (jButton1.getIcon() == redIcon) {
	          	for (int i=0; i<4; i++) {
	    	   		if (secretCodeList.get(0).equals("Red")) {
	           			iButton1.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton1.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton1.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton1.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Black")) {
	           			iButton1.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton1.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton1.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton1.getIcon() == blueIcon) {
	        	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Blue")) {
	            		iButton1.setIcon(keyBlack);
	            		break;
	            	} else if (secretCodeList.get(i).equals("Blue")) {
	            		iButton1.setIcon(keyWhite);
	            		break;
	            	} else {
	            		iButton1.setIcon(keyEmpty);
	            	}
	            }
	        } else if (jButton1.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Green")) {
	           			iButton1.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton1.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton1.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton1.getIcon() == yellowIcon) {
	        	for (int i=0; i<4; i++) {
	                if (secretCodeList.get(0).equals("Yellow")) {
	                	iButton1.setIcon(keyBlack);
	                	break;
	               	} else if (secretCodeList.get(i).equals("Yellow")) {
	                	iButton1.setIcon(keyWhite);
	                	break;
	                } else {
	                	iButton1.setIcon(keyEmpty);
	                }
	            }
	        } else if (jButton1.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("White")) {
	           			iButton1.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton1.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton1.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton2.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Red")) {
	           			iButton2.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton2.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton2.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton2.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Black")) {
	           			iButton2.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton2.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton2.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton2.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Blue")) {
	           			iButton2.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton2.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton2.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton2.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Green")) {
	           			iButton2.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton2.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton2.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton2.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Yellow")) {
	           			iButton2.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton2.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton2.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton2.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("White")) {
	           			iButton2.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton2.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton2.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton3.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton3.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton3.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton3.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton3.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton3.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            			iButton3.setIcon(keyWhite);
	            			break;
	           		} else {
	           			iButton3.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton3.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton3.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton3.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton3.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton3.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton3.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton3.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton3.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton3.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton3.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton3.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton3.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton3.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton3.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton3.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton3.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton4.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton4.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton4.setIcon(keyWhite);
               			break;
               		} else {
               			iButton4.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton4.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton4.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton4.setIcon(keyWhite);
               			break;
               		} else {
               			iButton4.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton4.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton4.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton4.setIcon(keyWhite);
               			break;
              		} else {
              			iButton4.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton4.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton4.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton4.setIcon(keyWhite);
               			break;
               		} else {
               			iButton4.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton4.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton4.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton4.setIcon(keyWhite);
               			break;
               		} else {
               			iButton4.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton4.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton4.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton4.setIcon(keyWhite);
               			break;
               		} else {
              			iButton4.setIcon(keyEmpty);
               		}
              	}
            }
        }
    }
    
    public void showSuitableIcons2() {
    if (jButton5.getIcon() == redIcon && secretCodeList.get(0).equals("Red") ||
        jButton5.getIcon() == blackIcon && secretCodeList.get(0).equals("Black") ||
        jButton5.getIcon() == blueIcon && secretCodeList.get(0).equals("Blue") ||
        jButton5.getIcon() == greenIcon && secretCodeList.get(0).equals("Green") ||
        jButton5.getIcon() == yellowIcon && secretCodeList.get(0).equals("Yellow") ||
        jButton5.getIcon() == whiteIcon && secretCodeList.get(0).equals("White")) {
        if (jButton6.getIcon() == redIcon && secretCodeList.get(1).equals("Red") ||
            jButton6.getIcon() == blackIcon && secretCodeList.get(1).equals("Black") ||
            jButton6.getIcon() == blueIcon && secretCodeList.get(1).equals("Blue") ||
            jButton6.getIcon() == greenIcon && secretCodeList.get(1).equals("Green") ||
            jButton6.getIcon() == yellowIcon && secretCodeList.get(1).equals("Yellow") ||
            jButton6.getIcon() == whiteIcon && secretCodeList.get(1).equals("White")) {
            if (jButton7.getIcon() == redIcon && secretCodeList.get(2).equals("Red") ||
                jButton7.getIcon() == blackIcon && secretCodeList.get(2).equals("Black") ||
                jButton7.getIcon() == blueIcon && secretCodeList.get(2).equals("Blue") ||
                jButton7.getIcon() == greenIcon && secretCodeList.get(2).equals("Green") ||
                jButton7.getIcon() == yellowIcon && secretCodeList.get(2).equals("Yellow") ||
                jButton7.getIcon() == whiteIcon && secretCodeList.get(2).equals("White")) {
                if (jButton8.getIcon() == redIcon && secretCodeList.get(3).equals("Red") ||
                    jButton8.getIcon() == blackIcon && secretCodeList.get(3).equals("Black") ||
                    jButton8.getIcon() == blueIcon && secretCodeList.get(3).equals("Blue") ||
                    jButton8.getIcon() == greenIcon && secretCodeList.get(3).equals("Green") ||
                    jButton8.getIcon() == yellowIcon && secretCodeList.get(3).equals("Yellow") ||
                    jButton8.getIcon() == whiteIcon && secretCodeList.get(3).equals("White")) {

                    iButton5.setIcon(keyBlack);
                    iButton6.setIcon(keyBlack);
                    iButton7.setIcon(keyBlack);
                    iButton8.setIcon(keyBlack);

                    JOptionPane.showMessageDialog(null, "Winner of round :\n"
                            + playerUsernameEasy.toString(),
                        "Round End", 1);
                                
                    roundWinner();
                } else {
                    iButton5.setIcon(keyBlack);
                    iButton6.setIcon(keyBlack);
                    iButton7.setIcon(keyBlack);

                    if (jButton8.getIcon() == redIcon) {
                        for (int i=0; i<4; i++) {
                            if (secretCodeList.get(3).equals("Red")) {
                                iButton8.setIcon(keyBlack);
                                break;
                            } else if (secretCodeList.get(i).equals("Red")) {
                                iButton8.setIcon(keyWhite);
                                break;
                            } else {
                                iButton8.setIcon(keyEmpty);
                            }
                        }
                    } else if (jButton8.getIcon() == blackIcon) {
                        for (int i=0; i<4; i++) {
                            if (secretCodeList.get(3).equals("Black")) {
                                iButton8.setIcon(keyBlack);
                                break;
                            } else if (secretCodeList.get(i).equals("Black")) {
                                iButton8.setIcon(keyWhite);
                                break;
                            } else {
                                iButton8.setIcon(keyEmpty);
                            }
                        }
                    } else if (jButton8.getIcon() == blueIcon) {
                        for (int i=0; i<4; i++) {
                            if (secretCodeList.get(3).equals("Blue")) {
                                iButton8.setIcon(keyBlack);
                                break;
                            } else if (secretCodeList.get(i).equals("Blue")) {
                                iButton8.setIcon(keyWhite);
                                break;
                            } else {
                                iButton8.setIcon(keyEmpty);
                            }
                        }
                    } else if (jButton8.getIcon() == greenIcon) {
                        for (int i=0; i<4; i++) {
                            if (secretCodeList.get(3).equals("Green")) {
                                iButton8.setIcon(keyBlack);
                                break;
                            } else if (secretCodeList.get(i).equals("Green")) {
                                iButton8.setIcon(keyWhite);
                                break;
                            } else {
                                iButton8.setIcon(keyEmpty);
                            }
                        }
                    } else if (jButton8.getIcon() == yellowIcon) {
                        for (int i=0; i<4; i++) {
                            if (secretCodeList.get(3).equals("Yellow")) {
                                iButton8.setIcon(keyBlack);
                                break;
                            } else if (secretCodeList.get(i).equals("Yellow")) {
                                iButton8.setIcon(keyWhite);
                                break;
                            } else {
                                iButton8.setIcon(keyEmpty);
                            }
                        }
                    } else if (jButton8.getIcon() == whiteIcon) {
                        for (int i=0; i<4; i++) {
                            if (secretCodeList.get(3).equals("White")) {
                                iButton8.setIcon(keyBlack);
                                break;
                            } else if (secretCodeList.get(i).equals("white")) {
                                iButton8.setIcon(keyWhite);
                                break;
                            } else {
                                iButton8.setIcon(keyEmpty);
                            }
                        }
                    }
                }
            } else {
                iButton5.setIcon(keyBlack);
                iButton6.setIcon(keyBlack);
        
                if (jButton7.getIcon() == redIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(2).equals("Red")) {
                            iButton7.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Red")) {
                            iButton7.setIcon(keyWhite);
                            break;
                        } else {
                            iButton7.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton7.getIcon() == blackIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(2).equals("Black")) {
                            iButton7.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Black")) {
                            iButton7.setIcon(keyWhite);
                            break;
                        } else {
                            iButton7.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton7.getIcon() == blueIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(2).equals("Blue")) {
                            iButton7.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Blue")) {
                            iButton7.setIcon(keyWhite);
                            break;
                        } else {
                            iButton7.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton7.getIcon() == greenIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(2).equals("Green")) {
                            iButton7.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Green")) {
                            iButton7.setIcon(keyWhite);
                            break;
                        } else {
                            iButton7.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton7.getIcon() == yellowIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(2).equals("Yellow")) {
                            iButton7.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Yellow")) {
                            iButton7.setIcon(keyWhite);
                            break;
                        } else {
                            iButton7.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton7.getIcon() == whiteIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(2).equals("White")) {
                            iButton7.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("white")) {
                            iButton7.setIcon(keyWhite);
                            break;
                        } else {
                            iButton7.setIcon(keyEmpty);
                        }
                    }
                }

                if (jButton8.getIcon() == redIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(3).equals("Red")) {
                            iButton8.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Red")) {
                            iButton8.setIcon(keyWhite);
                            break;
                        } else {
                            iButton8.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton8.getIcon() == blackIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(3).equals("Black")) {
                            iButton8.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Black")) {
                            iButton8.setIcon(keyWhite);
                            break;
                        } else {
                            iButton8.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton8.getIcon() == blueIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(3).equals("Blue")) {
                            iButton8.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Blue")) {
                            iButton8.setIcon(keyWhite);
                            break;
                        } else {
                            iButton8.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton8.getIcon() == greenIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(3).equals("Green")) {
                            iButton8.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Green")) {
                            iButton8.setIcon(keyWhite);
                            break;
                        } else {
                            iButton8.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton8.getIcon() == yellowIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(3).equals("Yellow")) {
                            iButton8.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Yellow")) {
                            iButton8.setIcon(keyWhite);
                            break;
                        } else {
                            iButton8.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton8.getIcon() == whiteIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(3).equals("White")) {
                            iButton8.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("white")) {
                            iButton8.setIcon(keyWhite);
                            break;
                        } else {
                            iButton8.setIcon(keyEmpty);
                        }
                    }
                }
                }
            } else {
                iButton5.setIcon(keyBlack);

                if (jButton6.getIcon() == redIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(1).equals("Red")) {
                            iButton6.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Red")) {
                            iButton6.setIcon(keyWhite);
                            break;
                        } else {
                            iButton6.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton6.getIcon() == blackIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(1).equals("Black")) {
                            iButton6.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Black")) {
                            iButton6.setIcon(keyWhite);
                            break;
                        } else {
                            iButton6.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton6.getIcon() == blueIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(1).equals("Blue")) {
                            iButton6.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Blue")) {
                            iButton6.setIcon(keyWhite);
                            break;
                        } else {
                            iButton6.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton6.getIcon() == greenIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(1).equals("Green")) {
                            iButton6.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Green")) {
                            iButton6.setIcon(keyWhite);
                            break;
                        } else {
                            iButton6.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton6.getIcon() == yellowIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(1).equals("Yellow")) {
                            iButton6.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Yellow")) {
                            iButton6.setIcon(keyWhite);
                            break;
                        } else {
                            iButton6.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton6.getIcon() == whiteIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(1).equals("White")) {
                            iButton6.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("white")) {
                            iButton6.setIcon(keyWhite);
                            break;
                        } else {
                            iButton6.setIcon(keyEmpty);
                        }
                    }
                }
        
                if (jButton7.getIcon() == redIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(2).equals("Red")) {
                            iButton7.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Red")) {
                            iButton7.setIcon(keyWhite);
                            break;
                        } else {
                            iButton7.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton7.getIcon() == blackIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(2).equals("Black")) {
                            iButton7.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Black")) {
                            iButton7.setIcon(keyWhite);
                            break;
                        } else {
                            iButton7.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton7.getIcon() == blueIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(2).equals("Blue")) {
                            iButton7.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Blue")) {
                            iButton7.setIcon(keyWhite);
                            break;
                        } else {
                            iButton7.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton7.getIcon() == greenIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(2).equals("Green")) {
                            iButton7.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Green")) {
                            iButton7.setIcon(keyWhite);
                            break;
                        } else {
                            iButton7.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton7.getIcon() == yellowIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(2).equals("Yellow")) {
                            iButton7.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Yellow")) {
                            iButton7.setIcon(keyWhite);
                            break;
                        } else {
                            iButton7.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton7.getIcon() == whiteIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(2).equals("White")) {
                            iButton7.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("white")) {
                            iButton7.setIcon(keyWhite);
                            break;
                        } else {
                            iButton7.setIcon(keyEmpty);
                        }
                    }
                }

                if (jButton8.getIcon() == redIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(3).equals("Red")) {
                            iButton8.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Red")) {
                            iButton8.setIcon(keyWhite);
                            break;
                        } else {
                            iButton8.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton8.getIcon() == blackIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(3).equals("Black")) {
                            iButton8.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Black")) {
                            iButton8.setIcon(keyWhite);
                            break;
                        } else {
                            iButton8.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton8.getIcon() == blueIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(3).equals("Blue")) {
                            iButton8.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Blue")) {
                            iButton8.setIcon(keyWhite);
                            break;
                        } else {
                            iButton8.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton8.getIcon() == greenIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(3).equals("Green")) {
                            iButton8.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Green")) {
                            iButton8.setIcon(keyWhite);
                            break;
                        } else {
                            iButton8.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton8.getIcon() == yellowIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(3).equals("Yellow")) {
                            iButton8.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("Yellow")) {
                            iButton8.setIcon(keyWhite);
                            break;
                        } else {
                            iButton8.setIcon(keyEmpty);
                        }
                    }
                } else if (jButton8.getIcon() == whiteIcon) {
                    for (int i=0; i<4; i++) {
                        if (secretCodeList.get(3).equals("White")) {
                            iButton8.setIcon(keyBlack);
                            break;
                        } else if (secretCodeList.get(i).equals("white")) {
                            iButton8.setIcon(keyWhite);
                            break;
                        } else {
                            iButton8.setIcon(keyEmpty);
                        }
                    }
                }

            }
        } else {
            if (jButton5.getIcon() == redIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(0).equals("Red")) {
                        iButton5.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Red")) {
                        iButton5.setIcon(keyWhite);
                        break;
                    } else {
                        iButton5.setIcon(keyEmpty);
                    }
                }
            } else if (jButton5.getIcon() == blackIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(0).equals("Black")) {
                        iButton5.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Black")) {
                        iButton5.setIcon(keyWhite);
                        break;
                    } else {
                        iButton5.setIcon(keyEmpty);
                    }
                }
            } else if (jButton5.getIcon() == blueIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(0).equals("Blue")) {
                        iButton5.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Blue")) {
                        iButton5.setIcon(keyWhite);
                        break;
                    } else {
                        iButton5.setIcon(keyEmpty);
                    }
                }
            } else if (jButton5.getIcon() == greenIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(0).equals("Green")) {
                        iButton5.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Green")) {
                        iButton5.setIcon(keyWhite);
                        break;
                    } else {
                        iButton5.setIcon(keyEmpty);
                    }
                }
            } else if (jButton5.getIcon() == yellowIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(0).equals("Yellow")) {
                        iButton5.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Yellow")) {
                        iButton5.setIcon(keyWhite);
                        break;
                    } else {
                        iButton5.setIcon(keyEmpty);
                    }
                }
            } else if (jButton5.getIcon() == whiteIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(0).equals("White")) {
                        iButton5.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("white")) {
                        iButton5.setIcon(keyWhite);
                        break;
                    } else {
                        iButton5.setIcon(keyEmpty);
                    }
                }
            }
    
            if (jButton6.getIcon() == redIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(1).equals("Red")) {
                        iButton6.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Red")) {
                        iButton6.setIcon(keyWhite);
                        break;
                    } else {
                        iButton6.setIcon(keyEmpty);
                    }
                }
            } else if (jButton6.getIcon() == blackIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(1).equals("Black")) {
                        iButton6.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Black")) {
                        iButton6.setIcon(keyWhite);
                        break;
                    } else {
                        iButton6.setIcon(keyEmpty);
                    }
                }
            } else if (jButton6.getIcon() == blueIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(1).equals("Blue")) {
                        iButton6.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Blue")) {
                        iButton6.setIcon(keyWhite);
                        break;
                    } else {
                        iButton6.setIcon(keyEmpty);
                    }
                }
            } else if (jButton6.getIcon() == greenIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(1).equals("Green")) {
                        iButton6.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Green")) {
                        iButton6.setIcon(keyWhite);
                        break;
                    } else {
                        iButton6.setIcon(keyEmpty);
                    }
                }
            } else if (jButton6.getIcon() == yellowIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(1).equals("Yellow")) {
                        iButton6.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Yellow")) {
                        iButton6.setIcon(keyWhite);
                        break;
                    } else {
                        iButton6.setIcon(keyEmpty);
                    }
                }
            } else if (jButton6.getIcon() == whiteIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(1).equals("White")) {
                        iButton6.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("white")) {
                        iButton6.setIcon(keyWhite);
                        break;
                    } else {
                        iButton6.setIcon(keyEmpty);
                    }
                }
            }
    
            if (jButton7.getIcon() == redIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(2).equals("Red")) {
                        iButton7.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Red")) {
                        iButton7.setIcon(keyWhite);
                        break;
                    } else {
                        iButton7.setIcon(keyEmpty);
                    }
                }
            } else if (jButton7.getIcon() == blackIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(2).equals("Black")) {
                        iButton7.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Black")) {
                        iButton7.setIcon(keyWhite);
                        break;
                    } else {
                        iButton7.setIcon(keyEmpty);
                    }
                }
            } else if (jButton7.getIcon() == blueIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(2).equals("Blue")) {
                        iButton7.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Blue")) {
                        iButton7.setIcon(keyWhite);
                        break;
                    } else {
                        iButton7.setIcon(keyEmpty);
                    }
                }
            } else if (jButton7.getIcon() == greenIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(2).equals("Green")) {
                        iButton7.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Green")) {
                        iButton7.setIcon(keyWhite);
                        break;
                    } else {
                        iButton7.setIcon(keyEmpty);
                    }
                }
            } else if (jButton7.getIcon() == yellowIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(2).equals("Yellow")) {
                        iButton7.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Yellow")) {
                        iButton7.setIcon(keyWhite);
                        break;
                    } else {
                        iButton7.setIcon(keyEmpty);
                    }
                }
            } else if (jButton7.getIcon() == whiteIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(2).equals("White")) {
                        iButton7.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("white")) {
                        iButton7.setIcon(keyWhite);
                        break;
                    } else {
                        iButton7.setIcon(keyEmpty);
                    }
                }
            }

            if (jButton8.getIcon() == redIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(3).equals("Red")) {
                        iButton8.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Red")) {
                        iButton8.setIcon(keyWhite);
                        break;
                    } else {
                        iButton8.setIcon(keyEmpty);
                    }
                }
            } else if (jButton8.getIcon() == blackIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(3).equals("Black")) {
                        iButton8.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Black")) {
                        iButton8.setIcon(keyWhite);
                        break;
                    } else {
                        iButton8.setIcon(keyEmpty);
                    }
                }
            } else if (jButton8.getIcon() == blueIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(3).equals("Blue")) {
                        iButton8.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Blue")) {
                        iButton8.setIcon(keyWhite);
                        break;
                    } else {
                        iButton8.setIcon(keyEmpty);
                    }
                }
            } else if (jButton8.getIcon() == greenIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(3).equals("Green")) {
                        iButton8.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Green")) {
                        iButton8.setIcon(keyWhite);
                        break;
                    } else {
                        iButton8.setIcon(keyEmpty);
                    }
                }
            } else if (jButton8.getIcon() == yellowIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(3).equals("Yellow")) {
                        iButton8.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("Yellow")) {
                        iButton8.setIcon(keyWhite);
                        break;
                    } else {
                        iButton8.setIcon(keyEmpty);
                    }
                }
            } else if (jButton8.getIcon() == whiteIcon) {
                for (int i=0; i<4; i++) {
                    if (secretCodeList.get(3).equals("White")) {
                        iButton8.setIcon(keyBlack);
                        break;
                    } else if (secretCodeList.get(i).equals("white")) {
                        iButton8.setIcon(keyWhite);
                        break;
                    } else {
                        iButton8.setIcon(keyEmpty);
                    }
                }
            }
        }
    }
    
    public void showSuitableIcons3() {
	if (jButton9.getIcon() == redIcon && secretCodeList.get(0).equals("Red") ||
		jButton9.getIcon() == blackIcon && secretCodeList.get(0).equals("Black") ||
		jButton9.getIcon() == blueIcon && secretCodeList.get(0).equals("Blue") ||
		jButton9.getIcon() == greenIcon && secretCodeList.get(0).equals("Green") ||
		jButton9.getIcon() == yellowIcon && secretCodeList.get(0).equals("Yellow") ||
		jButton9.getIcon() == whiteIcon && secretCodeList.get(0).equals("White")) {
		if (jButton10.getIcon() == redIcon && secretCodeList.get(1).equals("Red") ||
			jButton10.getIcon() == blackIcon && secretCodeList.get(1).equals("Black") ||
			jButton10.getIcon() == blueIcon && secretCodeList.get(1).equals("Blue") ||
			jButton10.getIcon() == greenIcon && secretCodeList.get(1).equals("Green") ||
			jButton10.getIcon() == yellowIcon && secretCodeList.get(1).equals("Yellow") ||
			jButton10.getIcon() == whiteIcon && secretCodeList.get(1).equals("White")) {
			if (jButton11.getIcon() == redIcon && secretCodeList.get(2).equals("Red") ||
				jButton11.getIcon() == blackIcon && secretCodeList.get(2).equals("Black") ||
				jButton11.getIcon() == blueIcon && secretCodeList.get(2).equals("Blue") ||
				jButton11.getIcon() == greenIcon && secretCodeList.get(2).equals("Green") ||
				jButton11.getIcon() == yellowIcon && secretCodeList.get(2).equals("Yellow") ||
				jButton11.getIcon() == whiteIcon && secretCodeList.get(2).equals("White")) {
				if (jButton12.getIcon() == redIcon && secretCodeList.get(3).equals("Red") ||
					jButton12.getIcon() == blackIcon && secretCodeList.get(3).equals("Black") ||
					jButton12.getIcon() == blueIcon && secretCodeList.get(3).equals("Blue") ||
					jButton12.getIcon() == greenIcon && secretCodeList.get(3).equals("Green") ||
					jButton12.getIcon() == yellowIcon && secretCodeList.get(3).equals("Yellow") ||
					jButton12.getIcon() == whiteIcon && secretCodeList.get(3).equals("White")) {

					iButton9.setIcon(keyBlack);
					iButton10.setIcon(keyBlack);
					iButton11.setIcon(keyBlack);
					iButton12.setIcon(keyBlack);

					JOptionPane.showMessageDialog(null, "Winner of round :\n"
							+ playerUsernameEasy.toString(),
						"Round End", 1);
	                            
	                roundWinner();
				} else {
					iButton9.setIcon(keyBlack);
	                iButton10.setIcon(keyBlack);
	                iButton11.setIcon(keyBlack);

	                if (jButton12.getIcon() == redIcon) {
	               	for (int i=0; i<4; i++) {
	               		if (secretCodeList.get(3).equals("Red")) {
	              			iButton12.setIcon(keyBlack);
	               			break;
	               		} else if (secretCodeList.get(i).equals("Red")) {
	               			iButton12.setIcon(keyWhite);
	               			break;
	               		} else {
	               			iButton12.setIcon(keyEmpty);
	               		}
	               	}
	            } else if (jButton12.getIcon() == blackIcon) {
	              	for (int i=0; i<4; i++) {
	               		if (secretCodeList.get(3).equals("Black")) {
	               			iButton12.setIcon(keyBlack);
	               			break;
	               		} else if (secretCodeList.get(i).equals("Black")) {
	               			iButton12.setIcon(keyWhite);
	               			break;
	               		} else {
	               			iButton12.setIcon(keyEmpty);
	               		}
	               	}
	            } else if (jButton12.getIcon() == blueIcon) {
	               	for (int i=0; i<4; i++) {
	               		if (secretCodeList.get(3).equals("Blue")) {
	               			iButton12.setIcon(keyBlack);
	               			break;
	               		} else if (secretCodeList.get(i).equals("Blue")) {
	               			iButton12.setIcon(keyWhite);
	               			break;
	              		} else {
	              			iButton12.setIcon(keyEmpty);
	               		}
	               	}
	            } else if (jButton12.getIcon() == greenIcon) {
	               	for (int i=0; i<4; i++) {
	               		if (secretCodeList.get(3).equals("Green")) {
	               			iButton12.setIcon(keyBlack);
	               			break;
	               		} else if (secretCodeList.get(i).equals("Green")) {
	               			iButton12.setIcon(keyWhite);
	               			break;
	               		} else {
	               			iButton12.setIcon(keyEmpty);
	               		}
	               	}
	            } else if (jButton12.getIcon() == yellowIcon) {
	               	for (int i=0; i<4; i++) {
	               		if (secretCodeList.get(3).equals("Yellow")) {
	               			iButton12.setIcon(keyBlack);
	               			break;
	              		} else if (secretCodeList.get(i).equals("Yellow")) {
	               			iButton12.setIcon(keyWhite);
	               			break;
	               		} else {
	               			iButton12.setIcon(keyEmpty);
	               		}
	               	}
	            } else if (jButton12.getIcon() == whiteIcon) {
	               	for (int i=0; i<4; i++) {
	               		if (secretCodeList.get(3).equals("White")) {
	               			iButton12.setIcon(keyBlack);
	               			break;
	               		} else if (secretCodeList.get(i).equals("white")) {
	               			iButton12.setIcon(keyWhite);
	               			break;
	               		} else {
	              			iButton12.setIcon(keyEmpty);
	               		}
	              	}
	            }
				}
			} else {
				iButton9.setIcon(keyBlack);
	            iButton10.setIcon(keyBlack);

	            if (jButton11.getIcon() == redIcon) {
		           	for (int i=0; i<4; i++) {
		           		if (secretCodeList.get(2).equals("Red")) {
		           			iButton11.setIcon(keyBlack);
		           			break;
		           		} else if (secretCodeList.get(i).equals("Red")) {
		           			iButton11.setIcon(keyWhite);
		           			break;
		           		} else {
		           			iButton11.setIcon(keyEmpty);
		          		}
		           	}
		        } else if (jButton11.getIcon() == blackIcon) {
		           	for (int i=0; i<4; i++) {
		           		if (secretCodeList.get(2).equals("Black")) {
		           			iButton11.setIcon(keyBlack);
		           			break;
		           		} else if (secretCodeList.get(i).equals("Black")) {
		            		iButton11.setIcon(keyWhite);
		            		break;
		           		} else {
		           			iButton11.setIcon(keyEmpty);
		           		}
		           	}
			    } else if (jButton11.getIcon() == blueIcon) {
		           	for (int i=0; i<4; i++) {
		           		if (secretCodeList.get(2).equals("Blue")) {
		           			iButton11.setIcon(keyBlack);
		           			break;
		           		} else if (secretCodeList.get(i).equals("Blue")) {
		           			iButton11.setIcon(keyWhite);
		           			break;
		           		} else {
		           			iButton11.setIcon(keyEmpty);
		           		}
		           	}
		        } else if (jButton11.getIcon() == greenIcon) {
		           	for (int i=0; i<4; i++) {
		           		if (secretCodeList.get(2).equals("Green")) {
		           			iButton11.setIcon(keyBlack);
		           			break;
		           		} else if (secretCodeList.get(i).equals("Green")) {
		           			iButton11.setIcon(keyWhite);
		           			break;
		           		} else {
		          			iButton11.setIcon(keyEmpty);
		           		}
		          	}
		    	} else if (jButton11.getIcon() == yellowIcon) {
		           	for (int i=0; i<4; i++) {
		           		if (secretCodeList.get(2).equals("Yellow")) {
		          			iButton11.setIcon(keyBlack);
		           			break;
		           		} else if (secretCodeList.get(i).equals("Yellow")) {
		           			iButton11.setIcon(keyWhite);
		           			break;
		           		} else {
		           			iButton11.setIcon(keyEmpty);
		           		}
		           	}
		        } else if (jButton11.getIcon() == whiteIcon) {
		           	for (int i=0; i<4; i++) {
		           		if (secretCodeList.get(2).equals("White")) {
		           			iButton11.setIcon(keyBlack);
		           			break;
		          		} else if (secretCodeList.get(i).equals("white")) {
		           			iButton11.setIcon(keyWhite);
		           			break;
		           		} else {
		           			iButton11.setIcon(keyEmpty);
		          		}
		           	}
		        }

	            if (jButton12.getIcon() == redIcon) {
	               	for (int i=0; i<4; i++) {
	               		if (secretCodeList.get(3).equals("Red")) {
	              			iButton12.setIcon(keyBlack);
	               			break;
	               		} else if (secretCodeList.get(i).equals("Red")) {
	               			iButton12.setIcon(keyWhite);
	               			break;
	               		} else {
	               			iButton12.setIcon(keyEmpty);
	               		}
	               	}
	            } else if (jButton12.getIcon() == blackIcon) {
	              	for (int i=0; i<4; i++) {
	               		if (secretCodeList.get(3).equals("Black")) {
	               			iButton12.setIcon(keyBlack);
	               			break;
	               		} else if (secretCodeList.get(i).equals("Black")) {
	               			iButton12.setIcon(keyWhite);
	               			break;
	               		} else {
	               			iButton12.setIcon(keyEmpty);
	               		}
	               	}
	            } else if (jButton12.getIcon() == blueIcon) {
	               	for (int i=0; i<4; i++) {
	               		if (secretCodeList.get(3).equals("Blue")) {
	               			iButton12.setIcon(keyBlack);
	               			break;
	               		} else if (secretCodeList.get(i).equals("Blue")) {
	               			iButton12.setIcon(keyWhite);
	               			break;
	              		} else {
	              			iButton12.setIcon(keyEmpty);
	               		}
	               	}
	            } else if (jButton12.getIcon() == greenIcon) {
	               	for (int i=0; i<4; i++) {
	               		if (secretCodeList.get(3).equals("Green")) {
	               			iButton12.setIcon(keyBlack);
	               			break;
	               		} else if (secretCodeList.get(i).equals("Green")) {
	               			iButton12.setIcon(keyWhite);
	               			break;
	               		} else {
	               			iButton12.setIcon(keyEmpty);
	               		}
	               	}
	            } else if (jButton12.getIcon() == yellowIcon) {
	               	for (int i=0; i<4; i++) {
	               		if (secretCodeList.get(3).equals("Yellow")) {
	               			iButton12.setIcon(keyBlack);
	               			break;
	              		} else if (secretCodeList.get(i).equals("Yellow")) {
	               			iButton12.setIcon(keyWhite);
	               			break;
	               		} else {
	               			iButton12.setIcon(keyEmpty);
	               		}
	               	}
	            } else if (jButton12.getIcon() == whiteIcon) {
	               	for (int i=0; i<4; i++) {
	               		if (secretCodeList.get(3).equals("White")) {
	               			iButton12.setIcon(keyBlack);
	               			break;
	               		} else if (secretCodeList.get(i).equals("white")) {
	               			iButton12.setIcon(keyWhite);
	               			break;
	               		} else {
	              			iButton12.setIcon(keyEmpty);
	               		}
	              	}
	            }
				}
			} else {
				iButton9.setIcon(keyBlack);

				if (jButton10.getIcon() == redIcon) {
		           	for (int i=0; i<4; i++) {
		           		if (secretCodeList.get(1).equals("Red")) {
		           			iButton10.setIcon(keyBlack);
		           			break;
		           		} else if (secretCodeList.get(i).equals("Red")) {
		           			iButton10.setIcon(keyWhite);
		           			break;
		           		} else {
		           			iButton10.setIcon(keyEmpty);
		           		}
		           	}
		        } else if (jButton10.getIcon() == blackIcon) {
		           	for (int i=0; i<4; i++) {
		           		if (secretCodeList.get(1).equals("Black")) {
		           			iButton10.setIcon(keyBlack);
		           			break;
		           		} else if (secretCodeList.get(i).equals("Black")) {
		           			iButton10.setIcon(keyWhite);
		           			break;
		           		} else {
		           			iButton10.setIcon(keyEmpty);
		           		}
		           	}
		        } else if (jButton10.getIcon() == blueIcon) {
		           	for (int i=0; i<4; i++) {
		           		if (secretCodeList.get(1).equals("Blue")) {
		           			iButton10.setIcon(keyBlack);
		           			break;
		           		} else if (secretCodeList.get(i).equals("Blue")) {
		           			iButton10.setIcon(keyWhite);
		           			break;
		           		} else {
		           			iButton10.setIcon(keyEmpty);
		           		}
		           	}
		        } else if (jButton10.getIcon() == greenIcon) {
		           	for (int i=0; i<4; i++) {
		           		if (secretCodeList.get(1).equals("Green")) {
		           			iButton10.setIcon(keyBlack);
		           			break;
		           		} else if (secretCodeList.get(i).equals("Green")) {
		           			iButton10.setIcon(keyWhite);
		           			break;
		           		} else {
		           			iButton10.setIcon(keyEmpty);
		           		}
		           	}
		        } else if (jButton10.getIcon() == yellowIcon) {
		           	for (int i=0; i<4; i++) {
		           		if (secretCodeList.get(1).equals("Yellow")) {
		           			iButton10.setIcon(keyBlack);
		           			break;
		           		} else if (secretCodeList.get(i).equals("Yellow")) {
		           			iButton10.setIcon(keyWhite);
		           			break;
		           		} else {
		           			iButton10.setIcon(keyEmpty);
		           		}
		           	}
		        } else if (jButton10.getIcon() == whiteIcon) {
		           	for (int i=0; i<4; i++) {
		           		if (secretCodeList.get(1).equals("White")) {
		           			iButton10.setIcon(keyBlack);
		           			break;
		           		} else if (secretCodeList.get(i).equals("white")) {
		           			iButton10.setIcon(keyWhite);
		           			break;
		           		} else {
		           			iButton10.setIcon(keyEmpty);
		           		}
		           	}
		        }
		
				if (jButton11.getIcon() == redIcon) {
		           	for (int i=0; i<4; i++) {
		           		if (secretCodeList.get(2).equals("Red")) {
		           			iButton11.setIcon(keyBlack);
		           			break;
		           		} else if (secretCodeList.get(i).equals("Red")) {
		           			iButton11.setIcon(keyWhite);
		           			break;
		           		} else {
		           			iButton11.setIcon(keyEmpty);
		          		}
		           	}
		        } else if (jButton11.getIcon() == blackIcon) {
		           	for (int i=0; i<4; i++) {
		           		if (secretCodeList.get(2).equals("Black")) {
		           			iButton11.setIcon(keyBlack);
		           			break;
		           		} else if (secretCodeList.get(i).equals("Black")) {
		            		iButton11.setIcon(keyWhite);
		            		break;
		           		} else {
		           			iButton11.setIcon(keyEmpty);
		           		}
		           	}
			    } else if (jButton11.getIcon() == blueIcon) {
		           	for (int i=0; i<4; i++) {
		           		if (secretCodeList.get(2).equals("Blue")) {
		           			iButton11.setIcon(keyBlack);
		           			break;
		           		} else if (secretCodeList.get(i).equals("Blue")) {
		           			iButton11.setIcon(keyWhite);
		           			break;
		           		} else {
		           			iButton11.setIcon(keyEmpty);
		           		}
		           	}
		        } else if (jButton11.getIcon() == greenIcon) {
		           	for (int i=0; i<4; i++) {
		           		if (secretCodeList.get(2).equals("Green")) {
		           			iButton11.setIcon(keyBlack);
		           			break;
		           		} else if (secretCodeList.get(i).equals("Green")) {
		           			iButton11.setIcon(keyWhite);
		           			break;
		           		} else {
		          			iButton11.setIcon(keyEmpty);
		           		}
		          	}
		    	} else if (jButton11.getIcon() == yellowIcon) {
		           	for (int i=0; i<4; i++) {
		           		if (secretCodeList.get(2).equals("Yellow")) {
		          			iButton11.setIcon(keyBlack);
		           			break;
		           		} else if (secretCodeList.get(i).equals("Yellow")) {
		           			iButton11.setIcon(keyWhite);
		           			break;
		           		} else {
		           			iButton11.setIcon(keyEmpty);
		           		}
		           	}
		        } else if (jButton11.getIcon() == whiteIcon) {
		           	for (int i=0; i<4; i++) {
		           		if (secretCodeList.get(2).equals("White")) {
		           			iButton11.setIcon(keyBlack);
		           			break;
		          		} else if (secretCodeList.get(i).equals("white")) {
		           			iButton11.setIcon(keyWhite);
		           			break;
		           		} else {
		           			iButton11.setIcon(keyEmpty);
		          		}
		           	}
		        }

	            if (jButton12.getIcon() == redIcon) {
	               	for (int i=0; i<4; i++) {
	               		if (secretCodeList.get(3).equals("Red")) {
	              			iButton12.setIcon(keyBlack);
	               			break;
	               		} else if (secretCodeList.get(i).equals("Red")) {
	               			iButton12.setIcon(keyWhite);
	               			break;
	               		} else {
	               			iButton12.setIcon(keyEmpty);
	               		}
	               	}
	            } else if (jButton12.getIcon() == blackIcon) {
	              	for (int i=0; i<4; i++) {
	               		if (secretCodeList.get(3).equals("Black")) {
	               			iButton12.setIcon(keyBlack);
	               			break;
	               		} else if (secretCodeList.get(i).equals("Black")) {
	               			iButton12.setIcon(keyWhite);
	               			break;
	               		} else {
	               			iButton12.setIcon(keyEmpty);
	               		}
	               	}
	            } else if (jButton12.getIcon() == blueIcon) {
	               	for (int i=0; i<4; i++) {
	               		if (secretCodeList.get(3).equals("Blue")) {
	               			iButton12.setIcon(keyBlack);
	               			break;
	               		} else if (secretCodeList.get(i).equals("Blue")) {
	               			iButton12.setIcon(keyWhite);
	               			break;
	              		} else {
	              			iButton12.setIcon(keyEmpty);
	               		}
	               	}
	            } else if (jButton12.getIcon() == greenIcon) {
	               	for (int i=0; i<4; i++) {
	               		if (secretCodeList.get(3).equals("Green")) {
	               			iButton12.setIcon(keyBlack);
	               			break;
	               		} else if (secretCodeList.get(i).equals("Green")) {
	               			iButton12.setIcon(keyWhite);
	               			break;
	               		} else {
	               			iButton12.setIcon(keyEmpty);
	               		}
	               	}
	            } else if (jButton12.getIcon() == yellowIcon) {
	               	for (int i=0; i<4; i++) {
	               		if (secretCodeList.get(3).equals("Yellow")) {
	               			iButton12.setIcon(keyBlack);
	               			break;
	              		} else if (secretCodeList.get(i).equals("Yellow")) {
	               			iButton12.setIcon(keyWhite);
	               			break;
	               		} else {
	               			iButton12.setIcon(keyEmpty);
	               		}
	               	}
	            } else if (jButton12.getIcon() == whiteIcon) {
	               	for (int i=0; i<4; i++) {
	               		if (secretCodeList.get(3).equals("White")) {
	               			iButton12.setIcon(keyBlack);
	               			break;
	               		} else if (secretCodeList.get(i).equals("white")) {
	               			iButton12.setIcon(keyWhite);
	               			break;
	               		} else {
	              			iButton12.setIcon(keyEmpty);
	               		}
	              	}
	            }

			}
		} else {
			if (jButton9.getIcon() == redIcon) {
	          	for (int i=0; i<4; i++) {
	    	   		if (secretCodeList.get(0).equals("Red")) {
	           			iButton9.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton9.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton9.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton9.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Black")) {
	           			iButton9.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton9.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton9.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton9.getIcon() == blueIcon) {
	        	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Blue")) {
	            		iButton9.setIcon(keyBlack);
	            		break;
	            	} else if (secretCodeList.get(i).equals("Blue")) {
	            		iButton9.setIcon(keyWhite);
	            		break;
	            	} else {
	            		iButton9.setIcon(keyEmpty);
	            	}
	            }
	        } else if (jButton9.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Green")) {
	           			iButton9.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton9.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton9.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton9.getIcon() == yellowIcon) {
	        	for (int i=0; i<4; i++) {
	                if (secretCodeList.get(0).equals("Yellow")) {
	                	iButton9.setIcon(keyBlack);
	                	break;
	               	} else if (secretCodeList.get(i).equals("Yellow")) {
	                	iButton9.setIcon(keyWhite);
	                	break;
	                } else {
	                	iButton9.setIcon(keyEmpty);
	                }
	            }
	        } else if (jButton9.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("White")) {
	           			iButton9.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton9.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton9.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton10.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Red")) {
	           			iButton10.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton10.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton10.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton10.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Black")) {
	           			iButton10.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton10.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton10.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton10.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Blue")) {
	           			iButton10.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton10.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton10.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton10.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Green")) {
	           			iButton10.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton10.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton10.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton10.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Yellow")) {
	           			iButton10.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton10.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton10.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton10.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("White")) {
	           			iButton10.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton10.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton10.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton11.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton11.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton11.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton11.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton11.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton11.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            		iButton11.setIcon(keyWhite);
	            		break;
	           		} else {
	           			iButton11.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton11.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton11.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton11.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton11.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton11.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton11.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton11.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton11.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton11.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton11.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton11.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton11.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton11.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton11.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton11.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton11.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton12.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton12.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton12.setIcon(keyWhite);
               			break;
               		} else {
               			iButton12.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton12.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton12.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton12.setIcon(keyWhite);
               			break;
               		} else {
               			iButton12.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton12.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton12.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton12.setIcon(keyWhite);
               			break;
              		} else {
              			iButton12.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton12.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton12.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton12.setIcon(keyWhite);
               			break;
               		} else {
               			iButton12.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton12.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton12.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton12.setIcon(keyWhite);
               			break;
               		} else {
               			iButton12.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton12.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton12.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton12.setIcon(keyWhite);
               			break;
               		} else {
              			iButton12.setIcon(keyEmpty);
               		}
              	}
            }
        }
    }
    
    public void showSuitableIcons4() {
	if (jButton13.getIcon() == redIcon && secretCodeList.get(0).equals("Red") ||
		jButton13.getIcon() == blackIcon && secretCodeList.get(0).equals("Black") ||
		jButton13.getIcon() == blueIcon && secretCodeList.get(0).equals("Blue") ||
		jButton13.getIcon() == greenIcon && secretCodeList.get(0).equals("Green") ||
		jButton13.getIcon() == yellowIcon && secretCodeList.get(0).equals("Yellow") ||
		jButton13.getIcon() == whiteIcon && secretCodeList.get(0).equals("White")) {
		if (jButton14.getIcon() == redIcon && secretCodeList.get(1).equals("Red") ||
			jButton14.getIcon() == blackIcon && secretCodeList.get(1).equals("Black") ||
			jButton14.getIcon() == blueIcon && secretCodeList.get(1).equals("Blue") ||
			jButton14.getIcon() == greenIcon && secretCodeList.get(1).equals("Green") ||
			jButton14.getIcon() == yellowIcon && secretCodeList.get(1).equals("Yellow") ||
			jButton14.getIcon() == whiteIcon && secretCodeList.get(1).equals("White")) {
			if (jButton15.getIcon() == redIcon && secretCodeList.get(2).equals("Red") ||
				jButton15.getIcon() == blackIcon && secretCodeList.get(2).equals("Black") ||
				jButton15.getIcon() == blueIcon && secretCodeList.get(2).equals("Blue") ||
				jButton15.getIcon() == greenIcon && secretCodeList.get(2).equals("Green") ||
				jButton15.getIcon() == yellowIcon && secretCodeList.get(2).equals("Yellow") ||
				jButton15.getIcon() == whiteIcon && secretCodeList.get(2).equals("White")) {
				if (jButton16.getIcon() == redIcon && secretCodeList.get(3).equals("Red") ||
					jButton16.getIcon() == blackIcon && secretCodeList.get(3).equals("Black") ||
					jButton16.getIcon() == blueIcon && secretCodeList.get(3).equals("Blue") ||
					jButton16.getIcon() == greenIcon && secretCodeList.get(3).equals("Green") ||
					jButton16.getIcon() == yellowIcon && secretCodeList.get(3).equals("Yellow") ||
					jButton16.getIcon() == whiteIcon && secretCodeList.get(3).equals("White")) {

					iButton13.setIcon(keyBlack);
					iButton14.setIcon(keyBlack);
					iButton15.setIcon(keyBlack);
					iButton16.setIcon(keyBlack);

					JOptionPane.showMessageDialog(null, "Winner of round :\n"
							+ playerUsernameEasy.toString(),
						"Round End", 1);
	                            
	                roundWinner();
				} else {
					iButton13.setIcon(keyBlack);
	                iButton14.setIcon(keyBlack);
	                iButton15.setIcon(keyBlack);

	                if (jButton16.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
               			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
               			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton16.setIcon(keyWhite);
               			break;
              		} else {
              			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
               			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton16.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
               			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
              			iButton16.setIcon(keyEmpty);
               		}
              	}
            }
				}
			} else {
				iButton13.setIcon(keyBlack);
	            iButton14.setIcon(keyBlack);

	            if (jButton15.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton15.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton15.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton15.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton15.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton15.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            		iButton15.setIcon(keyWhite);
	            		break;
	           		} else {
	           			iButton15.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton15.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton15.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton15.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton15.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton15.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton15.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton15.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton15.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton15.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton15.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton15.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton15.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton15.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton15.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton15.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton15.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton16.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
               			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
               			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton16.setIcon(keyWhite);
               			break;
              		} else {
              			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
               			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton16.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
               			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
              			iButton16.setIcon(keyEmpty);
               		}
              	}
            }
				}
			} else {
				iButton13.setIcon(keyBlack);

				if (jButton14.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Red")) {
	           			iButton14.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton14.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton14.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton14.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Black")) {
	           			iButton14.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton14.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton14.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton14.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Blue")) {
	           			iButton14.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton14.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton14.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton14.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Green")) {
	           			iButton14.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton14.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton14.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton14.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Yellow")) {
	           			iButton14.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton14.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton14.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton14.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("White")) {
	           			iButton14.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton14.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton14.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton15.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton15.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton15.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton15.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton15.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton15.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            		iButton15.setIcon(keyWhite);
	            		break;
	           		} else {
	           			iButton15.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton15.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton15.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton15.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton15.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton15.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton15.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton15.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton15.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton15.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton15.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton15.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton15.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton15.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton15.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton15.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton15.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton16.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
               			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
               			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton16.setIcon(keyWhite);
               			break;
              		} else {
              			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
               			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton16.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
               			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
              			iButton16.setIcon(keyEmpty);
               		}
              	}
            }

			}
		} else {
			if (jButton13.getIcon() == redIcon) {
	          	for (int i=0; i<4; i++) {
	    	   		if (secretCodeList.get(0).equals("Red")) {
	           			iButton13.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton13.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton13.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton13.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Black")) {
	           			iButton13.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton13.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton13.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton13.getIcon() == blueIcon) {
	        	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Blue")) {
	            		iButton13.setIcon(keyBlack);
	            		break;
	            	} else if (secretCodeList.get(i).equals("Blue")) {
	            		iButton13.setIcon(keyWhite);
	            		break;
	            	} else {
	            		iButton13.setIcon(keyEmpty);
	            	}
	            }
	        } else if (jButton13.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Green")) {
	           			iButton13.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton13.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton13.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton13.getIcon() == yellowIcon) {
	        	for (int i=0; i<4; i++) {
	                if (secretCodeList.get(0).equals("Yellow")) {
	                	iButton13.setIcon(keyBlack);
	                	break;
	               	} else if (secretCodeList.get(i).equals("Yellow")) {
	                	iButton13.setIcon(keyWhite);
	                	break;
	                } else {
	                	iButton13.setIcon(keyEmpty);
	                }
	            }
	        } else if (jButton13.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("White")) {
	           			iButton13.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton13.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton13.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton14.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Red")) {
	           			iButton14.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton14.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton14.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton14.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Black")) {
	           			iButton14.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton14.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton14.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton14.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Blue")) {
	           			iButton14.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton14.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton14.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton14.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Green")) {
	           			iButton14.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton14.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton14.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton14.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Yellow")) {
	           			iButton14.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton14.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton14.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton14.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("White")) {
	           			iButton14.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton14.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton14.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton15.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton15.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton15.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton15.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton15.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton15.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            		iButton15.setIcon(keyWhite);
	            		break;
	           		} else {
	           			iButton15.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton15.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton15.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton15.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton15.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton15.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton15.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton15.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton15.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton15.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton15.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton15.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton15.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton15.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton15.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton15.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton15.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton16.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
               			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
               			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton16.setIcon(keyWhite);
               			break;
              		} else {
              			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
               			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton16.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
               			iButton16.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton16.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton16.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton16.setIcon(keyWhite);
               			break;
               		} else {
              			iButton16.setIcon(keyEmpty);
               		}
              	}
            }
        }
    }
    
    public void showSuitableIcons5() {
	if (jButton17.getIcon() == redIcon && secretCodeList.get(0).equals("Red") ||
		jButton17.getIcon() == blackIcon && secretCodeList.get(0).equals("Black") ||
		jButton17.getIcon() == blueIcon && secretCodeList.get(0).equals("Blue") ||
		jButton17.getIcon() == greenIcon && secretCodeList.get(0).equals("Green") ||
		jButton17.getIcon() == yellowIcon && secretCodeList.get(0).equals("Yellow") ||
		jButton17.getIcon() == whiteIcon && secretCodeList.get(0).equals("White")) {
		if (jButton18.getIcon() == redIcon && secretCodeList.get(1).equals("Red") ||
			jButton18.getIcon() == blackIcon && secretCodeList.get(1).equals("Black") ||
			jButton18.getIcon() == blueIcon && secretCodeList.get(1).equals("Blue") ||
			jButton18.getIcon() == greenIcon && secretCodeList.get(1).equals("Green") ||
			jButton18.getIcon() == yellowIcon && secretCodeList.get(1).equals("Yellow") ||
			jButton18.getIcon() == whiteIcon && secretCodeList.get(1).equals("White")) {
			if (jButton19.getIcon() == redIcon && secretCodeList.get(2).equals("Red") ||
				jButton19.getIcon() == blackIcon && secretCodeList.get(2).equals("Black") ||
				jButton19.getIcon() == blueIcon && secretCodeList.get(2).equals("Blue") ||
				jButton19.getIcon() == greenIcon && secretCodeList.get(2).equals("Green") ||
				jButton19.getIcon() == yellowIcon && secretCodeList.get(2).equals("Yellow") ||
				jButton19.getIcon() == whiteIcon && secretCodeList.get(2).equals("White")) {
				if (jButton20.getIcon() == redIcon && secretCodeList.get(3).equals("Red") ||
					jButton20.getIcon() == blackIcon && secretCodeList.get(3).equals("Black") ||
					jButton20.getIcon() == blueIcon && secretCodeList.get(3).equals("Blue") ||
					jButton20.getIcon() == greenIcon && secretCodeList.get(3).equals("Green") ||
					jButton20.getIcon() == yellowIcon && secretCodeList.get(3).equals("Yellow") ||
					jButton20.getIcon() == whiteIcon && secretCodeList.get(3).equals("White")) {

					iButton17.setIcon(keyBlack);
					iButton18.setIcon(keyBlack);
					iButton19.setIcon(keyBlack);
					iButton20.setIcon(keyBlack);

					JOptionPane.showMessageDialog(null, "Winner of round :\n"
							+ playerUsernameEasy.toString(),
						"Round End", 1);
	                            
	                roundWinner();
				} else {
					iButton17.setIcon(keyBlack);
	                iButton18.setIcon(keyBlack);
	                iButton19.setIcon(keyBlack);

	                if (jButton20.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
               			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
               			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton20.setIcon(keyWhite);
               			break;
              		} else {
              			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
               			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton20.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
               			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
              			iButton20.setIcon(keyEmpty);
               		}
              	}
            }
				}
			} else {
				iButton17.setIcon(keyBlack);
	            iButton18.setIcon(keyBlack);

	            if (jButton19.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton19.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton19.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton19.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton19.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton19.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            		iButton19.setIcon(keyWhite);
	            		break;
	           		} else {
	           			iButton19.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton19.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton19.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton19.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton19.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton19.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton19.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton19.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton19.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton19.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton19.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton19.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton19.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton19.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton19.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton19.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton19.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton20.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
               			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
               			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton20.setIcon(keyWhite);
               			break;
              		} else {
              			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
               			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton20.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
               			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
              			iButton20.setIcon(keyEmpty);
               		}
              	}
            }
				}
			} else {
				iButton17.setIcon(keyBlack);

				if (jButton18.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Red")) {
	           			iButton18.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton18.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton18.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton18.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Black")) {
	           			iButton18.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton18.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton18.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton18.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Blue")) {
	           			iButton18.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton18.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton18.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton18.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Green")) {
	           			iButton18.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton18.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton18.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton18.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Yellow")) {
	           			iButton18.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton18.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton18.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton18.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("White")) {
	           			iButton18.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton18.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton18.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton19.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton19.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton19.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton19.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton19.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton19.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            		iButton19.setIcon(keyWhite);
	            		break;
	           		} else {
	           			iButton19.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton19.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton19.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton19.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton19.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton19.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton19.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton19.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton19.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton19.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton19.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton19.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton19.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton19.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton19.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton19.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton19.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton20.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
               			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
               			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton20.setIcon(keyWhite);
               			break;
              		} else {
              			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
               			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton20.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
               			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
              			iButton20.setIcon(keyEmpty);
               		}
              	}
            }

			}
		} else {
			if (jButton17.getIcon() == redIcon) {
	          	for (int i=0; i<4; i++) {
	    	   		if (secretCodeList.get(0).equals("Red")) {
	           			iButton17.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton17.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton17.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton17.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Black")) {
	           			iButton17.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton17.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton17.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton17.getIcon() == blueIcon) {
	        	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Blue")) {
	            		iButton17.setIcon(keyBlack);
	            		break;
	            	} else if (secretCodeList.get(i).equals("Blue")) {
	            		iButton17.setIcon(keyWhite);
	            		break;
	            	} else {
	            		iButton17.setIcon(keyEmpty);
	            	}
	            }
	        } else if (jButton17.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Green")) {
	           			iButton17.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton17.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton17.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton17.getIcon() == yellowIcon) {
	        	for (int i=0; i<4; i++) {
	                if (secretCodeList.get(0).equals("Yellow")) {
	                	iButton17.setIcon(keyBlack);
	                	break;
	               	} else if (secretCodeList.get(i).equals("Yellow")) {
	                	iButton17.setIcon(keyWhite);
	                	break;
	                } else {
	                	iButton17.setIcon(keyEmpty);
	                }
	            }
	        } else if (jButton17.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("White")) {
	           			iButton17.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton17.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton17.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton18.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Red")) {
	           			iButton18.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton18.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton18.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton18.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Black")) {
	           			iButton18.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton18.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton18.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton18.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Blue")) {
	           			iButton18.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton18.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton18.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton18.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Green")) {
	           			iButton18.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton18.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton18.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton18.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Yellow")) {
	           			iButton18.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton18.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton18.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton18.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("White")) {
	           			iButton18.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton18.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton18.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton19.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton19.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton19.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton19.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton19.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton19.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            		iButton19.setIcon(keyWhite);
	            		break;
	           		} else {
	           			iButton19.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton19.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton19.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton19.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton19.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton19.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton19.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton19.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton19.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton19.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton19.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton19.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton19.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton19.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton19.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton19.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton19.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton20.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
               			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
               			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton20.setIcon(keyWhite);
               			break;
              		} else {
              			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
               			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton20.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
               			iButton20.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton20.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton20.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton20.setIcon(keyWhite);
               			break;
               		} else {
              			iButton20.setIcon(keyEmpty);
               		}
              	}
            }
        }
    }
    
    public void showSuitableIcons6() {
	if (jButton21.getIcon() == redIcon && secretCodeList.get(0).equals("Red") ||
		jButton21.getIcon() == blackIcon && secretCodeList.get(0).equals("Black") ||
		jButton21.getIcon() == blueIcon && secretCodeList.get(0).equals("Blue") ||
		jButton21.getIcon() == greenIcon && secretCodeList.get(0).equals("Green") ||
		jButton21.getIcon() == yellowIcon && secretCodeList.get(0).equals("Yellow") ||
		jButton21.getIcon() == whiteIcon && secretCodeList.get(0).equals("White")) {
		if (jButton22.getIcon() == redIcon && secretCodeList.get(1).equals("Red") ||
			jButton22.getIcon() == blackIcon && secretCodeList.get(1).equals("Black") ||
			jButton22.getIcon() == blueIcon && secretCodeList.get(1).equals("Blue") ||
			jButton22.getIcon() == greenIcon && secretCodeList.get(1).equals("Green") ||
			jButton22.getIcon() == yellowIcon && secretCodeList.get(1).equals("Yellow") ||
			jButton22.getIcon() == whiteIcon && secretCodeList.get(1).equals("White")) {
			if (jButton23.getIcon() == redIcon && secretCodeList.get(2).equals("Red") ||
				jButton23.getIcon() == blackIcon && secretCodeList.get(2).equals("Black") ||
				jButton23.getIcon() == blueIcon && secretCodeList.get(2).equals("Blue") ||
				jButton23.getIcon() == greenIcon && secretCodeList.get(2).equals("Green") ||
				jButton23.getIcon() == yellowIcon && secretCodeList.get(2).equals("Yellow") ||
				jButton23.getIcon() == whiteIcon && secretCodeList.get(2).equals("White")) {
				if (jButton24.getIcon() == redIcon && secretCodeList.get(3).equals("Red") ||
					jButton24.getIcon() == blackIcon && secretCodeList.get(3).equals("Black") ||
					jButton24.getIcon() == blueIcon && secretCodeList.get(3).equals("Blue") ||
					jButton24.getIcon() == greenIcon && secretCodeList.get(3).equals("Green") ||
					jButton24.getIcon() == yellowIcon && secretCodeList.get(3).equals("Yellow") ||
					jButton24.getIcon() == whiteIcon && secretCodeList.get(3).equals("White")) {

					iButton21.setIcon(keyBlack);
					iButton22.setIcon(keyBlack);
					iButton23.setIcon(keyBlack);
					iButton24.setIcon(keyBlack);

					JOptionPane.showMessageDialog(null, "Winner of round :\n"
							+ playerUsernameEasy.toString(),
						"Round End", 1);
	                            
	                roundWinner();
				} else {
					iButton21.setIcon(keyBlack);
	                iButton22.setIcon(keyBlack);
	                iButton23.setIcon(keyBlack);

	                if (jButton24.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
               			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
               			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton24.setIcon(keyWhite);
               			break;
              		} else {
              			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
               			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton24.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
               			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
              			iButton24.setIcon(keyEmpty);
               		}
              	}
            }
				}
			} else {
				iButton21.setIcon(keyBlack);
	            iButton22.setIcon(keyBlack);

	            if (jButton23.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton23.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton23.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton23.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton23.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton23.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            			iButton23.setIcon(keyWhite);
	            			break;
	           		} else {
	           			iButton23.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton23.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton23.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton23.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton23.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton23.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton23.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton23.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton23.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton23.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton23.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton23.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton23.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton23.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton23.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton23.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton23.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton24.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
               			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
               			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton24.setIcon(keyWhite);
               			break;
              		} else {
              			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
               			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton24.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
               			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
              			iButton24.setIcon(keyEmpty);
               		}
              	}
            }
				}
			} else {
				iButton21.setIcon(keyBlack);

				if (jButton22.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Red")) {
	           			iButton22.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton22.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton22.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton22.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Black")) {
	           			iButton22.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton22.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton22.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton22.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Blue")) {
	           			iButton22.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton22.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton22.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton22.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Green")) {
	           			iButton22.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton22.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton22.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton22.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Yellow")) {
	           			iButton22.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton22.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton22.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton22.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("White")) {
	           			iButton22.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton22.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton22.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton23.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton23.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton23.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton23.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton23.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton23.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            			iButton23.setIcon(keyWhite);
	            			break;
	           		} else {
	           			iButton23.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton23.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton23.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton23.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton23.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton23.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton23.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton23.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton23.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton23.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton23.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton23.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton23.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton23.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton23.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton23.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton23.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton24.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
               			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
               			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton24.setIcon(keyWhite);
               			break;
              		} else {
              			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
               			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton24.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
               			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
              			iButton24.setIcon(keyEmpty);
               		}
              	}
            }

			}
		} else {
			if (jButton21.getIcon() == redIcon) {
	          	for (int i=0; i<4; i++) {
	    	   		if (secretCodeList.get(0).equals("Red")) {
	           			iButton21.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton21.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton21.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton21.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Black")) {
	           			iButton21.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton21.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton21.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton21.getIcon() == blueIcon) {
	        	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Blue")) {
	            		iButton21.setIcon(keyBlack);
	            		break;
	            	} else if (secretCodeList.get(i).equals("Blue")) {
	            		iButton21.setIcon(keyWhite);
	            		break;
	            	} else {
	            		iButton21.setIcon(keyEmpty);
	            	}
	            }
	        } else if (jButton21.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Green")) {
	           			iButton21.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton21.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton21.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton21.getIcon() == yellowIcon) {
	        	for (int i=0; i<4; i++) {
	                if (secretCodeList.get(0).equals("Yellow")) {
	                	iButton21.setIcon(keyBlack);
	                	break;
	               	} else if (secretCodeList.get(i).equals("Yellow")) {
	                	iButton21.setIcon(keyWhite);
	                	break;
	                } else {
	                	iButton21.setIcon(keyEmpty);
	                }
	            }
	        } else if (jButton21.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("White")) {
	           			iButton21.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton21.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton21.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton22.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Red")) {
	           			iButton22.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton22.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton22.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton22.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Black")) {
	           			iButton22.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton22.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton22.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton22.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Blue")) {
	           			iButton22.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton22.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton22.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton22.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Green")) {
	           			iButton22.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton22.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton22.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton22.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Yellow")) {
	           			iButton22.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton22.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton22.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton22.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("White")) {
	           			iButton22.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton22.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton22.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton23.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton23.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton23.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton23.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton23.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton23.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            			iButton23.setIcon(keyWhite);
	            			break;
	           		} else {
	           			iButton23.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton23.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton23.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton23.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton23.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton23.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton23.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton23.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton23.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton23.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton23.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton23.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton23.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton23.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton23.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton23.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton23.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton24.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
               			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
               			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton24.setIcon(keyWhite);
               			break;
              		} else {
              			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
               			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton24.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
               			iButton24.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton24.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton24.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton24.setIcon(keyWhite);
               			break;
               		} else {
              			iButton24.setIcon(keyEmpty);
               		}
              	}
            }
        }
    }
    
    public void showSuitableIcons7() {
	if (jButton25.getIcon() == redIcon && secretCodeList.get(0).equals("Red") ||
		jButton25.getIcon() == blackIcon && secretCodeList.get(0).equals("Black") ||
		jButton25.getIcon() == blueIcon && secretCodeList.get(0).equals("Blue") ||
		jButton25.getIcon() == greenIcon && secretCodeList.get(0).equals("Green") ||
		jButton25.getIcon() == yellowIcon && secretCodeList.get(0).equals("Yellow") ||
		jButton25.getIcon() == whiteIcon && secretCodeList.get(0).equals("White")) {
		if (jButton26.getIcon() == redIcon && secretCodeList.get(1).equals("Red") ||
			jButton26.getIcon() == blackIcon && secretCodeList.get(1).equals("Black") ||
			jButton26.getIcon() == blueIcon && secretCodeList.get(1).equals("Blue") ||
			jButton26.getIcon() == greenIcon && secretCodeList.get(1).equals("Green") ||
			jButton26.getIcon() == yellowIcon && secretCodeList.get(1).equals("Yellow") ||
			jButton26.getIcon() == whiteIcon && secretCodeList.get(1).equals("White")) {
			if (jButton27.getIcon() == redIcon && secretCodeList.get(2).equals("Red") ||
				jButton27.getIcon() == blackIcon && secretCodeList.get(2).equals("Black") ||
				jButton27.getIcon() == blueIcon && secretCodeList.get(2).equals("Blue") ||
				jButton27.getIcon() == greenIcon && secretCodeList.get(2).equals("Green") ||
				jButton27.getIcon() == yellowIcon && secretCodeList.get(2).equals("Yellow") ||
				jButton27.getIcon() == whiteIcon && secretCodeList.get(2).equals("White")) {
				if (jButton28.getIcon() == redIcon && secretCodeList.get(3).equals("Red") ||
					jButton28.getIcon() == blackIcon && secretCodeList.get(3).equals("Black") ||
					jButton28.getIcon() == blueIcon && secretCodeList.get(3).equals("Blue") ||
					jButton28.getIcon() == greenIcon && secretCodeList.get(3).equals("Green") ||
					jButton28.getIcon() == yellowIcon && secretCodeList.get(3).equals("Yellow") ||
					jButton28.getIcon() == whiteIcon && secretCodeList.get(3).equals("White")) {

					iButton25.setIcon(keyBlack);
					iButton26.setIcon(keyBlack);
					iButton27.setIcon(keyBlack);
					iButton28.setIcon(keyBlack);

					JOptionPane.showMessageDialog(null, "Winner of round :\n"
							+ playerUsernameEasy.toString(),
						"Round End", 1);
	                            
	                roundWinner();
				} else {
					iButton25.setIcon(keyBlack);
	                iButton26.setIcon(keyBlack);
	                iButton27.setIcon(keyBlack);

	                if (jButton28.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
               			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
               			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton28.setIcon(keyWhite);
               			break;
              		} else {
              			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
               			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton28.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
               			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
              			iButton28.setIcon(keyEmpty);
               		}
              	}
            }
				}
			} else {
				iButton25.setIcon(keyBlack);
	            iButton26.setIcon(keyBlack);

	            if (jButton27.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton27.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton27.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton27.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton27.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton27.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            		iButton27.setIcon(keyWhite);
	            		break;
	           		} else {
	           			iButton27.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton27.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton27.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton27.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton27.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton27.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton27.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton27.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton27.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton27.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton27.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton27.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton27.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton27.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton27.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton27.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton27.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton28.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
               			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
               			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton28.setIcon(keyWhite);
               			break;
              		} else {
              			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
               			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton28.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
               			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
              			iButton28.setIcon(keyEmpty);
               		}
              	}
            }
				}
			} else {
				iButton25.setIcon(keyBlack);

				if (jButton26.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Red")) {
	           			iButton26.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton26.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton26.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton26.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Black")) {
	           			iButton26.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton26.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton26.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton26.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Blue")) {
	           			iButton26.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton26.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton26.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton26.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Green")) {
	           			iButton26.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton26.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton26.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton26.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Yellow")) {
	           			iButton26.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton26.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton26.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton26.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("White")) {
	           			iButton26.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton26.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton26.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton27.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton27.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton27.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton27.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton27.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton27.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            		iButton27.setIcon(keyWhite);
	            		break;
	           		} else {
	           			iButton27.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton27.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton27.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton27.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton27.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton27.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton27.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton27.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton27.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton27.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton27.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton27.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton27.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton27.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton27.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton27.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton27.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton28.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
               			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
               			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton28.setIcon(keyWhite);
               			break;
              		} else {
              			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
               			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton28.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
               			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
              			iButton28.setIcon(keyEmpty);
               		}
              	}
            }

			}
		} else {
			if (jButton25.getIcon() == redIcon) {
	          	for (int i=0; i<4; i++) {
	    	   		if (secretCodeList.get(0).equals("Red")) {
	           			iButton25.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton25.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton25.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton25.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Black")) {
	           			iButton25.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton25.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton25.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton25.getIcon() == blueIcon) {
	        	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Blue")) {
	            		iButton25.setIcon(keyBlack);
	            		break;
	            	} else if (secretCodeList.get(i).equals("Blue")) {
	            		iButton25.setIcon(keyWhite);
	            		break;
	            	} else {
	            		iButton25.setIcon(keyEmpty);
	            	}
	            }
	        } else if (jButton25.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Green")) {
	           			iButton25.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton25.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton25.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton25.getIcon() == yellowIcon) {
	        	for (int i=0; i<4; i++) {
	                if (secretCodeList.get(0).equals("Yellow")) {
	                	iButton25.setIcon(keyBlack);
	                	break;
	               	} else if (secretCodeList.get(i).equals("Yellow")) {
	                	iButton25.setIcon(keyWhite);
	                	break;
	                } else {
	                	iButton25.setIcon(keyEmpty);
	                }
	            }
	        } else if (jButton25.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("White")) {
	           			iButton25.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton25.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton25.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton26.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Red")) {
	           			iButton26.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton26.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton26.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton26.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Black")) {
	           			iButton26.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton26.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton26.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton26.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Blue")) {
	           			iButton26.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton26.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton26.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton26.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Green")) {
	           			iButton26.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton26.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton26.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton26.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Yellow")) {
	           			iButton26.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton26.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton26.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton26.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("White")) {
	           			iButton26.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton26.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton26.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton27.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton27.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton27.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton27.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton27.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton27.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            		iButton27.setIcon(keyWhite);
	            		break;
	           		} else {
	           			iButton27.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton27.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton27.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton27.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton27.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton27.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton27.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton27.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton27.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton27.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton27.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton27.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton27.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton27.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton27.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton27.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton27.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton28.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
               			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
               			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton28.setIcon(keyWhite);
               			break;
              		} else {
              			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
               			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton28.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
               			iButton28.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton28.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton28.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton28.setIcon(keyWhite);
               			break;
               		} else {
              			iButton28.setIcon(keyEmpty);
               		}
              	}
            }
        }
    }
    
    public void showSuitableIcons8() {
	if (jButton29.getIcon() == redIcon && secretCodeList.get(0).equals("Red") ||
		jButton29.getIcon() == blackIcon && secretCodeList.get(0).equals("Black") ||
		jButton29.getIcon() == blueIcon && secretCodeList.get(0).equals("Blue") ||
		jButton29.getIcon() == greenIcon && secretCodeList.get(0).equals("Green") ||
		jButton29.getIcon() == yellowIcon && secretCodeList.get(0).equals("Yellow") ||
		jButton29.getIcon() == whiteIcon && secretCodeList.get(0).equals("White")) {
		if (jButton30.getIcon() == redIcon && secretCodeList.get(1).equals("Red") ||
			jButton30.getIcon() == blackIcon && secretCodeList.get(1).equals("Black") ||
			jButton30.getIcon() == blueIcon && secretCodeList.get(1).equals("Blue") ||
			jButton30.getIcon() == greenIcon && secretCodeList.get(1).equals("Green") ||
			jButton30.getIcon() == yellowIcon && secretCodeList.get(1).equals("Yellow") ||
			jButton30.getIcon() == whiteIcon && secretCodeList.get(1).equals("White")) {
			if (jButton31.getIcon() == redIcon && secretCodeList.get(2).equals("Red") ||
				jButton31.getIcon() == blackIcon && secretCodeList.get(2).equals("Black") ||
				jButton31.getIcon() == blueIcon && secretCodeList.get(2).equals("Blue") ||
				jButton31.getIcon() == greenIcon && secretCodeList.get(2).equals("Green") ||
				jButton31.getIcon() == yellowIcon && secretCodeList.get(2).equals("Yellow") ||
				jButton31.getIcon() == whiteIcon && secretCodeList.get(2).equals("White")) {
				if (jButton32.getIcon() == redIcon && secretCodeList.get(3).equals("Red") ||
					jButton32.getIcon() == blackIcon && secretCodeList.get(3).equals("Black") ||
					jButton32.getIcon() == blueIcon && secretCodeList.get(3).equals("Blue") ||
					jButton32.getIcon() == greenIcon && secretCodeList.get(3).equals("Green") ||
					jButton32.getIcon() == yellowIcon && secretCodeList.get(3).equals("Yellow") ||
					jButton32.getIcon() == whiteIcon && secretCodeList.get(3).equals("White")) {

					iButton29.setIcon(keyBlack);
					iButton30.setIcon(keyBlack);
					iButton31.setIcon(keyBlack);
					iButton32.setIcon(keyBlack);

					JOptionPane.showMessageDialog(null, "Winner of round :\n"
							+ playerUsernameEasy.toString(),
						"Round End", 1);
	                            
	                roundWinner();
				} else {
					iButton29.setIcon(keyBlack);
	                iButton30.setIcon(keyBlack);
	                iButton31.setIcon(keyBlack);

	                if (jButton32.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
               			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
               			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton32.setIcon(keyWhite);
               			break;
              		} else {
              			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
               			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton32.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
               			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
              			iButton32.setIcon(keyEmpty);
               		}
              	}
            }
				}
			} else {
				iButton29.setIcon(keyBlack);
	            iButton30.setIcon(keyBlack);

	            if (jButton31.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton31.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton31.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton31.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton31.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton31.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            			iButton31.setIcon(keyWhite);
	            			break;
	           		} else {
	           			iButton31.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton31.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton31.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton31.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton31.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton31.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton31.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton31.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton31.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton31.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton31.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton31.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton31.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton31.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton31.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton31.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton31.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton32.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
               			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
               			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton32.setIcon(keyWhite);
               			break;
              		} else {
              			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
               			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton32.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
               			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
              			iButton32.setIcon(keyEmpty);
               		}
              	}
            }
				}
			} else {
				iButton29.setIcon(keyBlack);

				if (jButton30.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Red")) {
	           			iButton30.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton30.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton30.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton30.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Black")) {
	           			iButton30.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton30.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton30.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton30.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Blue")) {
	           			iButton30.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton30.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton30.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton30.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Green")) {
	           			iButton30.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton30.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton30.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton30.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Yellow")) {
	           			iButton30.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton30.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton30.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton30.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("White")) {
	           			iButton30.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton30.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton30.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton31.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton31.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton31.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton31.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton31.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton31.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            			iButton31.setIcon(keyWhite);
	            			break;
	           		} else {
	           			iButton31.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton31.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton31.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton31.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton31.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton31.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton31.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton31.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton31.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton31.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton31.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton31.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton31.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton31.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton31.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton31.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton31.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton32.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
               			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
               			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton32.setIcon(keyWhite);
               			break;
              		} else {
              			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
               			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton32.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
               			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
              			iButton32.setIcon(keyEmpty);
               		}
              	}
            }

			}
		} else {
			if (jButton29.getIcon() == redIcon) {
	          	for (int i=0; i<4; i++) {
	    	   		if (secretCodeList.get(0).equals("Red")) {
	           			iButton29.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton29.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton29.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton29.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Black")) {
	           			iButton29.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton29.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton29.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton29.getIcon() == blueIcon) {
	        	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Blue")) {
	            		iButton29.setIcon(keyBlack);
	            		break;
	            	} else if (secretCodeList.get(i).equals("Blue")) {
	            		iButton29.setIcon(keyWhite);
	            		break;
	            	} else {
	            		iButton29.setIcon(keyEmpty);
	            	}
	            }
	        } else if (jButton29.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Green")) {
	           			iButton29.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton29.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton29.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton29.getIcon() == yellowIcon) {
	        	for (int i=0; i<4; i++) {
	                if (secretCodeList.get(0).equals("Yellow")) {
	                	iButton29.setIcon(keyBlack);
	                	break;
	               	} else if (secretCodeList.get(i).equals("Yellow")) {
	                	iButton29.setIcon(keyWhite);
	                	break;
	                } else {
	                	iButton29.setIcon(keyEmpty);
	                }
	            }
	        } else if (jButton29.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("White")) {
	           			iButton29.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton29.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton29.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton30.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Red")) {
	           			iButton30.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton30.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton30.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton30.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Black")) {
	           			iButton30.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton30.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton30.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton30.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Blue")) {
	           			iButton30.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton30.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton30.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton30.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Green")) {
	           			iButton30.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton30.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton30.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton30.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Yellow")) {
	           			iButton30.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton30.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton30.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton30.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("White")) {
	           			iButton30.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton30.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton30.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton31.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton31.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton31.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton31.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton31.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton31.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            			iButton31.setIcon(keyWhite);
	            			break;
	           		} else {
	           			iButton31.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton31.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton31.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton31.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton31.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton31.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton31.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton31.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton31.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton31.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton31.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton31.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton31.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton31.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton31.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton31.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton31.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton32.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
               			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
               			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton32.setIcon(keyWhite);
               			break;
              		} else {
              			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
               			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton32.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
               			iButton32.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton32.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton32.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton32.setIcon(keyWhite);
               			break;
               		} else {
              			iButton32.setIcon(keyEmpty);
               		}
              	}
            }
        }
    }
    
    public void showSuitableIcons9() {
	if (jButton33.getIcon() == redIcon && secretCodeList.get(0).equals("Red") ||
		jButton33.getIcon() == blackIcon && secretCodeList.get(0).equals("Black") ||
		jButton33.getIcon() == blueIcon && secretCodeList.get(0).equals("Blue") ||
		jButton33.getIcon() == greenIcon && secretCodeList.get(0).equals("Green") ||
		jButton33.getIcon() == yellowIcon && secretCodeList.get(0).equals("Yellow") ||
		jButton33.getIcon() == whiteIcon && secretCodeList.get(0).equals("White")) {
		if (jButton34.getIcon() == redIcon && secretCodeList.get(1).equals("Red") ||
			jButton34.getIcon() == blackIcon && secretCodeList.get(1).equals("Black") ||
			jButton34.getIcon() == blueIcon && secretCodeList.get(1).equals("Blue") ||
			jButton34.getIcon() == greenIcon && secretCodeList.get(1).equals("Green") ||
			jButton34.getIcon() == yellowIcon && secretCodeList.get(1).equals("Yellow") ||
			jButton34.getIcon() == whiteIcon && secretCodeList.get(1).equals("White")) {
			if (jButton35.getIcon() == redIcon && secretCodeList.get(2).equals("Red") ||
				jButton35.getIcon() == blackIcon && secretCodeList.get(2).equals("Black") ||
				jButton35.getIcon() == blueIcon && secretCodeList.get(2).equals("Blue") ||
				jButton35.getIcon() == greenIcon && secretCodeList.get(2).equals("Green") ||
				jButton35.getIcon() == yellowIcon && secretCodeList.get(2).equals("Yellow") ||
				jButton35.getIcon() == whiteIcon && secretCodeList.get(2).equals("White")) {
				if (jButton36.getIcon() == redIcon && secretCodeList.get(3).equals("Red") ||
					jButton36.getIcon() == blackIcon && secretCodeList.get(3).equals("Black") ||
					jButton36.getIcon() == blueIcon && secretCodeList.get(3).equals("Blue") ||
					jButton36.getIcon() == greenIcon && secretCodeList.get(3).equals("Green") ||
					jButton36.getIcon() == yellowIcon && secretCodeList.get(3).equals("Yellow") ||
					jButton36.getIcon() == whiteIcon && secretCodeList.get(3).equals("White")) {

					iButton33.setIcon(keyBlack);
					iButton34.setIcon(keyBlack);
					iButton35.setIcon(keyBlack);
					iButton36.setIcon(keyBlack);

					JOptionPane.showMessageDialog(null, "Winner of round :\n"
							+ playerUsernameEasy.toString(),
						"Round End", 1);
	                            
	                roundWinner();
				} else {
					iButton33.setIcon(keyBlack);
	                iButton34.setIcon(keyBlack);
	                iButton35.setIcon(keyBlack);

	                if (jButton36.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
               			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
               			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton36.setIcon(keyWhite);
               			break;
              		} else {
              			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
               			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton36.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
               			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
              			iButton36.setIcon(keyEmpty);
               		}
              	}
            }
				}
			} else {
				iButton33.setIcon(keyBlack);
	            iButton34.setIcon(keyBlack);

	            if (jButton35.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton35.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton35.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton35.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton35.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton35.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            			iButton35.setIcon(keyWhite);
	            			break;
	           		} else {
	           			iButton35.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton35.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton35.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton35.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton35.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton35.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton35.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton35.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton35.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton35.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton35.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton35.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton35.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton35.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton35.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton35.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton35.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton36.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
               			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
               			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton36.setIcon(keyWhite);
               			break;
              		} else {
              			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
               			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton36.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
               			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
              			iButton36.setIcon(keyEmpty);
               		}
              	}
            }
				}
			} else {
				iButton33.setIcon(keyBlack);

				if (jButton34.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Red")) {
	           			iButton34.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton34.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton34.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton34.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Black")) {
	           			iButton34.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton34.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton34.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton34.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Blue")) {
	           			iButton34.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton34.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton34.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton34.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Green")) {
	           			iButton34.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton34.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton34.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton34.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Yellow")) {
	           			iButton34.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton34.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton34.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton34.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("White")) {
	           			iButton34.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton34.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton34.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton35.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton35.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton35.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton35.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton35.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton35.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            			iButton35.setIcon(keyWhite);
	            			break;
	           		} else {
	           			iButton35.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton35.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton35.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton35.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton35.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton35.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton35.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton35.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton35.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton35.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton35.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton35.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton35.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton35.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton35.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton35.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton35.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton36.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
               			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
               			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton36.setIcon(keyWhite);
               			break;
              		} else {
              			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
               			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton36.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
               			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
              			iButton36.setIcon(keyEmpty);
               		}
              	}
            }

			}
		} else {
			if (jButton33.getIcon() == redIcon) {
	          	for (int i=0; i<4; i++) {
	    	   		if (secretCodeList.get(0).equals("Red")) {
	           			iButton33.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton33.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton33.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton33.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Black")) {
	           			iButton33.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton33.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton33.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton33.getIcon() == blueIcon) {
	        	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Blue")) {
	            		iButton33.setIcon(keyBlack);
	            		break;
	            	} else if (secretCodeList.get(i).equals("Blue")) {
	            		iButton33.setIcon(keyWhite);
	            		break;
	            	} else {
	            		iButton33.setIcon(keyEmpty);
	            	}
	            }
	        } else if (jButton33.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Green")) {
	           			iButton33.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton33.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton33.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton33.getIcon() == yellowIcon) {
	        	for (int i=0; i<4; i++) {
	                if (secretCodeList.get(0).equals("Yellow")) {
	                	iButton33.setIcon(keyBlack);
	                	break;
	               	} else if (secretCodeList.get(i).equals("Yellow")) {
	                	iButton33.setIcon(keyWhite);
	                	break;
	                } else {
	                	iButton33.setIcon(keyEmpty);
	                }
	            }
	        } else if (jButton33.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("White")) {
	           			iButton33.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton33.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton33.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton34.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Red")) {
	           			iButton34.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton34.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton34.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton34.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Black")) {
	           			iButton34.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton34.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton34.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton34.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Blue")) {
	           			iButton34.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton34.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton34.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton34.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Green")) {
	           			iButton34.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton34.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton34.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton34.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Yellow")) {
	           			iButton34.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton34.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton34.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton34.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("White")) {
	           			iButton34.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton34.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton34.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton35.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton35.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton35.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton35.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton35.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton35.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            			iButton35.setIcon(keyWhite);
	            			break;
	           		} else {
	           			iButton35.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton35.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton35.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton35.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton35.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton35.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton35.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton35.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton35.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton35.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton35.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton35.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton35.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton35.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton35.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton35.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton35.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton36.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
               			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
               			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton36.setIcon(keyWhite);
               			break;
              		} else {
              			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
               			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton36.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
               			iButton36.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton36.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton36.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton36.setIcon(keyWhite);
               			break;
               		} else {
              			iButton36.setIcon(keyEmpty);
               		}
              	}
            }
        }
    }
    
    public void showSuitableIcons10() {
	if (jButton37.getIcon() == redIcon && secretCodeList.get(0).equals("Red") ||
		jButton37.getIcon() == blackIcon && secretCodeList.get(0).equals("Black") ||
		jButton37.getIcon() == blueIcon && secretCodeList.get(0).equals("Blue") ||
		jButton37.getIcon() == greenIcon && secretCodeList.get(0).equals("Green") ||
		jButton37.getIcon() == yellowIcon && secretCodeList.get(0).equals("Yellow") ||
		jButton37.getIcon() == whiteIcon && secretCodeList.get(0).equals("White")) {
		if (jButton38.getIcon() == redIcon && secretCodeList.get(1).equals("Red") ||
			jButton38.getIcon() == blackIcon && secretCodeList.get(1).equals("Black") ||
			jButton38.getIcon() == blueIcon && secretCodeList.get(1).equals("Blue") ||
			jButton38.getIcon() == greenIcon && secretCodeList.get(1).equals("Green") ||
			jButton38.getIcon() == yellowIcon && secretCodeList.get(1).equals("Yellow") ||
			jButton38.getIcon() == whiteIcon && secretCodeList.get(1).equals("White")) {
			if (jButton39.getIcon() == redIcon && secretCodeList.get(2).equals("Red") ||
				jButton39.getIcon() == blackIcon && secretCodeList.get(2).equals("Black") ||
				jButton39.getIcon() == blueIcon && secretCodeList.get(2).equals("Blue") ||
				jButton39.getIcon() == greenIcon && secretCodeList.get(2).equals("Green") ||
				jButton39.getIcon() == yellowIcon && secretCodeList.get(2).equals("Yellow") ||
				jButton39.getIcon() == whiteIcon && secretCodeList.get(2).equals("White")) {
				if (jButton40.getIcon() == redIcon && secretCodeList.get(3).equals("Red") ||
					jButton40.getIcon() == blackIcon && secretCodeList.get(3).equals("Black") ||
					jButton40.getIcon() == blueIcon && secretCodeList.get(3).equals("Blue") ||
					jButton40.getIcon() == greenIcon && secretCodeList.get(3).equals("Green") ||
					jButton40.getIcon() == yellowIcon && secretCodeList.get(3).equals("Yellow") ||
					jButton40.getIcon() == whiteIcon && secretCodeList.get(3).equals("White")) {

					iButton37.setIcon(keyBlack);
					iButton38.setIcon(keyBlack);
					iButton39.setIcon(keyBlack);
					iButton40.setIcon(keyBlack);

					JOptionPane.showMessageDialog(null, "Winner of round :\n"
							+ playerUsernameEasy.toString(),
						"Round End", 1);
	                            
	                roundWinner();
				} else {
					iButton37.setIcon(keyBlack);
	                iButton38.setIcon(keyBlack);
	                iButton39.setIcon(keyBlack);

	                if (jButton40.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton40.setIcon(keyWhite);
               			break;
               		} else {
               			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton4.setIcon(keyWhite);
               			break;
               		} else {
               			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton40.setIcon(keyWhite);
               			break;
              		} else {
              			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton40.setIcon(keyWhite);
               			break;
               		} else {
               			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton40.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton40.setIcon(keyWhite);
               			break;
               		} else {
               			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton40.setIcon(keyWhite);
               			break;
               		} else {
              			iButton40.setIcon(keyEmpty);
               		}
              	}
            }
				}
			} else {
				iButton37.setIcon(keyBlack);
	            iButton38.setIcon(keyBlack);

	            if (jButton39.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton39.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton39.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton39.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton39.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton39.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            			iButton39.setIcon(keyWhite);
	            			break;
	           		} else {
	           			iButton39.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton39.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton39.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton39.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton39.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton39.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton39.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton39.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton39.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton39.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton39.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton39.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton39.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton39.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton39.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton39.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton39.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton40.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton40.setIcon(keyWhite);
               			break;
               		} else {
               			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton4.setIcon(keyWhite);
               			break;
               		} else {
               			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton40.setIcon(keyWhite);
               			break;
              		} else {
              			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton40.setIcon(keyWhite);
               			break;
               		} else {
               			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton40.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton40.setIcon(keyWhite);
               			break;
               		} else {
               			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton40.setIcon(keyWhite);
               			break;
               		} else {
              			iButton40.setIcon(keyEmpty);
               		}
              	}
            }
				}
			} else {
				iButton37.setIcon(keyBlack);

				if (jButton38.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Red")) {
	           			iButton38.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton38.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton38.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton38.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Black")) {
	           			iButton38.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton38.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton38.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton38.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Blue")) {
	           			iButton38.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton38.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton38.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton38.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Green")) {
	           			iButton38.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton38.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton38.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton38.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Yellow")) {
	           			iButton38.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton38.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton38.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton38.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("White")) {
	           			iButton38.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton38.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton38.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton39.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton39.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton39.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton39.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton39.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton39.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            			iButton39.setIcon(keyWhite);
	            			break;
	           		} else {
	           			iButton39.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton39.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton39.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton39.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton39.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton39.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton39.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton39.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton39.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton39.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton39.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton39.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton39.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton39.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton39.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton39.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton39.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton40.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton40.setIcon(keyWhite);
               			break;
               		} else {
               			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton4.setIcon(keyWhite);
               			break;
               		} else {
               			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton40.setIcon(keyWhite);
               			break;
              		} else {
              			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton40.setIcon(keyWhite);
               			break;
               		} else {
               			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton40.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton40.setIcon(keyWhite);
               			break;
               		} else {
               			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton40.setIcon(keyWhite);
               			break;
               		} else {
              			iButton40.setIcon(keyEmpty);
               		}
              	}
            }

			}
		} else {
			if (jButton37.getIcon() == redIcon) {
	          	for (int i=0; i<4; i++) {
	    	   		if (secretCodeList.get(0).equals("Red")) {
	           			iButton37.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton37.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton37.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton37.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Black")) {
	           			iButton37.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton37.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton37.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton37.getIcon() == blueIcon) {
	        	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Blue")) {
	            		iButton37.setIcon(keyBlack);
	            		break;
	            	} else if (secretCodeList.get(i).equals("Blue")) {
	            		iButton37.setIcon(keyWhite);
	            		break;
	            	} else {
	            		iButton37.setIcon(keyEmpty);
	            	}
	            }
	        } else if (jButton37.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Green")) {
	           			iButton37.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton37.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton37.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton37.getIcon() == yellowIcon) {
	        	for (int i=0; i<4; i++) {
	                if (secretCodeList.get(0).equals("Yellow")) {
	                	iButton37.setIcon(keyBlack);
	                	break;
	               	} else if (secretCodeList.get(i).equals("Yellow")) {
	                	iButton37.setIcon(keyWhite);
	                	break;
	                } else {
	                	iButton37.setIcon(keyEmpty);
	                }
	            }
	        } else if (jButton37.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("White")) {
	           			iButton37.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton37.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton37.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton38.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Red")) {
	           			iButton38.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton38.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton38.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton38.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Black")) {
	           			iButton38.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton38.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton38.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton38.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Blue")) {
	           			iButton38.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton38.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton38.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton38.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Green")) {
	           			iButton38.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton38.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton38.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton38.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Yellow")) {
	           			iButton38.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton38.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton38.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton38.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("White")) {
	           			iButton38.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton38.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton38.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton39.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton39.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton39.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton39.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton39.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton39.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            			iButton39.setIcon(keyWhite);
	            			break;
	           		} else {
	           			iButton39.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton39.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton39.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton39.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton39.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton39.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton39.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton39.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton39.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton39.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton39.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton39.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton39.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton39.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton39.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton39.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton39.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton40.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton40.setIcon(keyWhite);
               			break;
               		} else {
               			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton4.setIcon(keyWhite);
               			break;
               		} else {
               			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton40.setIcon(keyWhite);
               			break;
              		} else {
              			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton40.setIcon(keyWhite);
               			break;
               		} else {
               			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton40.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton40.setIcon(keyWhite);
               			break;
               		} else {
               			iButton40.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton40.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton40.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton40.setIcon(keyWhite);
               			break;
               		} else {
              			iButton40.setIcon(keyEmpty);
               		}
              	}
            }
        }
    }
    
    public void showSuitableIcons11() {
	if (jButton41.getIcon() == redIcon && secretCodeList.get(0).equals("Red") ||
		jButton41.getIcon() == blackIcon && secretCodeList.get(0).equals("Black") ||
		jButton41.getIcon() == blueIcon && secretCodeList.get(0).equals("Blue") ||
		jButton41.getIcon() == greenIcon && secretCodeList.get(0).equals("Green") ||
		jButton41.getIcon() == yellowIcon && secretCodeList.get(0).equals("Yellow") ||
		jButton41.getIcon() == whiteIcon && secretCodeList.get(0).equals("White")) {
		if (jButton42.getIcon() == redIcon && secretCodeList.get(1).equals("Red") ||
			jButton42.getIcon() == blackIcon && secretCodeList.get(1).equals("Black") ||
			jButton42.getIcon() == blueIcon && secretCodeList.get(1).equals("Blue") ||
			jButton42.getIcon() == greenIcon && secretCodeList.get(1).equals("Green") ||
			jButton42.getIcon() == yellowIcon && secretCodeList.get(1).equals("Yellow") ||
			jButton42.getIcon() == whiteIcon && secretCodeList.get(1).equals("White")) {
			if (jButton43.getIcon() == redIcon && secretCodeList.get(2).equals("Red") ||
				jButton43.getIcon() == blackIcon && secretCodeList.get(2).equals("Black") ||
				jButton43.getIcon() == blueIcon && secretCodeList.get(2).equals("Blue") ||
				jButton43.getIcon() == greenIcon && secretCodeList.get(2).equals("Green") ||
				jButton43.getIcon() == yellowIcon && secretCodeList.get(2).equals("Yellow") ||
				jButton43.getIcon() == whiteIcon && secretCodeList.get(2).equals("White")) {
				if (jButton44.getIcon() == redIcon && secretCodeList.get(3).equals("Red") ||
					jButton44.getIcon() == blackIcon && secretCodeList.get(3).equals("Black") ||
					jButton44.getIcon() == blueIcon && secretCodeList.get(3).equals("Blue") ||
					jButton44.getIcon() == greenIcon && secretCodeList.get(3).equals("Green") ||
					jButton44.getIcon() == yellowIcon && secretCodeList.get(3).equals("Yellow") ||
					jButton44.getIcon() == whiteIcon && secretCodeList.get(3).equals("White")) {

					iButton41.setIcon(keyBlack);
					iButton42.setIcon(keyBlack);
					iButton43.setIcon(keyBlack);
					iButton44.setIcon(keyBlack);

					JOptionPane.showMessageDialog(null, "Winner of round :\n"
							+ playerUsernameEasy.toString(),
						"Round End", 1);
	                            
	                roundWinner();
				} else {
					iButton41.setIcon(keyBlack);
	                iButton42.setIcon(keyBlack);
	                iButton43.setIcon(keyBlack);

	                if (jButton44.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton44.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
               			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton44.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
               			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton4.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton44.setIcon(keyWhite);
               			break;
              		} else {
              			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton44.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
               			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton44.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
               			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton44.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
              			iButton44.setIcon(keyEmpty);
               		}
              	}
            }
				}
			} else {
				iButton41.setIcon(keyBlack);
	            iButton42.setIcon(keyBlack);

	            if (jButton43.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton43.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton43.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton43.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton43.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton43.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            		iButton43.setIcon(keyWhite);
	            		break;
	           		} else {
	           			iButton43.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton43.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton43.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton43.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton43.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton43.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton43.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton43.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton43.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton43.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton43.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton43.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton43.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton43.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton43.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton43.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton43.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton44.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton44.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
               			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton44.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
               			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton4.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton44.setIcon(keyWhite);
               			break;
              		} else {
              			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton44.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
               			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton44.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
               			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton44.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
              			iButton44.setIcon(keyEmpty);
               		}
              	}
            }
				}
			} else {
				iButton41.setIcon(keyBlack);

				if (jButton42.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Red")) {
	           			iButton42.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton42.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton42.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton42.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Black")) {
	           			iButton42.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton42.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton42.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton42.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Blue")) {
	           			iButton42.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton42.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton42.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton42.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Green")) {
	           			iButton42.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton42.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton42.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton42.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Yellow")) {
	           			iButton42.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton42.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton42.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton42.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("White")) {
	           			iButton42.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton42.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton42.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton43.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton43.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton43.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton43.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton43.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton43.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            		iButton43.setIcon(keyWhite);
	            		break;
	           		} else {
	           			iButton43.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton43.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton43.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton43.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton43.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton43.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton43.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton43.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton43.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton43.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton43.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton43.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton43.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton43.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton43.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton43.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton43.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton44.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton44.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
               			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton44.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
               			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton4.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton44.setIcon(keyWhite);
               			break;
              		} else {
              			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton44.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
               			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton44.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
               			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton44.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
              			iButton44.setIcon(keyEmpty);
               		}
              	}
            }

			}
		} else {
			if (jButton41.getIcon() == redIcon) {
	          	for (int i=0; i<4; i++) {
	    	   		if (secretCodeList.get(0).equals("Red")) {
	           			iButton41.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton41.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton41.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton41.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Black")) {
	           			iButton41.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton41.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton41.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton41.getIcon() == blueIcon) {
	        	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Blue")) {
	            		iButton41.setIcon(keyBlack);
	            		break;
	            	} else if (secretCodeList.get(i).equals("Blue")) {
	            		iButton41.setIcon(keyWhite);
	            		break;
	            	} else {
	            		iButton41.setIcon(keyEmpty);
	            	}
	            }
	        } else if (jButton41.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("Green")) {
	           			iButton41.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton41.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton41.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton41.getIcon() == yellowIcon) {
	        	for (int i=0; i<4; i++) {
	                if (secretCodeList.get(0).equals("Yellow")) {
	                	iButton41.setIcon(keyBlack);
	                	break;
	               	} else if (secretCodeList.get(i).equals("Yellow")) {
	                	iButton41.setIcon(keyWhite);
	                	break;
	                } else {
	                	iButton41.setIcon(keyEmpty);
	                }
	            }
	        } else if (jButton41.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(0).equals("White")) {
	           			iButton41.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton41.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton41.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton42.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Red")) {
	           			iButton42.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton42.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton42.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton42.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Black")) {
	           			iButton42.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	           			iButton42.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton42.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton42.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Blue")) {
	           			iButton42.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton42.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton42.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton42.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Green")) {
	           			iButton42.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton42.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton42.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton42.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("Yellow")) {
	           			iButton42.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton42.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton42.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton42.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(1).equals("White")) {
	           			iButton42.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton42.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton42.setIcon(keyEmpty);
	           		}
	           	}
	        }
	
			if (jButton43.getIcon() == redIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Red")) {
	           			iButton43.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Red")) {
	           			iButton43.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton43.setIcon(keyEmpty);
	          		}
	           	}
	        } else if (jButton43.getIcon() == blackIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Black")) {
	           			iButton43.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Black")) {
	            		iButton43.setIcon(keyWhite);
	            		break;
	           		} else {
	           			iButton43.setIcon(keyEmpty);
	           		}
	           	}
		    } else if (jButton43.getIcon() == blueIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Blue")) {
	           			iButton43.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Blue")) {
	           			iButton43.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton43.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton43.getIcon() == greenIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Green")) {
	           			iButton43.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Green")) {
	           			iButton43.setIcon(keyWhite);
	           			break;
	           		} else {
	          			iButton43.setIcon(keyEmpty);
	           		}
	          	}
	    	} else if (jButton43.getIcon() == yellowIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("Yellow")) {
	          			iButton43.setIcon(keyBlack);
	           			break;
	           		} else if (secretCodeList.get(i).equals("Yellow")) {
	           			iButton43.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton43.setIcon(keyEmpty);
	           		}
	           	}
	        } else if (jButton43.getIcon() == whiteIcon) {
	           	for (int i=0; i<4; i++) {
	           		if (secretCodeList.get(2).equals("White")) {
	           			iButton43.setIcon(keyBlack);
	           			break;
	          		} else if (secretCodeList.get(i).equals("white")) {
	           			iButton43.setIcon(keyWhite);
	           			break;
	           		} else {
	           			iButton43.setIcon(keyEmpty);
	          		}
	           	}
	        }

            if (jButton44.getIcon() == redIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Red")) {
              			iButton44.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Red")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
               			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == blackIcon) {
              	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Black")) {
               			iButton44.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Black")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
               			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == blueIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Blue")) {
               			iButton4.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Blue")) {
               			iButton44.setIcon(keyWhite);
               			break;
              		} else {
              			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == greenIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Green")) {
               			iButton44.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("Green")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
               			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == yellowIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("Yellow")) {
               			iButton44.setIcon(keyBlack);
               			break;
              		} else if (secretCodeList.get(i).equals("Yellow")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
               			iButton44.setIcon(keyEmpty);
               		}
               	}
            } else if (jButton44.getIcon() == whiteIcon) {
               	for (int i=0; i<4; i++) {
               		if (secretCodeList.get(3).equals("White")) {
               			iButton44.setIcon(keyBlack);
               			break;
               		} else if (secretCodeList.get(i).equals("white")) {
               			iButton44.setIcon(keyWhite);
               			break;
               		} else {
              			iButton44.setIcon(keyEmpty);
               		}
              	}
            }
        }
    }
    
    public void showSuitableIcons12() {
        if (jButton45.getIcon() == redIcon && secretCodeList.get(0).equals("Red") ||
            jButton45.getIcon() == blackIcon && secretCodeList.get(0).equals("Black") ||
            jButton45.getIcon() == blueIcon && secretCodeList.get(0).equals("Blue") ||
            jButton45.getIcon() == greenIcon && secretCodeList.get(0).equals("Green") ||
            jButton45.getIcon() == yellowIcon && secretCodeList.get(0).equals("Yellow") ||
            jButton45.getIcon() == whiteIcon && secretCodeList.get(0).equals("White")) {
            if (jButton46.getIcon() == redIcon && secretCodeList.get(1).equals("Red") ||
                jButton46.getIcon() == blackIcon && secretCodeList.get(1).equals("Black") ||
                jButton46.getIcon() == blueIcon && secretCodeList.get(1).equals("Blue") ||
                jButton46.getIcon() == greenIcon && secretCodeList.get(1).equals("Green") ||
                jButton46.getIcon() == yellowIcon && secretCodeList.get(1).equals("Yellow") ||
                jButton46.getIcon() == whiteIcon && secretCodeList.get(1).equals("White")) {
                if (jButton47.getIcon() == redIcon && secretCodeList.get(2).equals("Red") ||
                    jButton47.getIcon() == blackIcon && secretCodeList.get(2).equals("Black") ||
                    jButton47.getIcon() == blueIcon && secretCodeList.get(2).equals("Blue") ||
                    jButton47.getIcon() == greenIcon && secretCodeList.get(2).equals("Green") ||
                    jButton47.getIcon() == yellowIcon && secretCodeList.get(2).equals("Yellow") ||
                    jButton47.getIcon() == whiteIcon && secretCodeList.get(2).equals("White")) {
                    if (jButton48.getIcon() == redIcon && secretCodeList.get(3).equals("Red") ||
                        jButton48.getIcon() == blackIcon && secretCodeList.get(3).equals("Black") ||
                        jButton48.getIcon() == blueIcon && secretCodeList.get(3).equals("Blue") ||
                        jButton48.getIcon() == greenIcon && secretCodeList.get(3).equals("Green") ||
                        jButton48.getIcon() == yellowIcon && secretCodeList.get(3).equals("Yellow") ||
                        jButton48.getIcon() == whiteIcon && secretCodeList.get(3).equals("White")) {

                        iButton45.setIcon(keyBlack);
                        iButton46.setIcon(keyBlack);
                        iButton47.setIcon(keyBlack);
                        iButton48.setIcon(keyBlack);

                        JOptionPane.showMessageDialog(null, "Winner of round :\n"
                                + playerUsernameEasy.toString(),
                            "Round End", 1);                                
                        roundWinner();
                    } else {
                        JOptionPane.showMessageDialog(null, "Winner of round :\n"
                                + opponentUsername.toString(),
                            "Round End", 1);
                        roundLoser();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Winner of round :\n"
                            + opponentUsername.toString(),
                        "Round End", 1);
                    roundLoser();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Winner of round :\n"
                    + opponentUsername.toString(),
                "Round End", 1);
                roundLoser();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Winner of round :\n"
                    + opponentUsername.toString(),
                "Round End", 1);
            roundLoser();
        }
   
    }
        












    
    
    private void sButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void sButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void sButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if (gameStart == 0) {
            secretCodeSelectIcons();
            window2.dispose();
            int randomNumberLength = 6;
            
            colorsToSelect.add("Red");
            colorsToSelect.add("Black");
            colorsToSelect.add("Blue");
            colorsToSelect.add("Green");
            colorsToSelect.add("Yellow");
            colorsToSelect.add("White");
            
            Random randomGenerator = new Random();
            
            for (int i=0; i<4; i++) {
                int z = randomGenerator.nextInt(randomNumberLength);
                String color = colorsToSelect.get(z);
                randomNumberLength --;
                secretCodeList.add(color);
                colorsToSelect.remove(color);                
            }

            availableRaw ++;
            
            System.out.println("Colors code ->");
            
            for (String i: secretCodeList) {
                System.out.println(i);
            }
                
            gameStart ++;
            
            JOptionPane.showMessageDialog(null, "SECRET CODE HAS BEEN MADE!"
                    + "\nGOOD LUCK!",
                        "GAME START", 1);
            
        } else {
            JOptionPane.showMessageDialog(null, "INVALID MOVE!"
                    + "\nGAME HAS ALREADY STARTED!",
                        "ERROR", 1);
        }
    }                                      

    private void sButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (availableRaw == 0 && window2.isDisplayable() == false) {
            pressedButton = "jb1";
            secretCodeSelectIcons();
        } 
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (availableRaw == 0 && window2.isDisplayable() == false) {
            pressedButton = "jb2";
            secretCodeSelectIcons();
        } 
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (availableRaw == 0 && window2.isDisplayable() == false) {
            pressedButton = "jb3";
            secretCodeSelectIcons();
        }
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (availableRaw == 0 && window2.isDisplayable() == false) {
            pressedButton = "jb4";
            secretCodeSelectIcons();
        }
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (availableRaw == 5 && window2.isDisplayable() == false) {
            pressedButton = "jb5";
            secretCodeSelectIcons();
        } 
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (availableRaw == 5 && window2.isDisplayable() == false) {
            pressedButton = "jb6";
            secretCodeSelectIcons();
        }
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (availableRaw == 5 && window2.isDisplayable() == false) {
            pressedButton = "jb7";
            secretCodeSelectIcons();
        }
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (availableRaw == 5 && window2.isDisplayable() == false) {
            pressedButton = "jb8";
            secretCodeSelectIcons();
        }
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (availableRaw == 10 && window2.isDisplayable() == false) {
            pressedButton = "jb9";
            secretCodeSelectIcons();
        }
    }                                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 10 && window2.isDisplayable() == false) {
            pressedButton = "jb10";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 10 && window2.isDisplayable() == false) {
            pressedButton = "jb11";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 10 && window2.isDisplayable() == false) {
            pressedButton = "jb12";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 15 && window2.isDisplayable() == false) {
            pressedButton = "jb13";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 15 && window2.isDisplayable() == false) {
            pressedButton = "jb14";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 15 && window2.isDisplayable() == false) {
            pressedButton = "jb15";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 15 && window2.isDisplayable() == false) {
            pressedButton = "jb16";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 20 && window2.isDisplayable() == false) {
            pressedButton = "jb17";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 20 && window2.isDisplayable() == false) {
            pressedButton = "jb18";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 20 && window2.isDisplayable() == false) {
            pressedButton = "jb19";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 20 && window2.isDisplayable() == false) {
            pressedButton = "jb20";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 25 && window2.isDisplayable() == false) {
            pressedButton = "jb21";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 25 && window2.isDisplayable() == false) {
            pressedButton = "jb22";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 25 && window2.isDisplayable() == false) {
            pressedButton = "jb23";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 25 && window2.isDisplayable() == false) {
            pressedButton = "jb24";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 30 && window2.isDisplayable() == false) {
            pressedButton = "jb25";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 30 && window2.isDisplayable() == false) {
            pressedButton = "jb26";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 30 && window2.isDisplayable() == false) {
            pressedButton = "jb27";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 30 && window2.isDisplayable() == false) {
            pressedButton = "jb28";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 35 && window2.isDisplayable() == false) {
            pressedButton = "jb29";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 35 && window2.isDisplayable() == false) {
            pressedButton = "jb30";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 35 && window2.isDisplayable() == false) {
            pressedButton = "jb31";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 35 && window2.isDisplayable() == false) {
            pressedButton = "jb32";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 40 && window2.isDisplayable() == false) {
            pressedButton = "jb33";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 40 && window2.isDisplayable() == false) {
            pressedButton = "jb34";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 40 && window2.isDisplayable() == false) {
            pressedButton = "jb35";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 40 && window2.isDisplayable() == false) {
            pressedButton = "jb36";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 45 && window2.isDisplayable() == false) {
            pressedButton = "jb37";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 45 && window2.isDisplayable() == false) {
            pressedButton = "jb38";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 45 && window2.isDisplayable() == false) {
            pressedButton = "jb39";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 45 && window2.isDisplayable() == false) {
            pressedButton = "jb40";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 50 && window2.isDisplayable() == false) {
            pressedButton = "jb41";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 50 && window2.isDisplayable() == false) {
            pressedButton = "jb42";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 50 && window2.isDisplayable() == false) {
            pressedButton = "jb43";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 50 && window2.isDisplayable() == false) {
            pressedButton = "jb44";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 55 && window2.isDisplayable() == false) {
            pressedButton = "jb45";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 55 && window2.isDisplayable() == false) {
            pressedButton = "jb46";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 55 && window2.isDisplayable() == false) {
            pressedButton = "jb47";
            secretCodeSelectIcons();
        }
    }                                         

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (availableRaw == 55 && window2.isDisplayable() == false) {
            pressedButton = "jb48";
            secretCodeSelectIcons();
        }
    }                                         

    private void iButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void RestartActionPerformed(java.awt.event.ActionEvent evt) {                                        
        dispose();        
        
        gameStart = 0;
        availableRaw = -1;
        roundsNumber = 1;   

        opponentUsername = "CM";
        opponentPoints = 0;
        playerPoints = 0;
        
        if (secretCodeList.size() > 0) {
            secretCodeList.clear();
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EasyMode mode11 = new EasyMode();
                mode11.setVisible(true);
            }
        });
    }                                       

    private void menuNewGameActionPerformed(java.awt.event.ActionEvent evt) {                                            
        dispose();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterMindGame().setVisible(true);
            }
        });
    }                                           

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {                                     
        System.exit(0);
    }   
    
    private void showHistoryActionPerformed(java.awt.event.ActionEvent evt) {
        
        try {
            
            FileReader readTextFile=new FileReader(onomaArxeiou);
            Scanner fileReaderScan=new Scanner(readTextFile);
            String storeAllString="";
            
            while(fileReaderScan.hasNextLine()) {
                String temp=fileReaderScan.nextLine()+"\n";

                storeAllString=storeAllString+temp;
            }

            JTextArea textArea=new JTextArea(storeAllString);
            textArea.setLineWrap(true);
            textArea.setEditable(false);
            textArea.setWrapStyleWord(true);
            JScrollPane scrollBarForTextArea=new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            frame = new JFrame("Records");

            frame.add(scrollBarForTextArea);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(500,500);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);

            frame.setVisible(true);
             
            } catch(Exception exception) {
                System.out.println("Error in file processing");
            }        
    }
    
    private void hideHistoryActionPerformed(java.awt.event.ActionEvent evt) {
        frame.dispose();
    }

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {                                      
        JOptionPane.showMessageDialog(null, "CREATOR: ALEXANDROS MENTOUDAKIS"
                + "\nAM: TP5066"
                + "\nDATE: THURSDAY 6/01/2022"
                + "\nAPPNAME: MASTERMIND"
                + "\nTYPE OF APP: PC GAME"
                + "\nCURRENT-VERSION: 1.0", "INFORMATIONS", 1);
    }                                     
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        switch(command) {
            case "cancel": window2.dispose(); break;
            case "ok" :
                codeBreakerIconColor = box2.getSelectedItem().toString();
                
                if (pressedButton.equals("jb1")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton1.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton1.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton1.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton1.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton1.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton1.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    
                    if (jButton2.getIcon() != emptySlot &&
                        jButton3.getIcon() != emptySlot &&
                        jButton4.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb2")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton2.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton2.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton2.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton2.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton2.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton2.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    
                    if (jButton1.getIcon() != emptySlot &&
                        jButton3.getIcon() != emptySlot &&
                        jButton4.getIcon() != emptySlot) {
                        
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb3")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton3.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton3.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton3.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton3.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton3.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton3.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton1.getIcon() != emptySlot &&
                        jButton2.getIcon() != emptySlot &&
                        jButton4.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb4")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton4.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton4.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton4.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton4.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton4.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton4.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton1.getIcon() != emptySlot &&
                        jButton2.getIcon() != emptySlot &&
                        jButton3.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb5")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton5.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton5.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton5.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton5.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton5.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton5.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton6.getIcon() != emptySlot &&
                        jButton7.getIcon() != emptySlot &&
                        jButton8.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb6")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton6.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton6.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton6.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton6.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton6.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton6.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton5.getIcon() != emptySlot &&
                        jButton7.getIcon() != emptySlot &&
                        jButton8.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb7")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton7.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton7.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton7.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton7.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton7.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton7.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton5.getIcon() != emptySlot &&
                        jButton6.getIcon() != emptySlot &&
                        jButton8.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb8")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton8.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton8.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton8.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton8.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton8.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton8.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton5.getIcon() != emptySlot &&
                        jButton6.getIcon() != emptySlot &&
                        jButton7.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb9")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton9.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton9.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton9.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton9.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton9.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton9.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton10.getIcon() != emptySlot &&
                        jButton11.getIcon() != emptySlot &&
                        jButton12.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb10")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton10.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton10.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton10.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton10.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton10.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton10.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton9.getIcon() != emptySlot &&
                        jButton11.getIcon() != emptySlot &&
                        jButton12.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb11")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton11.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton11.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton11.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton11.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton11.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton11.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton9.getIcon() != emptySlot &&
                        jButton10.getIcon() != emptySlot &&
                        jButton12.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb12")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton12.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton12.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton12.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton12.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton12.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton12.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton9.getIcon() != emptySlot &&
                        jButton10.getIcon() != emptySlot &&
                        jButton11.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb13")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton13.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton13.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton13.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton13.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton13.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton13.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton14.getIcon() != emptySlot &&
                        jButton15.getIcon() != emptySlot &&
                        jButton16.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb14")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton14.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton14.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton14.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton14.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton14.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton14.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton13.getIcon() != emptySlot &&
                        jButton15.getIcon() != emptySlot &&
                        jButton16.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb15")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton15.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton15.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton15.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton15.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton15.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton15.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton13.getIcon() != emptySlot &&
                        jButton14.getIcon() != emptySlot &&
                        jButton16.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb16")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton16.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton16.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton16.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton16.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton16.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton16.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton13.getIcon() != emptySlot &&
                        jButton14.getIcon() != emptySlot &&
                        jButton15.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb17")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton17.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton17.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton17.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton17.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton17.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton17.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton18.getIcon() != emptySlot &&
                        jButton19.getIcon() != emptySlot &&
                        jButton20.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb18")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton18.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton18.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton18.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton18.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton18.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton18.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton17.getIcon() != emptySlot &&
                        jButton19.getIcon() != emptySlot &&
                        jButton20.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb19")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton19.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton19.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton19.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton19.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton19.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton19.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton17.getIcon() != emptySlot &&
                        jButton18.getIcon() != emptySlot &&
                        jButton20.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb20")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton20.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton20.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton20.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton20.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton20.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton20.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton17.getIcon() != emptySlot &&
                        jButton18.getIcon() != emptySlot &&
                        jButton19.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb21")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton21.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton21.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton21.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton21.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton21.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton21.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton22.getIcon() != emptySlot &&
                        jButton23.getIcon() != emptySlot &&
                        jButton24.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb22")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton22.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton22.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton22.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton22.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton22.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton22.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton21.getIcon() != emptySlot &&
                        jButton23.getIcon() != emptySlot &&
                        jButton24.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb23")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton23.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton23.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton23.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton23.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton23.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton23.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton21.getIcon() != emptySlot &&
                        jButton22.getIcon() != emptySlot &&
                        jButton24.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb24")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton24.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton24.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton24.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton24.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton24.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton24.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton21.getIcon() != emptySlot &&
                        jButton22.getIcon() != emptySlot &&
                        jButton23.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb25")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton25.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton25.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton25.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton25.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton25.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton25.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton26.getIcon() != emptySlot &&
                        jButton27.getIcon() != emptySlot &&
                        jButton28.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb26")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton26.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton26.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton26.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton26.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton26.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton26.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton25.getIcon() != emptySlot &&
                        jButton27.getIcon() != emptySlot &&
                        jButton28.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb27")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton27.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton27.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton27.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton27.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton27.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton27.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton25.getIcon() != emptySlot &&
                        jButton26.getIcon() != emptySlot &&
                        jButton28.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb28")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton28.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton28.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton28.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton28.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton28.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton28.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton25.getIcon() != emptySlot &&
                        jButton26.getIcon() != emptySlot &&
                        jButton27.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb29")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton29.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton29.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton29.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton29.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton29.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton29.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton30.getIcon() != emptySlot &&
                        jButton31.getIcon() != emptySlot &&
                        jButton32.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb30")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton30.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton30.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton30.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton30.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton30.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton30.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton29.getIcon() != emptySlot &&
                        jButton31.getIcon() != emptySlot &&
                        jButton32.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb31")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton31.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton31.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton31.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton31.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton31.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton31.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton29.getIcon() != emptySlot &&
                        jButton30.getIcon() != emptySlot &&
                        jButton32.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb32")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton32.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton32.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton32.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton32.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton32.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton32.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton29.getIcon() != emptySlot &&
                        jButton30.getIcon() != emptySlot &&
                        jButton31.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb33")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton33.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton33.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton33.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton33.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton33.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton33.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton34.getIcon() != emptySlot &&
                        jButton35.getIcon() != emptySlot &&
                        jButton36.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb34")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton34.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton34.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton34.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton34.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton34.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton34.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton33.getIcon() != emptySlot &&
                        jButton35.getIcon() != emptySlot &&
                        jButton36.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb35")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton35.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton35.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton35.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton35.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton35.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton35.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton33.getIcon() != emptySlot &&
                        jButton34.getIcon() != emptySlot &&
                        jButton36.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        jLabel2.setText(roundsNumber + "");
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb36")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton36.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton36.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton36.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton36.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton36.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton36.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton33.getIcon() != emptySlot &&
                        jButton34.getIcon() != emptySlot &&
                        jButton35.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb37")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton37.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton37.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton37.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton37.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton37.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton37.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton38.getIcon() != emptySlot &&
                        jButton39.getIcon() != emptySlot &&
                        jButton40.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb38")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton38.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton38.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton38.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton38.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton38.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton38.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton37.getIcon() != emptySlot &&
                        jButton39.getIcon() != emptySlot &&
                        jButton40.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb39")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton39.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton39.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton39.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton39.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton39.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton39.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton37.getIcon() != emptySlot &&
                        jButton38.getIcon() != emptySlot &&
                        jButton40.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb40")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton40.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton40.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton40.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton40.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton40.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton40.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton37.getIcon() != emptySlot &&
                        jButton38.getIcon() != emptySlot &&
                        jButton39.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb41")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton41.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton41.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton41.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton41.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton41.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton41.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton42.getIcon() != emptySlot &&
                        jButton43.getIcon() != emptySlot &&
                        jButton44.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb42")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton42.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton42.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton42.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton42.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton42.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton42.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton41.getIcon() != emptySlot &&
                        jButton43.getIcon() != emptySlot &&
                        jButton44.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb43")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton43.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton43.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton43.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton43.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton43.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton43.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton41.getIcon() != emptySlot &&
                        jButton42.getIcon() != emptySlot &&
                        jButton44.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb44")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton44.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton40.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton44.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton44.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton44.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton44.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton41.getIcon() != emptySlot &&
                        jButton42.getIcon() != emptySlot &&
                        jButton43.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb45")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton45.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton45.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton45.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton45.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton45.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton45.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton46.getIcon() != emptySlot &&
                        jButton47.getIcon() != emptySlot &&
                        jButton48.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb46")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton46.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton46.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton46.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton46.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton46.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton46.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton45.getIcon() != emptySlot &&
                        jButton47.getIcon() != emptySlot &&
                        jButton48.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb47")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton47.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton40.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton47.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton47.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton47.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton47.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton45.getIcon() != emptySlot &&
                        jButton46.getIcon() != emptySlot &&
                        jButton48.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        availableRaw = availableRaw + 5;
                    }
                }
                
                if (pressedButton.equals("jb48")) {
                    switch(codeBreakerIconColor) {
                        case "Red" : jButton48.setIcon(redIcon); window2.dispose(); break;
                        case "Black" : jButton48.setIcon(blackIcon); window2.dispose(); break;
                        case "Blue" : jButton48.setIcon(blueIcon); window2.dispose(); break;
                        case "Green" : jButton48.setIcon(greenIcon); window2.dispose(); break;
                        case "Yellow" : jButton48.setIcon(yellowIcon); window2.dispose(); break;
                        case "White" : jButton48.setIcon(whiteIcon); window2.dispose(); break;
                    }
                    if (jButton45.getIcon() != emptySlot &&
                        jButton46.getIcon() != emptySlot &&
                        jButton47.getIcon() != emptySlot) {
                    
                        roundsNumber ++;
                        availableRaw = availableRaw + 5;
                    }
                }
                
                switch(availableRaw) {
                    case 5: showSuitableIcons1(); break;
                    case 10: showSuitableIcons2(); break;
                    case 15: showSuitableIcons3(); break;
                    case 20: showSuitableIcons4(); break;
                    case 25: showSuitableIcons5(); break;
                    case 30: showSuitableIcons6(); break;
                    case 35: showSuitableIcons7(); break;
                    case 40: showSuitableIcons8(); break;
                    case 45: showSuitableIcons9(); break;
                    case 50: showSuitableIcons10(); break;
                    case 55: showSuitableIcons11(); break;
                    case 60: showSuitableIcons12(); break;
                }
        }
    }
    
    
    // Variables declaration - do not modify                     
    private javax.swing.JMenuItem Restart;
    private javax.swing.JMenuItem about;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem hideHistory;
    private javax.swing.JButton iButton1;
    private javax.swing.JButton iButton10;
    private javax.swing.JButton iButton11;
    private javax.swing.JButton iButton12;
    private javax.swing.JButton iButton13;
    private javax.swing.JButton iButton14;
    private javax.swing.JButton iButton15;
    private javax.swing.JButton iButton16;
    private javax.swing.JButton iButton17;
    private javax.swing.JButton iButton18;
    private javax.swing.JButton iButton19;
    private javax.swing.JButton iButton2;
    private javax.swing.JButton iButton20;
    private javax.swing.JButton iButton21;
    private javax.swing.JButton iButton22;
    private javax.swing.JButton iButton23;
    private javax.swing.JButton iButton24;
    private javax.swing.JButton iButton25;
    private javax.swing.JButton iButton26;
    private javax.swing.JButton iButton27;
    private javax.swing.JButton iButton28;
    private javax.swing.JButton iButton29;
    private javax.swing.JButton iButton3;
    private javax.swing.JButton iButton30;
    private javax.swing.JButton iButton31;
    private javax.swing.JButton iButton32;
    private javax.swing.JButton iButton33;
    private javax.swing.JButton iButton34;
    private javax.swing.JButton iButton35;
    private javax.swing.JButton iButton36;
    private javax.swing.JButton iButton37;
    private javax.swing.JButton iButton38;
    private javax.swing.JButton iButton39;
    private javax.swing.JButton iButton4;
    private javax.swing.JButton iButton40;
    private javax.swing.JButton iButton41;
    private javax.swing.JButton iButton42;
    private javax.swing.JButton iButton43;
    private javax.swing.JButton iButton44;
    private javax.swing.JButton iButton45;
    private javax.swing.JButton iButton46;
    private javax.swing.JButton iButton47;
    private javax.swing.JButton iButton48;
    private javax.swing.JButton iButton5;
    private javax.swing.JButton iButton6;
    private javax.swing.JButton iButton7;
    private javax.swing.JButton iButton8;
    private javax.swing.JButton iButton9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenu menuGame;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuHistory;
    private javax.swing.JMenuItem menuNewGame;
    private javax.swing.JLabel opponentName;
    private javax.swing.JLabel opponentScore;
    private javax.swing.JLabel playerName;
    private javax.swing.JLabel playerScore;
    private javax.swing.JButton sButton1;
    private javax.swing.JButton sButton2;
    private javax.swing.JButton sButton3;
    private javax.swing.JButton sButton4;
    private javax.swing.JPanel scorePanel;
    private javax.swing.JMenuItem showHistory;
    private javax.swing.JButton submit;                   
}

