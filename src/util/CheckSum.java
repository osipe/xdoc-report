package util;

import java.security.MessageDigest;

public class CheckSum {

	public static void main(String[] args) throws Exception {
		checkSum();
	}

	public static void checkSum() {
		String paramsInput = "HNKH2HNJ4HNG" + "000.00.58.H29" + "356019473b1ed272d9ca085f3922b431332177c71c432e234bb4319295767464,-775780856" + "dd9360f8-b2eb-4596-9b77-70baac0ed0c5" + "HQAE7XUODBiT/fNtvWFoIw==_0fd33d3b-78d7-42b2-956a-f1b1396d0546" + "30000"; 
		String checksum = convertSha256(paramsInput);
		System.out.println(checksum);
		
	}
	

	public static String convertSha256(String strHash) {
        try {
            
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(strHash.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
