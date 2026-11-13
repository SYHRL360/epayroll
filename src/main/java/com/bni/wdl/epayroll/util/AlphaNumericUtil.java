package com.bni.wdl.epayroll.util;

import java.security.SecureRandom;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public final class AlphaNumericUtil {
    private static final SecureRandom SECURE_RANDOM = new SecureRandom();
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss").withZone(ZoneId.of("Asia/Jakarta"));
    private static final String TRANSACTION_PREFIX = "TRX";
    private static final String DASH = "-";

    public static String generateTransactionId(){
        String timeStamp = FORMATTER.format(Instant.now());
        // Generate random number (100000 to 999999)
        int randomNum = 100000 + SECURE_RANDOM.nextInt(900000);

        return TRANSACTION_PREFIX + DASH + timeStamp + DASH + randomNum;
    }

}
