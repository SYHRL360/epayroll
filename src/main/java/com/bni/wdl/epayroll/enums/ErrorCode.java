package com.bni.wdl.epayroll.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    DATA_NOT_FOUND(804, "Data tidak ditemukan"),
    REQUEST_TIME_OUT(808, "Request time out"),
    GENERAL_ERROR(801, "General error");


    private final int errorCode;
    private final String errorMessage;


}
