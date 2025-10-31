package com.fiap.migrateAi.adapter.out;

import com.fiap.migrateAi.adapter.out.dto.CodeRequest;
import com.fiap.migrateAi.port.out.IOpenAI;
import dev.langchain4j.model.chat.ChatLanguageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class OpenAiService implements IOpenAI {
    private final ChatLanguageModel model;

    @Autowired
    public OpenAiService(ChatLanguageModel model) {
        this.model = model;
    }


    @Override
    public String callOpenAi(CodeRequest request) {
        return model.generate(request.getMessage());
    }
}
