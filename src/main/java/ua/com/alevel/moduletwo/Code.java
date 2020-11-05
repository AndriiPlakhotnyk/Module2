package ua.com.alevel.moduletwo;

import java.util.UUID;

public class Code {
    public String generateString() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }
}
