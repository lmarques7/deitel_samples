package payment_system.java_interface;
// Fig. 10.12: Invoice.java
// Classe Invoice que implementa Payable.

public class Invoice implements Payable {
  private String partNumber;
  private String partDescription;
  private int quantity;
  private double pricePerItem;

  public Invoice(String part, String description, int count, double price) {
    this.partNumber = part;
    this.partDescription = description;
    setQuantity(count); 
    setPricePerItem(price);
  } 

  public double getPaymentAmount() {
    return getQuantity() * getPricePerItem();
  }

  public String toString() {
    return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", "invoice",
        "part number", getPartNumber(), getPartDescription(), "quantity",
        this.getQuantity(), "price per item", this.getPricePerItem());
  }
  
  public void setPartNumber(String part) {
    partNumber = part;
  } // fim do m�todo setPartNumber

  // obt�m o n�mero da pe�a
  public String getPartNumber() {
    return partNumber;
  } // fim do m�todo getPartNumber

  // configura a descri��o
  public void setPartDescription(String description) {
    partDescription = description;
  } // fim do m�todo setPartDescription

  // obt�m a descri��o
  public String getPartDescription() {
    return partDescription;
  } // fim do m�todo getPartDescription

  // configura a quantidade
  public void setQuantity(int count) {
    quantity = (count < 0) ? 0 : count; // quantidade n�o pode ser negativa
  } // fim do m�todo setQuantity

  // obt�m quantidade
  public int getQuantity() {
    return quantity;
  } // fim do m�todo getQuantity

  // configura pre�o por item
  public void setPricePerItem(double price) {
    pricePerItem = (price < 0.0) ? 0.0 : price; // valida pre�o
  } // fim do m�todo setPricePerItem

  // obt�m pre�o por item
  public double getPricePerItem() {
    return pricePerItem;
  } // fim do m�todo getPricePerItem
}