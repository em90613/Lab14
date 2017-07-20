/**
 * Created by ericm on 7/20/2017.
 */
public class TestProgramApp {
    public static void main(String[] args) {
        //ProgramConfiguration test  = new ProgramConfiguration();//Does not work outside of ProgramConfiguration
        ProgramConfiguration test1 = ProgramConfiguration.getInstance();
        ProgramConfiguration test2 = ProgramConfiguration.getInstance();

        test1.setConnectionLimit(2);
        test2.setConnectionLimit(3);

        System.out.println(test1);
        System.out.println(test2);//Both test and test2 print at the same spot in memory.



    }
}
