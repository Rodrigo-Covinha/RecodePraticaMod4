package br.com.model;

public class JavaBeans {
	
	
		
		private int idAgenda;
		private String classe;
		private String dataIda;
		private String dataVolta;
		private String qtdCrianca;
		private String qtdAdulto;
		private String origem;
		private String destino;
		
		
		public JavaBeans(int idAgenda, String classe, String dataIda, String dataVolta, String qtdCrianca,
				String qtdAdulto, String origem, String destino) {
			super();
			this.idAgenda = idAgenda;
			this.classe = classe;
			this.dataIda = dataIda;
			this.dataVolta = dataVolta;
			this.qtdCrianca = qtdCrianca;
			this.qtdAdulto = qtdAdulto;
			this.origem = origem;
			this.destino = destino;
		}
		public JavaBeans() {
			super();
		}
		public int getIdAgenda() {
			return idAgenda;
		}
		public void setIdAgenda(int idAgenda) {
			this.idAgenda = idAgenda;
		}
		
		public String getClasse() {
			return classe;
		}
		public void setClasse(String classe) {
			this.classe = classe;
		}
		public String getDataIda() {
			return dataIda;
		}
		public void setDataIda(String dataIda) {
			this.dataIda = dataIda;
		}
		public String getDataVolta() {
			return dataVolta;
		}
		public void setDataVolta(String dataVolta) {
			this.dataVolta = dataVolta;
		}
		public String getQtdCrianca() {
			return qtdCrianca;
		}
		public void setQtdCrianca(String qtdCrianca) {
			this.qtdCrianca = qtdCrianca;
		}
		public String getQtdAdulto() {
			return qtdAdulto;
		}
		public void setQtdAdulto(String qtdAdulto) {
			this.qtdAdulto = qtdAdulto;
		}
		public String getOrigem() {
			return origem;
		}
		public void setOrigem(String origem) {
			this.origem = origem;
		}
		public String getDestino() {
			return destino;
		}
		public void setDestino(String destino) {
			this.destino = destino;
		}
		
			
		
		
		
		
		
	}



