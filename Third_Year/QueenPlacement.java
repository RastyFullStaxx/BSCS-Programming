package Third_Year;

import java.util.Stack;

public class QueenPlacement extends ChessPiece {

    public QueenPlacement(int row, int column) {
        super(row, column);
    }

    public boolean isConflict(QueenPlacement other) {
        return (this.row == other.row) || (this.column == other.column) ||
                (Math.abs(this.row - other.row) == Math.abs(this.column - other.column));
    }
}
