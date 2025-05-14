package com.ms.email.dtos;

import java.util.UUID;

public record EmailRecordDto(UUID userid, String emailTo, String text) {
}
