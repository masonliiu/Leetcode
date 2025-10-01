class Solution {
    public String defangIPaddr(String address) {
        String[] str = address.split("\\.");
        String addy = "";
        for (int i = 0; i < str.length; i++) {
            if (i == str.length-1) {
                addy += str[i];
                break;
            }
            addy += str[i];
            addy += "[.]";
        }
        return addy;
    }
}