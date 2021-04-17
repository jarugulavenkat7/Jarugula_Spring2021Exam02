/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class PlayerDriver {

    public static void main(String[] args) {
        System.out.println("Question:4 By Venkat Sai Jarugula");
        CricketPlayer cricketPlayer1 = new CricketPlayer("M.S.Dhoni", 39, 1.80, "WK-Batsman", 10773, 36);
        System.out.println(cricketPlayer1);
        FootBallPlayer footBallPlayer = new FootBallPlayer("Lionel Messi", 33, 1.70, "Forward", 705, 867);
        System.out.println(footBallPlayer);
        Player player1 = new CricketPlayer("Virat Kohli", 32, 1.75, "Top-order batsman", 12169, 641);
        System.out.println(player1);
    }

}
