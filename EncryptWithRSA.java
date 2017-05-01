package encrypter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import org.apache.commons.codec.binary.Hex;


public class EncryptWithRSA {

	private PublicKey PKA;
	private PrivateKey SKA;
	private PublicKey PKB;
	private SecretKey ASEKEY;
	private static long startTime;
	private static String Data = "C:/Users/aishw/Desktop/proj/files/data.txt";
	private static String RSAeData = "C:/Users/aishw/Desktop/proj/files/RSAedata";
	private static String RSAprocessedData = "C:/Users/aishw/Desktop/proj/files/RSApdata.txt";

	public EncryptWithRSA(String name) {
		GenerateKeys();
		System.out.println(name + " RSA PublicKey :"
				+ Base64.getEncoder().encodeToString(PKA.getEncoded()));
		System.out.println(name + " RSA SecretKey :"
				+ Base64.getEncoder().encodeToString(SKA.getEncoded()));

	}

	public void SetOtherPublicKey(PublicKey PKB) {
		this.PKB = PKB;
	}

	public PublicKey GetPublicKey() {
		return PKA;
	}

	public static void startTimer() {

		startTime = System.currentTimeMillis();
	}

	public static void getExecutionTime(String processName) {
		long endTime = System.currentTimeMillis();
		if ((endTime - startTime) < 9000)
			System.out.println(processName + " took "
					+ String.valueOf((endTime - startTime)) + " milliseconds");
		else
			System.out
					.println(processName + " took "
							+ String.valueOf((endTime - startTime) / 1000)
							+ " seconds");
	}

	public void GenerateKeys() {
		KeyPairGenerator keyGen;
		try {
			keyGen = KeyPairGenerator.getInstance("RSA");
			keyGen.initialize(2048);
			final KeyPair key = keyGen.generateKeyPair();
			PKA = key.getPublic();
			SKA = key.getPrivate();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	public void RSAEncrypt() {
		try {

			Cipher cipher;
			cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.ENCRYPT_MODE, PKB);
			byte[] bytes = (new String(readBFile(Data))).getBytes("UTF-8");

			byte[] encrypted = blockCipher(bytes, Cipher.ENCRYPT_MODE, cipher);

			char[] encryptedTranspherable = Hex.encodeHex(encrypted);
			writeFile((new String(encryptedTranspherable)).getBytes("UTF-8"),
					RSAeData);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void RSADecrypt() {

		byte[] dectyptedText = null;
		try {
			// get an RSA cipher object and print the provider
			final Cipher cipher = Cipher.getInstance("RSA");

			// decryptRsaKey the text using the private key
			cipher.init(Cipher.DECRYPT_MODE, SKA);
			byte[] bts = Hex
					.decodeHex((new String(readBFile(RSAeData), "UTF-8"))
							.toCharArray());

			byte[] decrypted = blockCipher(bts, Cipher.DECRYPT_MODE, cipher);
			writeFile(decrypted, RSAprocessedData);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static String readFile(String path) {

		try {
			InputStream in = new FileInputStream(new File(path));
			byte[] data = new byte[in.available()];
			in.read(data);
			return new String(data);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public byte[] readBFile(String path) {

		byte[] data = null;
		try {
			InputStream in = new FileInputStream(new File(path));
			data = new byte[in.available()];
			in.read(data);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // assuming already present
		return data;

	}

	public static void writeFile(byte[] data, String path) {

		try {

			FileOutputStream out = new FileOutputStream(path);
			out.write(data);
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public byte[] keyEncrypt() {
		byte[] cipherKey = null;
		try {

			Cipher cipher;
			cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.ENCRYPT_MODE, PKB);
			cipherKey = cipher.doFinal(ASEKEY.getEncoded());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cipherKey;

	}
	
	public static void main(String[] args) {

		EncryptWithRSA Alice = new EncryptWithRSA("Alice");
		EncryptWithRSA Bob = new EncryptWithRSA("Bob");
		Alice.SetOtherPublicKey(Bob.GetPublicKey());
		startTimer();
		Alice.RSAEncrypt();
		getExecutionTime("RSA Data Encryption time :");
		startTimer();
		Bob.RSADecrypt();
		getExecutionTime("RSA Data Decryption time :");

	}

	private byte[] blockCipher(byte[] bytes, int mode, Cipher cipher)
			throws IllegalBlockSizeException, BadPaddingException {

		byte[] scrambled = new byte[0];

		byte[] toReturn = new byte[0];

		int length = (mode == Cipher.ENCRYPT_MODE) ? 245 : 256;

		byte[] buffer = new byte[length];

		for (int i = 0; i < bytes.length; i++) {

			if ((i > 0) && (i % length == 0)) {

				scrambled = cipher.doFinal(buffer);

				toReturn = append(toReturn, scrambled);

				int newlength = length;

				if (i + length > bytes.length) {
					newlength = bytes.length - i;
				}

				buffer = new byte[newlength];
			}

			buffer[i % length] = bytes[i];
		}

		scrambled = cipher.doFinal(buffer);

		toReturn = append(toReturn, scrambled);

		return toReturn;
	}

	private byte[] append(byte[] prefix, byte[] suffix) {
		byte[] toReturn = new byte[prefix.length + suffix.length];
		for (int i = 0; i < prefix.length; i++) {
			toReturn[i] = prefix[i];
		}
		for (int i = 0; i < suffix.length; i++) {
			toReturn[i + prefix.length] = suffix[i];
		}
		return toReturn;
	}

}
