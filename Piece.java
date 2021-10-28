/**
 * This is abtract class that defines the basic methods of all chess pieces
 * 
 * @author Sujay Sayini
 * @author Pauleene Jordan
 */

public abstract class Piece {
    private boolean whiteTurn = false;
    //private boolean remove = false;
    public boolean first = true;
    
    public Piece(boolean whiteTurn)
    {
        this.setWhiteTurn(whiteTurn);
    }

    public boolean isWhite()
    {
        return this.whiteTurn;
    }
    
    // public boolean removePiece()
    // {
    //     return this.remove;
    // }

    public void setWhiteTurn(boolean whiteTurn)
    {
        this.whiteTurn = whiteTurn;
    }

    // public void setremovePiece(boolean remove)
    // {
    //     this.remove = remove;
    // }
    
    public abstract String toString();
    
    public abstract boolean allowedMove(int prevX, int prevY, int newX, int newY, boolean isEmpty);
}
