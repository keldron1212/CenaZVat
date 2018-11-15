public class Main {
    public static void main(String[] args){
        InputReader inputReader = new InputReader();
        float a = inputReader.readNextFloat();
        VAT vat = inputReader.askForVat();
        VATCalculator calculatorVat = new VATCalculator();
        Float result = calculatorVat.calculateVat(vat, a);
        System.out.println("Wartość brutto wynosi "+ result);
    }

}
