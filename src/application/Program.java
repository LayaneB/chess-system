package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		ChessMatch pos = new ChessMatch();
		UI.printBoard(pos.getPieces());

	}

}
