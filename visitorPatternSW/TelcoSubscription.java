public interface TelcoSubscription {
    public String accept(UsagePromo promo, double promoPrice);
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText);
}