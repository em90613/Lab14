/**
 * Created by ericm on 7/20/2017.
 */
public class ProgramConfiguration {
    public int connectionLimit;
    public int portNumber;
    public String URL;
    public int timeOut;

    public int getConnectionLimit() {
        return connectionLimit;
    }

    public void setConnectionLimit(int connectionLimit) {
        this.connectionLimit = connectionLimit;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }
    private static ProgramConfiguration instance;

    private ProgramConfiguration(){}

    public static ProgramConfiguration getInstance() {
        if (instance == null) {
            instance = new ProgramConfiguration();
        }
        return instance;
    }
}
