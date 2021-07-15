package Familia28;

public class PooAviao {

	//DECLARA��O DOS ATRIBUTOS DA CLASSE
	
		private String cArea;
		private String partida;
		private String destino;
		private String embarque;
		
		//M�TODO CONSTRUTOR
		
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
			//DECLARA��O DOS DEMAIS M�TODOS
		public void imprimirInfo()
		{
			
		System.out.println("\n PROX�MO EMBARQUE\n\n");
		System.out.println(" COMPANHIA AR�A: " + cArea);
		System.out.println(" PARTIDA: " + partida);
		System.out.println(" DESTINO: " + destino);
		System.out.println(" HOR�RIO DE EMBARQUE �S: " + embarque);
		
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

