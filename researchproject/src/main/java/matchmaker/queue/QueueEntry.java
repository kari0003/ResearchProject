package matchmaker.queue;

import matchmaker.Player;

/**
 * Created by Robi on 2016.02.26..
 */
public class QueueEntry {
    public Player player;
    public long enter_time;

    public QueueEntry(Player player) {
        this.player = player;
        enter_time = System.currentTimeMillis();
    }
}
