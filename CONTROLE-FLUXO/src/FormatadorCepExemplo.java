public class FormatadorCepExemplo {

    public static void main(String[] args) {
        try {
            String cepFormatado = fomatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde!");
            // e.printStackTrace();
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException {

        if (cep.length() != 8) {
            throw new CepInvalidoException();

            // simulando um cep formatado
            return "23.765-064";

        }
    }
}