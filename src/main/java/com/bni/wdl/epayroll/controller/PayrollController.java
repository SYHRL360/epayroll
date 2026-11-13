package com.bni.wdl.epayroll.controller;

import com.bni.wdl.epayroll.model.dto.ResponseDto;
import com.bni.wdl.epayroll.service.PayrollService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/payroll")
public class PayrollController {

    private final PayrollService payrollService;

    @PostMapping(value = "/uploadPayrollFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<ResponseDto<String>> uploadPayrollFile(@RequestParam("file")MultipartFile file) {
        return null;
    }
}
