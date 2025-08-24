package exception;

import java.math.BigDecimal;
import java.util.Objects;

public class Q01 {

    static class Account {
        private final String id;
        private BigDecimal balance;

        Account(String id, BigDecimal balance) {
            this.id = Objects.requireNonNull(id);
            this.balance = Objects.requireNonNull(balance);
        }

        public String id() {
            return id;
        }

        public BigDecimal balance() {
            return balance;
        }

        void debit(BigDecimal amount) throws SaldoInsuficienteException {
            if (this.balance.compareTo(amount) < 0) throw new SaldoInsuficienteException("Saldo insuficiente para resgate!");
            this.balance = this.balance.subtract(amount);
        }

        void credit(BigDecimal amount) {
            this.balance = this.balance.add(amount);
        }
    }

    static class ContaInvalidaException extends IllegalArgumentException {
        public ContaInvalidaException() {
            super("Conta não pode ser inválida");
        }

        public ContaInvalidaException(String message) {
            super(message);
        }
    }

    static class SaldoInsuficienteException extends Exception {
            public SaldoInsuficienteException() {
                super("Conta não pode ser inválida");
            }

            public SaldoInsuficienteException(String message) {
                super(message);
            }
        }

    static class TransferService {
        /**
         * Requisitos:
         * - Lançar exceções de negócio específicas para:
         * (a) valor negativo/zero, (b) conta nula, (c) saldo insuficiente.
         * - Escolher quais serão checadas vs. não checadas e justificar no código (nomes).
         * - Garantir que, se der erro após debitar, o estado não fique inconsistente.
         */
        public void transfer(Account from, Account to, BigDecimal amount) throws SaldoInsuficienteException {
            if (from == null || to == null) throw new ContaInvalidaException("Conta não pode ser nula");
            if (amount.compareTo(new BigDecimal(0)) <= 0) throw new IllegalArgumentException("Valor inválido");

            try {
                from.debit(amount);
                to.credit(amount);
            } catch (RuntimeException e) {
                try { System.out.println("rollback....");} catch (RuntimeException ignored) {}
                throw e;
            }

        }
    }

    public static void main(String[] args) {
        Account a1 = new Account("1", new BigDecimal(100));
        Account a2 = new Account("2", new BigDecimal(100));

        TransferService transferService = new TransferService();

        try {
            transferService.transfer(a1, a1, new BigDecimal(-10));
            System.out.println("Transação realizada com sucesso!");
        } catch (IllegalArgumentException | SaldoInsuficienteException e) {
            System.out.println("Erro na transferência: " + e.getMessage());
            System.out.println("Transação cancelada, tente novamente com valores válidos");
        } finally {
            System.out.println("status das contas: ");
            System.out.println("Conta de origem: " + a1.balance);
            System.out.println("Conta de destino: " + a2.balance);
        }

    }

}
