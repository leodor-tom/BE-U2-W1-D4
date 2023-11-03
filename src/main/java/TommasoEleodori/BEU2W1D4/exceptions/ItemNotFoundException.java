package TommasoEleodori.BEU2W1D4.exceptions;

import java.util.UUID;

public class ItemNotFoundException extends RuntimeException{
    public ItemNotFoundException(UUID id){
        super("the item with the id " + id + " was not found");
    }
    public ItemNotFoundException(String id){
        super("the item " + id + " was not found");
    }

}
