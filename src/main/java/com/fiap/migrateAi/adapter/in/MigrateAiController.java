package com.fiap.migrateAi.adapter.in;

import com.fiap.migrateAi.application.domain.entity.request.CodeRequestDTO;
import com.fiap.migrateAi.application.domain.entity.response.CodeResponseDTO;
import com.fiap.migrateAi.port.in.IMigrate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/migrate")
@RestController
public class MigrateAiController {
    @Autowired
    IMigrate migrate;

    @PostMapping("/recode")
    public ResponseEntity<CodeResponseDTO> callOpenAi(@RequestBody CodeRequestDTO requestDTO){
        return ResponseEntity.ok(migrate.callOpenAi(requestDTO));
    }
}
