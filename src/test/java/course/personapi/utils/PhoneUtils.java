package course.personapi.utils;

import course.personapi.dto.request.PhoneDTO;
import course.personapi.entity.Phone;
import course.personapi.enums.PhoneType;

public class PhoneUtils {
    private static final String NUMBER = "(67)999999999";
    private static final long PHONE_ID = 1L;
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .number(NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
