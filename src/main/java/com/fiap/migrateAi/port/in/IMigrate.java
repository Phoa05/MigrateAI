package com.fiap.migrateAi.port.in;

import com.fiap.migrateAi.application.domain.entity.request.CodeRequestDTO;
import com.fiap.migrateAi.application.domain.entity.response.CodeResponseDTO;

public interface IMigrate {
    CodeResponseDTO callOpenAi(CodeRequestDTO requestDTO);
}
