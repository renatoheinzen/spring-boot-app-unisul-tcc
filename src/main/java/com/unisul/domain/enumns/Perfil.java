package com.unisul.domain.enumns;

public enum Perfil {
	
	ADMIN (1, "ROLE_ADMIN"),
	CLIENTE (2,"ROLE_CLIENTE"),
	VISITANTE (3,"ROLE_VISITANTE");;
	
	private int codigo;
	private String descricao;
	
	private Perfil (int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Perfil toEnum (Integer codigo) {
		
		if (codigo == null) {
			return null;
		}
		
		for(Perfil x: Perfil.values()) {
			if (codigo.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido para o Perfil: "+codigo);
		
	}
	

}
