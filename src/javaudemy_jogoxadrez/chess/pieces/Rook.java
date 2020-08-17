package javaudemy_jogoxadrez.chess.pieces;

import javaudemy_jogoxadrez.boardgame.Board;
import javaudemy_jogoxadrez.chess.ChessPiece;
import javaudemy_jogoxadrez.chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);		
	}
	
	@Override
	public String toString() {
		return "R";
	}
}
