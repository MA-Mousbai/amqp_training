package lernejo.chat;

import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {
    private ChatMessageRepository repository;

    public ChatMessageListener(ChatMessageRepository repository) {
        this.repository = repository;
    }

    public void onMessage(String msg) {
        System.out.println(msg);
        repository.addChatMessage(msg);
    }
}
