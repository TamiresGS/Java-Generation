package Familia28;

public class PooAviao {

	//DECLARAÇÃO DOS ATRIBUTOS DA CLASSE
	
		private String cArea;
		private String partida;
		private String destino;
		private String embarque;
		
		//MÉTODO CONSTRUTOR
		
		public PooAviao (String cArea,String destino, String partida,String embarque)
		{
			this.cArea = cArea;
			this.partida = partida;
			this.destino = destino;
			this.embarque = embarque;
		}
		public PooAviao (String partida, String destino, String embarque )
		{
			this.partida= partida;
			this.destino = destino;
			this.embarque = embarque;
		}	
			//DECLARAÇÃO DOS DEMAIS MÉTODOS
		public void imprimirInfo()
		{
			
		System.out.println("\n PROXÍMO EMBARQUE\n\n");
		System.out.println(" COMPANHIA ARÉA: " + cArea);
		System.out.println(" PARTIDA: " + partida);
		System.out.println(" DESTINO: " + destino);
		System.out.println(" HORÁRIO DE EMBARQUE ÁS: " + embarque);
		
		}
		
		public String getcArea() {
			return cArea;
		}
		public void setcArea(String cArea) {
			this.cArea = cArea;
		}
		public String getPartida() {
			return partida;
		}
		public void setPartida(String partida) {
			this.partida = partida;
		}
		public String getDestino() {
			return destino;
		}
		public void setDestino(String destino) {
			this.destino = destino;
		}
		public String getEmbarque() {
			return embarque;
		}
		public void setEmbarque(String embarque) {
			this.embarque = embarque;
		}
}

