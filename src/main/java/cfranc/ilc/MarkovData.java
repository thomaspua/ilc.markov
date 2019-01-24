package cfranc.ilc;

public class MarkovData {
    String theWord;
    int theCount;

    public MarkovData(String w, int c)
    {
        theWord = w;
        theCount = c;
    }

    public void setTheCount(int c)
    {
        theCount = c;
    }

    public String getTheWord()
    {
        return theWord;
    }

    public int getTheCount()
    {
        return theCount;
    }

}