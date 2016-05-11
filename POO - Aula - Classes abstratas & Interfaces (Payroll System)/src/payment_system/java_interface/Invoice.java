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
  } // fim do método setPartNumber

  // obtém o número da peça
  public String getPartNumber() {
    return partNumber;
  } // fim do método getPartNumber

  // configura a descrição
  public void setPartDescription(String description) {
    partDescription = description;
  } // fim do método setPartDescription

  // obtém a descrição
  public String getPartDescription() {
    return partDescription;
  } // fim do método getPartDescription

  // configura a quantidade
  public void setQuantity(int count) {
    quantity = (count < 0) ? 0 : count; // quantidade não pode ser negativa
  } // fim do método setQuantity

  // obtém quantidade
  public int getQuantity() {
    return quantity;
  } // fim do método getQuantity

  // configura preço por item
  public void setPricePerItem(double price) {
    pricePerItem = (price < 0.0) ? 0.0 : price; // valida preço
  } // fim do método setPricePerItem

  // obtém preço por item
  public double getPricePerItem() {
    return pricePerItem;
  } // fim do método getPricePerItem
}