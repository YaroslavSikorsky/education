package javarush.tasks.task00;

//Преобразование (кстати, а из строки вот так: int имя = Integer.parseInt(строка);)

public class Solution2 {
	Byte byteValueBox;
	Short shortValueBox;
	Integer integerValueBox;
	Long longValueBox;

	Float floatValueBox;
	Double doubleValueBox;

	Character characterValueBox;
	Boolean booleanValueBox;

	byte byteValue = byteValueBox.byteValue();
	short shortValue = shortValueBox.shortValue();
	int intValue = integerValueBox.intValue();
	long longValue = longValueBox.longValue();

	float floatValue = floatValueBox.floatValue();
	double doubleValue = doubleValueBox.doubleValue();

	char charValue = characterValueBox.charValue();
	boolean booleanValue = booleanValueBox.booleanValue();
}

