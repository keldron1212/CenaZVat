public enum VAT {
    VAT23(23),
    VAT8(8),
    VAT5(5);

    int vatValue;

    private VAT(int vatValue) {
       this.vatValue = vatValue;
    }
}
