import java.util.List;

public interface Friend {

    /**
     * Найти друга из френдлиста по фильтрам, в частности по ФИ
     * */
    List<Friend> findFriend(String surname, String firstname);

    /**
     * Найти друга из френдлиста по строке поиска
     * */
    List<Friend> findFriend(String searchString);

    /**
     * Удалить друга из френдлиста
     * */
    void removeFriend(Friend friend) throws FriendNotFoundException;
}
