public interface Inviteable {


    /**
     * Отправить приглашение пользователю
     */
    void sendInvite(User user);

    /**
     * Принять приглашение
     */
    void acceptInvite(Invite invite);

    /**
     * Отклонить приглашение
     */
    void refuseInvite(Invite invite);

    /**
     * Отозвать приглашение
     */
    void revokeInvite(User user);

}
