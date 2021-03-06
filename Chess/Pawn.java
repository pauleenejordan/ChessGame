/**
 * This is Pawn class for chess piece that extends Piece abstract class
 * 
 * @author Sujay Sayini
 * @author Pauleene Jordan
 */

public class Pawn extends Piece {

    private String chessPiece;

    public Pawn(boolean whiteTurn) {
        super(whiteTurn);

        if (whiteTurn == true) {
            this.chessPiece = "wp";
        } else {
            this.chessPiece = "bp";
        }

    }

    /**
	 * Check to see if the piece is allowed to move to the destination or not.
	 *
	 * @return true if it is allowed to 
     * @return false if it is not allowed to 
     * 
	 */
    @Override
    public boolean allowedMove(int prevX, int prevY, int currX, int currY, boolean isEmpty) {
        // change in x and y
        int y;

        int x = Math.abs(currX - prevX);
        if (this.isWhite() == true) {
            y = -(currY - prevY);
        } else {
            y = currY - prevY;
        }

        if (y == 1 && x == 0 && isEmpty == true) {
            return true;
        } else if (x == 1 && y == 1 && isEmpty == false) {
            return true;
        } else if (this.first == true && x == 0 && y == 2 && isEmpty == true) {
            return true;
        }

        return false;
    }

    public String toString() {
        return this.chessPiece;
    }

}
