import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener{

    Random rd = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[25];
    boolean player1turn;
    
    TicTacToe(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);


        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic Tac Toe");
        textfield.setFont(new Font("Arial", Font.BOLD, 75));

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 1000, 100);

        button_panel.setLayout(new GridLayout(5, 5));
        for (int i = 0; i < 25; i++){
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 50));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel);

        firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
		
		for(int i=0;i<25;i++) {
			if(e.getSource()==buttons[i]) {
				if(player1turn) {
					if(buttons[i].getText()=="") {						
						buttons[i].setText("X");
						player1turn=false;
                        textfield.setText("O turn");
						check();
					}
				}
				else {
					if(buttons[i].getText()=="") {						
						buttons[i].setText("O");
						player1turn=true;
                        textfield.setText("X turn");
						check();
					}
				}
			}			
		}
	}
    public void firstTurn() {
        if(rd.nextInt(2)==0){
            player1turn = true;
            textfield.setText("X turn");
        }
        else {
            player1turn = false;
            textfield.setText("O turn");
        }
    }

    public void check() {
        if ((buttons[0].getText() == "X") && (buttons[1].getText() == "X") && (buttons[2].getText() == "X") && (buttons[3].getText() == "X") && (buttons[4].getText() == "X")) {
            textfield.setText("X wins!");
            gameover();
        }
        else if ((buttons[5].getText() == "X") && (buttons[6].getText() == "X") && (buttons[7].getText() == "X") && (buttons[8].getText() == "X") && (buttons[9].getText() == "X")) {
            textfield.setText("X wins!");
            gameover();
        }
        else if ((buttons[10].getText() == "X") && (buttons[11].getText() == "X") && (buttons[12].getText() == "X") && (buttons[13].getText() == "X") && (buttons[14].getText() == "X")) {
            textfield.setText("X wins!");
            gameover();
        }
        else if ((buttons[15].getText() == "X") && (buttons[16].getText() == "X") && (buttons[17].getText() == "X") && (buttons[18].getText() == "X") && (buttons[19].getText() == "X")) {
            textfield.setText("X wins!");
            gameover();
        }
        else if ((buttons[20].getText() == "X") && (buttons[21].getText() == "X") && (buttons[22].getText() == "X") && (buttons[23].getText() == "X") && (buttons[24].getText() == "X")) {
            textfield.setText("X wins!");
            gameover();
        }
        else if ((buttons[0].getText() == "X") && (buttons[6].getText() == "X") && (buttons[12].getText() == "X") && (buttons[18].getText() == "X") && (buttons[24].getText() == "X")) {
            textfield.setText("X wins!");
            gameover();
        }  
        else if ((buttons[4].getText() == "X") && (buttons[8].getText() == "X") && (buttons[12].getText() == "X") && (buttons[16].getText() == "X") && (buttons[20].getText() == "X")) {
            textfield.setText("X wins!");
            gameover();
        }  
        else if ((buttons[0].getText() == "X") && (buttons[5].getText() == "X") && (buttons[10].getText() == "X") && (buttons[15].getText() == "X") && (buttons[20].getText() == "X")) {
            textfield.setText("X wins!");
            gameover();
        }
        else if ((buttons[1].getText() == "X") && (buttons[6].getText() == "X") && (buttons[11].getText() == "X") && (buttons[16].getText() == "X") && (buttons[21].getText() == "X")) {
            textfield.setText("X wins!");
            gameover();
        }  
        else if ((buttons[2].getText() == "X") && (buttons[7].getText() == "X") && (buttons[12].getText() == "X") && (buttons[17].getText() == "X") && (buttons[22].getText() == "X")) {
            textfield.setText("X wins!");
            gameover();
        }     
        else if ((buttons[3].getText() == "X") && (buttons[8].getText() == "X") && (buttons[13].getText() == "X") && (buttons[18].getText() == "X") && (buttons[23].getText() == "X")) {
            textfield.setText("X wins!");
            gameover();
        } 
        else if ((buttons[4].getText() == "X") && (buttons[9].getText() == "X") && (buttons[14].getText() == "X") && (buttons[19].getText() == "X") && (buttons[24].getText() == "X")) {
            textfield.setText("X wins!");
            gameover();
        }

        if ((buttons[0].getText() == "O") && (buttons[1].getText() == "O") && (buttons[2].getText() == "O") && (buttons[3].getText() == "O") && (buttons[4].getText() == "O")) {
            textfield.setText("O wins!");
            gameover();
        }
        else if ((buttons[5].getText() == "O") && (buttons[6].getText() == "O") && (buttons[7].getText() == "O") && (buttons[8].getText() == "O") && (buttons[9].getText() == "O")) {
            textfield.setText("O wins!");
            gameover();
        }
        else if ((buttons[10].getText() == "O") && (buttons[11].getText() == "O") && (buttons[12].getText() == "O") && (buttons[13].getText() == "O") && (buttons[14].getText() == "O")) {
            textfield.setText("O wins!");
            gameover();
        }
        else if ((buttons[15].getText() == "O") && (buttons[16].getText() == "O") && (buttons[17].getText() == "O") && (buttons[18].getText() == "O") && (buttons[19].getText() == "O")) {
            textfield.setText("O wins!");
            gameover();
        }
        else if ((buttons[20].getText() == "O") && (buttons[21].getText() == "O") && (buttons[22].getText() == "O") && (buttons[23].getText() == "O") && (buttons[24].getText() == "O")) {
            textfield.setText("O wins!");
            gameover();
        }
        else if ((buttons[0].getText() == "O") && (buttons[6].getText() == "O") && (buttons[12].getText() == "O") && (buttons[18].getText() == "O") && (buttons[24].getText() == "O")) {
            textfield.setText("O wins!");
            gameover();
        }  
        else if ((buttons[4].getText() == "O") && (buttons[8].getText() == "O") && (buttons[12].getText() == "O") && (buttons[16].getText() == "O") && (buttons[20].getText() == "O")) {
            textfield.setText("O wins!");
            gameover();
        }  
        else if ((buttons[0].getText() == "O") && (buttons[5].getText() == "O") && (buttons[10].getText() == "O") && (buttons[15].getText() == "O") && (buttons[20].getText() == "O")) {
            textfield.setText("O wins!");
            gameover();
        }
        else if ((buttons[1].getText() == "O") && (buttons[6].getText() == "O") && (buttons[11].getText() == "O") && (buttons[16].getText() == "O") && (buttons[21].getText() == "O")) {
            textfield.setText("O wins!");
            gameover();
        }  
        else if ((buttons[2].getText() == "O") && (buttons[7].getText() == "O") && (buttons[12].getText() == "O") && (buttons[17].getText() == "O") && (buttons[22].getText() == "O")) {
            textfield.setText("O wins!");
            gameover();
        }     
        else if ((buttons[3].getText() == "O") && (buttons[8].getText() == "O") && (buttons[13].getText() == "O") && (buttons[18].getText() == "O") && (buttons[23].getText() == "O")) {
            textfield.setText("O wins!");
            gameover();
        } 
        else if ((buttons[4].getText() == "O") && (buttons[9].getText() == "O") && (buttons[14].getText() == "O") && (buttons[19].getText() == "O") && (buttons[24].getText() == "O")) {
            textfield.setText("O wins!");
            gameover();
        }
        
    


    }
    public void gameover(){
            for (int i = 0; i < 25; i++){
                buttons[i].setEnabled(false);
            }
        }


}
