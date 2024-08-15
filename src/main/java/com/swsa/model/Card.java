package com.swsa.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Card {

    int cardId;
    long cardNo;
    long accountNo;
    String accountHolderName;
    int cvv;
    String cardType;

    }



