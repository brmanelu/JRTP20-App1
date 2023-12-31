package in.ashokit;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {


	public static String encode(String txt) {
		// Bug Id : 101
		int i = 10;
		int j = 20;
		Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(txt.getBytes());
		
    }
	
	public static String decode(String encodeTxt) {
		
		// changes Bug Id : 121
		int k = 30;
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodeTxt);
		return new String(decode);
		
	}
	
	public static void main(String[]args) {
		String encode = PasswordService.encode("ashokit");
		System.out.println(encode);
		String decode = PasswordService.decode(encode);
		System.out.println(decode);

	}
	

}	
