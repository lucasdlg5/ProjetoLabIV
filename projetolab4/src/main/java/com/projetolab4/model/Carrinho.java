package com.projetolab4.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CRN_CARRINHO")
public class Carrinho {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long crnId;
	
	/*TODO CHAVE ESTRANGEIRA PARA PRODUTO - PRO_ID*/
	@OneToOne
	@JoinColumn(name = "proId", unique = true, referencedColumnName = "pro_id", nullable = false)
	private long pro_id;
	
	
	@Column(name="PRO_QTD", nullable = false)
	private String proQtd;
	
	/*TODO CHAVE ESTRANGEIRA PARA CLIENTE - CLI_ID*/
	@JoinColumn(name = "cli_Id", unique = true, referencedColumnName = "cliId", nullable = false)
	private long cli_Id;
	
	
	/*TODO CHAVE ESTRANGEIRA PARA VENDA - VEN_ID*/
	@JoinColumn(name = "ven_id", unique = true, referencedColumnName = "venId", nullable = false)
	private long ven_id;
	
	
	
	/*TODO METODO TOSTRING CONSIDERANDO AS CHAVES ESTRANGEIRAS*/
	  public String toString(long valor) {
			return Long.toString(valor);
		    }
	
	
	
	


}
