package javaudemy_jogoxadrez.application;

import java.text.ParseException;

import javaudemy_jogoxadrez.chess.ChessMatch;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		ChessMatch chessMatch = new ChessMatch();
		
		UI.printBoard(chessMatch.getPieces());
	}
}
