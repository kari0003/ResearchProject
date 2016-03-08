package matchmaker;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Robi on 2016.02.25..
 * Contains the basic informations about the player. The player enters a Queue as a super object of QueueMember, and
 * leaves the queue (in case of a match) as a super object of TeamMember.
 */
public class Player {
    private long id;
    private final String name;
    private final int elo;
    private static AtomicLong playerIdCounter = new AtomicLong();

    public Player(String name, int elo){
        id = playerIdCounter.incrementAndGet();
        this.name = name;
        this.elo = elo;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getElo() {
        return elo;
    }
}
