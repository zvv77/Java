package ru.geekbrains.april_chat.network;

import java.io.IOException;

public class ChatMessageServiceImpl implements ChatMessageService{
    private String host;
    private int port;
    private NetworkService networkService;
    private MessageProcessor messageProcessor;

    public ChatMessageServiceImpl(String host, int port, MessageProcessor messageProcessor) {
        this.host = host;
        this.port = port;
        this.messageProcessor = messageProcessor;
    }

    @Override
    public void connect() {
        try {
            this.networkService = new NetworkService(host, port, this);
            networkService.readMessages();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void send(String msg) {
        networkService.sendMessage(msg);
    }

    @Override
    public void receive(String msg) {
        messageProcessor.processMessage(msg);
    }
}
