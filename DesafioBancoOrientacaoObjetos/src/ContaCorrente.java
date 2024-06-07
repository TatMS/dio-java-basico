public class ContaCorrente extends Conta {

    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Corrente  ***");
        super.imprimirInfosComuns();
    }

    @Override
    public void sacar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sacar'");
    }

    @Override
    public void depositar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'depositar'");
    }

    @Override
    public void transferir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transferir'");
    }

}
