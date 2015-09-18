using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;

/**
 * CodinGame planet is being attacked by slimy insectoid aliens.
 * <---
 * Hint:To protect the planet, you can implement the pseudo-code provided in the statement, below the player.
 **/
class Player
{
    static void Main(string[] args)
    {

        while (true)
        {
			string enemy1 = Console.ReadLine();
            int dist1 = int.Parse(Console.ReadLine());
            string enemy2 = Console.ReadLine();
            int dist2 = int.Parse(Console.ReadLine());

            if(dist1 <= dist2) {
                Console.WriteLine( enemy1 );
            }
            else {
                Console.WriteLine( enemy2 );
            }
            
        }
    }
}