package entidades;

public enum OrdemStatus {
	
	PAGAMENTO_PENDENTE, //CONSTANTES
	PROCESSANDO,
	ENVIADO,
	ENTREGUE;
}  
	
_______________________________________________________

package entidades;

import java.util.Date;

public class Pedidos {

	private Integer id;
	private Date momento;
	private OrdemStatus status;

	public Pedidos() {
	}

	public Pedidos(Integer id, Date momento, OrdemStatus status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedidos [id = " + id + ", momento = " + momento + ", status =  " + status + "]";
	}

	
}

______________________________________________________________________________________

package aplicattion;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entidades.OrdemStatus;
import entidades.Pedidos;

public class Programa {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Pedidos pedido1 = new Pedidos(1080, new Date(), OrdemStatus.PAGAMENTO_PENDENTE);
		
		System.out.println(pedido1);
		
		OrdemStatus os1 = OrdemStatus.ENTREGUE;
		
		OrdemStatus os2 = OrdemStatus.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);

		sc.close();
	}
}
/*
Pedidos [id = 1080, momento = Fri May 17 12:40:35 BRT 2024, status =  PAGAMENTO_PENDENTE]
ENTREGUE
ENTREGUE
*/