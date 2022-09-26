package models;

public class Singleton {

    private static String connection;             // muzu si udelat 10 instanci trid, ale vzdy bude jen jedno spojeni

    public String getConnection(){
        if (connection == null){
            connection = "open";
        }

        return connection;

    }
}
