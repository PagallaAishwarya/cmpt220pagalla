/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aishw
 */
import java.util.Scanner;
public class ASH1809 {

 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  char[][] board = new char[3][3];
  char player = 'X';
  char status;
  int row, col;
 
  displayBoard(board);
 
  while ((status = checkBoard(board)) == 'N') {
 
   System.out.print("Enter a row (0, 1, or 2) for player " + player
     + ":");
   row = input.nextInt();
 
   System.out.print("Enter a column (0, 1, or 2) for player " + player
     + ":");
   col = input.nextInt();
 
   if (board[col][row] != '\u0000') {
    System.out.println("The row and column is occupied.");
    continue;
   } else {
    board[col][row] = player;
    if (player == 'O') {
     player = 'X';
    } else {
     player = 'O';
    }
 
   }
    
   displayBoard(board);
 
  }
   
  if(status == 'F')
  System.out.println("It is a draw.");
  else
  System.out.println("The winner is " + status);
   
 
 }
 
 public static char checkBoard(char board[][]) {
  char status = 'F';
 
  // Check if the board is full
  outer: for (int i = 0; i < board.length; i++) {
   for (int j = 0; j < board[0].length; j++) {
    if (board[i][j] == '\u0000') {
     status = 'N';
     break outer;
    }
   }
 
  }
 
  // Check column 1
  if (board[0][0] == board[0][1] && board[0][0] == board[0][2]
    && board[0][0] != '\u0000') {
   status = board[0][0];
  }
 
  // Check column 2
  if (board[1][0] == board[1][1] && board[1][0] == board[1][2]
    && board[1][0] != '\u0000') {
   status = board[1][0];
  }
 
  // Check column 3
  if (board[2][0] == board[2][1] && board[2][0] == board[2][2]
    && board[2][0] != '\u0000') {
   status = board[2][0];
  }
 
  // Check row 1
  if (board[0][0] == board[1][0] && board[0][0] == board[2][0]
    && board[0][0] != '\u0000') {
   status = board[0][0];
  }
 
  // Check row 2
  if (board[0][1] == board[1][1] && board[0][1] == board[2][1]
    && board[0][1] != '\u0000') {
   status = board[0][1];
  }
 
  // Check row 3
  if (board[0][2] == board[1][2] && board[0][2] == board[2][2]
    && board[0][2] != '\u0000') {
   status = board[0][2];
  }
 
  // Check diagonal 1
  if (board[0][0] == board[1][1] && board[0][0] == board[2][2]
    && board[0][0] != '\u0000') {
   status = board[0][0];
  }
 
  // Check diagonal 2
  if (board[2][0] == board[1][1] && board[2][0] == board[0][2]
    && board[2][0] != '\u0000') {
   status = board[0][0];
  }
 
  return status;
 
 }
 
 public static void displayBoard(char board[][]) {
 
  for (int i = 0; i < board.length; i++) {
   for (int j = 0; j < board[1].length; j++) {
    System.out.print("|" + board[j][i]);
   }
 
   System.out.println("|");
  }
 }
 
}

