package pieces;

import board.Board;

import java.util.Vector;

public class Empty extends Piece {
    public Empty(byte pieceByte) {
        super(pieceByte);
    }

    @Override
    public Vector<String> GetLegalNormalMoves(int rank, int file, Board board) {
        return new Vector<String>();
    }

    @Override
    public Vector<String> GetLegalSpecialMoves(int rank, int file, Board board) {
        return new Vector<String>();
    }
}
