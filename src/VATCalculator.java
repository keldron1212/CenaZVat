import java.math.BigInteger;

public class VATCalculator {
  float calculateVat(VAT vat, float money) {
      return money*(100+vat.vatValue)/100;
  }

}
