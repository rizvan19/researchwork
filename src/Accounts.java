import java.util.List;

/**
 * Created by Ahtisham Zubair on 4/24/2017.
 */
public class Accounts
{
    public void generate_bill(List<CarProblemChain> prob,Car car)
    {
            new InputHandler().Pagebreaker();
        System.out.println("===========");
        System.out.println("Cash Memo");
        System.out.println("===========");
        System.out.println("Car :" +car.CarNeme);
        System.out.println("Car Registration Num :" +car.CarRegisterationNum);
    ShowItem(prob);
        System.out.println("");
        System.out.println("Total Bill : "+TotalCost(prob));



    }
    public float TotalCost(List<CarProblemChain> probs)
    {
        float cost=0;
        for(CarProblemChain item :probs)
        {
            cost+=item.ProblemCost();
        }
        return cost;
    }
    public void ShowItem(List<CarProblemChain> probs)
    {
        String msg="";
        for(CarProblemChain item: probs)
        {
            System.out.println("Problem Name  "+item.ProblemDesc() +"   ");
            System.out.print("Cost "+item.ProblemCost());
        }

    }
}
