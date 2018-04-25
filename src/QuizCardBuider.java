//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class QuizCardBuider {
//
//    private JTextArea question;
//    private JTextArea answer;
//    private ArrayList<QuizCard> cardList;
//    private JFrame frame;
//
//    public static void main (String[] args){
//        QuizCardBuider buider = new QuizCardBuider();
//        buider.go();
//    }
//
//    public void go(){
//        //创建GUI
//        frame = new JFrame("Quiz Card Buider");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JPanel mainPanel = new JPanel();
//        Font bigFont = new Font("sanserif",Font.BOLD,24);
//        question = new JTextArea(6,20);
//        question.setLineWrap(true);
//        question.setWrapStyleWord(true);
//        question.setFont(bigFont);
//
//        JScrollPane qScroller = new JScrollPane(question);
//        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
//
//        answer = new JTextArea(6,20);
//        answer.setLineWrap(true);
//        answer.setWrapStyleWord(true);
//        answer.setFont(bigFont);
//
//        JScrollPane aScroller = new JScrollPane(answer);
//        aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//        aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
//
//        JButton nextButton = new JButton("Next Card");
//
//        cardList = new ArrayList<QuizCard>();
//
//        JLabel qLabel = new JLabel("Question:");
//        JLabel aLabel = new JLabel("Answer:");
//
//        mainPanel.add(qLabel);                          // 界面布局
//        mainPanel.add(qScroller);
//        mainPanel.add(aLabel);
//        mainPanel.add(aScroller);
//        mainPanel.add(nextButton);
//        nextButton.addActionListener(new NextCardListener());
//
//        JMenuBar menuBar = new JMenuBar();                 // 创建并设置菜单
//        JMenu fileMenu = new JMenu("File");
//        JMenuItem newMenuItem = new JMenuItem("New");
//        JMenuItem saveMenuItem = new JMenuItem("Save");
//        newMenuItem.addActionListener(new NewMenuListener());
//        saveMenuItem.addActionListener(new SaveMenuLisener());
//
//        fileMenu.add(newMenuItem);
//        fileMenu.add(saveMenuItem);
//        menuBar.add(fileMenu);
//        frame.setJMenuBar(menuBar);
//        frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
//        frame.setSize(500,600);
//        frame.setVisible(true);
//    }
//
//    // 3个内部类
//    public class NextCardListener implements ActionListener{
//        public void actionPerformed(ActionEvent ev){
//            QuizCard card = new QuizCard(question.getText(),answer.getText());
//            cardList.add(card);
//            clearCard();
//        }
//    }
//
//    public class SaveMenuLisener implements ActionListener{
//        public void actionPerformed(ActionEvent ev){
//            QuizCard card = new QuizCard(question.getText(),answer.getText());
//            cardList.add(card);
//
//            JFileChooser fileSave = new JFileChooser();
//            fileSave.showSaveDialog(frame);                    // 调出存盘对话框（dialog）等待用户决定，考JFileChooser完成的
//            saveFile(fileSave.getSelectedFile());
//        }
//    }
//
//    public class NewMenuListener implements ActionListener{
//        public void actionPerformed(ActionEvent e) {
//            cardList.clear();
//            clearCard();
//        }
//    }
//
//    private void clearCard(){
//        question.setText("");
//        answer.setText("");
//        question.requestFocus();
//    }
//
//    private void saveFile(File file){
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(file)); //将 BufferdWriter(缓冲) 连接到Filewriter
//
//            for (QuizCard card:cardList){
//                writer.write(card.getQuestion() + "/");
//                writer.write(card.getAnswer() + "\n");
//            }
//            writer.close();
//        }catch (IOException ex){
//            System.out.println("couldn't write the card out");
//            ex.printStackTrace();
//        }
//    }
//}
