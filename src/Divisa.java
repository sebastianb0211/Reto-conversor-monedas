public record Divisa(String base_code, String target_code, double conversion_result) {

    public String toString(double cantidad) {
        return "Hiciste una conversion de: "+cantidad +" "+base_code+" a "+ conversion_result+ " "+ target_code;
    }
}
