package org.jointheleague.skylar.test;

public class ByteTest{

    public static void main(String[] args){
	//byte n = (byte) 200;
	//System.out.println(n);
	byte[]tester = {(byte)200, 30,-100};
	readSignedByte(tester);
	readUnSignedByte(tester);
	readSignedShort(new byte[]{(byte)0x80,(byte)0x00});	
	readSignedShort(new byte[]{(byte)0xFF,(byte)0xFF});
	readUnSignedShort(new byte[]{(byte)0x80, (byte)0x00});
	readUnSignedShort(new byte[]{(byte)0xFF, (byte)0xFF});
	
    }
 
   public static void readSignedByte(byte[] bytes){
	assert bytes != null && bytes.length >=1;
	for(int i =0; i<bytes.length;i++){
	    int n = (int)bytes[i];
	    System.out.println(n);
	}
    }
    public static void readUnSignedByte(byte[] bytes){
	assert bytes != null && bytes.length >=1;
	for(int i =0; i<bytes.length;i++){
            int n = (int)bytes[i];
	    System.out.println(n & 0xFF);
	}
    }
    public static void readSignedShort (byte[] bytes) {
	assert bytes != null && bytes.length >= 2;
	int result = (bytes[0] << 8) + (bytes[1] & 0xFF);
	System.out.println(result);
    }
    public static void readUnSignedShort (byte[] bytes) {
	assert bytes != null && bytes.length >= 2;
	int result = (bytes[0] << 8) + (bytes[1] & 0xFF);
	System.out.println(result & 0xFFFF);
    }

	
}