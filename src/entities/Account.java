package entities;

public class Account {

	public static double DEPOSIT_FEE_PERCENTAGE = 0.02;

	private Long id;
	private Double balance;

	public Account() {

	}

	public Account(Long id, Double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getBalance() {
		return balance;
	}

	// função para realizar o deposito com o desconto da taxa bancária
	public void deposit(double amount) {
		if (amount > 0) {
			amount -= amount * DEPOSIT_FEE_PERCENTAGE; // o -= é o mesmo que amount = amount - amount * DEPOSIT....
			balance += amount;
		}
	}

	//função para realizar um saque no banco
	public void withdraw(double amount) {
		if (amount > balance) { 
			throw new IllegalArgumentException();
		}
		balance -= amount;
	}
	
	//função que saca todo o valor disponivel na conta
	public double fullWithdraw() { 
		double aux = balance;
		balance = 0.0;
		return aux;
	}

}
