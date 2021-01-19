
public class dsproject {
    public static void main(String[] args) {
        graph g=new graph();
        System.out.println("-------------------------Phase One-------------------------");
        phase_one phase_one = new phase_one();
        System.out.println("-------------------------Phase Two-------------------------");
        phase_two two = new phase_two(g);
        System.out.println("-------------------------Phase Three-------------------------");
        phase_three three = new phase_three(g);
        System.out.println("-------------------------Phase Four-------------------------");
        phase_four four=new phase_four(g);
    }
}
