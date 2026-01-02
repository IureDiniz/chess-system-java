package entities;

import entities.enums.Color;

public abstract class ChessPiece extends Piece{
	private Color color;
	private int moveCount;
	
	public Color getColor() {
		return color;
	}
	public int getMoveCount() {
		return moveCount;
	}

	public ChessPiece(Position position, Color color, int moveCount) {
		super(position);
		this.color = color;
		this.moveCount = moveCount;
	}
	
	public abstract ChessPosition getChessPosition();
	
	
}
