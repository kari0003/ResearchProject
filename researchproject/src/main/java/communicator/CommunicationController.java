package communicator;

import matchmaker.Player;
import matchmaker.queue.QueueHandler;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;

/**
 * Created by Robi on 2016.02.29..
 *
 * CommunicationController handles incoming requests, and repsponds to them.
 * 
 */

@RestController
public class CommunicationController {

    @RequestMapping(value = "/queue/listPlayers/{1}" , method = RequestMethod.GET)
    public @ResponseBody LinkedList<Player> onListPlayers(@RequestBody CommObject req){
        QueueHandler handler = QueueHandler.getHandler();
        //Handles the incoming ojbect, redirect to the proper
        long queueId = (long)req.packet;
        return handler.getList(queueId).getPlayers();
    }


}
