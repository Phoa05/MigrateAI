package com.fiap.migrateAi.application.usecase;

import com.fiap.migrateAi.adapter.out.dto.CodeRequest;
import com.fiap.migrateAi.application.domain.entity.request.CodeRequestDTO;
import com.fiap.migrateAi.application.domain.entity.response.CodeResponseDTO;
import com.fiap.migrateAi.port.in.IMigrate;
import com.fiap.migrateAi.port.out.IOpenAI;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MigrateUseCase implements IMigrate {
    private final IOpenAI openAI;

    @Override
    public CodeResponseDTO callOpenAi(CodeRequestDTO requestDTO) {
        CodeRequest request = new CodeRequest();
        request.setMessage(requestDTO.getInput());

        CodeResponseDTO responseDTO = new CodeResponseDTO();
        responseDTO.setMessage(openAI.callOpenAi(request));

        return responseDTO;
    }


}
