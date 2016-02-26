package matchmaker;

import java.util.HashSet;

/**
 * Updates the queue based on a principle.
 * Created by Robi on 2016.02.26..
 */
public class QueueHandler {
    private HashSet<Queue> queues = new HashSet<>();

    public void update(){
        for (Queue q : queues
             ) {
            q.onUpdate();
        }
    }
}
