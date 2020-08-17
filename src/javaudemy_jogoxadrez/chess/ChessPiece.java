package javaudemy_jogoxadrez.chess;

import javaudemy_jogoxadrez.boardgame.Board;
import javaudemy_jogoxadrez.boardgame.Piece;

public class ChessPiece extends Piece {
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
		
}
