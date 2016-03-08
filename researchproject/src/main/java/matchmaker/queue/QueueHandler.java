package matchmaker.queue;

import java.util.HashSet;

/**
 * Created by Robi on 2016.02.26..
 * Responsible for updating, deleting, creating the queues (based on their principles).
 * calls the onUpdate method when the queue should be updated.
 */
public class QueueHandler {
    private static QueueHandler handlerInstance = new QueueHandler();
    private HashSet<Queue> queues = new HashSet<Queue>();

    public void update(){
        for (Queue q : queues
             ) {
            q.onUpdate();
        }
    }

    public static QueueHandler getHandler() {
        return handlerInstance;
    }

    public Queue getList(long queueId) {
        Queue yourQueue = null;
        for (Queue q: queues
             ) {
            if(q.getId() == queueId){
                yourQueue = q;
            }
        }
        return yourQueue;
    }
}
