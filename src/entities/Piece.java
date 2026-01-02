package entities;

public abstract class Piece {
	protected Position position;
	
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}

	public Piece(Position position) {
		this.position = position;
	}
	
	public abstract boolean[][] possibleMovies();
	public abstract boolean possibleMovie(Position position);
	public abstract boolean isThereAnyPossibleMovie();	
}
