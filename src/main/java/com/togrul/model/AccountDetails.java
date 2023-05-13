package com.togrul.model;

import com.togrul.encrypt.MaskData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountDetails {

    private String accountHolderName;

    @MaskData
    private String accountNumber;
    private String accountType;
}
