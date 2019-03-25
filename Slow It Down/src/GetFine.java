public class GetFine
{
    float speedingFine;

    public void fineTotal(float OverLimit, boolean doubleFine)
    {
        if (OverLimit <= 0 || OverLimit <= 5)
        {
            speedingFine = 0;
            System.out.println("Thank you, for being lawful!");

        } else if ((OverLimit <= 6 || OverLimit <= 9 && doubleFine == false))
        {
            speedingFine = 129;
            System.out.println("Total Fine " + speedingFine);

        } else if ((OverLimit <= 6 || OverLimit <= 9) && doubleFine == true)
        {
            speedingFine = 129 * 2;
            System.out.println("Total Fine " + speedingFine);

        } else if (OverLimit <= 10 || OverLimit <= 14 && doubleFine == false)
        {
            speedingFine = 204;
            System.out.println("Total Fine " + speedingFine);

        } else if (OverLimit <= 15 || OverLimit <= 19 && doubleFine == false)
        {
            speedingFine = 254;
            System.out.println("Total Fine " + speedingFine);

        } else if (OverLimit <= 15 || OverLimit <= 19 && doubleFine == true)
        {
            speedingFine = 254 * 2;
            System.out.println("Total Fine " + speedingFine);

        } else if (OverLimit <= 20 || OverLimit <= 29 && doubleFine == false)
        {
            speedingFine = 279;
            System.out.println("Total Fine " + speedingFine);

        } else if (OverLimit <= 20 || OverLimit <= 29 && doubleFine == true)
        {
            speedingFine = 279 * 2;
            System.out.println("Total Fine " + speedingFine);

        } else
        {
            System.out.println("Court Mandatory");
        }
    }
}
