package gmailApiWrapper;

public class FactoryEmailApi {

    private FactoryEmailApi(){;}
    static public IEmailApi getEmailApiInstance(String i_EmailApiType)
    {
        IEmailApi result = null;
        switch (i_EmailApiType)
        {
            case "GmailApi":
                try {
                    result = new GmailApiWrapper();
                }
                catch (Exception e){}
                finally {
                    break;
                }
        }

        return result;
    }
}
