/**
 * Created by test on 7/22/2015.
 */
public class Odometer {

    private int[] currentReading;
    private int size;


    public Odometer(int initialReading) {
    }

    public int maxAtIndex(int index, int length)
    {
        return 9 - length + (index + 1);
    }

    public int minAtIndex(int index, int length)
    {
        return index+1;
    }

    public boolean isValid(int[] number)
    {
        for (int i = number.length-1; i >= 0; i--)
        {
            if ((number[i] < minAtIndex(i,number.length)) || (number[i] > maxAtIndex(i,number.length)))
                return false;

            if ((i > 0) & (number[i] < number[i-1]))
                return false;
        }
        return true;
    }

    public int[] increment(int[] oldReading) {
        for(int pos = size - 1; pos >= 0; pos --)  {
        }
    }

    public static void main(String[] args) {

    }
}
