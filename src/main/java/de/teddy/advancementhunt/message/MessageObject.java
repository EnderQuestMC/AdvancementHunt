package de.teddy.advancementhunt.message;

public final class MessageObject {
    private MessageType messageType;
    private SendType sendType;
    private String message;

    public MessageObject(MessageType messageType,SendType sendType,String message)
    {
        this.messageType = messageType;
        this.sendType = sendType;
        this.message = message;
    }

    public MessageType getMessageType()
    {
        return messageType;
    }

    public SendType getSendType()
    {
        return sendType;
    }

    public String getMessage()
    {
        return message;
    }
}