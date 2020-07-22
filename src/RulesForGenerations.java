public class RulesForGenerations implements RulesService{
    @Override
    public int redToGreen() {
        return 1;
    }

    @Override
    public int greenToRed() {
        return 0;
    }
}
