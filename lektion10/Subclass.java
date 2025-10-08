public class Subclass extends Base {
    private Integer i = 1;

    @Override
    public void setName(String name) {
        super.setName(name + i.toString());
        i = i + 1;
    }

}
