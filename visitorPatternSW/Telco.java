public class Telco implements TelcoSubscription {
    private int dataAllowance;
    private double promoPrice;
    private String telcoName;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double promoPrice) {
        this.promoPrice = promoPrice;
        return promo.showAllowance(telcoName, promoPrice);
    }

    @Override
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText) {
        this.unliCallText = unliCallText;
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    public int getDataAllowance() {
        return dataAllowance;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }
}