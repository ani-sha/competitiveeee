public class DefangIP {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<address.length(); i++) {
            if(address.charAt(i)== '.')
                sb.append("[.]");
            else
                sb.append(address.charAt(i));
        }
        String res =  sb.toString();
        return res;
    }
}
