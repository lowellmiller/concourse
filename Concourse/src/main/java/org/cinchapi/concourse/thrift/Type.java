/**
 * Autogenerated by Thrift Compiler (0.9.0)
 * 
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 * 
 * @generated
 */
package org.cinchapi.concourse.thrift;

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * Enumerates the possible TObject types
 */
@SuppressWarnings({ "unused" })
public enum Type implements org.apache.thrift.TEnum {
	BOOLEAN(1), DOUBLE(2), FLOAT(3), INTEGER(4), LONG(5), LINK(6), STRING(7);

	private final int value;

	private Type(int value) {
		this.value = value;
	}

	/**
	 * Get the integer value of this enum value, as defined in the Thrift IDL.
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Find a the enum type by its integer value, as defined in the Thrift IDL.
	 * 
	 * @return null if the value is not found.
	 */
	public static Type findByValue(int value) {
		switch (value) {
		case 1:
			return BOOLEAN;
		case 2:
			return DOUBLE;
		case 3:
			return FLOAT;
		case 4:
			return INTEGER;
		case 5:
			return LONG;
		case 6:
			return LINK;
		case 7:
			return STRING;
		default:
			return null;
		}
	}
}
