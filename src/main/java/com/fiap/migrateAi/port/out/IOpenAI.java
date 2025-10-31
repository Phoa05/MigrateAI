package com.fiap.migrateAi.port.out;

import com.fiap.migrateAi.adapter.out.dto.CodeRequest;

public interface IOpenAI {
    String callOpenAi(CodeRequest request);
}
