package io.mosip.biometrics.util.finger;

/** Table 17 of ISO/IEC 19794-4-2011. 
*/
//https://www.ibia.org/cbeff/iso/biometric-quality-algorithm-identifiers
public enum FingerQualityAlgorithmIdentifier {

	ALGORITHM_IDENTIFIER(0x0000),
	NIST(0x000F),
	GREEN_BIT_AMERICAS_INC(0x0040);

	private final int value;
	FingerQualityAlgorithmIdentifier(int value) {
		this.value = value;
	}	
	
	public int value() {
		return this.value;
	}

	public static FingerQualityAlgorithmIdentifier fromValue(int value) {
		for (FingerQualityAlgorithmIdentifier c : FingerQualityAlgorithmIdentifier.values()) {
			if (c.value == value) {
				return c;
			}
		}
		throw new IllegalArgumentException(value + "");
	}

	@Override
	public String toString() {
		return super.toString() + "(" + Integer.toHexString (value) + ")";
	}
}
