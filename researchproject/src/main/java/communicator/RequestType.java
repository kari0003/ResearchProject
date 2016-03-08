package communicator;

/**
 * Created by Robi on 2016.02.29..
 */
public enum RequestType {
    CREATE_QUEUE ("/queue/create"),   //Creates a new queue, with an unique id.
    DELETE_QUEUE ("/queue/delete"),   //Creates a new queue, with an unique id.
    REFRESH_QUEUE ("/queue/refresh"),  //Updates a queue based on a configuration object
    CHECK_QUEUE ("/queue/check"),    //Check the state of the queue. If a match was found, it responds accordingly
    ADD_PLAYER ("/queue/addPlayer"),     //Adds a player to a queue or queues
    REMOVE_PLAYER ("/queue/removePlayer"),  //Removes player from a queue or queues
    LIST_PLAYERS ("/queue/listPlayers");

    private final String name;

    private RequestType(String route){
        name = route;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
