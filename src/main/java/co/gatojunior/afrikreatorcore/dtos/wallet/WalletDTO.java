package co.gatojunior.afrikreatorcore.dtos.wallet;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class WalletDTO {

    private Float availableBalance;
    private Float outcomeBalance;
    private Float incomeBalance;
    private Float lastBalance;
    private String ownerMatricule;
    private String createdDate;
    private String lastModifiedDate;
}
