package javaudemy_jogoxadrez.boardgame;

public class BoardException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public BoardException(String mensagem) {
		super(mensagem);
	}
}
