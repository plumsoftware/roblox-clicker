package ru.plumsoftware.robloxclicker.data.ads;

public abstract class AdsData {
    protected String interstitial;
    protected String rewarded;
    protected String banner;
    protected String open;

    public AdsData(String interstitial, String rewarded, String banner, String open) {
        this.interstitial = interstitial;
        this.rewarded = rewarded;
        this.banner = banner;
        this.open = open;
    }

    public String getInterstitial() {
        return interstitial;
    }

    public String getRewarded() {
        return rewarded;
    }

    public String getBanner() {
        return banner;
    }

    public String getOpen() {
        return open;
    }
}
