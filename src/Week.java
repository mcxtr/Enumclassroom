public enum Week {
    MONDAY("мен окууга бардым"),
    TEUSDAY("футболго бардым"),
    WENDNSDAY("бассейинге бардым"),
    THUSDAY("иш кылдым"),
    FRIDAY("тренировкага бардым"),
    SATURDAY("Досторум менен отурушка бардым"),
    SUNDAY("мен эсалдым");
    private String mean;

    @Override
    public String toString() {
        return "Week:" +
                "mean:" + mean + "\n";
    }

    Week(String mean) {
        this.mean = mean;
    }

    public String getMean() {
        return mean;

    }
}
