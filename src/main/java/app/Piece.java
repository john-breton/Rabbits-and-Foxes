package app;

/***
 * 
 * @author
 */
public abstract class Piece {

	enum PieceType {
		FOX, MUSHROOM, RABBIT
	}

	private PieceType pieceType;

	/**
	 * Construct a new piece given the specified piece type
	 * 
	 * @param pieceType The piece type of the piece, as a PieceType
	 */
	public Piece(PieceType pieceType) {
		this.pieceType = pieceType;
	}

	/**
	 * @return This piece's type, as a PieceType
	 */
	public PieceType getPieceType() {
		return pieceType;
	}

	/**
	 * @return True if the piece can move the specified start to end positions.
	 *         False otherwise.
	 */
	abstract boolean canMove(int xStart, int yStart, int xEnd, int yEnd);

	/**
	 * @return A short, two-character string representing the piece.
	 */
	abstract String toShortString();
}
