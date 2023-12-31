package com.employeeportal.manager;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class EmployeeCreationResponse {
    private String employeeId;
    private String password;
}
