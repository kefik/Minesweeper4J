package cz.minesweeper4j.agents;

import cz.minesweeper4j.Minesweeper;
import cz.minesweeper4j.simulation.MinesweeperResult;
import cz.minesweeper4j.simulation.actions.Action;
import cz.minesweeper4j.simulation.agent.IAgent;
import cz.minesweeper4j.simulation.board.oop.Board;

/**
 * Fully random agent (except the first advice).
 * @author Jimmy
 */
public class RandomAgent1 extends ArtificialAgent {
	
	/**
	 * See {@link ArtificialAgent#think(Board)} and {@link ArtificialAgent#observe(Board)} for things it is doing
	 * automatically for you.
	 * 
	 * Just randomly clicks around...
	 * 
	 * @param board current state of the board
	 * @param previousBoard a board from previous think iteration, never nulls
	 */
	@Override
	protected Action thinkImpl(Board board, Board previousBoard) {
		// RANDOM CLICK
		return actions.open(unknowns.get(random.nextInt(unknowns.size())));		
	}
	
	public static void main(String[] args) {
		IAgent agent = new RandomAgent1(); 
		
		MinesweeperResult result = Minesweeper.playAgent("RandomAgent1", 10, 10, 10, 60 * 1000, 1, true, agent);
		System.out.println("---// FINISHED //---");
		System.out.println(result);
	}

}
