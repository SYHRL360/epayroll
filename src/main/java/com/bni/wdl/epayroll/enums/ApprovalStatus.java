package com.bni.wdl.epayroll.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ApprovalStatus {
    PENDING("PENDING", 0),
    APPROVED("APPROVED", 1),
    REJECTED("REJECTED", 2),
    CANCELLED("CANCELLED", 3);

    private final String name;
    private final int code;


    public static ApprovalStatus fromString(String stringName) {
        if (stringName == null)
            return null;
        for (ApprovalStatus status : ApprovalStatus.values()){
            if (status.getName().equalsIgnoreCase(stringName)) {
                return status;
            }
        }
        return null;
    }
}
