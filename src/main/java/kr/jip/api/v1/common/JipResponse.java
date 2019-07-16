package kr.jip.api.v1.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JipResponse {
    private boolean result;
    private String message;
}
